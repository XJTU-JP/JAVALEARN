package thread;

public class state {
    public static void main(String[] args) throws InterruptedException {

        stateTest stateTest = new stateTest();

        System.out.println(stateTest.getName() + " 状态 " +stateTest.getState());

        stateTest.start();
        while (true) {
            System.out.println(stateTest.getName() + " 状态 " + stateTest.getState());
            Thread.sleep(1000);
        }


    }

}

class stateTest extends Thread{

    @Override
    public void run() {
        while (true) {
            for (int i = 0 ; i < 10 ; i++){
                System.out.println("hi" + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
