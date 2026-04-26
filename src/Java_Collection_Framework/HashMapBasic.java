package Java_Collection_Framework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBasic {
    static void main() {
        Map<String, String> mapping = new HashMap<>();
        mapping.put("us "," united state");
        mapping.put("in "," India");
        mapping.put("uk "," united Kingdom");
        mapping.put("Br "," Brazil");
        mapping.put("rus "," Russia");
//        mapping.put("in "," India2");//value is modiefied

        System.out.println(mapping);

Map<String, String> m = new HashMap<>();
m.put("Aus ","Australlia");
        System.out.println("Before: "+m);
        m.putAll(mapping);
        System.out.println("After: "+m);
        System.out.println(m.get("Aus"));
m.put("rus","russia");

        Set<String> keyset = m.keySet();
        System.out.println(keyset);

        Collection<String> valueSet = m.values();
        System.out.println(valueSet);


Set<Map.Entry<String,String>> st = m.entrySet();
        System.out.println("Printing entry: "+st);







        //delete method
//     m.remove("Br","Brazil");
//        System.out.println(m);
//        System.out.println(m.size());
//        m.clear();
//        System.out.println(m.size());

//        m.putIfAbsent("is "," india3");
//        System.out.println(m);

//        System.out.println(m.getOrDefault("usa","none"));
//        System.out.println(m);
//
//        System.out.println(m.containsKey("rus"));
//replace method
        //m.put("pr","putin");
//        System.out.println(m);
//m.replace("pr","Indonesia");
//        System.out.println(m);
    }
}
