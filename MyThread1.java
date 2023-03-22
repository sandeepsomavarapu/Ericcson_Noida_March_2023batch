package com.ericsson.threads;

public class MyThread1 extends Thread { // Thread child class Runnable
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("child Thread ...");// 1-10
		}
	}

	public static void main(String[] args) throws InterruptedException {

		MyThread1 obj = new MyThread1();
		obj.start();
		obj.join();
		for (int i = 0; i < 10; i++) {
		
			System.out.println("main Thread ...");// 1-10
		}

	}
}