package com.ghost.interviewquestion;

public class SecondLevel extends OneLevel {

	int c;

	public SecondLevel(int a, int b, int c) {
		super(a, b);
		this.c = c;
		// TODO Auto-generated constructor stub
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "SecondLevel [c=" + c + "]";
	}
}
