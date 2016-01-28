package com.upc.learnmooc.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.upc.learnmooc.R;
import com.upc.learnmooc.utils.ToastUtils;

/**
 * 注册页
 * Created by Explorer on 2016/1/26.
 */
public class RegisterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register_activity);
		initViews();
	}

	/**
	 * 初始化页面
	 */
	private void initViews(){

	}

	/**
	 * 返回前一个界面
	 */
	public void BackToPrePager(View view){
		startActivity(new Intent(RegisterActivity.this, GuidePagerActivity.class));
		finish();
	}
	/**
	 * 跳转登录界面
	 */
	public void TurnToLogin(View view){
		ToastUtils.showToastLong(RegisterActivity.this, "跳登录");
		startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
		finish();
	}

	/**
	 * 注册逻辑与服务器处理
	 */
	public void RegisterDeal(View view){

	}
}

