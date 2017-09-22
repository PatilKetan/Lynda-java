import java.io.File;
import java.util.ArrayList;
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
		
		ArrayList<Double> airTemprature = reader.getData(Macros.AIR_TEMP, inputs);
		ArrayList<Double> barometricPressure = reader.getData(Macros.BAROMETRIC_PRESSURE, inputs);
		ArrayList<Double> dewPoint = reader.getData(Macros.DEW_POINT, inputs);
		ArrayList<Double> relativeHumidity = reader.getData(Macros.RELATIVE_HUMIDITY, inputs);
		ArrayList<Double> windDirection = reader.getData(Macros.WIND_DIRECTION, inputs);
		ArrayList<Double> windGust = reader.getData(Macros.WIND_GUST, inputs);
		ArrayList<Double> windSpeed = reader.getData(Macros.WIND_SPEED, inputs);
		
		
		
		
		
		
		scanner.close();
	}
	

}


	