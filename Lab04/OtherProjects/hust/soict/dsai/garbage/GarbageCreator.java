package Lab03.OtherProjects.hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        // ✅ Lấy đường dẫn thư mục chứa class này
        Path currentDir = Paths.get(System.getProperty("user.dir"), 
                                    "Lab03", "OtherProjects", "hust", "soict", "dsai", "garbage");
        Path filePath = currentDir.resolve("test.txt"); // test.txt cùng thư mục

        System.out.println("Đang đọc file: " + filePath.toAbsolutePath());

        byte[] inputBytes = {0};
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(filePath);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b;
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}