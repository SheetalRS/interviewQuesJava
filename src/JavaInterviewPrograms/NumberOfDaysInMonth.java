package JavaInterviewPrograms;
import java.util.Scanner;

//1: Ask user to input starting day and the number of days in a month. Find the number of times every day occurs in that month.
public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		String[] day= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		int count[]= new int[7];
		for (int i = 0; i < 7; i++) {
			count[i]=4;
			
		}
		
		for (int i = 0; i < day.length; i++) {
			//System.out.println(day[i] +" " + count[i]);
		}
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first day of Month and number of days in a month");
		String firstDay=sc.next();
		int noOfDays=sc.nextInt();
		System.out.println(firstDay);
		System.out.println(noOfDays);
		if (!(noOfDays>=28 &&noOfDays<=31)) {
			System.out.println("Enter correct no Of Days");
		} 
		int pos=0;
		for (int i = 0; i < day.length; i++) {
			if (day[i].equalsIgnoreCase(firstDay)) {
				pos=i;
			} 
		}
		
		System.out.println(pos);
		
		int inc=noOfDays-28;
		System.out.println(inc);
		
		for (int i = pos; i < pos+inc; i++) {
			count[i]=5;
		}
		
		for (int i = 0; i < day.length; i++) {
			System.out.println(day[i] +" " + count[i]);
		}
	}

}
