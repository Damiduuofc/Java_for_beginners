import java.util.Scanner;

public class WeatherNew {
    static String date;
    static String txt;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the celsius: ");
        int celsius = scanner.nextInt();
        int fahrenheit = convert(celsius); 

        System.out.print("Enter the Day (1-7): ");
        int day = scanner.nextInt();
        getDayName(day); 
      
		System.out.println("It's " + fahrenheit + "°F on " + date + " and it's " + txt + ".");
    }

    public static int convert(int celsius) {
        int fahrenheit = (celsius * 9 / 5) + 32;
        if (fahrenheit > 50) {
            txt = "Hot";
        } else {
            txt = "Cold";
        }
        return fahrenheit; 
    }

    public static void getDayName(int day) {
        
		switch (day) {
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
            
			default:
			date = "Invalid day";
			break;
        }
    }
}
