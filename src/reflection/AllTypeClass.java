package reflection;

import java.io.Serializable;

public class AllTypeClass {
    public static void main(String[] args) {
        Class<String> c1 = String.class;
        Class<Serializable> c2 = Serializable.class;
        Class<Integer[]> c3 = Integer[].class;
        Class<float[][]> c4 = float[][].class;
        Class<Deprecated> c5 = Deprecated.class;
        Class<Thread.State> c6 = Thread.State.class;
        Class<Integer> c7 = int.class;
        Class<Integer> c8 = Integer.class;
        Class<Void> c9 = void.class;
        Class<Class> c10 = Class.class;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);
        System.out.println(c10);



    }
}
