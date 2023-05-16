package com.ghost.test;

public class MyResource1 implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Close  MyResource1");
		
	}

}
