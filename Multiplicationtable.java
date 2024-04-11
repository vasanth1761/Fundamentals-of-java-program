package com.task1.day1;
import java.util.*;

public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the table:");
		int n=sc.nextInt();
		
		//validation
		if(n<0)
		{
			System.out.printf("Enter the valid Data");
		}
		if(n>0)
			
		System.out.println("Enter the limit");
		int limit=sc.nextInt();
		
		//validation
		if(n<0)
		{
			System.out.printf("Enter the valid Data");
		}
		if(n>0)
			
		for(int i=1;i<=limit;i++)
		{ 
			
			System.out.printf("%d*%d=%d\n",n,i,n*i);
		}
	    

	}

}

