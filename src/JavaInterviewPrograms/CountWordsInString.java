package JavaInterviewPrograms;
import java.util.Scanner;

//Given a string, count the number of words ending in 'y' or 'z' -- 
//string "heavy" → Output 1 : As it has 1 y at end, so output should be 1.
//string "Yellow"→ Output 0 : As it has 1 y but its not at the end, its at the beginning, so output should be 0.
//string "fez"→ Output 1 : As it has 1 z at end, so output should be 1.
//string "fez day"→ Output 2 : As it has 1 z and 1 y at the end, so output should be 2.
//string "day fez"→ Output 2 : As it has 1 z and 1 y at the end, so output should be 2.
//string "day fyyyz"→ Output 2 : As it has 1 z and 1 y at the end, so output should be 2.
//string "sunday"→ Output 1 : As it has 1 y at the end, so output should be 1.
//string "zero"→ Output 0 : As it has 1 z but its not at the end, its at the beginning, so output should be 0
public class CountWordsInString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string data");
		String a=sc.nextLine();
		System.out.println(a);
		String[] b=a.split(" ");
		int count=0;
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			if ((b[i].charAt(b[i].length()-1)=='y')||(b[i].charAt(b[i].length()-1)=='z')) {
				
				count++;
			}
			
		}
		System.out.println(count);

	}

}
