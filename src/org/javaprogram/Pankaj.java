package org.javaprogram;

public class Pankaj {

	public static void main(String[] args) {
	t1();
	}
	public static void t1() 
	{
		t2();
		System.out.println("123");
	}
	
	public static void t2() {
	try {
		System.out.println(" Before Found");
		int a=10/0;
		System.out.println("Found");
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}

}
}