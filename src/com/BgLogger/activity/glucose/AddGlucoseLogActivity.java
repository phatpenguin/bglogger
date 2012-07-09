package com.BgLogger.activity.glucose;

import java.math.BigDecimal;
import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;

import com.BgLogger.R;
import com.BgLogger.model.glucose.BloodGlucoseLog;
import com.BgLogger.model.glucose.BloodGlucoseLogDao;
import com.BgLogger.model.glucose.BloodGlucoseMeasurementUnitDao;
import com.BgLogger.model.glucose.BloodGlucoseTypeDao;

/**
 * @author 	 Scott Leonard, 
 * Created:	 07/01/2012, 
 * Modified: 07/08/2012
 */
public class AddGlucoseLogActivity extends Activity {
	private final View.OnClickListener cancelButtonOnClickListener = new View.OnClickListener() {
    	public void onClick(View v) {
    		Intent intent = new Intent();
            setResult(RESULT_OK, intent);
            finish();
    	}
	};
	
	private final Button.OnClickListener submitButtonOnClickListener = new Button.OnClickListener() {
    	public void onClick(View v) {
    		BloodGlucoseLog bgl = new BloodGlucoseLog();
    		bloodGlucoseLogDao.openToWrite();
    		bgl.setBloodGlucoseMeasurementUnitId(1L);
    		bgl.setBloodGlucoseTypeId(1L);
 
    		EditText readingEditText = (EditText)findViewById(R.id.ResultEditText);
    		bgl.setReading(BigDecimal.valueOf(Double.parseDouble((readingEditText.getText().toString()))));
    		
    		bgl.setLog_time(new Date());
    		
    		bloodGlucoseLogDao.insertBloodGlucoseLog(bgl);
    		
    		Intent intent = new Intent();
            setResult(RESULT_OK, intent);
            finish();
    	}
	};
	
	SimpleCursorAdapter cursorAdapter;
	Cursor cursor;
	private BloodGlucoseLogDao bloodGlucoseLogDao;
	private BloodGlucoseMeasurementUnitDao bloodGlucoseMeasurementUnitDao;
	private BloodGlucoseTypeDao bloodGlucoseTypeDao;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_glucose_log);
        
        bloodGlucoseLogDao = new BloodGlucoseLogDao(this);
        //bloodGlucoseMeasurementUnitDao = new BloodGlucoseMeasurementUnitDao(this);
        //bloodGlucoseTypeDao = new BloodGlucoseTypeDao(this);
        
        Button cancelButton = (Button)findViewById(R.id.CancelButton);
        Button submitButton = (Button)findViewById(R.id.SubmitButton);
        
        cancelButton.setOnClickListener(cancelButtonOnClickListener);
        submitButton.setOnClickListener(submitButtonOnClickListener);
        
        Spinner glucoseTypeSpinner = (Spinner)findViewById(R.id.GlucoseTypeSpinner);
        //TODO POPULATE THE SPINNER WITH INFO FROM FROM DATABASE
	}
}
