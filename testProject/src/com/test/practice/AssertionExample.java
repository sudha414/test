package com.test.practice;

import java.util.Scanner;

class AssertionExample{  
 public static void main( String args[] ){  
	
		int i,j,k,l=0;
		k = l++;
		System.out.println(k);
		System.out.println(l);
		j = ++k;
		System.out.println(k);
		System.out.println(j);
		i = j++;
		System.out.println(j);
		System.out.println(i);
  Scanner scanner = new Scanner( System.in );  
  System.out.print("Enter ur age ");  
    
  int value = scanner.nextInt();  
  assert value>=18:" Not valid";  
  
  System.out.println("value is "+value);  
 }   
}  