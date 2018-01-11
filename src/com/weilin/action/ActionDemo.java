package com.weilin.action;

import com.weilin.service.CustomerService;
import com.weilin.service.impl.CustomerServiceImpl;

/**
 * @author KouWeilin
 * @date 2018年1月10日---下午2:59:07
 */
public class ActionDemo {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();
		customerService.save();
	}
}

