package com.example.pranay.fabhotelsassignment.data.db.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "properties".
*/
public class ListPropertyEntityDao extends AbstractDao<ListPropertyEntity, Long> {

    public static final String TABLENAME = "properties";

    /**
     * Properties of entity ListPropertyEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property Landmark = new Property(1, String.class, "landmark", false, "landmark");
        public final static Property City = new Property(2, String.class, "city", false, "city");
        public final static Property Name = new Property(3, String.class, "name", false, "name");
        public final static Property ReviewCount = new Property(4, Integer.class, "reviewCount", false, "reviewCount");
        public final static Property Price = new Property(5, Integer.class, "price", false, "price");
        public final static Property RatedText = new Property(6, String.class, "ratedText", false, "ratedText");
    }


    public ListPropertyEntityDao(DaoConfig config) {
        super(config);
    }
    
    public ListPropertyEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"properties\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL ," + // 0: id
                "\"landmark\" TEXT," + // 1: landmark
                "\"city\" TEXT," + // 2: city
                "\"name\" TEXT," + // 3: name
                "\"reviewCount\" INTEGER," + // 4: reviewCount
                "\"price\" INTEGER," + // 5: price
                "\"ratedText\" TEXT);"); // 6: ratedText
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"properties\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ListPropertyEntity entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String landmark = entity.getLandmark();
        if (landmark != null) {
            stmt.bindString(2, landmark);
        }
 
        String city = entity.getCity();
        if (city != null) {
            stmt.bindString(3, city);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
 
        Integer reviewCount = entity.getReviewCount();
        if (reviewCount != null) {
            stmt.bindLong(5, reviewCount);
        }
 
        Integer price = entity.getPrice();
        if (price != null) {
            stmt.bindLong(6, price);
        }
 
        String ratedText = entity.getRatedText();
        if (ratedText != null) {
            stmt.bindString(7, ratedText);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ListPropertyEntity entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String landmark = entity.getLandmark();
        if (landmark != null) {
            stmt.bindString(2, landmark);
        }
 
        String city = entity.getCity();
        if (city != null) {
            stmt.bindString(3, city);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
 
        Integer reviewCount = entity.getReviewCount();
        if (reviewCount != null) {
            stmt.bindLong(5, reviewCount);
        }
 
        Integer price = entity.getPrice();
        if (price != null) {
            stmt.bindLong(6, price);
        }
 
        String ratedText = entity.getRatedText();
        if (ratedText != null) {
            stmt.bindString(7, ratedText);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public ListPropertyEntity readEntity(Cursor cursor, int offset) {
        ListPropertyEntity entity = new ListPropertyEntity( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // landmark
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // city
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // name
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // reviewCount
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // price
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // ratedText
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ListPropertyEntity entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setLandmark(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCity(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setReviewCount(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setPrice(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setRatedText(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(ListPropertyEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(ListPropertyEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ListPropertyEntity entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
