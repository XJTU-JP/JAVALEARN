package thread;

import java.util.Locale;
import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Print100 print100 = new Print100();
        GetQ q = new GetQ(print100);

        print100.start();
        q.start();

    }

}

class Print100 extends Thread{

    private boolean flag = true;

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        while (flag){
            System.out.println(Math.random() * 100 + 1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("线程退出");
    }
}

class GetQ extends Thread{
    private Print100 p;
    private Scanner scanner = new Scanner(System.in);

    public GetQ(Print100 p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            char key = scanner.next().toUpperCase().charAt(0);
            if(key == 'Q'){
                p.setFlag(false);
                break;
            }
        }
    }
}

