package JavaInterviewPrograms;
/*
 * Return the number of clumps in the given arrays.
A "clump" in an array is a series of 2 or more adjacent elements of the same value. 
Ex1: clumps([1, 2, 2, 3, 4, 4]) → 2
Ex2: clumps([1, 1, 2, 1, 1]) → 2
Ex3: clumps([1, 1, 1, 1, 1]) → 1
Ex4: clumps([3, 4, 4, 4, 5]) → 1
Ex5: clumps([8, 8, 6, 6, 5, 5]) → 3
Ex6: clumps([10, 9, 8, 7, 6, 6, 5, 4, 4, 4, 3, 3, 3, 2, 2, 1]) → 4
 */
public class Array14 {

	public static void main(String[] args) {
		int[] arr = { 10, 9, 8, 7, 6, 6, 5, 4, 4, 4, 3, 3, 3, 2, 2, 1};
		boolean flag=false;
		int count = 0;
		int index=0;
		for (int i = 0; i < arr.length-1;i++) {
			if ((arr[i]==arr[i+1]&&!flag)) {
				flag=true;
				count++;
			} else if(arr[i]!=arr[i+1]){
				flag=false;
			}
		}
		System.out.println(count);
	}

}
