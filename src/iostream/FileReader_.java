package iostream;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {}

    /*
    * 用char数组的形式读取文件
    */
    @Test
    public void read01(){
        String path = ".\\file\\filereader.txt";
        FileReader in = null;

        //分别对应‘/r’‘/n’，在对文件字符进行统计与编码时
        char[] chars = new char[8];
        int length = 0;
        try {
            in = new FileReader(path);
            while ((length = in.read(chars)) != -1){
                for(char c : chars){
                    System.out.print(c);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
    * 用单个字符的方式读取文件
    * 换行的时候有 /r /n
    */
    @Test
    public void read02(){
        String path = ".\\file\\filereader.txt";
        FileReader in = null;

        int c;
        try {
            in = new FileReader(path);
            while ((c = in.read()) != -1){
                char c1 = (char)c;
                System.out.print(c1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
