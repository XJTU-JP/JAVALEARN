package thread;

public class Runnable_ {
    public static void main(String[] args) {
        RunnableTest runnable = new RunnableTest();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

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

class RunnableTest implements Runnable{
    int count = 0;

    @Override
    public void run() {
        int i = 0;
        while (i++ < 1000) {
            System.out.println((++count) + "重写run方法的业务逻辑输出" + Thread.currentThread().getName());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
