package com.ericcson.oops;
class Parent2 {
	int age = 29;
	Parent2() {
		this("ericsson");
		System.out.println("from parent default constructor");
	}
	Parent2(String name) {
		System.out.println("from parent param constructor"+ name );
	}
	public void m2() {
		System.out.println("from parent m2 method ");
	}}
public class ThisSuperEx extends Parent2 {
	int age = 30;
	public ThisSuperEx() {
		super();
		System.out.println("child class default constructor");
	}
	public ThisSuperEx(int number) {
		System.out.println("child class param constructor" + number);
	}
	public void m1(int age) {
		System.out.println("from child m1 method " + age + " " + this.age + " " + super.age);
		System.out.println(this);
		this.m2();
		super.m2();              }
	public void m2() {
		System.out.println("from child m2 method ");
	}
	public static void main(String[] args) {
		ThisSuperEx obj = new ThisSuperEx();
	
		obj.m1(111);
	}

}
