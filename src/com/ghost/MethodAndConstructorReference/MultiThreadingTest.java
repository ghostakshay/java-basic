package com.ghost.MethodAndConstructorReference;

public class MultiThreadingTest {

	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		MultiThreadingTest obj = new MultiThreadingTest();
		//Method Reference: Run Method and m1 Method has no argument.
		//We can use it for method reference
		//Instance method so call on object.
		Runnable r = obj::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Parent Thread");
		}
	}
}
