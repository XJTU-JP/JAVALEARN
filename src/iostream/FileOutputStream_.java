package iostream;

import org.junit.jupiter.api.Test;

import java.io.*;

public class FileOutputStream_ {
    public static void main(String[] args) {}

    @Test
    public void write01(){
        String path = ".\\file\\out.txt";
        FileOutputStream out = null;

        try {
            out = new FileOutputStream(path,true);
            //写入一个字符
            //out.write(65);
            //out.write('A');
            //写入一个字符串
            String str = "abc";
            //out.write(str.getBytes());
            //out.write(str.getBytes(),1,str.getBytes().length - 1);
            out.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void copy01(){
        String inPath = ".\\file\\xjtu.png";
        String outPath = ".\\file\\xjtu2.png";
        String outPath2 = ".\\file\\xjtu2.txt";


        FileInputStream in = null;
        FileOutputStream out = null;
        FileOutputStream out2 = null;

        byte[] bytes = new byte[1024];
        int length = 0;

        try {
            in = new FileInputStream(inPath);
            out = new FileOutputStream(outPath,false);
            out2 = new FileOutputStream(outPath2 ,false);

            while ((length = in.read(bytes)) != -1){
                System.out.println("读取了" + length + "个字符");
                out.write(bytes,0,length);
                out2.write(bytes,0,length);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
                out2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
