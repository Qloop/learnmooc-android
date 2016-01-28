package com.upc.learnmooc.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.upc.learnmooc.R;
import com.upc.learnmooc.utils.ToastUtils;

/**
 * Created by Explorer on 2016/1/26.
 */
public class LoginActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_activity);
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
		startActivity(new Intent(LoginActivity.this, GuidePagerActivity.class));
		finish();
	}

	/**
	 * 跳转注册界面
	 */
	public void TurnToRegister(View view){
		ToastUtils.showToastLong(LoginActivity.this,"跳注册");
		startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
		finish();
	}

	/**
	 * 登录逻辑与服务器处理
	 */
	public void LoginDeal(View view){

	}

	/**
	 * 忘记密码时跳转
	 */
	public void FindPwd(View view){

	}
}
