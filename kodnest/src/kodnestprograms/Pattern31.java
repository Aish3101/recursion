package kodnestprograms;

import java.util.Scanner;

public class Pattern31 {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number of lines");
		int n=scan.nextInt();
		
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j<=i;j--)
			{
				System.out.print("-");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k);
			}
		
		
System.out.println();
}
	}
}
	
