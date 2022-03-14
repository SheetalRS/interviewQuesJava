package JavaInterviewPrograms;
import java.util.Scanner;

//For the given below strings, Return true if the string "cat" and "dog" appear the same number of times.
//Ex1: ("catdog") → true
//Ex2:("catcat") → false
//Ex3:("1cat1cadodog") → true
//Ex4:("catnotdog") → true
public class stringex5 {

	public static void main(String[] args) {
		
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter String");
			String s= sc.next();
			int countCat=0;
			int countDog=0;
			String tempCat=s;
			String tempDog=s;
			String wrd1="cat";
			String wrd2="dog";
			while (tempCat.indexOf("cat")>-1) {
				countCat++;
				tempCat=tempCat.substring(tempCat.indexOf("cat")+wrd1.length());
			}
			System.out.println(countCat);
			while (tempDog.indexOf("dog")>-1) {
				countDog++;
				tempDog=tempDog.substring(tempDog.indexOf("dog")+wrd2.length());
			}
			System.out.println(countDog);
			if (countCat==countDog) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}

	}

}
