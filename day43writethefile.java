package javaTutorials;
import java.io.FileWriter;
import java.io.IOException;
public class day43writethefile {

	public static void main(String[] args) {
		String fileName = "example.txt";
		try {
			FileWriter writer = new FileWriter("example.txt");
			
			writer.write("hello world");
			writer.write("\n");
			writer.write("i am learning java");
			writer.write("\n");
			writer.write("i am learning python");
			writer.write("\n");
			writer.write("i am learning selenium");
			writer.write("\n");
			writer.write("i am learning git");
			writer.close();
			System.out.println("data successfully written and file is closed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
