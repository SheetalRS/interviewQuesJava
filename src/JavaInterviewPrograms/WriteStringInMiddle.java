package JavaInterviewPrograms;
//a: First string has a fixed length of 4, such as "[[]]"
//b: Second string is a word and can be of any length, such as "Yay", OR "WooHoo"  OR "Word"
//Write a program to return a new string where the second string is in the middle of the first string.
//Ex1: ("<<>>", "Yay") → "<<Yay>>"
//Ex2: ("<<>>", "WooHoo") → "<<WooHoo>>"
//Ex3: ("[[]]", "word") → "[[word]]"
public class WriteStringInMiddle {

	public static void main(String[] args) {
		String a="<<>>";
		String b="WooHoo";
		String result="";
		for (int i = 0; i < a.length(); i++) {
			if (i<2 ||i>2) {
				result=result+a.charAt(i);
			}
			
			if (i==2) {
				result=result+b+a.charAt(i);
			}
		}
		System.out.println(result);

	}

}
