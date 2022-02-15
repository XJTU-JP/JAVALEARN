package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {

        String str = "123abc12";

        String regStr = "^[0-9]+[a-z]+";

        //创建模式对象 --> 正则表达式
        Pattern pattern = Pattern.compile(regStr);
        //创建匹配器 根据正则表达式匹配字符串 --> str
        Matcher matcher = pattern.matcher(str);
        /*---------------------------find()的功能------------------------------
        *
        * 1.根据正则表达式 定位满足这个规则的子字符串1
        * 2.找到以后 将子串的 开始索引->startIndex1 记录到 matcher对象的 int[] groups中
        *   也就是 group[0] = startIndex1
        * 3.然后记录 字串的 结束索引->endIndex1 加一后记录到 group[1]
        *   也就是 group[1] = endIndex1 + 1
        * 4.同时记录 oldLast = endIndex1 + 1 表示下次find()的时候从这个位置开始匹配
        *
        * --------------------------再次执行find()-------------------------------
        *
        * 1.根据正则表达式 定位满足这个规则的子字符串2
        * 2.找到以后 将子串的 开始索引->startIndex2 记录到 matcher对象的 int[] groups中
        *   也就是 group[0] = startIndex2
        * 3.然后记录 字串的 结束索引->endIndex2 加一后记录到 group[1]
        *   也就是 group[1] = endIndex2 + 1
        * 4.同时记录 oldLast = endIndex1 + 1 表示下次find()的时候从这个位置开始匹配
        *
        * group()功能
        *   group(0)的功能是 截取从 [group(0) , group(1)) 左闭右开的区间 返回字符串 --> 也就是返回了正确的字符串
        *
        * ----------------------当正则表达式是分组形式的时候-------------------------
        * 正则表达式中的 () 表示分组
        * find():
        * 1.根据正则表达式 定位满足这个规则的子字符串1
        * 2.找到以后 将子串的 开始索引->startIndex1 记录到 matcher对象的 int[] groups中
        *   也就是 group[0] = startIndex1
        * 3.然后记录 字串的 结束索引->endIndex1 加一后记录到 group[1]
        *   也就是 group[1] = endIndex1 + 1
        * 5.接下来是分组记录 因为匹配到的字符串 = [subStr1 + subStr2 + subStr3 ......]
        *   group[2] = subStr1 StartIndex
        *   group[3] = subStr1 EndIndex + 1
        *
        *   group[4] = subStr2 StartIndex
        *   group[5] = subStr2 EndIndex + 1
        *   .......其他分组......
        *
        *   所以group(0) 表示匹配到的整体的那个字符串
        *      group(1) 表示那个字符串的第一个分组的字串
        *      group(2) ..............二..........
        *
        *
        * */
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }

    }
}
