package JavaInterviewPrograms;
import java.util.Scanner;

//Ask user to input length of an array, for example start=1 and end=5
//1: Construct an array of 4 elements i.e. 1,2,3,4 
/*2: Return a new String[] array as stated above, except 
        a: for multiples of 3, use "JUMP" instead of the number 3, 
        b: for multiples of 5  "RUN", 
        c: for multiples of both 3 and 5 use "HOP". 
Ex1: (1, 2) → ["1"]
Ex2: (1, 3) → ["1", "2"]
Ex3: (1, 4) → ["1", "2", "JUMP" ]
Ex4: (1, 5) → ["1", "2", "JUMP", "4" ]
Ex5: (1, 6) → ["1", "2", "JUMP", "4", "RUN"]
Ex6: (1, 8) → ["1", "2", "JUMP", "4", "RUN", "JUMP", "7"]
Ex7: (1, 11) → ["1", "2", "JUMP", "4", "RUN", "JUMP", "7", "8", "JUMP", "RUN"]
Ex8: (1, 16) → ["1", "2", "JUMP", "4", "RUN", "JUMP", "7", "8", "JUMP", "RUN", "11", "JUMP", "13" , "14", "HOP"]*/
public class Array4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter start and end of Array");
		int start=sc.nextInt();
		int end= sc.nextInt();
		int[] arr =new int[end-1];
		String[] arrnew=new String[end-1];
		for (int i =0,st= start; i < arr.length; i++,st++) {
			arr[i]=st;
			
		}
		System.out.println("------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i]%3==0)&& (arr[i]%5!=0) ) {
				arrnew[i]="JUMP";
			} else if((arr[i]%5==0) && (arr[i]%3!=0)){
				arrnew[i]="RUN";
			}else if((arr[i]%3==0) && (arr[i]%5==0)) {
				arrnew[i]="HOP";
			}else {
				arrnew[i]=String.valueOf(arr[i]);
			}
		}
		System.out.println();
		for (int i = 0; i < arrnew.length; i++) {
			System.out.print(arrnew[i]+"\t");
		}
		

	}

}
