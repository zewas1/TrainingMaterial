package advancedJavaLearning;

import java.util.*;

/*
HashSet is the implementation of Set Interface which uses Hash table for storing the data.
Hash table internally uses a phenomena known as hashing,
 Hash set does not maintains the insertion order,
 that is when we retrieve values from it  we do not get that values in the same order as we have entered in it.
 */
public class HashSetExample1 {
    public static void main(String[] args) {
        /*
        NO duplicates allowed
        Return elements in not predictable order
         */
        Set<String> rinkinys = new HashSet<>();
        rinkinys.add("Tom");
        rinkinys.add("Avery");
        rinkinys.add("Bob");
        System.out.println("HashSet values - " + rinkinys);
        List<String> setConvertedToList = new ArrayList<>(rinkinys);
        Collections.sort(setConvertedToList);
        for(String vardas : setConvertedToList) {
            System.out.println(vardas);
        }
        rinkinys.clear();
        System.out.println("Set is now empty - " + rinkinys.isEmpty());
    }
}
