package thread;

import org.junit.jupiter.api.Test;

public class Thread_ {
    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        //启动后 下面的代码不会阻塞
        t.start();

        for (int i = 1000; ; i++) {
            System.out.println("主线程---" + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}

//继承Thread类 这个类就是线程类
class ThreadTest extends Thread{

    @Override

    public void run() {
        int i = 0;
        while (i++ < 1000) {
            System.out.println("重写run方法的业务逻辑输出" + Thread.currentThread().getName());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
