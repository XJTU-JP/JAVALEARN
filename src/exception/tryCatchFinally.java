package exception;

@SuppressWarnings({"all"})
public class tryCatchFinally {


    public static void main(String[] args) {


        try {
            //可能发生异常的代码块
            //当发生异常的时候，代码块中剩余的代码不会再执行，直接进入catch里
            //当没有异常的时候，不会进入catch里
        }catch (Exception e){

        }finally {
            //这个代码块中的代码一定会被执行
            //即使前面有return

        }


    }

}
