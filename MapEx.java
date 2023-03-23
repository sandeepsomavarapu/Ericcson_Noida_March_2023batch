package com.ericcson.collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {
	public static void main(String[] args) {
		TreeMap<Integer, String> emps = new TreeMap<Integer, String>();
		emps.put(123, "mahesh");// Entry
		emps.put(833, "naresh");
		emps.put(941, "rajesh");
		emps.put(43, "somesh");
		emps.put(12, "hitesh");
		emps.put(123, "sandeep");
		emps.put(211, "shreyas");

		System.out.println(emps);

		Set<Entry<Integer, String>> entries = emps.entrySet();

		Iterator<Entry<Integer, String>> itr1 = entries.iterator();
		while (itr1.hasNext()) {
			Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
//boxing unboxing
//		Set<Integer> keys = emps.keySet();
//
//		Iterator<Integer> itr = keys.iterator();
//		while (itr.hasNext()) {
//			int key = itr.next();
//			System.out.println(key + "  " + emps.get(key));
//
//		}

//		TreeMap<Integer, String> emps1 = new TreeMap<Integer, String>();
//		emps1.put(666, "shaheen");
//		emps1.put(777, "ram");
//		emps1.put(888, "anji");
//		emps1.putAll(emps);
//		System.out.println(emps1);

	}
}
