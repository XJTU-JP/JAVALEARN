package thread;

public class homework01 {
    public static void main(String[] args) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread1 = new Thread(new T1());
        Thread thread2 = new Thread(new T2());

        thread1.start();
        thread2.start();

        for(int i = 0 ; i < 20 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main" + Thread.currentThread().getName());
        }
    }

}

class T1 implements Runnable{
    int count = 0;

    @Override
    public void run() {
        while ((++count) < 10){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T1" + Thread.currentThread().getName());
        }
    }
}

class T2 implements Runnable{
    int count = 0;

    @Override
    public void run() {
        while ((++count) < 5){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T2" + Thread.currentThread().getName());
        }
    }
}
