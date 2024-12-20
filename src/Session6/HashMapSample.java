package Session6;

import java.util.HashMap;

public class HashMapSample {
    public static void main(String[] args) {
         HashMap<Integer, String> hashMap = new HashMap<>();
         hashMap.put(1, "Artem");
         hashMap.put(2, "Vladyslav");
         hashMap.put(3, "Eugen");
         hashMap.put(4, "Elena");
         hashMap.put(5, "Gegam");
         hashMap.put(6, "Nastia");
         hashMap.put(7, "Vitalii");
         System.out.println(hashMap);

         hashMap.put(2, "Elena");
        System.out.println(hashMap);
    }
}
