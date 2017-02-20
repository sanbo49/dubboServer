/**
 * 
 */
package com.xhxg.server.dubbo.service;

import java.util.Date;


public class DemoServerImpl implements DemoServer {

	/**
	 * 返回添加后的语句
	 */
	@Override
	public String xhxgHelloWorld(String str) {
		str = "Hello " + str + "  2:" + new Date();
		System.err.println("server:" + str);
		return str;
	}

}
