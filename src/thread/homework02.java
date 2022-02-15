package thread;

public class homework02 {
    public static void main(String[] args) {
        sellTicket05 s = new sellTicket05();

        Thread thread1 = new Thread(s);
        Thread thread2 = new Thread(s);
        Thread thread3 = new Thread(s);
        thread1.start();
        thread2.start();
        thread3.start();


    }
}

class sellTicket01 extends Thread{

    private static int num = 100;

    @Override
    public void run() {
        
        while (true) {
            if (num-- <= 0) {
                System.out.println("售票结束");
                break;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "售出1张票" + " 剩余" + (num));
        }

    }
}


class sellTicket02 implements Runnable{
    private static int num = 100;

    @Override
    public void run() {
        while (true) {

            if (num-- <= 0) {
                System.out.println("售票结束");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "售出1张票" + " 剩余" + (num));

        }

    }
}

//方法加锁
class sellTicket03 implements Runnable{
    private int num = 100;

    @Override
    public void run() {
       m();
    }
    public synchronized void m(){
        while (true) {
            if (num-- <= 0) {
                System.out.println("售票结束");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "售出1张票" + " 剩余" + (num));
        }
    }
}

//代码块加锁
class sellTicket04 implements Runnable{
    private int num = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (num <= 0) {
                    System.out.println("售票结束");
                    break;
                }
                System.out.println("窗口" + Thread.currentThread().getName() + "售出1张票" + " 剩余" + (--num));
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}


class sellTicket05 implements Runnable{
    private int num = 100;
    Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (num <= 0) {
                    System.out.println("售票结束");
                    break;
                }
                System.out.println("窗口" + Thread.currentThread().getName() + "售出1张票" + " 剩余" + (--num));
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    }
}