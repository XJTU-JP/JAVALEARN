package niuke;

import java.util.*;


public class NC114 {
    /**
     * 旋转字符串
     * @param A string字符串
     * @param B string字符串
     * @return bool布尔型
     */
    public boolean solve (String A, String B) {
        if(A.length() != B.length())
            return false;
        return (A+A).contains(B);
    }
}