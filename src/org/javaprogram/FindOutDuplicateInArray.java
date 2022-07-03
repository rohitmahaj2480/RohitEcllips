package org.javaprogram;

public class FindOutDuplicateInArray {

	public static void main(String[] args) {
		int ar[]= {10,20,85,85,62,10,30,96};

		for(int  i =0;i<ar.length;i++) {
			int count=0;
			for(int j =i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					count++;
					System.out.println(ar[i]+" Number is Duplicate in Given Array & Repeted "+count+" times");	
				}
			
				
			}
			
		}

	}

}
