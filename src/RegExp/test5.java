package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test5 {

    public static void main(String[] args) {
        //验证一个url
        //
        String str = "https://www.bilibili.com/video/BV1Eq4y1E79W?p=17&spm_id_from=pageDriver";

        String regStr = "^http(s)?://[w]";

        Pattern pattern = Pattern.compile(regStr);

        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
