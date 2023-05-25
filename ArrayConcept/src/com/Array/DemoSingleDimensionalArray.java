package com.Array;

public class DemoSingleDimensionalArray {
	public static void main(String[] args) {
	/*	int [] arr=new int[98];
		int count=1;
		for(int i=0;i<arr.length;i++) {
			arr[i]=count++;
			
		}
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}*/
		// using a Single Dimensional Array
		singleDarray();
	}

	private static void singleDarray() {
		int arr[]=new int[100];
		int count=1;
		for(int i=0;i<arr.length;i++) {
			arr[i]=count++;
		}
		/*for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]); */
		// Using  a for each loop
		for(int num: arr) {
			System.out.println(num);
		}
		
	}
}
