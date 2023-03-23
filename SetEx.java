package com.ericcson.collections;

import java.util.Comparator;
import java.util.TreeSet;

//1)both Homogeneous and heterogeneous data allowed 
//2)not fixed in size /growable in nature 
//3)lots utility methods
//Set
//1)duplicates are not allowed 
//2)insertion order is not followed 
public class SetEx {
	public static void main(String[] args) {
		TreeSet<String> al = new TreeSet<String>(new MyOrder());// 10-->HashMap(key,value)
		al.add("suresh");
		al.add("naresh");
		al.add("rajesh");
		al.add("mahesh");
		al.add("hitesh");
		al.add("somesh");
		al.add("suresh");
		System.out.println(al);
		//System.out.println("suresh".compareTo("naresh"));
		// returns -ve if obj1 has to come before obj2
		// returns +ve if obj1 has to come after obj2
		// returns 0 if both are same
		//FI-->java.lang.Comparable--->compareTo -->NSO & java.util.Comparator-->compare  -->CSO     
		}}
class MyOrder implements Comparator<String>
{
	@Override
	public int compare(String o1, String o2) {		
		return o2.compareTo(o1);
	}
	}