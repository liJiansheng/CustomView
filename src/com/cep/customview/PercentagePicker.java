package com.cep.customview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.NumberPicker;

public class PercentagePicker extends Activity {
NumberPicker percentPicker; 
private String[] numSel = {"1","2","3"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.percentage_picker);
		
		percentPicker = (NumberPicker) findViewById(R.id.numberPicker1);
		percentPicker.setMinValue(0);
		percentPicker.setMaxValue(100);
		
	}


}
