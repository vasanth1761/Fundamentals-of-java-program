package com.task1.day1;
import java.util.*;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no:");
	int n =sc.nextInt();
		
  for(int i=n;i>0;i--)
  {
	  for(int j=0;j<n-i;j++)
	  {
		  System.out.print(" ");
	  }
      for( int k=0;k<2*i-1;k++)
      {
		 if(k%2==0)
		  {
			  System.out.print("1");
		  }
		 else
		 {
			 System.out.print("0");
		 }
	  }
      System.out.println();
	    
	  }
  }
	}


