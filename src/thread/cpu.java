package thread;

import org.junit.jupiter.api.Test;

public class cpu {
    public static void main(String[] args) {}

    @Test
    public void f1(){
        Runtime runtime = Runtime.getRuntime();

        int cpuNum = runtime.availableProcessors();

        System.out.println(cpuNum);
    }
}
