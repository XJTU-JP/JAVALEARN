package iostream;

import org.junit.jupiter.api.Test;

import java.io.File;

public class createFile {

    public static void main(String[] args) {}

    @Test
    public void f1(){
        File file = new File(".\\file\\test1.txt");
        try {
            file.createNewFile();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void f2(){
        File file = new File(new File(".\\file"),"test2.txt");
        try {
            file.createNewFile();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void f3(){
        File file = new File(".\\file", "test3.txt");
        try {
            file.createNewFile();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
