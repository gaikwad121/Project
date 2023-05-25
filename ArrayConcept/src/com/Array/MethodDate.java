package com.Array;

import java.util.Date;

public class MethodDate {
	static int day;
	static int month;
	static int year;
	
/*	public void AcceptDate(int d,int m,int y) {
		day=d;
		month=m;
		year=y;
	}*/
	/*// Using Contructor
	public MethodDate() {
		day=10;
		month=5;
		year=2023;
	}
	*/
	// Using parametrized constructore
	public MethodDate(int d,int m,int y) {
		day=d;
		month=m;
		year=y;
	}
	
	public void printDate() {
		System.out.println("Date"+ "/"+day+"/"+month+"/"+year);
	}
	public static void main(String[] args) {
		MethodDate d=new MethodDate(10, 5, 2023);
		//d.AcceptDate(5, 10, 2023);
		d.printDate();
	//	Date date=new Date();
		//System.out.println("today date"+ " " +date);
	}

}
