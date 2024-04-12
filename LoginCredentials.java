package com.task1.day1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginCredentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		String s1="^[a-z]+[a-z0-9\\.]+@[a-z\\.]+[a-z]$";
		String s2="(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=.*\\d).{5,}";
		
		System.out.println("Enter the email id:");
		String emailid=sc.next();
		while(!(Pattern.matches(s1, emailid))) {
			System.out.println("Email id must have small letters and numbers");
			emailid=sc.next();
			
		}
		
		System.out.println("Enter the password:");
		String password=sc.next();
		while(!(Pattern.matches(s2, password))) {
			System.out.println("Password must have uppercase,smallercase,lowercase,specialcharacters");
			password =sc.next();
		}
		
		
		
		
		Pattern p1=Pattern.compile(s1);
		Pattern p2=Pattern.compile(s2);
		
		
		Matcher m1=p1.matcher(emailid);
		Matcher m2=p2.matcher(password);
		
		
		if(m1.matches() && m2.matches() ) {
			System.out.println("Login Succesfull");
		}
		else {
			System.out.println("Login failed");
		}
		
		
		
        

	}

}
