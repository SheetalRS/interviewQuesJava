package JavaInterviewPrograms;
import java.util.Scanner;
//Generate a random number between 1 and 9 (including 1 and 9). Ask the user to guess the number, then tell them whether they guessed too low, too high, or exactly right

//Exp: If random no is 6 and user input 5 (print "Low"), if user enter 8 (print High), if user input 6 then print ('Right Guess').
public class NumberGuess {

	public static void main(String[] args) {
		
		
		  Scanner sc= new Scanner(System.in); System.out.println("Guess Number"); 
		  int n= sc.nextInt();
		 
		int  randomNum=  (int)(Math.random()*10);
		
		System.out.println(randomNum);
		if (n==randomNum) {
			System.out.println("Right Guess");
		} else if(n<randomNum){
			System.out.println("Low ");
		}else if(n>randomNum){
			System.out.println("High ");
		}
	
	}

}
