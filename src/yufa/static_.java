package yufa;

public class static_ {
    public static void main(String[] args) {
        staticTest test = new staticTest();
        staticTest test1 = new staticTest();

        test.numjj();
        test1.numjj();
    }
}

class staticTest{
    static int num = 10;

    public void numjj(){
        System.out.println("num = " + (--num));
    }
}
