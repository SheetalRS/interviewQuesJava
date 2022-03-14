package JavaInterviewPrograms;
import java.util.Scanner;

//Given 2 strings, a and b, return a new string made of the first char of a and the last char of b.
//If either string is length 0, use '@' for its missing char.
//Ex1:("last", "chars") → "ls"
//Ex2:("yo", "java") → "ya"
//Ex3:("hi", "") → "h@"
public class FirstAndLastCharString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two strings");
		String a=sc.nextLine();
		String b=sc.nextLine();
		String result="";
		if (a.length()==0 || a==null) {
			result=result+"@"+b.charAt(b.length()-1);
		}else if(b.length()==0|| b==null) {
			result=result+a.charAt(0)+"@";
		}else {
			result=result+a.charAt(0)+b.charAt(b.length()-1);
		}
		
		System.out.println(result);
	}

}
