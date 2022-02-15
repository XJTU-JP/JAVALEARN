package set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {

        LinkedHashSet<Object> set = new LinkedHashSet<>();

        set.add(1);
        set.add("AAA");
        set.add("434s");
        set.add(0.1);

        System.out.println(set);

    }
}
