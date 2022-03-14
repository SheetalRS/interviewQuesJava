package JavaInterviewPrograms;
/*
 * Write a Java program to form the largest number from a given list of non negative integers.
Ex1: Input[1,2]                        → Output [21]
Ex2: Input[3,4,7]                → Output [743]
Ex3: Input[8,1,4,6]                → Output [8641]
Ex4: Input[6,1,3,7,9]        → Output [97631]
Ex5: Input[1,2,3,0,4,6]        → Output [643210]
 */
public class Array15 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,0,4,6};
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				} else {
					continue;
				}
				
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
