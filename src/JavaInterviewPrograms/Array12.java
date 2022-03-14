package JavaInterviewPrograms;
/*
 * Return an rearranged array, so that all the even numbers come before all the odd numbers. 
Ex1:[1, 0, 1, 0, 0, 1, 1] → [0, 0, 0, 1, 1, 1, 1]
Ex2:[3, 3, 2] → [2, 3, 3]
Ex3:[2, 2, 2] → [2, 2, 2]
 */
		
public class Array12 {

	public static void main(String[] args) {
		int[] arr= {2, 2, 2};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if ((!(arr[i]%2==0))) {
					if (((j)<arr.length)&&(arr[j]%2==0)) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					} else {
						continue;
					}
					
					
				}else {
					continue;
				}	
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}

	}

}
