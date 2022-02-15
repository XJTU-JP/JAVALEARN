package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test2 {

    public static void main(String[] args) {

        //验证邮政编码 是一个非0数字开头的6位数
        String str = "134526";

        String regStr = "^[^0][0-9]{5}$";

        Pattern pattern = Pattern.compile(regStr);

        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
