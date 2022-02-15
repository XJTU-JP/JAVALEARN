package exception;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class homework1 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try{

            int a = scanner.nextInt();

            int b = scanner.nextInt();

            cel(a,b);

        }catch (InputMismatchException e){
            System.out.println("数据格式错误");

        }catch (NoSuchElementException e){
            System.out.println("没有输入的数据");

        }catch (ArithmeticException e){
            System.out.println("数学计算错误");

        }

    }


    public static void cel(int a,int b) throws ArithmeticException{

        double d = a / b;



        System.out.println(d);
    }
}
