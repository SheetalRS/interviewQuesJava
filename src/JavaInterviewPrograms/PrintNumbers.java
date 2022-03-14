package JavaInterviewPrograms;
import java.util.Scanner;

//3:Ask user to enter the starting number and ending number and Print all the prime numbers between starting and ending number.
public class PrintNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Start Number and End Number");
		
		int stnum=sc.nextInt();
		int endnum=sc.nextInt();
		for (int i = stnum; i < endnum; i++) {
			System.out.println(i);
			
		}
	}

}
