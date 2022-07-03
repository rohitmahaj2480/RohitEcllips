package org.javaprogram;

public class additionoftwoMatrix {

	public static void main(String[] args) {

		int ar1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int ar2[][]= {{1,2,3},{4,5,6},{7,8,9}};

		int ar3[][] =new int[3][3];

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ar3[i][j]=ar1[i][j]+ar2[i][j];
				System.out.print(ar3[i][j]+" ");

			}
			System.out.println();
		}

	}

}
