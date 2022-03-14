package JavaInterviewPrograms;
/*
 * Given an array of ints, return true if the number of 1's is greater than the number of 4's
Ex1: [1, 4, 1] → true
Ex2: [1, 4, 1, 4] → false
Ex3: [1, 1] → true
Ex4: [1, 4, 4, 4] → false
Ex51: [1, 1, 1, 4] → true
 */
public class Array11 {

	public static void main(String[] args) {
		int[] arr= {1, 1};
		int countone=0;
		int countfour=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==1) {
				countone++;
			} else {
				countfour++;
			}
		}
		
		if (countone>countfour) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
