package JavaInterviewPrograms;
import java.util.Scanner;

//Given a non-empty string and an int n, return a new string where the char at index n has been removed.
//Note : The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
//Ex : Input ("TESTER", 0) → Output "ESTER"
//Ex : Input ("TESTER", 2) → "TETER"
//Ex : Input ("TESTER", 5) → "TESTE"

public class RemoveCharFromString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String and position of char from 0th Position ");
		String s=sc.next();
		int n=sc.nextInt();
		String result="";
		for (int i = 0; i < s.length(); i++) {
			
			if (i==n) {
				continue;
			}else {
				result=result+s.charAt(i);
			}
		}
		System.out.println(result);
	}

}
