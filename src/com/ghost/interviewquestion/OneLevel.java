package com.ghost.interviewquestion;

public class OneLevel extends MultileveInheritanceTest {

	int b;

	public OneLevel(int a, int b) {
		super(a);
		this.b = b;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OneLevel [b=" + b + "]";
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
