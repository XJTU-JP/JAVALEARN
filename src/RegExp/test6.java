package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test6 {

    public static void main(String[] args) {
        //结巴
        //
        String str = "西西..西安交...交交....通大...大学";

        //去除点
        String regStr = "\\.";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(str);
        str = matcher.replaceAll("");
        System.out.println(str);

        /*regStr = "(.)\\1+";
        pattern = Pattern.compile(regStr);
        matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group(0) + " " +matcher.group(1));
        }

        str = matcher.replaceAll("$1");
        System.out.println(str);
         */
        regStr = "(.)\\1+";
        pattern = Pattern.compile(regStr);
        matcher = pattern.matcher(str);
        str = matcher.replaceAll("$1");
        System.out.println(str);

    }
}
