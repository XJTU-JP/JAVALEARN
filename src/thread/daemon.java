package thread;

public class daemon {
    public static void main(String[] args) throws InterruptedException {

        //子线程设置为主线程的守护线程
        DaemonTest test = new DaemonTest();
        test.setDaemon(true);
        test.start();



        int i = 0;
        while (i++ < 1000){
            Thread.sleep(10);
            System.out.println("输出" + i +Thread.currentThread().getName());
        }


    }
}


class DaemonTest extends Thread{
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}