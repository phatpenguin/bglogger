package com.BgLogger.model.glucose;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;

import com.BgLogger.model.GenericDao;

/**
 * @author		Scott Leonard
 * Created:		07/01/2012
 * Modified:	07/02/2012
 */
public class BloodGlucoseTypeDao extends GenericDao{
	private static final String TABLE_NAME = "blood_glucose_type";
	private static final String CREATE_SCRIPT = "CREATE TABLE " 
			+ TABLE_NAME + " ("
			+ "_id integer primary key autoincrement," 
			+ ",name varchar not null"
			+ ",dsc varchar not null);";

	public BloodGlucoseTypeDao(Context context) {
		super(context,TABLE_NAME,CREATE_SCRIPT);
	}

	public BloodGlucoseTypeDao openToRead() throws SQLException {
		return (BloodGlucoseTypeDao)super.openToRead();
	}

	public BloodGlucoseTypeDao openToWrite() throws SQLException {
		return (BloodGlucoseTypeDao)super.openToWrite();
	}

	public long insert(BloodGlucoseType bloodGlucoseType) {
		ContentValues entityMap = new ContentValues();

		entityMap.put("_id", bloodGlucoseType.getId());
		entityMap.put("name", bloodGlucoseType.getName());
		entityMap.put("dsc", bloodGlucoseType.getDsc());
		
		return super.insert(TABLE_NAME, entityMap);
	}
}
