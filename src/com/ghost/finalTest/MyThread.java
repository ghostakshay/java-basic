package com.ghost.finalTest;

public class MyThread extends Thread {
	
	public MyThread() {
		// TODO Auto-generated constructor stub
	}
	
	MyThread(Runnable r){
		super();
	}
	public void run() {
		System.out.println("Inside Thread");
	}

}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside Runnable");
	}
	
}


