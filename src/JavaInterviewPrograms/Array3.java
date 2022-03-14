package JavaInterviewPrograms;
//Return an array that is "left shifted" by one. You may modify and return the given array, or return a new array.
//Ex1:[6, 2, 5, 3] → [2, 5, 3, 6]
//Ex2:[9, 8, 7, 6, 5] → [8, 7, 6, 5, 9]
//Ex3:[1, 2] → [2, 1]
//Ex4:[1] → [1]
public class Array3 {

	public static void main(String[] args) {
		int[] arr= {1};
		int temp=arr[0];
		for (int i = 0; i < arr.length; i++) {
			
			if (!(i==arr.length-1)) {
				arr[i]=arr[i+1];
			} else {
				arr[i]=temp;
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +"\t");
		}
	}

}
