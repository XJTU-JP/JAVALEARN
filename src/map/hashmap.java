package map;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings({"all"})
public class hashmap {
    public static void main(String[] args) {

        Map map = new HashMap();

        map.put("no3","halun");
        map.put("no1","tom");
        map.put("no2","luck");
        map.put("no1","jack");

        map.get("no3");

        System.out.println(map);

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

    }
}
