package com.wf.weatherforcastexample.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CityDao_Impl implements CityDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CityModel> __insertionAdapterOfCityModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllCities;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteForecastCity;

  public CityDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCityModel = new EntityInsertionAdapter<CityModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `city_table` (`name`,`temp`,`icon`,`id`) VALUES (?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CityModel value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getTemp() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindDouble(2, value.getTemp());
        }
        if (value.getIcon() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getIcon());
        }
        stmt.bindLong(4, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAllCities = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from city_table";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteCity = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from city_table where id =?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteForecastCity = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from forecast_city_table where id =?";
        return _query;
      }
    };
  }

  @Override
  public Object insertCity(final CityModel jobs, final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfCityModel.insertAndReturnId(jobs);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAllCities(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllCities.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllCities.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteCity(final long id, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCity.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteCity.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteForecastCity(final long id, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteForecastCity.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteForecastCity.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object getAllCities(final Continuation<? super List<CityModel>> continuation) {
    final String _sql = "select * from city_table ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<CityModel>>() {
      @Override
      public List<CityModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "temp");
          final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "icon");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<CityModel> _result = new ArrayList<CityModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CityModel _item;
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final Double _tmpTemp;
            if (_cursor.isNull(_cursorIndexOfTemp)) {
              _tmpTemp = null;
            } else {
              _tmpTemp = _cursor.getDouble(_cursorIndexOfTemp);
            }
            final String _tmpIcon;
            if (_cursor.isNull(_cursorIndexOfIcon)) {
              _tmpIcon = null;
            } else {
              _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
            }
            _item = new CityModel(_tmpName,_tmpTemp,_tmpIcon);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getSizeCities(final Continuation<? super Long> continuation) {
    final String _sql = "select COUNT(*) FROM city_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Long _result;
          if(_cursor.moveToFirst()) {
            final Long _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
