package com.hospital.day2;
import java.util.*;

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Book name:");
		String book=sc.next();
		System.out.println( "Book name is:"+book);
		System.out.println("Enter the Author name:");
		String author=sc.next();
		System.out.println("He is good Author");
		System.out.println("Enter the published year:");
		int year =sc.nextInt();
		System.out.println("The published year is:"+year);
		System.out.println("How many pages:");
		int page=sc.nextInt();
		System.out.println("The no of pages:"+page);
		System.out.println("Is the story is nice?");
		boolean story=sc.nextBoolean();
		System.out.println(story);
		
		

	}

}
