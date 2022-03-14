package JavaInterviewPrograms;
//5: An apple costs 40 cents, a banana costs 60 cents, and a grapefruit costs 80 cents. How much does a pear cost?
// answer is each vowel cost 20
public class CostOfPear {

	public static void main(String[] args) {
		
		String s="pear";
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				sum=sum+20;
				
			} 
			
		}
		
		System.out.println(sum);
		
	}

}
