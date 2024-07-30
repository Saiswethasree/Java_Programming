package com.java.programming;

public class HelloWorld {
	
	public String helloWorld()
	{
		return "Hello World";
	}
	
	public static void main(String[] args) {
		HelloWorld h = new HelloWorld();
		System.out.println(h.helloWorld());
	}

}
