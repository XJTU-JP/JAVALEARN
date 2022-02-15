package iostream;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FileInformation {

    public static void main(String[] args) {



    }

    @Test
    public void getInfo(){

        String filePath = ".//file//test.txt";
        File file = new File(filePath);

        System.out.println(file.getName());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        //utf-8编码  英1个字节   汉字3个字节
        System.out.println(file.length());
        System.out.println(file.canRead());
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());


    }

}
