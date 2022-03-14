package JavaInterviewPrograms;
import java.util.Scanner;
//Ask the user to input a character and check whether it is an alphabet or not, then display the output on the screen.
//If input character is an Alphabets, print "AN ALPHABET! I can read your mind" and if its a number print "A NUMBER! I can read your mind".
public class NumberOrChara {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Character"); 
		char n= sc.next().charAt(0);
		if (Character.isAlphabetic(n)) {
			System.out.println("AN ALPHABET! I can read your mind");
		} else {
			System.out.println("A NUMBER! I can read your mind");
		}

	}

}
