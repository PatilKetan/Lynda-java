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
	
	public ArrayList<Double> getData(double offset,String inputDate) throws IOException{
		
		
		
		BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
		String currentLine;
		
		while ((currentLine = fileReader.readLine()) != null){
			if(currentLine.startsWith(inputDate)){
				System.out.println(currentLine);
			}
		}
		
		
		return null;
	}
	

}
