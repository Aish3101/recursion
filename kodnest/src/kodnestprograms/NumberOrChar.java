package kodnestprograms;

import java.util.Scanner;

public class NumberOrChar {

	public static void main (String[]args) {
	Scanner sc=new Scanner(System.in);
			
			char ch=sc.nextLine().charAt(0);
	if(ch>='0'&& ch<='9')
	{
		System.out.println("Number");
		}
	else
	{
		System.out.println("end");
		
}
	}
}


