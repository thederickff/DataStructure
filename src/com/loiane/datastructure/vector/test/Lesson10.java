package com.loiane.datastructure.vector.test;

import com.loiane.datastructure.vector.VectorObject;

public class Lesson10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VectorObject vo = new VectorObject(3);
		
		Contact c1 = new Contact("Contact 1", "contact1@example.com", "0982-1029");
		Contact c2 = new Contact("Contact 2", "contact2@example.com", "1678-1431");
		Contact c3 = new Contact("Contact 3", "contact3@example.com", "3563-4264");
		
		vo.add(c1);
		vo.add(c2);
		vo.add(c3);
		
		System.out.println(vo);
		
		vo.removeItem(2);
		vo.removeItem(c1);
		System.out.println(vo.search(0));
		System.out.println(vo.search(c1));
		
		
		
	
	}

}
