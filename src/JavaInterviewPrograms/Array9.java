package JavaInterviewPrograms;
/*Return true if the array contains three increasing adjacent numbers like.
Ex1: [1, 2, 3] → true
Ex2: [6, 7, 8] → true
Ex3: [15, 16, 17] → true
Ex4: [1, 4, 5, 6, 2] → true
Ex5: [1, 2, 4] → false
Ex6: [1, 5, 6, 8] → false
Ex7: [18, 15, 4] → false*/

public class Array9 {

	public static void main(String[] args) {
		int[] arr= {18, 15, 4};
		boolean flag=true;
		if (arr.length<3) {
			System.out.println("Enter atleast 3 Numbers");
		}else {
			for (int i = 0; i < arr.length; i++) {
				if ((i+1)< arr.length) {
					if (arr[i+1]==(arr[i]+1)) {
						if ((i+2)< arr.length) {
							if (arr[i+2]==(arr[i]+2)) {
								break;
							}else {
								flag=false;
							}
						} else {
							flag=false;
						}
						
					} else if((i+1)< arr.length){
						continue;
					}else if((i+1)> arr.length) {
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
