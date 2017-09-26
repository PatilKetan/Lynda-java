import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {
	
	private File inputFile;
	
	public Reader(String fileName) {
		
		inputFile = new File(fileName);
		
	} 
	
	public ArrayList<Double> getData(int offset,String inputDate) throws IOException{
		
		String currentLine;
		Double tempValue;
		ArrayList<Double> sensorValues = new ArrayList<Double>();
		
		BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
		
		
		while ((currentLine = fileReader.readLine()) != null){
			if(currentLine.startsWith(inputDate)){
				tempValue = Double.parseDouble(currentLine.substring(offset, offset+5));
				sensorValues.add(tempValue);
			}
		}
		
		return sensorValues;
	}
	

}
