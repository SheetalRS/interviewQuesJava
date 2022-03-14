package JavaInterviewPrograms;
import java.util.Scanner;

//Given a string, return true if "bad" appears starting at index 0 or 1 in the string, The string may be any length, including 0.
//Ex1:("badxx") → true
//Ex2:("xbadxx") → true
//Ex3:("xxbadxx") → false
public class stringex2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String s= sc.next();
		String result1="";
		String result2="";
		String exp="bad";
		for (int i = 0; i < exp.length(); i++) {
			result1=result1+s.charAt(i);
		}
		
		for (int i = 1; i < exp.length()+1; i++) {
			result2=result2+s.charAt(i);
		}
		
		//System.out.println(result1);
		//System.out.println(result2);
		if (result1.equals(exp)||result2.equals(exp)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
