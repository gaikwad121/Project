package com.Array;

import java.util.Iterator;

public class DemoMultiDimensionalArray {
	
	public static void main(String[] args) {
		multiDArray();
	}

	private static void multiDArray() {

		int [][] arr=new int[3][3];
		int count =1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=count++;
			}
		}
		/*	for(int i=0;i<arr.length;i++) {
				for (int j=0;j<arr[i].length;j++) {
					System.out.print(" " +arr[i][j]);
				
			}
				System.out.println();
		}
	}

}*/
		// Using a for each loop
		for (int [] row:arr) {
			for(int column: row) {
				System.out.print( " "+column);
			}
			System.out.println();
		}
}
}