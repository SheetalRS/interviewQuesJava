package JavaInterviewPrograms;
import java.util.Scanner;

//Ask user to input a string of odd length, return the string length 3 from its middle. The string length will be at least 3.
//Ex1:("Candy") → "and"
//Ex2:("and") → "and"
//Ex3:("solving") → "lvi"
//Ex4:("Happy") → "app"
public class PrintMiddleChars {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string data");
		String s= sc.next();
		String result="";
		if (s.length()<=3) {
			System.out.println(s);
		} else {
			for (int i = (s.length()/2)-1; i <=(s.length()/2)+1 ; i++) {
				result=result+s.charAt(i);
			}
		}
		
		System.out.println(result);
	}

}
