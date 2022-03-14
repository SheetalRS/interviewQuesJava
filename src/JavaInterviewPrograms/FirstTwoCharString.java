package JavaInterviewPrograms;
import java.util.Scanner;

//Ask user to input a string, return a new string made of 3 copies of the first 2 chars of the original string. 
//The string may be any length. If there are fewer than 2 chars, use whatever is there.
//Ex1: ("Hello") → "HeHeHe"
//Ex2:("ab") → "ababab"
//Ex3:("H") → "HHH"
public class FirstTwoCharString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		String result="";
		if (s.length()<1) {
			System.out.println("String should have atleast one Character");
		} else if(s.length()==1){
			for (int i = 0; i <= 2; i++) {
				result=result+s.charAt(0);
				
			}
		}else if(s.length()>=2){
			for (int i = 0; i <= 2; i++) {
				result=result+s.charAt(0)+s.charAt(1);
				
			}
		}
		System.out.println(result);
	}

}
