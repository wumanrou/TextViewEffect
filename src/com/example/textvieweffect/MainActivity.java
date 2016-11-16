package com.example.textvieweffect;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView mTitle;//显示标题的文本框

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mTitle=(TextView)findViewById(R.id.title);//根据ID在布局文件中查找控件
		mTitle.setText(Html.fromHtml(getResources().getString(R.string.title)));//为文本显示框设置文本内容
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
