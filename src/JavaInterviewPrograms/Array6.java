package JavaInterviewPrograms;
/*
 * Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7.
(every 6 will be followed by at least one 7). Return 0 for no numbers.
Ex1: [1, 2, 2] → 5
Ex2: [1, 2, 2, 6, 7] → 5
Ex3: [1, 1, 6, 7, 2] → 4
 */
public class Array6 {

	public static void main(String[] args) {
		int[] arr= {1, 2, 2};
		int sum=0;
		for (int i = 0; i < arr.length; ) {
			if ((arr[i]==6)&&arr[i+1]==7) {
				if ((i+2)<=(arr.length-1)) {
					i+=2;
				} else {
					break;
				}
				
				
			} else {
				sum=sum+arr[i];
				i++;
			}
		}
		System.out.println(sum);

	}

}
