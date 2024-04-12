package com.task1.day1;
import java.util.*;
public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner p = new Scanner(System.in);
		System.out.print("Enter the no of class held");
		int held=p.nextInt();
		while(true)
		if(held>0)
		{ 
			break;
		}
		else {
			System.out.println("Enter the valid data");
			held=p.nextInt();
		}
		System.out.print("Enter the no of class attended");
		int attended=p.nextInt();
		while(true)
			if(attended>0)
			{ 
				break;
			}
			else {
				System.out.println("Enter the valid data");
				attended=p.nextInt();
			}
		double percentage;
		percentage=(held/attended)*100;
		System.out.println("The total percentage:"+percentage);
		if(percentage>=75)
		{
			System.out.println("YOu are eligible to write an exam");
			System.out.print("Do you have any medical issue(Y/N");
			char medicalIssue=p.next().charAt(0);
			if(medicalIssue=='y'||medicalIssue=='Y')
			{
				System.out.print("You are eligible to attend the exam");
		    }
			else
			{
				System.out.println("YOu are not eligible");
			}
		}	
		else
		{
			System.out.print("you are not eligible to write an exam");
		
		}
		    
		
		
		

	}

}
