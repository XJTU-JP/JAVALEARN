package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {

    public static void main(String[] args) {

        String str = "西安交通大学";

        String regStr = "^[\u0391-\uffe5]+$";

        Pattern pattern = Pattern.compile(regStr);

        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
