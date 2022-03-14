package JavaInterviewPrograms;
import java.util.Scanner;

/*
 * create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} 
Note that the length of the array will be n*(n + 1)/2.
Ex1: Array(2) → [1, 1, 2]
Ex2: Array(3) → [1, 1, 2, 1, 2, 3]
Ex3: Array(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
 */
public class Array13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int size=n*(n + 1)/2;
		int[] arr= new int[size];
		for (int i = 0,index=0; index < arr.length;i++ ) {
			int num=1;
			for (int j = 0; j <= i; j++,num++,index++) {
			
				arr[index]=num;
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +"\t");
			
		}

	}

}
