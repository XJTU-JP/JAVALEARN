package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test3 {

    public static void main(String[] args) {

        //验证QQ号  1-9开头 5-10位数
        String str = "410618525";

        String regStr = "^[^0][0-9]{4,9}$";

        Pattern pattern = Pattern.compile(regStr);

        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
