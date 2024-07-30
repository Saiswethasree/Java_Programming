package com.java.programming;
import java.util.*;

public class SwappingNumbers {
	
	public void swap(int a,int b) 
	{
		int swap = 0;
		swap = a;
		a = b;
		b=swap;
		System.out.println("after swap : "+a+" "+b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("before swap : "+num1+" "+num2);
		SwappingNumbers s = new SwappingNumbers();
		s.swap(num1, num2);
	}

}
