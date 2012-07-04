package com.BgLogger.activity.glucose;

import com.BgLogger.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author 		Scott Leonard
 * Created:		07/01/2012
 * Modified:	07/02/2012
 */
public class AddGlucoseLogActivity extends Activity {
	private static final Button.OnClickListener cancelButtonOnClickListener = new Button.OnClickListener() {
    	public void onClick(View v) {
    		
    	}
	};
	
	private static final Button.OnClickListener submitButtonOnClickListener = new Button.OnClickListener() {
    	public void onClick(View v) {
    		
    	}
	};
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_glucose_log);
        
        Button cancelButton = (Button)findViewById(R.id.CancelButton);
        Button submitButton = (Button)findViewById(R.id.SubmitButton);
        
        cancelButton.setOnClickListener(cancelButtonOnClickListener);
        submitButton.setOnClickListener(submitButtonOnClickListener);
	}
	
	private void cancel(){
		finish();
	}
}
