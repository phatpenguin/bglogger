package com.BgLogger.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author		Scott Leonard
 * Created:		07/01/2012
 * Modified:	07/01/2012
 *
 */
public abstract class GenericDao extends SQLiteOpenHelper{
	private SQLiteDatabase sqLiteDatabase;
	private Context context;
	
	private static final String DB_NAME = "BGLOGGER_DATABASE";
	private static final int DB_Version = 1;
	private static final CursorFactory CURSOR_FACTORY = null;
	
	private String tableName;
	private String createScript;

	public GenericDao(Context context, String tableName, String createScript) {
		super(context, DB_NAME, CURSOR_FACTORY, DB_Version);
		
		this.context = context;
		this.tableName = tableName;
		this.createScript = createScript;
	}

	public GenericDao openToRead() throws SQLException {
		sqLiteDatabase = getReadableDatabase();
		return this;
	}

	public GenericDao openToWrite() throws SQLException {
		sqLiteDatabase = getWritableDatabase();
		return this;
	}
	
	public long insert(String tableName, ContentValues contentValues){
		return sqLiteDatabase.insert(tableName, null, contentValues);
	}

	public void delete(int id) {
		String deleteSql = "delete from " + tableName + " where _id=" + id;
		sqLiteDatabase.rawQuery(deleteSql, null).moveToFirst();
	}

	public Cursor queueAll() {
		Cursor cursor = sqLiteDatabase.rawQuery("select rowid _id,* from " + tableName, null);
		return cursor;

	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(createScript);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion) {

	}
}
