package com.ska.sms.dao;

import com.ska.sms.entity.UserInfo;

public interface IUserInfoDAO {
	UserInfo getActiveUser(String userName);
}