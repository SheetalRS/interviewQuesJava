package JavaInterviewPrograms;
/*
 * Find the sum of even and odd numbers in the given array.
Ex1: Input[1,2]                        → Output evenSum= 1, oddSum=2
Ex2: Input[3,4,7]                → Output evenSum= 4, oddSum=10
Ex3: Input[8,1,4,6]                → Output evenSum= 18,oddSum=1
Ex4: Input[6,1,3,7,9]        → Output evenSum= 6, oddSum=20
Ex5: Input[1,2,3,0,4,6]        → Output evenSum= 12, oddSum=4
 */
public class Array16 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,0,4,6};
		int evenSum=0;
		int oddSum=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				evenSum=evenSum+arr[i];
			} else {
				oddSum=oddSum+arr[i];
			}
		}
		
		System.out.println("Even sum-->" +evenSum);
		System.out.println("oddSum sum-->" +oddSum);
		
	}

}
