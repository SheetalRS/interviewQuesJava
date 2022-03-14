package JavaInterviewPrograms;
import java.util.Scanner;

//Ask user to input a string, return a new string where for every char in the original, there are two chars.
//Ex1: ("The") → "TThhee"
//Ex2: ("AAbb") → "AAAAbbbb"
//Ex3: ("Hi-There") → "HHii--TThheerree"
public class stringex3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String s= sc.next();
		String result="";
		for (int i = 0; i < s.length(); i++) {
			result=result+s.charAt(i)+s.charAt(i);
		}
		System.out.println(result);

	}

}
