package advancedJavaLearning;

import java.util.LinkedHashSet;
import java.util.Set;

/*
LinkedHashSet is the ordered version of HashSet.
The only difference between HashSet and LinkedHashSet is that:
LinkedHashSet maintains the insertion order.
 When we iterate through a HashSet, the order is
 unpredictable while it is predictable in case of LinkedHashSet.
 NO DUPLICATES ALLOWED
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Integer> linkedHashSetOfIntegers = new LinkedHashSet<>();
        linkedHashSetOfIntegers.add(5);
        linkedHashSetOfIntegers.add(8);
        linkedHashSetOfIntegers.add(4);
        linkedHashSetOfIntegers.add(1);
        linkedHashSetOfIntegers.add(8);
        linkedHashSetOfIntegers.add(9);
        linkedHashSetOfIntegers.add(5);
        linkedHashSetOfIntegers.add(10);
        linkedHashSetOfIntegers.add(4);
        for(Integer skaicius : linkedHashSetOfIntegers) {
            System.out.println(skaicius);
        }
    }
}
