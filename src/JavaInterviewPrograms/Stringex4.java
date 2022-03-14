package JavaInterviewPrograms;
import java.util.Scanner;

//Return the number of times that the string "code" appears anywhere in the given string 
//Ex1: ("aaacodebbb") → 1
//Ex2: ("codexxcode") → 2
//Ex3: ("codexxcodexxcode") → 3
public class Stringex4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String s= sc.next();
		String wrd="code";
		String temp=s;
		System.out.println(temp);
		//System.out.println(s.indexOf("code"));
		//System.out.println(s.indexOf("coed"));
		int i=0;
		int count=0;
		while (temp.indexOf(wrd)>-1 &&temp.length()>1) {
			count++;
			temp=temp.substring(temp.indexOf(wrd)+wrd.length());
			
		}
		System.out.println(count);
		
	}

}
