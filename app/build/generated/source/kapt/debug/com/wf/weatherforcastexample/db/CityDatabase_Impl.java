package com.wf.weatherforcastexample.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CityDatabase_Impl extends CityDatabase {
  private volatile CityDao _cityDao;

  private volatile ForecastCityDao _forecastCityDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `city_table` (`name` TEXT, `temp` REAL, `icon` TEXT, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `forecast_city_table` (`id` INTEGER, `name` TEXT, `temp` REAL, `icon` TEXT, `time` TEXT, `forecastRows` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8897558c7dc5cf41004a594eccd6a880')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `city_table`");
        _db.execSQL("DROP TABLE IF EXISTS `forecast_city_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCityTable = new HashMap<String, TableInfo.Column>(4);
        _columnsCityTable.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCityTable.put("temp", new TableInfo.Column("temp", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCityTable.put("icon", new TableInfo.Column("icon", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCityTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCityTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCityTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCityTable = new TableInfo("city_table", _columnsCityTable, _foreignKeysCityTable, _indicesCityTable);
        final TableInfo _existingCityTable = TableInfo.read(_db, "city_table");
        if (! _infoCityTable.equals(_existingCityTable)) {
          return new RoomOpenHelper.ValidationResult(false, "city_table(com.wf.weatherforcastexample.db.CityModel).\n"
                  + " Expected:\n" + _infoCityTable + "\n"
                  + " Found:\n" + _existingCityTable);
        }
        final HashMap<String, TableInfo.Column> _columnsForecastCityTable = new HashMap<String, TableInfo.Column>(6);
        _columnsForecastCityTable.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecastCityTable.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecastCityTable.put("temp", new TableInfo.Column("temp", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecastCityTable.put("icon", new TableInfo.Column("icon", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecastCityTable.put("time", new TableInfo.Column("time", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecastCityTable.put("forecastRows", new TableInfo.Column("forecastRows", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysForecastCityTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesForecastCityTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoForecastCityTable = new TableInfo("forecast_city_table", _columnsForecastCityTable, _foreignKeysForecastCityTable, _indicesForecastCityTable);
        final TableInfo _existingForecastCityTable = TableInfo.read(_db, "forecast_city_table");
        if (! _infoForecastCityTable.equals(_existingForecastCityTable)) {
          return new RoomOpenHelper.ValidationResult(false, "forecast_city_table(com.wf.weatherforcastexample.db.ForecastCityModel).\n"
                  + " Expected:\n" + _infoForecastCityTable + "\n"
                  + " Found:\n" + _existingForecastCityTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "8897558c7dc5cf41004a594eccd6a880", "082dd57d751acdab3c4d4e1123deaa83");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "city_table","forecast_city_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `city_table`");
      _db.execSQL("DELETE FROM `forecast_city_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CityDao.class, CityDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ForecastCityDao.class, ForecastCityDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public CityDao cityDao() {
    if (_cityDao != null) {
      return _cityDao;
    } else {
      synchronized(this) {
        if(_cityDao == null) {
          _cityDao = new CityDao_Impl(this);
        }
        return _cityDao;
      }
    }
  }

  @Override
  public ForecastCityDao forecastCityDao() {
    if (_forecastCityDao != null) {
      return _forecastCityDao;
    } else {
      synchronized(this) {
        if(_forecastCityDao == null) {
          _forecastCityDao = new ForecastCityDao_Impl(this);
        }
        return _forecastCityDao;
      }
    }
  }
}
