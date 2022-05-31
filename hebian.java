package txet_5_31;

import java.util.*;

public class hebian {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("wo", "ai", "ni");//集合不能改变大小，只能修改

//      list.add("ma");//UnsupportedOperationException
//      list.remove("ai");//UnsupportedOperationException
        list.set(1,"buai");
        System.out.println(list);

//        List<String> list1 = List.of("wo", "ai", "ni");
        //Set<String> set = Set.of("wo", "ai", "ni");
        Map<String, String> hash = new HashMap<String, String>();
        hash.put("wo","ni");
        hash.put("他","她");

        //删除所有元素
        //hash.clear();
        //.remove 删除
        System.out.println(hash.remove("wo"));
        System.out.println(hash.remove("ww"));//NULL
        //contausKey 判断是否有这个主键
        System.out.println(hash.containsKey("wo"));
        System.out.println(hash.containsKey("ww"));
        //.isEmpty判断是否为空
        System.out.println(hash.isEmpty());
        System.out.println(hash);
    }
}
