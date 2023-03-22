package com.ericcson.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws IOException {

		Product product = new Product(123, "samsung", 20000, "electronics");

		FileOutputStream fout = new FileOutputStream("products.txt");

		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(product);
		System.out.println("done");

	}

}
