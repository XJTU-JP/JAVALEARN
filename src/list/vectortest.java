package list;

import java.util.Vector;

public class vectortest {
    public static void main(String[] args) {

        Vector<Object> vector = new Vector<>(5,10);

        for (int i = 0; i < 100; i++) {
            vector.add(i);
        }



    }
}
