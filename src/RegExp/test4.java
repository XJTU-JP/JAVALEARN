package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test4 {

    public static void main(String[] args) {

        //验证手机号码 必须是以13 14 15 18开头的11位
        String str = "18020220600";

        String regStr = "^1[3458][0-9]{9}$";

        Pattern pattern = Pattern.compile(regStr);

        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
