package iostream;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ {

    public static void main(String[] args) {}


    @Test
    public void readFile01(){
        String path = ".\\file\\hello.txt";
        FileInputStream fileInputStream = null;
        int r = 0;
        try {
            fileInputStream = new FileInputStream(path);
            //返回 -1 表示到文件结尾
            while ((r = fileInputStream.read()) != -1) {
                System.out.print((char) r + "");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void readFile02() {
        String path = ".\\file\\hello.txt";
        FileInputStream fileInputStream = null;
        int L = 0;
        byte[] b = new byte[8];
        try {
            fileInputStream = new FileInputStream(path);
            while ((L = fileInputStream.read(b)) != -1){
                System.out.println("L = " + L);
                for(byte bt:b){
                    System.out.print(bt+" ");
                }
                System.out.println();
                System.out.println(new String(b,0,L));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
