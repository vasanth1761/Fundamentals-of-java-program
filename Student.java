package com.hospital.day2;
import java.util.*;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the student name:");
    String student=sc.next();
    System.out.println("The student name is:"+student);
    System.out.println("Enter the bood group:");
    String bloodgroup=sc.next();
    System.out.println("The blood group is:"+bloodgroup);
    System.out.println("Enter the registration number:");
    long no=sc.nextLong();
    System.out.println("The registration number:"+no);
    System.out.println("Is Student having any standing arrears:");
    boolean arrear=sc.nextBoolean();
    System.out.println(arrear);
    System.out.println("Enter the student  percenage:");
    float percentage=sc.nextFloat();
    System.out.println("The student percentage is:"+percentage);
    
	}

}
