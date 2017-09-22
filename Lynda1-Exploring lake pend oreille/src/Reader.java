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
		System.out.println(fileName);
		
	} 
	
	public ArrayList<Double> getData(int offset,String inputDate) throws IOException{
		
		String currentLine;
		Double tempValue;
		ArrayList<Double> sensorValues = new ArrayList<Double>();
		
		BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
		
		
		while ((currentLine = fileReader.readLine()) != null){
			if(currentLine.startsWith(inputDate)){
				/*read values from file by reading line by line and
				 * for each line cut 5 characters from the given offset 
				 * get each 4 digit number and parse it into double, store in the sensorValues,
				 * return that array list 
				 */
				tempValue = Double.parseDouble(currentLine.substring(offset, offset+5));
				System.out.println(tempValue);
			}
		}
		
		return null;
	}
	

}
