package com.regex;
import java.util.*;

public class Team {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     	System.out.print("Enter the age :");
     	int age=sc.nextInt();
     	
		System.out.print("Enter the age 1:");
		int age1=sc.nextInt();
		System.out.print("Enter the age 2:");
		int age2=sc.nextInt();
		System.out.print("Enter the age 2:");
		int age3=sc.nextInt();
		System.out.println(hasteen(age1, age2, age3));
		System.out.println(isteen(age));
		
	}
	 public static boolean hasteen(int age1, int age2,int age3)
	 {
		 if(age1>=13 && age2<=19 ||age2>=13 && age2<=19 || age3>13 && age3<=19 )
		 {
			 return true;
		 }
		 return false;
	 }
	 
	 public static boolean isteen(int age)
	 {
		 if(age>=13 && age<=19)
		 {
			 return true;
		 }
		 return false;
	 }
	 

}
