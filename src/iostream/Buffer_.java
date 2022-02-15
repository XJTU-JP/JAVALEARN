package iostream;

import org.junit.jupiter.api.Test;

import java.io.*;

public class Buffer_ {
    public static void main(String[] args) {}

    @Test
    public void read01(){
        String path = ".\\file\\test.txt";
        String str;
        //节点流
        FileReader fileReader = null;
        //包装流
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            while ((str = bufferedReader.readLine()) != null ){
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void write01() throws IOException{
        String path = ".\\file\\test.txt";
        String Line;

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        fileWriter = new FileWriter(path);
        bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("第一行");
        bufferedWriter.write("\n");
        bufferedWriter.write("第二行");
        bufferedWriter.newLine();
        bufferedWriter.write("第三行");




        bufferedWriter.close();
    }

    @Test
    public void copy01() throws IOException{
        String str = null;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(".\\file\\copy.txt"));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(".\\file\\copy1.txt"));

        while ((str = bufferedReader.readLine()) != null){
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }




        bufferedReader.close();

        bufferedWriter.close();
    }

    @Test
    public void copy02() throws IOException {

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(".\\file\\xjtu.png"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(".\\file\\xjtu3.png"));

        byte[] bytes = new byte[1024];
        int length = 0;
        while ((length = bufferedInputStream.read(bytes)) != -1 ) {
            bufferedOutputStream.write(bytes, 0, length);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();



    }

    public void read02() throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(".\\file\\hello.txt"));

        byte[] bytes = new byte[8];


        while ((bufferedInputStream.read(bytes)) != -1){
            System.out.println();
        }


    }
}
