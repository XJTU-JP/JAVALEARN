package iostream;

import org.junit.jupiter.api.Test;

import java.io.File;

public class dir {
    public static void main(String[] args) {}

    @Test
    public void dir1(){
        String path = ".\\file\\dir1test.txt";
        File file = new File(path);

        if(file.exists()){
            if(file.delete()){
                System.out.println("del OK");
            }else {
                System.out.println("del NOT OK");
            }
        }else {
            System.out.println("not exists");
        }
    }

    @Test
    public void dir2(){
        String path = ".\\file\\dir2test";
        File file = new File(path);

        if(file.exists()){
            if(file.delete()){
                System.out.println("dir del ok");
            }else {
                System.out.println("dir del not ok");
            }
        }else {
            System.out.println("dir not exists");
        }
    }

    @Test
    public void dir3(){
        String path = ".\\file\\1\\2\\3";
        File file = new File(path);

        if(!file.exists()){
            if(file.mkdir()){
                System.out.println("mk dir ok");
            }else {
                System.out.println("mk dir not ok");
            }
        }else {
            System.out.println("dir has exists");
        }
    }
}
