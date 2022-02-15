package thread;

public class homework04 {
}

class GetMoney implements Runnable{
    private double money = 1000d;
    @Override
    public void run() {
        while (true){
            if(money <= 0){
                break;
            }

        }
    }
}
