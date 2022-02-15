package niuke;

import java.util.*;


public class NC1 {

    public static void main(String[] args) {
        System.out.println(new NC1().solve("124","321"));
    }

    public String solve (String s, String t) {

        StringBuffer SS = new StringBuffer();
        int i = s.length() - 1, j = t.length() - 1, carry = 0;
        while(i >= 0 || j >= 0 || carry > 0){
            int c1 = i >= 0 ? s.charAt(i--) - '0' : 0;
            int c2 = j >= 0 ? t.charAt(j--) - '0' : 0;

            int num = c1 + c2 + carry;

            SS.append(num % 10);
            carry = num / 10;
        }

        return SS.reverse().toString();

    }



}