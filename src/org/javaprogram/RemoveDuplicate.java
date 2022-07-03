package org.javaprogram;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Size of array");
		int size =scn.nextInt();
		int arWithDuplicate[]=new int[size];
		int arWithoutDuplicate[]=new int[size];
		//Array Input
		System.out.println("Enter the Array Element");
		for(int i=0;i<size;i++) {

			arWithDuplicate[i]=scn.nextInt();

		}//Sort 
		System.out.println("Sorted Array");
		Arrays.sort(arWithDuplicate);
		for(int i=0;i<arWithDuplicate.length;i++) {
			System.out.println(arWithDuplicate[i]);
		}
		//Logic to remove Duplicate 
		int j = 0;
		for(int i =0;i<size-1;i++) {
			if(arWithDuplicate[i]!=arWithDuplicate[i+1]) {
				arWithoutDuplicate[j]=arWithDuplicate[i];
				j++;
			}
		}
		arWithoutDuplicate[j]=arWithDuplicate[size-1];
		System.out.println("Array Without Duplicate");
		for(int i=0;i<=j;i++) {
			System.out.println(arWithoutDuplicate [i]+" ");
		}


	}
}


