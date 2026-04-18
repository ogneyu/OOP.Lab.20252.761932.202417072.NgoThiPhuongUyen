package hust.soict.ite6.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {

        String fileName = "ALongFile.exe";
        byte[] data = {0};
        long startTime;
        long endTime;

        try {
            data = Files.readAllBytes(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        startTime = System.currentTimeMillis();

        StringBuffer buffer = new StringBuffer();
        for (byte value : data) {
            buffer.append((char) value);
        }

        String result = buffer.toString();

        endTime = System.currentTimeMillis();

        System.out.println("Execution time: " + (endTime - startTime) + " ms");
        System.out.println("Length: " + result.length());
    }
}
