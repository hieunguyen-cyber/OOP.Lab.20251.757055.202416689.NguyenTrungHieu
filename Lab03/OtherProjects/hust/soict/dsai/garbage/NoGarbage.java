package Lab03.OtherProjects.hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NoGarbage {
	public static void main(String[] args) {
		Path currentDir = Paths.get(System.getProperty("user.dir"), 
		                            "Lab03", "OtherProjects", "hust", "soict", "dsai", "garbage");
		Path filePath = currentDir.resolve("test.txt");
		byte[] inputBytes = { 0 };
		long startTime, endTime;
		
		try {
			inputBytes = Files.readAllBytes(filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		startTime = System.currentTimeMillis();
		StringBuilder outputStringBuilder = new StringBuilder();
		for (byte b : inputBytes) {
			outputStringBuilder.append((char)b);
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime); // 1
	}

}
