package JavaInterviewPrograms;
import java.util.Scanner;

//Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
//Ex : ("WooHoo") → "Woo"
//Ex : ("HelloThere") → "Hello"
//Ex : ("abcdef") → "abc"
public class PrintFirstHalfOfString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Even length String");
		String s= sc.next();
		String result="";
		if (!(s.length()%2==0)) {
			System.out.println("Enter Even Length String");
		}else {
			for (int i = 0; i < s.length()/2; i++) {
				result=result+s.charAt(i);
				
			}
		}
		System.out.println(result);

	}

}
