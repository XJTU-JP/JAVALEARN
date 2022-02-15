package set;

import java.util.Comparator;
import java.util.TreeSet;

public class treesettest {

    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        TreeSet set = new TreeSet<>(new Comparator() {




            public int compare(Object o1,Object o2){

                if( ((String)o1).length() == ((String)o2).length() ){
                    //return 1;
                }

                return ((String)o1).length() - ((String)o2).length();
            }

        });


        set.add("a");
        set.add("ab");
        set.add("abc");
        set.add("abcd");
        set.add("aa");

        System.out.println(set);


    }

}
