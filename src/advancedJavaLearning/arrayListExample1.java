package advancedJavaLearning;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.*;

public class arrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String> vardai = new ArrayList<String>();
        /*
        list - ordered collection of elements
        array list (class) implements list(interface) extends collection (interface)
         */

        vardai.add("Darius");
        vardai.add("Paulius");
        vardai.add("Jonas");

        //vardai = new LinkedList<>();

        //program to interface and not concrete class
        List<String> varduSarasas = new ArrayList<>();
        varduSarasas.add("Mantas");
        varduSarasas.add("Petras");
        varduSarasas.add("Jack");

        for (String vardas : varduSarasas){
            System.out.println(vardas);
        }

        Collections.sort(varduSarasas);

        for (String vardas : varduSarasas){
            System.out.println(vardas);
        }

        List<Integer> skaiciai = new ArrayList<>();
        skaiciai.add(5);
        skaiciai.add(9);
        skaiciai.add(1);
        skaiciai.add(2);

        skaiciai.forEach(System.out::println);
        System.out.println();
        System.out.println("Max value of this list is " + Collections.max(skaiciai));
        System.out.println("Min value of this list is " + Collections.min(skaiciai));

        varduSarasas = new LinkedList<>();

        System.out.println();

        for (Integer skaicius : skaiciai) {
            System.out.println(skaicius);
        }

    }
}
