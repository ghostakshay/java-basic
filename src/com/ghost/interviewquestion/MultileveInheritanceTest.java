package com.ghost.interviewquestion;

public class MultileveInheritanceTest {

	int a;

	public MultileveInheritanceTest(int a) {
		super();
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "MultileveInheritanceTest [a=" + a + "]";
	}
	
}
