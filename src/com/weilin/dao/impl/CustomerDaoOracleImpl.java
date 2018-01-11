package com.weilin.dao.impl;

import com.weilin.dao.CustomerDao;

/**
 * @author KouWeilin
 * @date 2018年1月10日---下午3:04:55
 */
public class CustomerDaoOracleImpl implements CustomerDao {

	@Override
	public void save() {
		System.out.println("模拟，把数据存入Oracle数据库");
	}

}

