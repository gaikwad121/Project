package com.Inheritance;

public class BabyDog extends Dog {
	
	void Sleep() {
		System.out.println("the baby dog are sleeping");
	}
	public static void main(String[] args) {
		BabyDog d=new BabyDog();
		d.bark();
		d.run();
		d.Sleep();
		d.Eat();
	}

}
