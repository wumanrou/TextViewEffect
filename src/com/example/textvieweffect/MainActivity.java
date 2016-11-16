package com.example.textvieweffect;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView mTitle;//��ʾ������ı���

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mTitle=(TextView)findViewById(R.id.title);//����ID�ڲ����ļ��в��ҿؼ�
		mTitle.setText(Html.fromHtml(getResources().getString(R.string.title)));//Ϊ�ı���ʾ�������ı�����
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
