package JavaInterviewPrograms;
import java.util.Scanner;

//Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
//Ex : ("Hello", "There") → "ellohere"
//Ex : ("java", "code") → "avaode"
//Ex : ("shotl", "java") → "hotlava"
public class Stringjoin {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter To Strings");
		String a=sc.next();
		String b=sc.next();
		String result="";
		if(!(a.length()==1||b.length()==1)){
			System.out.println("String should be atleast 1 Length");
		}else if(a.length()==1 && b.length()==1) {
			System.out.println("No Outpt as both strings are of length 1");
		}else{
			for (int i = 1; i < a.length(); i++) {
			result=result+a.charAt(i);
			}
			for (int i = 1; i < b.length(); i++) {
			result=result+b.charAt(i);
			}
		}
		System.out.println(result);
	}

}
