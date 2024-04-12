package com.task1.day1;
import java.util.*;

public class Pattren3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
          int n = sc.nextInt();
          
         while(true)
        	 if(n>0)
        	 {
        		 break;
        	 }
        	 else
        	 {
        		 System.out.println("Enter the valid data:");
        		 n = sc.nextInt();
        	 }
          
         
  
              for(int i=1; i<n; i+=2)
              {
                  for(int j=i; j<=n; j+=1)
                  {
                      System.out.print(" ");
                  }
                  for(int j=1; j<=i; j+=1)
                  {
                      System.out.print("*");
                  }
                  System.out.println();
              }
              for(int i=1; i<=n; i+=2)
              {
                  for(int j=1; j<=i; j+=1)
                  {
                      System.out.print(" ");
                  }
                  for(int j=i; j<=n; j+=1)
                  {
                      System.out.print("*");
                  }
                  System.out.println();
              }

	}

}
