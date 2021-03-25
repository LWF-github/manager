import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test2 {
    public static void main(String[] args) {
        MultiValueMap<String, String> valueMap = new LinkedMultiValueMap<>();
        valueMap.add("1","1");
        valueMap.add("1","2");
        valueMap.add("1","3");
        valueMap.add("1","4");
        valueMap.add("1","5");
        valueMap.add("2","1");
        valueMap.add("2","2");
        valueMap.add("3","1");
        for (Map.Entry<String, List<String>> stringListEntry : valueMap.entrySet()) {
            List<String> value = stringListEntry.getValue();
        }
        System.out.println(valueMap);

        Map<String,Object> map = new HashMap<>();
        map.put("1",1);
        map.put("2",2);
        System.out.println(map);

        Map<String,List<String>> listMap = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        listMap.put("1",list);
        System.out.println(list);
        System.out.println(listMap);
    }
}
