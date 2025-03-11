import java.util.Scanner;

public class WeatherNew{
	public static void main (String[] args){
		
		Scanner damidu = new Scanner(System.in);
		System.out.print("Enter the celcius: ");
		int celsius = damidu.nextInt();
		int fahrenheit =  convert(celcius);
		
        
		System.out.print("Enter the Day: ");
		int days = damidu.nextInt();
		days(days);
		
		System.out.println("It's " + date + " and it's " + txt + ".");
	}
	
	
	
	
	
	static int celcius;
	static String date;
	static String txt;
	
	
	
	public static int convert(int celcius){
		int fahrenheit ;
		 fahrenheit = (celcius * 9/5) + 32;
		if(fahrenheit > 50){
			txt = "Hot";
		}
		else{
			txt = "Cold";
		}
		return fahrenheit;
	}	
	
	
	
	
	
		
		public static int days(int day){
			switch (day){
				case 1:
				date = "Monday";
				break;
				
				case 2:
				date = "Tuesday";
				break;
				
				case 3:
				date = "Wednesday";
				break;
				
				case 4:
				date = "Thursday";
				break;
				
				case 5:
				date = "Friday";
				break;
				
				case 6:
				date = "Saturday";
				break;
				
				case 7:
				date = "Sunday";
				break;
			}
			return day;
		}
		
		
		
		
}