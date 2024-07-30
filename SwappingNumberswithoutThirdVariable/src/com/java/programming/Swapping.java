package com.java.programming;
import java.util.*;
public class Swapping {
	public static void swap(int a,int b)
	{
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("after swapping "+a+" "+b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("before swapping : "+num1+" "+num2);
		swap(num1,num2);
	}

}
