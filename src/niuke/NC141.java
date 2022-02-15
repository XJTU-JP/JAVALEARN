package niuke;

import java.util.*;


public class NC141 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param str string字符串 待判断的字符串
     * @return bool布尔型
     */
    public boolean judge (String str) {
        // write code here

        char[] ch = str.toCharArray();
        for(int i = 0 ; i < ch.length/2 ; i++){

            if(ch[i] != ch[ch.length - 1 - i]){
                return false;
            }

        }
        return true;
    }
}