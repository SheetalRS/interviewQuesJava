package JavaInterviewPrograms;
import java.util.Scanner;

//Ask user to input a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
//Ex1:("Hello", 2) → "Helo"        
//Ex2:("Chocolate", 3) → "Choate"        
//Ex3:("Chocolate", 1) → "Ce"
//Ex4:("Hello", 1) → "Ho"       
public class Stringex1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String and number");
		String s= sc.next();
		String result="";
		int n=sc.nextInt();
		if (s.length()<n) {
			System.out.println("Length of string should be at least " + n);
		}else if(s.length()==n){
			result=s;
		}else if(s.length()>n) {
			int i=0;
			while(i <= n-1) {
				result=result+s.charAt(i);
				i++;
			}
			
			int j=s.length()-n;
			while( j <s.length()) {
				result=result+s.charAt(j);
				j++;
			}
			
		}
		System.out.println(result);

	}

}
