package com.Array;

import java.util.Iterator;

public class ClassOne {
	
	public static void main(String[] args) {
		
	/*	int[] arr=new int[5];
		int count=1;
		for (int i=0; i<arr.length;i++) {
			arr[i]=count++;
		}
		for (int i=0; i< arr.length;i++ )
			System.out.println(arr[i]);
		{
			
		}
	}

}*/
		
		// when u want to add the 1to 10 no in array using loop
		
		int [] array=new int[10];
		int count=0;
		for(int i=0; i<array.length;i++) {
			array[i]=count++;
			
		}
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i]);
		}
			
		
}
}