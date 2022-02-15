package iostream;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {}

    @Test
    public void f1() throws IOException {

        String path = ".\\file\\sql.properties";

        Properties properties = new Properties();

        properties.load(new FileReader(path));

        properties.list(System.out);


        properties.put("sexx","男");
        properties.setProperty("age","2");

        properties.list(System.out);
        properties.store(new FileOutputStream(path),null);

    }
}
