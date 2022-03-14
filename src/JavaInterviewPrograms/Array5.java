package JavaInterviewPrograms;
/*
 * Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. 
Ex1: [10, 3, 5, 6] → 7
Ex2: [7, 2, 10, 9] → 8
Ex3: [2, 10, 7, 2] → 8  
 */
public class Array5 {

	public static void main(String[] args) {
		int[] arr= {2, 10, 7, 2};
		int min=arr[0];
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min=arr[i];
			} else if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("max --> "+max+" min --> "+min+" difference --> "+(max-min));

	}

}
