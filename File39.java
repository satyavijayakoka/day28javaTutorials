package javaTutorials;

import java.io.FileWriter;
import java.io.IOException;

public class File39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			FileWriter write = new FileWriter("MyFile.txt",true);
			System.out.println(10/0);
			write.write("hello world");
			write.write("/n");
			write.write("hello satya");
			write.close();
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
