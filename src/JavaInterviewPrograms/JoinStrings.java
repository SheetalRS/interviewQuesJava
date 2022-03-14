package JavaInterviewPrograms;
import java.util.Scanner;

//Given two strings, a and b, return the result of putting them together in the order abba
//Ex1:("Hi", "Bye") → "HiByeByeHi"
//Ex2:("Yo", "Alice") → "YoAliceAliceYo"
//Ex3:("What", "Up") → "WhatUpUpWhat"
public class JoinStrings {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two Strings");
		String a=sc.next();
		String b=sc.next();
		String result="";
		result=a+b+b+a;
		System.out.println(result);
		
	}

}
