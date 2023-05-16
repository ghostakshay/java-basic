package com.ghost.DateTimeAPI;

public class Test {

	public static void main(String[] args) throws Throwable {

		try {
			int a = 10 / 0;
			System.out.println("hi");
			test();

		} catch (Error e) {
			System.out.println("Error" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("fin");
		}
	}

	public static void test() {
		throw new Error("sdff");
	}

}
