package com.BgLogger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.BgLogger.R;

public class foodlist extends ListActivity {
	
	Button backbutton;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.glylist);
		
		
		Button backbutton = (Button) findViewById(R.id.back);
        backbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }

        });
        
		
		ArrayList<Map<String, String>> list = buildData();
		String[] from = { "food", "gload" };
		int[] to = { android.R.id.text1, android.R.id.text2 };

		SimpleAdapter adapter = new SimpleAdapter(this, list,
				android.R.layout.simple_list_item_2, from, to);
		setListAdapter(adapter);
	}

	private ArrayList<Map<String, String>> buildData() {
		ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
		
		 
	
		
		list.add(putData("BAKED GOODS", "60 grams"));
		
		list.add(putData("Apple Muffin", "13"));
		list.add(putData("Banana Cake", "14"));
		list.add(putData("Banana Cake with No Sugar", "12"));
		list.add(putData("Blueberry Muffin", "15"));
		list.add(putData("Carrot Cake", "8"));
		list.add(putData("Chocolate Cake/Frosting", "11"));
		list.add(putData("Sponge Cake", "17"));
		list.add(putData("Vanilla cake/frosting", "13"));
 
		
		
		list.add(putData("BEVERAGES", "250 mL"));
		
		list.add(putData("Apple Juice", "10"));
		list.add(putData("Beer", "5"));
		list.add(putData("Banana Smoothie", "8"));
		list.add(putData("Coca Cola", "16"));
		list.add(putData("Fanta Orange Soda", "12"));
		list.add(putData("Fruit Punch", "19"));
		list.add(putData("Gatorade", "12"));
		list.add(putData("Lemonade", "15"));
		list.add(putData("V8 Vegetable Juice", "4"));
		list.add(putData("Whole Milk", "5"));
		
		list.add(putData("BREADS", "30 grams"));
		
		 
		list.add(putData("Baguette, White Flour", "15"));
		list.add(putData("Hamburger bun", "9"));
		list.add(putData("Kaiser roll", "12"));
		list.add(putData("Rye Bread", "6"));
		list.add(putData("Wheat bread", "10"));
		list.add(putData("White bread", "10"));
		list.add(putData("Waffle", "6"));
		
		list.add(putData("FAST FOOD", ""));
		list.add(putData("McDonald McChicken Sandwich", "26"));
		list.add(putData("McDonald Filet o Fish", "20"));
		list.add(putData("McDonald Hamburger", "17"));
		
		 
		
		list.add(putData("FRUITS", "120 grams"));
	 
		
		list.add(putData("Apple", "6"));
		list.add(putData("Apricot", "3"));
		list.add(putData("Banana", "16"));
		list.add(putData("Cherries", "9"));
		list.add(putData("Kiwi Fruit", "7"));
		list.add(putData("Nectarine", "4"));
		list.add(putData("Orange", "4"));
		list.add(putData("Pear", "5"));
		list.add(putData("Pineapple", "6"));
		
		list.add(putData("VEGETABLES", "80 grams"));
		
		list.add(putData("Carrots", "2"));
		list.add(putData("Corn (Sweet)", "11"));
		list.add(putData("Peas", "4"));
		list.add(putData("Pumpkin", "3"));
		
		
		return list;
	}

	private HashMap<String, String> putData(String food, String gload) {
		HashMap<String, String> item = new HashMap<String, String>();
		item.put("food", food);
		item.put("gload", gload);
		return item;
	}
    }


