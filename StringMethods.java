package com.ericsson.stringex;

public class StringMethods {

	public static void main(String[] args) {
//		String orgName1=new String("ericsson");//new 
//		System.out.println(orgName.equalsIgnoreCase(orgName1));
//
//		System.out.println(orgName.compareToIgnoreCase(orgName1));
		// String(Imutable),StringBuffer,StringBuilder(muttable) ""

		// muttable,imuttable

		// 2 ways 1)literal 2)new keyword

		String orgName = "ericsson";// literal

		orgName.concat(" india");
		System.out.println(orgName);

		String orgName1 = "ericsson1";// heap String constant pool

		System.out.println(orgName.equals(orgName1));// true
		System.out.println(orgName.compareTo(orgName1));// 0
		System.out.println(orgName == orgName1);// true

		System.out.println("x".compareTo("h"));// -25

		// returns -ve if obj1 has to come before obj2
		// returns +ve if obj1 has to come after obj2
		// returns 0 if both are same

		String name = new String("ericsson");
		String name1 = new String("ericsson");

		System.out.println(name.equals(name1));// true
		System.out.println(name.compareTo(name1));// 0
		System.out.println(name == name1);// false

		StringBuffer sb = new StringBuffer("india");
		StringBuffer sb1 = new StringBuffer("india");

		//sb.append(" noida");

		//System.out.println(sb);
		
		
		
		
		System.out.println(sb.equals(sb1));// false  ==

		System.out.println(sb == sb1);// false

	}

}
