package exception;

public class demo1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;


        try {
            int c = a / b;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getMessage());
        }

        System.out.println("...................");

    }

}
