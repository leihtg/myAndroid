package com.my;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MyAndroidActivity extends Activity implements OnClickListener {
	private Button btn;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		btn = (Button) findViewById(R.id.btn);
		btn.setOnClickListener(this);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		Toast.makeText(getApplicationContext(), "欢迎回来!", Toast.LENGTH_SHORT)
				.show();
	}

	@Override
	public void onClick(View v) {
		if (btn == v) {
			Toast.makeText(getApplicationContext(),
					"打开" + getString(R.string.zidingyi), Toast.LENGTH_SHORT)
					.show();
			/* 设置ContentView为自定义的MyVieW */
			Intent intent = new Intent(this, MyActivity.class);
			startActivityForResult(intent, 1);
		}
	}

}
