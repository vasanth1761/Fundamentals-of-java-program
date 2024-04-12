package com.task1.day1;
import java.util.*;

public class Intergerq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum = 0;
        int product = 1;
        int count = 0;

        System.out.println("Enter integers (press 'q' to quit):");

        while (true) 
        {
            System.out.print("Enter an integer (press 'q' to quit): ");
            if (sc.hasNextInt()) 
            {
                int number = sc.nextInt();
                sum += number;
                product *= number;
                count++;
            } 
            else 
            {
                String input = sc.next();
                if (input.equalsIgnoreCase("q")) 
                {
                    break;
                } 
                else 
                {
                    System.out.println("Invalid. ");
                    System.out.println("Please enter an integer or 'q' to quit.");
                }
            }
        }

        
        double average = count == 0 ? 0 : 
       (double) sum / count;

        
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
	}

}
