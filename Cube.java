package com.task1.day1;
import java.util.*;
public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the no: ");
		int n =sc.nextInt();
		
		//Validation 
		if(n>0)
			
			
		{
		System.out.println("The odd number is :"+n );
		for(int i=1;i<=n;i++) 
		{
		if(i%2!=0)
		{
			System.out.println(i);
		}
		}
		System.out.println("The Even number is :"+n );
		for(int i=1;i<=n;i++) {
		{
		if(i%2==0)
		{
			System.out.println(i);
		}
		}
			
		}
		System.out.println("Cubic value of the n number is:"+n *n*n);
		}
		
		else
		System.out.print("Enter the valid data:");

	}

	}
