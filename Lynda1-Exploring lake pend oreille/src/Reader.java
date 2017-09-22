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
	
	public ArrayList<Double> getData(double offset,String inputDate) throws IOException{
		
		BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
		
		String currentLine;
		/*read values from file by reading line by line and
		 * for each line cut 4 characters from the given offset 
		 * get each 4 digit number and parse it into double, store in the arraylist,
		 * return that array list 
		 */
		
		while ((currentLine = fileReader.readLine()) != null){
			if(currentLine.startsWith(inputDate)){
				System.out.println(currentLine);
			}
		}
		
		return null;
	}
	

}
