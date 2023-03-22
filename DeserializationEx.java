package com.ericcson.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fout = new FileInputStream("products.txt");

		ObjectInputStream out = new ObjectInputStream(fout);

		Product product = (Product) out.readObject();

		System.out.println(product);

	}

}