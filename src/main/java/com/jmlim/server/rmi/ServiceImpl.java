package com.jmlim.server.rmi;

public class ServiceImpl implements Service {
	/**
	 * Reads next record from input
	 */
	public String getMessage(String name) {
		return "Hello " + name;
	}
}
