package com.BgLogger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.view.View;
import com.BgLogger.R;

 

public class BgLoggerActivity extends Activity {
    /** Called when the activity is first created. */
	
	Button logbutton;
	Button listbutton;
	Button mainbutton;
	Button calculatorbutton;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        addListenerOnButton();
        ViewStub Myhome = (ViewStub) findViewById(R.id.homeView);
        Myhome.setVisibility(View.VISIBLE);
    }
    
 public void addListenerOnButton() {
final ImageButton BtHome = (ImageButton) findViewById(R.id.imageButton1);
final ImageButton BtMeals = (ImageButton) findViewById(R.id.imageButton2);
final ImageButton BtExercise = (ImageButton) findViewById(R.id.imageButton3);
final ImageButton BtInsulin = (ImageButton) findViewById(R.id.imageButton4);
final ImageButton BtGraph = (ImageButton) findViewById(R.id.imageButton5);

final ViewStub Myhome = (ViewStub) findViewById(R.id.homeView);
final ViewStub Mymeals = (ViewStub) findViewById(R.id.mealsView);
final ViewStub Myexercise = (ViewStub) findViewById(R.id.exerciseView);
final ViewStub Myinsuline = (ViewStub) findViewById(R.id.insulineView);
final ViewStub Myreports = (ViewStub) findViewById(R.id.reportView);

////////////HOME////////////////////////////////////
BtHome.setOnClickListener(new OnClickListener() {
public void onClick(View arg0) {
	BtHome.setImageResource(R.drawable.dropover);
	BtMeals.setImageResource(R.drawable.meal);
	BtExercise.setImageResource(R.drawable.exce);
	BtInsulin.setImageResource(R.drawable.med);
	BtGraph.setImageResource(R.drawable.graph);
	
	Myhome.setVisibility(View.VISIBLE);
	Mymeals.setVisibility(View.INVISIBLE);
	Myexercise.setVisibility(View.INVISIBLE);
	Myinsuline.setVisibility(View.INVISIBLE);
	Myreports.setVisibility(View.INVISIBLE);
	
	///PLACE CODE HERE///
}
});

////////////MEALS////////////////////////////////////
BtMeals.setOnClickListener(new OnClickListener() {
public void onClick(View arg0) {
	BtHome.setImageResource(R.drawable.drop);
	BtMeals.setImageResource(R.drawable.mealover);
	BtExercise.setImageResource(R.drawable.exce);
	BtInsulin.setImageResource(R.drawable.med);
	BtGraph.setImageResource(R.drawable.graph);	
	
	Myhome.setVisibility(View.INVISIBLE);
	Mymeals.setVisibility(View.VISIBLE);
	Myexercise.setVisibility(View.INVISIBLE);
	Myinsuline.setVisibility(View.INVISIBLE);
	Myreports.setVisibility(View.INVISIBLE);
	
	///PLACE CODE HERE///
	
	//setContentView(R.layout.menu);

	Button logbutton = (Button) findViewById(R.id.log);
	logbutton.setOnClickListener(new View.OnClickListener(){
	public void onClick(View v) {			
	Intent myIntent = new Intent (v.getContext(), Foodlog6Activity.class);
	startActivityForResult (myIntent, 0);
	}	
	});
			
	Button listbutton = (Button) findViewById(R.id.listbutton);
	listbutton.setOnClickListener(new View.OnClickListener(){
	public void onClick(View v) {			
	Intent myIntent = new Intent (v.getContext(), foodlist.class);
	startActivityForResult (myIntent, 0);
	}	
	});
			
	Button calculatebutton = (Button) findViewById(R.id.calculate);
	calculatebutton.setOnClickListener(new View.OnClickListener(){
	public void onClick(View v) {
	Intent myIntent = new Intent (v.getContext(), mealcalculatorActivity.class);
	startActivityForResult (myIntent, 0);
	}
	});
}
});

///////////////EXERCISE////////////////////////////
BtExercise.setOnClickListener(new OnClickListener() {
public void onClick(View arg0) {
	BtHome.setImageResource(R.drawable.drop);
	BtMeals.setImageResource(R.drawable.meal);
	BtExercise.setImageResource(R.drawable.exceover);
	BtInsulin.setImageResource(R.drawable.med);
	BtGraph.setImageResource(R.drawable.graph);
	
	Myhome.setVisibility(View.INVISIBLE);
	Mymeals.setVisibility(View.INVISIBLE);
	Myexercise.setVisibility(View.VISIBLE);
	Myinsuline.setVisibility(View.INVISIBLE);
	Myreports.setVisibility(View.INVISIBLE);
	
	///PLACE CODE HERE///
}
});

//////////////INSULIN//////////////////////////////
BtInsulin.setOnClickListener(new OnClickListener() {
public void onClick(View arg0) {
	BtHome.setImageResource(R.drawable.drop);
	BtMeals.setImageResource(R.drawable.meal);
	BtExercise.setImageResource(R.drawable.exce);
	BtInsulin.setImageResource(R.drawable.medover);
	BtGraph.setImageResource(R.drawable.graph);
	
	Myhome.setVisibility(View.INVISIBLE);
	Mymeals.setVisibility(View.INVISIBLE);
	Myexercise.setVisibility(View.INVISIBLE);
	Myinsuline.setVisibility(View.VISIBLE);
	Myreports.setVisibility(View.INVISIBLE);
	
	///PLACE CODE HERE///
}
});

//////////////REPORTING///////////////////////////
BtGraph.setOnClickListener(new OnClickListener() {
public void onClick(View arg0) {
	BtHome.setImageResource(R.drawable.drop);
	BtMeals.setImageResource(R.drawable.meal);
	BtExercise.setImageResource(R.drawable.exce);
	BtInsulin.setImageResource(R.drawable.med);
	BtGraph.setImageResource(R.drawable.graphover);
	
	Myhome.setVisibility(View.INVISIBLE);
	Mymeals.setVisibility(View.INVISIBLE);
	Myexercise.setVisibility(View.INVISIBLE);
	Myinsuline.setVisibility(View.INVISIBLE);
	Myreports.setVisibility(View.VISIBLE);
	
	///PLACE CODE HERE///
	
	/*Button Mbutton = (Button) findViewById(R.id.);
	logbutton.setOnClickListener(new View.OnClickListener(){
	public void onClick(View v) {			
	Intent myIntent = new Intent (v.getContext(), Foodlog6Activity.class);
	startActivityForResult (myIntent, 0);*/
	//}	
	//});
}
});

}    
}