package com.task1.day1;
import java.util.*;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int i,j;
		int n=sc.nextInt();
		

        //validation
        if(n<0)
		{
			System.out.printf("Enter the valid Data");
		}
        if(n>0)
        	
        	
        {
		for( i=0;i<=n;i++)
		{
		  	for(j=0;j<=i;j++)
		  	{
		  		System.out.print("*");
		  	}
		  	System.out.println(" ");
		}
        }
		

	}

}
