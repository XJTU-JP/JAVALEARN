package thread;

public class DeadLock_ {
    public static void main(String[] args) {
        DeadLockDemo a = new DeadLockDemo(true);
        DeadLockDemo b = new DeadLockDemo(false);

        a.start();
        b.start();

    }

}

class DeadLockDemo extends Thread{

    boolean flag;
    static Object o1 = new Object();
    static Object o2 = new Object();

    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag){
            synchronized (o1){
                System.out.println(Thread.currentThread().getName() + " 进入1");
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName() + " 进入2");
                }
            }
        }else {
            synchronized (o2){
                System.out.println(Thread.currentThread().getName() + " 进入1");
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName() + " 进入2");
                }
            }
        }
    }
}
