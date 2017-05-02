package com.loiane.datastructure.vector.test;

import com.loiane.datastructure.vector.Vector;

public class Lesson9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vector = new Vector(2);

		vector.add("B");
		vector.add("G");
		vector.add("E");
		vector.add("F");
		
		vector.removeItem("G");
		System.out.println(vector);
	}

}
