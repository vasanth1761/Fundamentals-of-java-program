package com.task1.day1;
import java.util.*;
public class Fizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no:");
		int n=sc.nextInt();
		
		//validation
		if(n<0)
		{
			System.out.println("Enter the valid data");
		}
		if(n>0)
		{

		
		for(int i=1;i<=n;i++)
		{
			if(i % 3==0 &&  i%5==0 )
			{
				System.out.println(i +"FIZZBUZZ");
			}
			else if(i%5==0)
			{
				System.out.println(i +"BUZZ");
			}
			else if(i%3== 0 )
			{
				System.out.println(i +"FIZZ");
				
			}
			else
			{
				System.out.println(i);
			}
		}
		}

	}

}
