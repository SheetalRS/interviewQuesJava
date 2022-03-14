package JavaInterviewPrograms;
//2: Given array ["A";"B";"C";"D";"E";"F";"G"]
//A: Add item "NOW I KNOW MY ABCs" at the end. Output should be ["A";"B";"C";"D";"E";"F";"G";"NOW I KNOW MY ABCs"]
//C: Remove ["D";"E";"F";"G"] from the array; Output should be ["123456";"A";"B";"C";"NOW I KNOW MY ABCs"]
//D: Remove ["123456"] from the array; Output should be ["A";"B";"C";"NOW I KNOW MY ABCs"]
//NOTE : Make sure the original array ["A";"B";"C";"D";"E";"F";"G"]should be intact and not modified. you can create any no. of new arrays.
public class Array1 {

	public static void main(String[] args) {
		String[] originalArr= {"A","B","C","D","E","F","G"};
		String[] A=new String[originalArr.length+1];
		String[] B=new String[A.length-3];
		String[] C=new String[B.length-1];
		for (int i = 0; i < A.length; i++) {
			if (i<originalArr.length) {
				A[i]=originalArr[i];
			} else {
				A[i]="NOW I KNOW MY ABCs";
			}
		}
		System.out.print("[");
		for (int i = 0; i < A.length; i++) {
			System.out.print("\""+A[i] +"\""+";");
		}
		System.out.print("]");
		System.out.println("");
		System.out.println("================B=======================");
		for (int i = 0,k=0; i < A.length; i++) {
			if (i==0) {
				String temp=A[0];
				B[k]="12345";
				k++;
				B[k]=temp;
				k++;
			} else if(A[i]=="D" || A[i]=="E"|| A[i]=="F"|| A[i]=="G") {
				continue;
			}else {
				B[k]=A[i];
				k++;
			}
			
		}
		
		
		for (int i = 0; i < B.length; i++) {
			System.out.print("\""+B[i] +"\""+";");
		}
		
		System.out.println("");
		System.out.println("================C=======================");
		
		for (int i = 0,k=0; i < B.length; i++) {
			if (i==0) {
				continue;
			} else {
				C[k]=B[i];
				k++;
			}
			
		}
		
		for (int i = 0; i < C.length; i++) {
			System.out.print("\""+C[i] +"\""+";");
		}
		
		
		
		
	}

}
