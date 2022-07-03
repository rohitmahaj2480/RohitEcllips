package org.javaprogram;

import java.util.Arrays;
import java.util.List;

public class SegrigateZero {

	public static void main(String[] args) {
		int ar[]= {0,1,2,0,8,6,5,0,8,0,5,98,0};
		SegrigateZero.zeroatend(ar);
		SegrigateZero.zeroatstart(ar);
		
	}
	
	public static void zeroatend(int ar[]) {
		
		int resultArray[] = new int[ar.length];
		int k=0;
		for(int i =0;i<ar.length;i++) {
			if(ar[i]!=0) {
				resultArray[k]=ar[i];
				k++;
			}
		}System.out.println("zeros at end");
		for(int i =0;i<resultArray.length;i++) {
			System.out.println(resultArray[i]);
			
		}
		
	}public static void zeroatstart(int ar[]) {
		int resultArray[] = new int[ar.length];
		int j=0;
		int count=0;
		for(int i =0;i<ar.length;i++) {
			if(ar[i]==0)
			count++;	
		}
		System.out.println(count);
		for(int i =0;i<count;i++) {
			resultArray[j]=0;
			j++;
		}
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=0) { 
			resultArray[j]=ar[i];
			j++;
			//System.out.println(ar[i]);
			}
		}
		System.out.println("zeros at start");
		for(int i =0;i<resultArray.length;i++) {
			System.out.println(resultArray[i]);
		}
		
	}
}
		
		

		