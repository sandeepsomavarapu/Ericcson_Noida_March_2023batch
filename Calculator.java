package com.ericcson.oops;

interface SuperParent {// 100% abstraction
	void div(int a, int b);// public abstract void div(int a,int b );

	public abstract void mod(int a, int b);
}

abstract class Parent implements SuperParent { // 0-100 %
	public abstract void add(int a, int b);

	public abstract void sub(int a, int b);
}

public class Calculator extends Parent {// 0
	public void mul(int a, int b) {
		System.out.println("mul of two number's :" + (a * b));
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.mul(12, 2);
		obj.add(2, 3);
		obj.sub(22, 1);
		obj.div(12, 3);
		obj.mod(20, 2);

	}

	@Override
	public void div(int a, int b) {
		System.out.println("div of two numbers : " + (a / b));
	}

	@Override
	public void mod(int a, int b) {
		System.out.println("mod of two numbers : " + (a % b));
	}

	@Override
	public void add(int a, int b) {
		System.out.println("add of two numbers " + (a + b));
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("sub of two numbers " + (a - b));
	}

}
