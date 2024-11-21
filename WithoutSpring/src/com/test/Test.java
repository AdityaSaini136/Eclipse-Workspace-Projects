package com.test;

public class Test {
	
	public static void main(String[] args) {
		
		ServiceProvider serviceProvider = new ServiceProvider();
		String remoteService = serviceProvider.getRemoteService();
		System.out.println(remoteService);
		
	}

}
