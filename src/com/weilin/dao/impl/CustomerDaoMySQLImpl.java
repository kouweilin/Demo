package com.weilin.dao.impl;

import com.weilin.dao.CustomerDao;

public class CustomerDaoMySQLImpl implements CustomerDao {

	@Override
	public void save() {
		System.out.println("模拟，把数据存入mySql数据库");
	}

}
