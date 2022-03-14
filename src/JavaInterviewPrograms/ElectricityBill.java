package JavaInterviewPrograms;
import java.util.Scanner;

//Ask user to input the electricity consumption and calculate the amount based on below parameters...
//1 to 100 units – Rs. 10/unit
//100 to 200 units – Rs. 15/unit
//200 to 300 units – Rs. 20/unit
//above 300 units – Rs. 25/unit
//Input: U = 250,Output: 3500
//Charge for the first 100 units – 10*100 = 1000
//Charge for the 100 to 200 units – 15*100 = 1500
//Charge for the 200 to 250 units – 20*50 = 1000
//Total Electricity Bill = 1000 + 1500 + 1000 = 3500
public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter electricity consumption");
		long unit=sc.nextLong();
		long amount=0;
		if (unit<=100) {
			amount=10*unit;
		} else if(unit>100 &&unit<=200) {
			long temp=unit-100;
			amount=temp*15+10*100;
		}else if(unit>200 &&unit<=300) {
			long temp=unit-200;
			amount=temp*20+10*100+15*100;
		}else if(unit>300) {
			long temp=unit-300;
			amount=temp*25+10*100+15*100+20*100;
		}
		
		System.out.println(amount);

	}

}
