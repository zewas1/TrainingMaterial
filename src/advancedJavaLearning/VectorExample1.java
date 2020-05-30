package advancedJavaLearning;

/*
Vector is very much similar to ArrayList, but with few differences,
firstly Vector is thread safe, where as Arraylist is not.
Secondly, Vector is synchronized, where as Arraylist is not,
So performance of Vector is low than ArrayList.
Vector increases its size by 100 % that is it doubles its size when total number of elements exceeds
its capacity whereas ArrayList increases by 50 % of current array size.
Vector can use Enumeration interface as well as Iterator to traverse over its elements.
Vector is a legacy Class, that is it is introduced before JDK 1.2.
Vector doubles its size when elements exceeds its initial capacity.
Vector can use both Enumeration as well as Iterator to traverse elements.
Vector is synchronized.
Vector is Thread Safe.
Vectors can be used for Multi Threading.
Vector is slow as compared to Array List.
 */

import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {
        System.out.println("Vector implements LIST, allows duplicates");
        Vector<Integer> vectorOfIntegers = new Vector<>();
        vectorOfIntegers.add(5);
        vectorOfIntegers.add(2);
        vectorOfIntegers.add(6);
        vectorOfIntegers.add(8);
        vectorOfIntegers.add(1);
        vectorOfIntegers.add(2);
        vectorOfIntegers.add(6);
        vectorOfIntegers.add(8);
        vectorOfIntegers.add(1);
        vectorOfIntegers.add(2);
        vectorOfIntegers.add(6);
        vectorOfIntegers.add(8);
        vectorOfIntegers.add(1);
        System.out.println(vectorOfIntegers);
        vectorOfIntegers.add(3, 123123);
        System.out.println(vectorOfIntegers);
        System.out.println("Vector capacity is : " + vectorOfIntegers.capacity());
    }
}