package iostream;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {}

    @Test
    public void writer01(){

        String path = ".\\file\\note.txt";

        FileWriter writer = null;

        try {
            writer = new FileWriter(path,true);
            String str = "ABCD西安交大\r\n换行";
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
