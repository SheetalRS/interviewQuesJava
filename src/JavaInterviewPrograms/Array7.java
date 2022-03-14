package JavaInterviewPrograms;
/*Given an array of ints, return true if every element is a 1 or a 4.
Ex1:only14([1, 4, 1, 4]) → true
Ex2:only14([1, 4, 2, 4]) → false
Ex3:only14([1, 1]) → true

 */
public class Array7 {

	public static void main(String[] args) {

		int[] arr= {1, 1};
		boolean flag=true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==1 ||arr[i]==4) {
				continue;
			} else {
				flag=false;
			}
		}
		
		if (flag) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
