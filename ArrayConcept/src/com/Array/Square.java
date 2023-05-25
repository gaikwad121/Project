package com.Array;

public class Square implements Drawing {

	@Override
	public void draw() {
		
		System.out.println("Draw a squire");
	}

	@Override
	public void erase() {
		System.out.println("Erase a squire");
		
	}
	public static void main(String[] args) {
		Drawing d= new Circle();
		d.draw();
		d.erase();
		Drawing d1=new Square();
		d1.draw();
		d1.erase();
	}
 
}
