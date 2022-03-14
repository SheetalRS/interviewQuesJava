package JavaInterviewPrograms;
//Ask user to input single string and  Reverse every word in a string and print. ex: Input : "Hello", Output : "olleH".
public class ReverseString {

	public static void main(String[] args) {
		String s= "Hello";
		String n="";
		for (int i = s.length()-1; i >=0 ; i--) {
			n=n+s.charAt(i);
		}
		System.out.println(n);

	}

}
