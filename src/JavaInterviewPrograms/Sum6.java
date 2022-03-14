package JavaInterviewPrograms;
import java.util.Scanner;
//Ask user to enter two number (int) a and b, return true if a:) either one is 6 b:) Or if their sum is 6 c:) or difference is 6.
//Ex condition [a:] (6,10), (5,6), (9,6) - True
//Ex condition [b:] (1,5), (3,3), (-4,10) - True
//Ex condition [c:] (90,84), (18,12), (-14,20) - True
public class Sum6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two Number");
		int a= sc.nextInt();
		int b= sc.nextInt();
		if (a>0&& b>0) {
			if (a==6 ||b==6 ||(a+b)==6 ||(a-b)==6 ||(b-a)==6) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}else {
			if ((a+b)==6) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}
		
	}

}
