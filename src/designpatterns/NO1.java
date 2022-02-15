package designpatterns;

import java.util.Scanner;

//封装的思想设计一个计算器
public class NO1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String c = scanner.next();

        Operation1 operation = new Operation1();

        System.out.println(operation.compute(a,b,c));
    }

}

class Operation1{

    public double compute(double a,double b,String c){
        switch (c){
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
        }

        throw new NoSuchOperationException("没有该操作符");
    }

}
