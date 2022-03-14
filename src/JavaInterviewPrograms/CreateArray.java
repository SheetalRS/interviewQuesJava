package JavaInterviewPrograms;
import java.util.Scanner;

//Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. 
//The given n may be 0, in which case just return a length 0 array.
//Ex1:(4) → [0, 1, 2, 3]
//Ex2:(1) → [0]
//Ex3:(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//Ex4:(0) → [0]
public class CreateArray {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int n= sc.nextInt();
		int[] arr = null;
		if (n==0) {
			arr= new int[1];
		} else if(n>0){
			arr= new int[n];
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i;
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +"\t");
		}
	}
}
