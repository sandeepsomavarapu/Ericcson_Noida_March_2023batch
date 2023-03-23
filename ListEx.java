package com.ericcson.collections;

import java.util.LinkedList;

//1)both Homogeneous and heterogeneous data allowed 

//2)not fixed in size /growable in nature 

//3)lots utility methods

//List
//1)duplicates are allowed 
//2)insertion order is followed 

public class ListEx {

	public static void main(String[] args) {

		LinkedList<String> al = new LinkedList<String>();// 10
		al.add("suresh");
		al.add("naresh");
		al.add("rajesh");
		al.add("mahesh");
		al.add("hitesh");
		al.add("somesh");
		al.add("suresh");
		al.add(1, "ericsson");
		
		
		System.out.println(al);
		
		
		
		
		
		
		
		
//
//		ListIterator<String> listitr=al.listIterator();
//		
//		while(listitr.hasNext())
//			System.out.println(listitr.next());
//		System.out.println("In reverse .....");
//		while(listitr.hasPrevious())
//			System.out.println(listitr.previous());
//		
//		
//		
//		
//		
//		
//		System.out.println(al.lastIndexOf("suresh"));
//
//		ArrayList<String> al1 = new ArrayList<String>();// 10
//		al1.add("shruthi");
//		al1.add("satakshi");
//		al1.add("rahul");
//		al1.addAll(1,al);
//		System.out.println(al1);
		
		
//		
//		
//		Iterator<String> itr = al.iterator();
//		
//		
//		while(itr.hasNext())
//			System.out.println(itr.next());
//		
//		
//		
//		
		
		
		
		
		
		
		
		
		

		al.remove("hitesh");
//		System.out.println(al.isEmpty());
//		// al.clear();
//		// System.out.println(al.contains("somesh"));
//		// System.out.println(al.size());
//
//		
//		// al1.removeAll(al);
//		//al1.retainAll(al);
//		System.out.println(al1.containsAll(al));
//		System.out.println(al1);
	}

}
