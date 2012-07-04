package com.BgLogger;
import android.app.Activity;
import com.BgLogger.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.database.*;
import android.widget.*;

public class exerciseReportActivity extends Activity {
	private DBAdapter exercisedatabase;
	@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.exercisereport);

ListView exerciseData = (ListView)findViewById(R.id.ExerciselistView);

exercisedatabase = new DBAdapter(this);
exercisedatabase.openToWrite();
Cursor results = exercisedatabase.queueAll();

String [] from = new String [] {DBAdapter.KEY_DATE, DBAdapter.KEY_CARBS, DBAdapter.KEY_NAME, DBAdapter.KEY_LOAD};
int [] to = new int [] { R.id.text1, R.id.text2, R.id.text3, R.id.text4};

SimpleCursorAdapter displayAdapter = (SimpleCursorAdapter) new SimpleCursorAdapter (this, R.layout.row, results, from, to);
exerciseData.setAdapter(displayAdapter);


Button exerciseBackbutton = (Button) findViewById(R.id.exerciseBackbutton);
exerciseBackbutton.setOnClickListener(new View.OnClickListener() {
public void onClick(View view) {
Intent exerciseintent = new Intent();
setResult(RESULT_OK, exerciseintent);
finish();
}
});

}
}

