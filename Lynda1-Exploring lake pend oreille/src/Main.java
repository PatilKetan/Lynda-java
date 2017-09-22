import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner  = new Scanner(System.in);
		
		String inputDate;
		
		System.out.println("Enter a date in \"YYYY_MM_DD\" format (Ex : 2014_07_30) for years 2013-2015");
		inputDate = scanner.nextLine();
		
		String year = inputDate.substring(0, 4);
		
		String filePath = "Sensor_Data/"+year+"/"+year+".txt";
		
		Reader reader = new Reader(filePath);
		
		ArrayList<Double> airTemprature = reader.getData(Macros.AIR_TEMP, inputDate);
		ArrayList<Double> barometricPressure = reader.getData(Macros.BAROMETRIC_PRESSURE, inputDate);
		ArrayList<Double> dewPoint = reader.getData(Macros.DEW_POINT, inputDate);
		ArrayList<Double> relativeHumidity = reader.getData(Macros.RELATIVE_HUMIDITY, inputDate);
		ArrayList<Double> windDirection = reader.getData(Macros.WIND_DIRECTION, inputDate);
		ArrayList<Double> windGust = reader.getData(Macros.WIND_GUST, inputDate);
		ArrayList<Double> windSpeed = reader.getData(Macros.WIND_SPEED, inputDate);
		
		
		
		
		
		
		scanner.close();
	}
	

}


	