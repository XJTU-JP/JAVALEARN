package list;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {

        ArrayList<Object> list1 = new ArrayList<>();
        for(int i = 1 ; i <= 11 ; i++){
            list1.add(i);
        }

        list1.trimToSize();


    }
}
