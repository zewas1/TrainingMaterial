package advancedJavaLearning;

import java.util.*;

public class HashMapExample1 {
    public static void main(String[] args) {
        /*
        MAP - key value pairs. Keys should be unique and immutable
        No duplicate KEYS, values can be identical.
         */
        List<String> names = new ArrayList<>();
        Set<Integer> numbers = new HashSet<>();
        //key (raktas) String tipo, value (reiksme) Integer tipo.
        Map<String, Integer> telefonuKnyga = new HashMap<>();
        telefonuKnyga.put("Tautvydas", 868625555);
        telefonuKnyga.put("Tomas", 869523154);
        telefonuKnyga.put("Arunas", 852415147);
        telefonuKnyga.put("Audrius", 123123123);
        //Entry yra visas irasas
        for (Map.Entry<String, Integer> integerEntry : telefonuKnyga.entrySet()) {
            System.out.println(((Map.Entry) integerEntry).getKey() + " = " + ((Map.Entry) integerEntry).getValue());
        }
        System.out.println();
        //Keyset raktu rinkinys (setas)
        for (String vardas : telefonuKnyga.keySet()) {
            System.out.println(vardas);
        }
        System.out.println();
        //Values yra reiksmiu collectionas
        for (Integer numeris : telefonuKnyga.values()) {
            System.out.println(numeris);
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : telefonuKnyga.entrySet()) {
        }
        System.out.println();
        telefonuKnyga.forEach((key, value) -> System.out.println(key + " - " + value));
        Map<String, List<String>> records = new HashMap<>();
        List<String> favoriteColors = new ArrayList<>();
        favoriteColors.add("Blue");
        favoriteColors.add("Red");
        favoriteColors.add("Green");
        records.put("Edvinas", favoriteColors);
        Map<String, Map<Integer, String>> detaliuIrasai = new HashMap<>();
        Map<Integer, String> detale = new HashMap<>();
        detale.put(1, "Varztas");
        detaliuIrasai.put("Pirmoji detale", detale);
    }
}
