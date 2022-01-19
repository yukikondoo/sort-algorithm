
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapPractice{
    public static void main(String[] args){
        
       LinkedHashMap<String, Integer> family = new LinkedHashMap<String, Integer>();

       family.put("Hannah", 27);
       family.put("Yuki", 24);
       family.put("Jonah", 21);

       System.out.println(family);
       System.out.println(family.get("Hannah"));
       System.out.println(family.keySet());
       
    }
}
   
