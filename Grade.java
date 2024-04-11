package com.hospital.day2;
import java.util.*;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student name:");
		String name=sc.next();
		System.out.println("The student name is:"+name);
		System.out.println("The student registration number is:");
		int registrationno=sc.nextInt();
		System.out.println("The registration number is:"+registrationno);
		System.out.println("Enter the marks:");
		int n=sc.nextInt();
		if(n>=90 && n<=100) 
		{
			System.out.println("O Grade");
		}
		else if(n>=80&&n<90) 
		{
			System.out.println("A Grade");
				
		}
		else if(n>=70&&n<80) 
		{
			System.out.println("B Grade");
				
		}
		else if(n>=60&&n<70) 
		{
			System.out.println("c Grade");	
		}
		else if(n>=50&&n<60) 
		{
			System.out.println("D Grade");
		}	
		else
		{
			System.out.println("Sorry you are fail Better luck next time");
		}}}
		
		
		
		

	


