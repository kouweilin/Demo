package com.weilin.service.impl;

import com.weilin.dao.CustomerDao;
import com.weilin.dao.impl.CustomerDaoMySQLImpl;
import com.weilin.dao.impl.CustomerDaoOracleImpl;
import com.weilin.ioc.BeanFactory;
import com.weilin.service.CustomerService;

/**
 * @author KouWeilin
 * @date 2018年1月10日---下午2:56:57
 */
public class CustomerServiceImpl implements CustomerService {

//	private CustomerDao customerDao = new CustomerDaoMySQLImpl();
//	private CustomerDao customerDao = new CustomerDaoOracleImpl();
	
	private CustomerDao customerDao = (CustomerDao)BeanFactory.getBean("customerDao");
	
	@Override
	public void save() {
		customerDao.save();
		
	}

}

