package com.example.textivew;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

public class MyView extends TextView {

	public MyView(Context context ) {
		super(context );
		// TODO Auto-generated constructor stub
	}
	public MyView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public MyView(Context context, AttributeSet attrs) {
		super(context, attrs);
		TypedArray array = context.obtainStyledAttributes(attrs,
				R.styleable.myview);
		int textCorlor = array.getColor(R.styleable.myview_textColor,
				0x00000000);
		float textSize = array.getDimension(R.styleable.myview_textSize, 12);
		setTextColor(textCorlor);
		setTextSize(textSize);
	}
	
 
}
