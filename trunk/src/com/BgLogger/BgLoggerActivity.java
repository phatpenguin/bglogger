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
import com.BgLogger.activity.glucose.AddGlucoseLogActivity;

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
		
		ImageButton addRecordImageButton = (ImageButton)findViewById(R.id.AddRecordImageButton);
		addRecordImageButton.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v) {
				Intent myIntent = new Intent(v.getContext(),
						AddGlucoseLogActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});
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
				Mymeals.setVisibility(View.GONE);
				Myexercise.setVisibility(View.GONE);
				Myinsuline.setVisibility(View.GONE);
				Myreports.setVisibility(View.GONE);

				ImageButton addRecordImageButton = (ImageButton)findViewById(R.id.AddRecordImageButton);
				addRecordImageButton.setOnClickListener(new View.OnClickListener(){
					public void onClick(View v) {
						Intent myIntent = new Intent(v.getContext(),
								AddGlucoseLogActivity.class);
						startActivityForResult(myIntent, 0);
					}
				});
			}
		});

		// //////////MEALS////////////////////////////////////
		BtMeals.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				BtHome.setImageResource(R.drawable.drop);
				BtMeals.setImageResource(R.drawable.mealover);
				BtExercise.setImageResource(R.drawable.exce);
				BtInsulin.setImageResource(R.drawable.med);
				BtGraph.setImageResource(R.drawable.graph);

				Mymeals.setVisibility(View.VISIBLE);
				Myhome.setVisibility(View.GONE);
				Myexercise.setVisibility(View.GONE);
				Myinsuline.setVisibility(View.GONE);
				Myreports.setVisibility(View.GONE);

				// /PLACE CODE HERE///

				Button logbutton = (Button) findViewById(R.id.log);
				logbutton.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						Intent myIntent = new Intent(v.getContext(),
								Foodlog6Activity.class);
						startActivityForResult(myIntent, 0);
					}
				});

				Button listbutton = (Button) findViewById(R.id.listbutton);
				listbutton.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						Intent myIntent = new Intent(v.getContext(),
								foodlist.class);
						startActivityForResult(myIntent, 0);
					}
				});

				Button calculatebutton = (Button) findViewById(R.id.calculate);
				calculatebutton.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						Intent myIntent = new Intent(v.getContext(),
								mealcalculatorActivity.class);
						startActivityForResult(myIntent, 0);
					}
				});
			}
		});

		// /////////////EXERCISE////////////////////////////
		BtExercise.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				BtHome.setImageResource(R.drawable.drop);
				BtMeals.setImageResource(R.drawable.meal);
				BtExercise.setImageResource(R.drawable.exceover);
				BtInsulin.setImageResource(R.drawable.med);
				BtGraph.setImageResource(R.drawable.graph);

				Myexercise.setVisibility(View.VISIBLE);
				Myhome.setVisibility(View.GONE);
				Mymeals.setVisibility(View.GONE);
				Myinsuline.setVisibility(View.GONE);
				Myreports.setVisibility(View.GONE);

				// /PLACE CODE HERE///
			}
		});

		// ////////////INSULIN//////////////////////////////
		BtInsulin.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				BtHome.setImageResource(R.drawable.drop);
				BtMeals.setImageResource(R.drawable.meal);
				BtExercise.setImageResource(R.drawable.exce);
				BtInsulin.setImageResource(R.drawable.medover);
				BtGraph.setImageResource(R.drawable.graph);

				Myinsuline.setVisibility(View.VISIBLE);
				Myhome.setVisibility(View.GONE);
				Mymeals.setVisibility(View.GONE);
				Myexercise.setVisibility(View.GONE);
				Myreports.setVisibility(View.GONE);

				// /PLACE CODE HERE///
			}
		});

		// ////////////REPORTING///////////////////////////
		BtGraph.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				BtHome.setImageResource(R.drawable.drop);
				BtMeals.setImageResource(R.drawable.meal);
				BtExercise.setImageResource(R.drawable.exce);
				BtInsulin.setImageResource(R.drawable.med);
				BtGraph.setImageResource(R.drawable.graphover);

				Myreports.setVisibility(View.VISIBLE);
				Myhome.setVisibility(View.GONE);
				Mymeals.setVisibility(View.GONE);
				Myexercise.setVisibility(View.GONE);
				Myinsuline.setVisibility(View.GONE);

				// /PLACE CODE HERE///

				Button mealButton = (Button) findViewById(R.id.mealbuttonReport);
				mealButton.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						Intent mealReport = new Intent(v.getContext(),
								mealReportActivity.class);
						startActivityForResult(mealReport, 0);
					}
				});

				Button bloodButton = (Button) findViewById(R.id.bloodbuttonReport);
				bloodButton.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						Intent bloodReport = new Intent(v.getContext(),
								bloodReportActivity.class);
						startActivityForResult(bloodReport, 0);
					}
				});

				Button exerciseButton = (Button) findViewById(R.id.exercisebuttonReport);
				exerciseButton.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						Intent exerciseReport = new Intent(v.getContext(),
								exerciseReportActivity.class);
						startActivityForResult(exerciseReport, 0);
					}
				});

			}
		});

	}
}