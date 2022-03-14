package JavaInterviewPrograms;
import java.util.Scanner;

//Two inputs i.e. (string, boolean value). Ask user to input string and check If boolean value set to TRUE, return a string length 1 from its beginning,
//if its set to FALSE, return a string length 1 from its end.
//Note : The string will be non-empty.
//Ex1:("Hello", true) → "H"
//Ex2:("Hello", false) → "o"
//Ex3:("oh", true) → "o

public class StringBooleanVal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String data and true/false");
		String a= sc.next();
		boolean flag=sc.nextBoolean();
		if (flag) {
			System.out.println(a.charAt(0));
		}else {
			System.out.println(a.charAt(a.length()-1));
		}

	}

}
