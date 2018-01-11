package com.weilin.ioc;
/**
 * @author KouWeilin
 * @date 2018年1月10日---下午3:13:40
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BeanFactory {
	
	private static Properties properties = new Properties();
	static {
		InputStream in = BeanFactory.class.getResourceAsStream("/beans.properties");
		try {
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("加载beans.properties文件失败");
		}
	}
	
	public static Object getBean(String name) {
		
		String className = properties.getProperty(name);
		
		try {
			return Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

