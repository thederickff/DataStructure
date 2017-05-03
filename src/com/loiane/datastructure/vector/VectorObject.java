package com.loiane.datastructure.vector;

public class VectorObject {
	private Object[] elements;
	private int size;

	public VectorObject(int capacity) {
		this.elements = new Object[capacity];
		this.size = 0;
	}

	
	// Add
	public boolean add(Object element) {
		increaseCapacity();
		if (this.size < this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		} else {
			return false;
		}

	}

	public boolean add(int index, Object element) {
		
		increaseCapacity();
		if (!(index >= 0 && index < this.size)) {
			throw new IllegalArgumentException("Invalid index!");
		}
		// move the elements to the next index
		for (int i = this.size; i > index; i--) {
			this.elements[i] = this.elements[i - 1];
		}

		this.elements[index] = element;
		this.size++;

		return true;
	}

	public void increaseCapacity() {
		if (this.elements.length == this.size) {
			Object[] newElements = new Object[this.elements.length * 2];

			for (int i = 0; i < this.elements.length; i++) {
				newElements[i] = this.elements[i];
			}

			this.elements = newElements;
		}
	}
	// Search
	public Object search(int index) {
		if (!(index >= 0 && index < this.size)) {
			throw new IllegalArgumentException("Invalid index!");
		}
		return this.elements[index];
	}

	public int search(Object s) {

		for (int i = 0; i < this.elements.length; i++) {
			if (s.equals(this.elements[i])) {
				return i;
			}
		}

		return -1;
	}
	
	
	// Remove
	public void removeItem(int index){
		if (!(index >= 0 && index < this.size)) {
			throw new IllegalArgumentException("Invalid index!");
		}
		
		for(int i = index; i < size-1;i++){
			this.elements[i] = this.elements[i+1];
		}
		this.size--;
	}
	public void removeItem(Object item){
		int index = search(item);
		
		if(index > -1){
			removeItem(index);
		}
	}

	public int getSize() {
		return this.size;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < this.size - 1; i++) {
			s.append(this.elements[i]);
			s.append(", ");
		}
		if (this.size > 0) {
			s.append(this.elements[this.size - 1]);
		}
		s.append("]");
		return s.toString();
	}

}
