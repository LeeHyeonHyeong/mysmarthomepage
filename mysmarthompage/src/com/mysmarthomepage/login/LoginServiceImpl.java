package com.mysmarthomepage.login;

import com.mysmarthomepage.join.MemberServiceImpl;

public class LoginServiceImpl{
	private LoginServiceImpl() {}
	private static LoginServiceImpl instance = new LoginServiceImpl();
	public static LoginServiceImpl getInstance(){
		return instance;
	}
}
