package com.examp.praveentest;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setLayout();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void setLayout(){

		
		LinearLayout parentLinearLayout = (LinearLayout)findViewById(R.id.parent);
		
		for (int i = 0; i < 12; i++) {
			
		
		LinearLayout linearLayout = new LinearLayout(this);
		linearLayout.setOrientation(LinearLayout.VERTICAL);
		LinearLayout.LayoutParams layout=new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		
		layout.setMargins(20, 20, 0, 0);
		linearLayout.setLayoutParams(layout);
		
		ImageView question = new ImageView(this);
		 LayoutParams lparam = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
		 question.setLayoutParams(lparam);
		 question.setImageResource(R.drawable.images);
		 linearLayout.addView(question);
	    TextView questionName = new TextView(this);
	    LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
	    questionName.setLayoutParams(lparams);
	  
	    
	    questionName.setGravity(Gravity.CENTER);
	    questionName.setText("text");
	    questionName.setTextSize(25);
	    questionName.setTypeface(Typeface.DEFAULT_BOLD);
	    linearLayout.addView(questionName);
	    linearLayout.setBackgroundColor(Color.RED);
	    parentLinearLayout.addView(linearLayout);
		}
	   
	
	}
}
