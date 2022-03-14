package JavaInterviewPrograms;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//You are driving a little too fast, and a police officer stops you. Write code to compute the result.
//0=no ticket,1=small ticket,2=big ticket.
//- If speed is 60 or less, the result is 0.
//- If speed is between 61 and 80 inclusive, the result is 1.
//- If speed is 81 or more, the result is 2.
//Special note : If it is your birthday -- on that day, your speed can be 5 higher in all cases.
public class SpeedFine {

	public static void main(String[] args) {
		
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter your D.O.B in dd/mm/yy and Speed" ); 
		  String neteredDob=sc.next(); 
		  int speed=sc.nextInt();
		  System.out.println(neteredDob);
		  System.out.println(speed); 
		  String dob="";
		  String[]dates=neteredDob.split("/"); 
		  for (int i = 0; i < dates.length-1; i++) {
			  dob=dob+dates[i];
		}
		 
		//System.out.println(dob);
		Date date = new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("ddMM");
		String currentDate=sdf.format(date);
		//System.out.println(currentDate);
		
		if (dob.equals(currentDate)) {
			
			if (speed<=65) {
				System.out.println("no ticket");
			} else if(speed>65&& speed<=85) {
				System.out.println("small ticket");
			}else if(speed>85) {
				System.out.println("big ticket");
			}
		}else if(!dob.equals(currentDate)){
			if (speed<=60) {
				System.out.println("no ticket");
			} else if(speed>60&& speed<=80) {
				System.out.println("small ticket");
			}else if(speed>80) {
				System.out.println("big ticket");
			}
		}
	}

}
