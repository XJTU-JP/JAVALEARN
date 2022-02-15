package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest {

    public static void main(String[] args) {

        String str = "abc11c6";
        String regStr = "\\w{2}";

        Pattern pattern = Pattern.compile(regStr,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }

        System.out.println();

    }

}
