package algorithms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class InversionDriver {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader(new File("/Users/eVestment/Documents/workspace/Practice/src/algorithms/IntegerArray.txt"));
			BufferedReader br = new BufferedReader(fileReader);
			List<Integer> temps = new ArrayList<Integer>();
			String line;
			while((line = br.readLine()) != null){
				temps.add(Integer.parseInt(line));
			}
			
			br.close();
			fileReader.close();
			
			System.out.println(InversionCounter.count(temps).count);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
