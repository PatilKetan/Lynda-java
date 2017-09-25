import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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
		
		HashMap<Integer,ArrayList<Double>> retrievedData = new HashMap<Integer,ArrayList<Double>>();
		
		retrievedData.put(Macros.AIR_TEMP, reader.getData(Macros.AIR_TEMP, inputDate));
		retrievedData.put(Macros.BAROMETRIC_PRESSURE, reader.getData(Macros.BAROMETRIC_PRESSURE, inputDate));
		retrievedData.put(Macros.DEW_POINT, reader.getData(Macros.DEW_POINT, inputDate));
		retrievedData.put(Macros.RELATIVE_HUMIDITY, reader.getData(Macros.RELATIVE_HUMIDITY, inputDate));
		retrievedData.put(Macros.WIND_DIRECTION, reader.getData(Macros.WIND_DIRECTION, inputDate));
		retrievedData.put(Macros.WIND_GUST, reader.getData(Macros.WIND_GUST, inputDate));
		retrievedData.put(Macros.WIND_SPEED, reader.getData(Macros.WIND_SPEED, inputDate));
		
		
		System.out.println("AIR TEMPRATURE : " + retrievedData.get(Macros.AIR_TEMP).toString());
		System.out.println("BAROMETRIC PRESSURE : " + retrievedData.get(Macros.BAROMETRIC_PRESSURE).toString());
		System.out.println("DEW POINT : " + retrievedData.get(Macros.DEW_POINT).toString());
		System.out.println("RELATIVE HUMIDITY : " + retrievedData.get(Macros.RELATIVE_HUMIDITY).toString());
		System.out.println("WIND DIRECTION : " + retrievedData.get(Macros.WIND_DIRECTION).toString());
		System.out.println("WIND GUST : " + retrievedData.get(Macros.WIND_GUST).toString());
		System.out.println("WIND SPEED : " + retrievedData.get(Macros.WIND_SPEED 	).toString());
		
		
		
		scanner.close();
	}
	

}


	