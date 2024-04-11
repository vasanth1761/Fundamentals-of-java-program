package com.task1.day1;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no :");
		int n=sc.nextInt();
		int sum=0;

        //validation
        if(n<0)
		{
			System.out.printf("Enter the valid Data");
		}
        if(n>0)
        	
        {
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			System.out.println(i);
			
		}
		
		System.out.println("The answer is:"+sum);
		

	}

}}
