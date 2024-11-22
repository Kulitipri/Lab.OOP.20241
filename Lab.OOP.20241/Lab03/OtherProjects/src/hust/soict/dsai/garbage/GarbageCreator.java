package hust.soict.dsai.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;
public class GarbageCreator {
	public static void main(String[] args) {
		
		String filename = "C:\\Users\\Kien\\eclipse-workspace/OtherProjects/src/hust/soict/dsai/garbage/test.txt";
		String filecontent = "";
		long startTime, endTime;
		
		try {
			filecontent = Files.readString(Paths.get(filename));
			startTime = System.currentTimeMillis();
			String outputString = "";
			for (char ch : filecontent.toCharArray()) {
				outputString += ch;
			}
			
			endTime = System.currentTimeMillis();
			System.out.println(endTime - startTime);
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
