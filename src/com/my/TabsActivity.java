package com.my;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.TabActivity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;

public class TabsActivity extends TabActivity {
	private TabHost tabHost;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tabHost = getTabHost();
		setTabs();
		tabHost.setCurrentTabByTag("首页");

//		tabHost.setOnTabChangedListener(new OnTabChangeListener() {
//			@Override
//			public void onTabChanged(String tabId) {
//				AlertDialog.Builder builder = new AlertDialog.Builder(
//						TabsActivity.this);
//				Dialog dia;
//				builder.setTitle("提示");
//				builder.setMessage("当前选中了" + tabId + "标签");
//				builder.setPositiveButton("确定", new OnClickListener() {
//					@Override
//					public void onClick(DialogInterface dialog, int which) {
//						dialog.cancel();
//					}
//				});
//				dia = builder.create();
//				dia.show();
//			}
//		});

	}

	private void setTabs() {
		tabHost.addTab(tabHost.newTabSpec("首页").setIndicator("首页")
				.setContent(new Intent(TabsActivity.this, HomeActivity.class)));
		tabHost.addTab(tabHost.newTabSpec("二页").setIndicator("二页")
				.setContent(new Intent(TabsActivity.this, MyActivity.class)));
		tabHost.addTab(tabHost.newTabSpec("三页").setIndicator("三页")
				.setContent(new Intent(TabsActivity.this, MyActivity.class)));

	}
}
