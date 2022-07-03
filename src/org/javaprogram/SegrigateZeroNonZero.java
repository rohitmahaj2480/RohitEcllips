package org.javaprogram;

import java.util.Scanner;

public class SegrigateZeroNonZero {

	public static void main(String[] args) {

		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int size= scn.nextInt();
		System.out.println("Enter the array Elements");
		int ar[]=new int[size];
		int arzero[]=new int[size];
		int arnonzero[]=new int[size];

		for(int i=0;i<size;i++) {
			ar[i]=scn.nextInt();

		}
		System.out.println("User Define Array");
		for(int i=0;i<size;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		int j=0;
		int k=0;
		for(int i=0;i<size;i++) {
			if(ar[i]==0) {
				arzero[j]=ar[i];
				j++;
			}else {
				arnonzero[k]=ar[i];
				k++;
			}
			
		}System.out.println("Zeo Array Element");
		for(int i =0;i<j;i++) {
		
			System.out.print(arzero[i]+" ");
		}
		System.out.println();
		System.out.println("Non Zeo Array Element");
		for(int i =0;i<k;i++) {
			System.out.print(arnonzero[i]+" ");
		}

	}
}




