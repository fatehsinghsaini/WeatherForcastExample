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
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ForecastCityDao_Impl implements ForecastCityDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ForecastCityModel> __insertionAdapterOfForecastCityModel;

  private final Converters __converters = new Converters();

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllForecastCities;

  private final SharedSQLiteStatement __preparedStmtOfDeleteForecastCity;

  public ForecastCityDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfForecastCityModel = new EntityInsertionAdapter<ForecastCityModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `forecast_city_table` (`id`,`name`,`temp`,`icon`,`time`,`forecastRows`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ForecastCityModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getTemp() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindDouble(3, value.getTemp());
        }
        if (value.getIcon() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getIcon());
        }
        if (value.getTime() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTime());
        }
        final String _tmp;
        _tmp = __converters.setIntModel(value.getForecastRows());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp);
        }
      }
    };
    this.__preparedStmtOfDeleteAllForecastCities = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from forecast_city_table";
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
  public Object insertForecastCity(final ForecastCityModel forecastCity,
      final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfForecastCityModel.insertAndReturnId(forecastCity);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAllForecastCities(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllForecastCities.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllForecastCities.release(_stmt);
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
  public Object getForecastCity(final long id,
      final Continuation<? super ForecastCityModel> continuation) {
    final String _sql = "select * from forecast_city_table where id =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<ForecastCityModel>() {
      @Override
      public ForecastCityModel call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "temp");
          final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "icon");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfForecastRows = CursorUtil.getColumnIndexOrThrow(_cursor, "forecastRows");
          final ForecastCityModel _result;
          if(_cursor.moveToFirst()) {
            final Long _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getLong(_cursorIndexOfId);
            }
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
            final String _tmpTime;
            if (_cursor.isNull(_cursorIndexOfTime)) {
              _tmpTime = null;
            } else {
              _tmpTime = _cursor.getString(_cursorIndexOfTime);
            }
            final List<ForecastRow> _tmpForecastRows;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfForecastRows)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfForecastRows);
            }
            _tmpForecastRows = __converters.getIntModel(_tmp);
            _result = new ForecastCityModel(_tmpId,_tmpName,_tmpTemp,_tmpIcon,_tmpTime,_tmpForecastRows);
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

  @Override
  public Object getSizeForecastCities(final Continuation<? super Long> continuation) {
    final String _sql = "select COUNT(*) FROM forecast_city_table";
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
