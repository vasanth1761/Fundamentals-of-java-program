package com.task.task;
import java.util.Scanner;
import java.lang.*;


public class Methods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		StringBuilder variable= new StringBuilder();
        String str ="vasanth";
        String str1="welcome,chainsys";
		variable.append(str);
		variable.reverse();
		int length=str.length();
  		System.out.println("The length of the String is:"+length);
        System.out.println("The reverse of the String is:"+variable);
        System.out.println("The first word of the string:"+str.charAt(0));
        System.out.println("The upper case of the string:"+str.toUpperCase());
        System.out.println("The lowercase of the string:"+str.toLowerCase());
        System.out.println("Replace the character:"+str.replace('h', 't'));
        System.out.println("The indexis :"+str.charAt(1));
        System.out.println("The concatenade of two string is:"+str.concat("raj"));
        System.out.println("Replace all character:"+str1.replaceAll("chainsys","vasanth"));
	    System.out.println("The substring is:"+str.substring(5));
	    
	}
	
	

}
