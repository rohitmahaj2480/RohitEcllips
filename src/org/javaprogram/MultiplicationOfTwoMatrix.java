package org.javaprogram;

import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class MultiplicationOfTwoMatrix {

	public static void main(String[] args) {

		Scanner scn =new Scanner (System.in);
		int r1,c1,r2,c2,i,j,k;
		System.out.println("Enter The Number of Rows of First Matrix");
		r1=scn.nextInt();
		System.out.println("Enter The Number of Columns of First Matrix");
		c1=scn.nextInt();
		System.out.println("Enter The Number of Rows of Second Matrix");
		r2=scn.nextInt();
		System.out.println("Enter The Number of Columns of Second Matrix");
		c2=scn.nextInt();
		if(c1==r2) {//true 
			int matrix1[][] =new int[r1][c1];//r1Xc1*r2Xc2=r1Xc2
			int matrix2[][] =new int[r2][c2];
			int result[][] =new int[r1][c2];
			System.out.println("Enter the Element of first Matrix");
			for(i=0;i<r1;i++) {
				for(j=0;j<c1;j++) {
					matrix1[i][j]=scn.nextInt();

				}
			}System.out.println("First Matrix");
			for(i=0;i<r1;i++) {
				for(j=0;j<c1;j++) {
					System.out.print(matrix1[i][j]+" ");
				}System.out.println();
			}
			System.out.println("Enter the Element of Second Matrix");
			for(i=0;i<r2;i++) {
				for(j=0;j<c2;j++) {
					matrix2[i][j]=scn.nextInt();
				}
			}
			System.out.println("Second Matrix");
			for(i=0;i<r2;i++) {
				for(j=0;j<c2;j++) {
					System.out.print(matrix2[i][j]+" ");
				}
				System.out.println();	
			}
			//Multiplication Logic 
			for(i=0;i<r1;i++) {
				for(j=0;j<c2;j++) {
					for(k=0;k<r2;k++) {
						result[i][j]=result[i][j]+matrix1[i][k]*matrix2[k][j];
					}
				}
			}
			//TO Print Result Matrix 
			System.out.println("Result Matrix");
			for (i=0;i<r1;i++) {
				for(j=0;j<c2;j++) {
					System.out.print(result[i][j]+" ");
				}
				System.out.println();
			}
		}else {
			System.out.println("Number of Columns of First Matrix should be equal to number of rows of second matrix");
		}
	}

}
