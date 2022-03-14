package JavaInterviewPrograms;
import java.util.Scanner;

//Given a string, compute a new string by moving the first char to come after the next two chars.
//Repeat this process for each subsequent group of 3 chars.Ignore any group of fewer than 3 chars at the end.
//Ex1: ("abc") → "bca"
//Ex2: ("tca") → "act"
//Ex3: ("tcagdo") → "actodg"
//Ex3: ("abcdef") → "bcaefd"
public class stringex6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String ");
		String s= sc.next();
		String result="";
		if (s.length()<3) {
			System.out.println("String should atleast 3 length");
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (i==0||i%3==0) {
					char temp1=s.charAt(i);
					char temp2=s.charAt(i+1);
					char temp3=s.charAt(i+2);
					result=result+temp3+temp2+temp1;
					i=i+2;
					
				}else {
					continue;
				}
			}
		}
		System.out.println(result);
		
	}

}
