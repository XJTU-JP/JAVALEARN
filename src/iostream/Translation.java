package iostream;

import org.junit.jupiter.api.Test;

import java.io.*;

public class Translation {
    public static void main(String[] args) {}

    @Test
    public void f1() throws IOException {
        String path = ".\\file\\tran.txt";

        FileInputStream fileInputStream = new FileInputStream(path);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"gbk");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);



        String s = bufferedReader.readLine();

        System.out.println(s);

        bufferedReader.close();
    }
}
