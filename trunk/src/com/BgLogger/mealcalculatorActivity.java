package com.BgLogger;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.BgLogger.R;

public class mealcalculatorActivity extends Activity {
	
	
	Button backbutton;
	Button calculatebutton;
	Button resetbutton;
	EditText carb;
	EditText index;
	TextView results;
	
	
	@Override
	public void onCreate (Bundle savedInstanceState)  {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calculate);
		
		backbutton= (Button)findViewById(R.id.back);
		calculatebutton = (Button)findViewById(R.id.calculate);
		resetbutton = (Button)findViewById(R.id.reset);
		carb = (EditText)findViewById(R.id.carbs);
		index = (EditText)findViewById(R.id.index);
		results = (TextView)findViewById(R.id.result);
		
		carb.requestFocus();
		
		calculatebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                 
            	String carbinput = carb.getText().toString();
            	String indexinput = index.getText().toString();
            	
            	if (carbinput !=null && carbinput.length()>0 && indexinput !=null && indexinput.length() >0) 
            	{
            		double netcarbs = Double.parseDouble(carbinput);
            		double glyindex = Double.parseDouble(indexinput);
            		double glyload;
            		
            		if (netcarbs == 0 || glyindex == 0)
            		{
            			glyload = 0;
            		}
            		
            		else 
            		{
            			glyload = glyindex/100*netcarbs;
            			
            		}
            		
            		results.setText("Glycemic Load =" + glyload);
            	}
            	
            	else
            	{
            	    results.setText("Please enter net carbs and glycemic index");	
            	}
            	}
            });

		resetbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                
            	
            	carb.setText("");
            	index.setText("");
            	results.setText("Glycemic Load=");
            	
            }
            });
		
		
		backbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }

        });
		
		
		
	}

}
