package thread;

public class method {
    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();

        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        Thread t3 = new Thread(test);

        t1.setName("线程1");
        t2.setName("线程2");
        t3.setName("线程3");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t3.join();



    }
}


class Test implements Runnable{


    @Override
    public void run() {
        int i = 0;
        while (i++ < 1000) {
            System.out.println("重写run方法的业务逻辑输出 - " + Thread.currentThread().getName());



        }
    }
}

