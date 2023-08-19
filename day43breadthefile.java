package javaTutorials;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class day43breadthefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         try {
			FileReader reader = new FileReader("example.txt");
			
			BufferedReader bufferedReader = new BufferedReader(reader);
			try {
			//	System.out.println(bufferedReader.readLine());
			//	System.out.println(bufferedReader.readLine());
				
			String line = bufferedReader.readLine();	
				
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
