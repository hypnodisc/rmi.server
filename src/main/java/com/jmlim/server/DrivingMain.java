package com.jmlim.server;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DrivingMain {

	/**
	 * 메인 메소드
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new GenericXmlApplicationContext("classpath:app-context.xml");
	}
}
