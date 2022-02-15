package thread;

public class exit_ {
    public static void main(String[] args) throws InterruptedException {

        T t = new T();
        t.start();

        Thread.sleep(5000);
        t.setLoop(false);

    }
}

class T extends Thread{
    int count = 0;
    private boolean loop = true;
    @Override
    public void run() {
        while (loop){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T " + (count++) + Thread.currentThread().getName());
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}


