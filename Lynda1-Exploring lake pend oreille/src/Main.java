import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		
		String inputs[] = {"","",""};
		
		System.out.println("Enter a year (2014 - 2015)");
		inputs[0] = scanner.nextLine();
		
		System.out.println("Enter a month (1 - 12)");
		inputs[1] = scanner.nextLine();
		
		System.out.println("Enter a day (1 - 31)");
		inputs[2] = scanner.nextLine();
		
		Reader reader = new Reader("Sensor_Data/"+inputs[0]+"/"+inputs[0]+".txt");
		
		
		
		
		scanner.close();
	}
	

}


	