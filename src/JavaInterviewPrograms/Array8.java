package JavaInterviewPrograms;
/*
 * Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element.
Ex1: [1, 7, 7] → true
Ex1: [1, 7, 1, 7] → true
Ex1: [1, 7, 1, 1, 7] → false
Ex1: [7, 7, 1, 1, 7] → false
Ex1: [9, 0, 5, 1, 7] → false
Ex1: [7, 7, 7, 7, 7] → true
 */
public class Array8 {

	public static void main(String[] args) {
		int[] arr= {7, 7, 7, 7, 7};
		boolean flag=true;
		
		int index=0;
		for (int j = 0; j < arr.length; j++) {
			if ((arr[j]==7)) {	
				if ((j+1)< arr.length) {
					if ((arr[j+1]==7)) {
						break;
					} else if((j+2)< arr.length){
						if (arr[j+2]==7) {
							break;
						} else {
							flag=false;
						}

					}else if((j+2)> arr.length) {
						flag=false;
					}
				} else {
					flag=false;
				}
				
				
			}
		

	}
		if (flag) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
}
}
