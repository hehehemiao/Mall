package com.lee.server;

import javax.jws.WebService;

import com.lee.bean.T_MALL_USER_ACCOUNT;

@WebService
public interface LoginServer {

	public String login(T_MALL_USER_ACCOUNT user);
	
	public String login2(T_MALL_USER_ACCOUNT user);
}
