package com.Array;

public class DemoString {

	public static void main(String[] args) {
		String str="Hello";
	//	String str2="Hello";
		String str2=new String("Hello");
		//if(str==str2) {
		if(str.equals(str2)) {
			System.out.println("The both the strings are equals");
		}
		else {
			System.out.println("The both the strings are not equals");
		}
		MyDate d= new MyDate(1,5,2023);
		MyDate d2=new MyDate(1,5,2023);
		if(d.equals(d2)) {
			System.out.println("both the strings are equals");
		}
		else {
			System.out.println("Both the strings are not equals");
		}
		System.out.println(d.hashCode());
		System.out.println(d2.hashCode());
	}
}
