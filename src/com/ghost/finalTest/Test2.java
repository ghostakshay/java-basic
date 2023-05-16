package com.ghost.finalTest;

 class Test2 extends AbsctractTest {

	 public static void main(String[] args) {
		m1(null);
		Test2 t = new Test2();
		t.displaydefault();
		
	}
	 static void  m1(Object m) {
		 System.out.println("Object");
	 }
	 static void m1(String s) {
		 System.out.println("String");
	 }
	@Override
	public void demo() {
		// TODO Auto-generated method stub
		
	}
 }