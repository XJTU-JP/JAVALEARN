package set;

import java.util.HashSet;

public class hashsettest {

    public static void main(String[] args) {

        HashSet<Object> set = new HashSet<>();

        for (int i = 1; i < 10000; i++) {

            set.add(i);

        }

        System.out.println(set);
    }

}
class test{
    String t;

    public test(String t){
        this.t = t;
    }

    @Override
    public String toString() {
        return "test{" +
                "t='" + t + '\'' +
                '}';
    }

    @Override
    public int hashCode(){
        return 100;
    }
}