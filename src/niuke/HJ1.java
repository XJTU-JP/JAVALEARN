package niuke;

import java.util.Scanner;

public class HJ1{
    public static void main(String arg0[]){

        String str = new Scanner(System.in).nextLine();

        int tag = 0;
        for(int i = str.length() - 1 ; i >= 0 ; i--){

            if(str.charAt(i) == ' '){
                tag = i + 1;
                break;
            }

        }


        String subStr = str.substring(tag,str.length());

        System.out.println("最后一个单词为" + subStr + ",长度为" + subStr.length());

    }
}