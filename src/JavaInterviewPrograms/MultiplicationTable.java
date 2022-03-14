package JavaInterviewPrograms;
import java.util.Scanner;

//2: Ask user to enter a number and then print the multiplication table of the input number.
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  Number");
		int n= sc.nextInt();
		
		for (int i = 1; i <=10; i++) {
			System.out.println(n + " x " +i +" = " +n*i);
			
		}

	}

}
