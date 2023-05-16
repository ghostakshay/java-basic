package com.ghost.test;

public class MyResource implements AutoCloseable {

	private MyResource1 myResource1;
	private static MyResource1 MyResource11;

	public MyResource(MyResource1 myResource1) {
		super();
		this.myResource1 = myResource1;
	}

	public void display() throws Exception {
		throw new Exception("Custom Exception");
		// System.out.println("Display MyResource");
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Close  MyResource");

	}

	public static void main(String[] args) throws Exception {

		try ( MyResource1 m12 = new MyResource1();
				MyResource m = new MyResource(m12);) {
			m.display();
		} catch (Exception e) {
			System.out.println("****" + e.getMessage());
		}
	}

}
