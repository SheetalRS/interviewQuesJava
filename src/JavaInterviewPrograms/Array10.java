package JavaInterviewPrograms;
/*
 * Return an array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. 
If there is no odd value to the right of the zero, leave the zero as a zero.
Ex1: [0, 5, 0, 3] → [5, 5, 3, 3]
Ex2: [0, 4, 0, 3] → [3, 4, 3, 3]
Ex3: [0, 1, 0] → [1, 1, 0]
 */
public class Array10 {

	public static void main(String[] args) {
		int[] arr= {0, 1, 0};
		int index=0;
		for (int i = 0,j=0; i < arr.length; i++) {
			
			if (arr[i]==0) {
				
				if ((i+1)<arr.length) {
					if (!(arr[i+1]%2==0)) {
						arr[i]=arr[i+1];
						arr[index]=arr[i+1];
					}else {
						index=i;
						j++;
					}
				} else {
					continue;
				}
			} else {
				continue;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +"\t");
		}
	}

}
