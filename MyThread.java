package com.ericsson.threads;
public class MyThread implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("slept");
		Thread.currentThread().setPriority(1);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println("child Thread ...");//1-10
		}}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("sleeping");
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		MyThread obj = new MyThread();
		Thread thread = new Thread(obj);
		thread.start();	
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread ...");//5
		}}}