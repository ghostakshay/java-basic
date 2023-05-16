package com.ghost.interviewquestion;

public class VarArgTest {

	public void test(int a, int b, int c) {
		System.out.println("Inside Test Int Method");
	}

	public void test(byte... b) {
		System.out.println("Inside byte Test var-arg Method");
	}

	// It only called when some pass array as argument
	public void test(int[] a) {
		System.out.println("Inside Test Int Method");
	}

	public void test(double... d) {
		System.out.println("Inside Double Test var-arg Method");
	}

	public static void main(String[] args) {

		VarArgTest test = new VarArgTest();
		// Method Called Int. It first check argument number if it find appropriate
		// method
		// it will call that
		byte b = 10;
		test.test(b, b, b);
		test.test(10, 12, 55, 60);
	}

}
