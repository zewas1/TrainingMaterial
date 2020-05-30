package advancedJavaLearning;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample1 {
    public static void main(String[] args) {
        System.out.println("LinkedList implements LIST and DEQUE, allows duplicates, maintains order");
        List<String> varduSarasas = new LinkedList<>();
        varduSarasas.add("Viktor");
        varduSarasas.add("Ola");
        varduSarasas.add("Johan");
        varduSarasas.add("Bosse");
        varduSarasas.add("Pontus");
        System.out.println("LinkedList before sort: " + varduSarasas);
        Collections.sort(varduSarasas);
        papildomasFuncionalumas(varduSarasas);
        varduSarasas = pridetiVardu(varduSarasas);
        System.out.println("LinkedList after sort: " + varduSarasas);
        if (varduSarasas.contains("Giedrius")) {
            System.out.println("Giedrius sarase yra");
        } else {
            System.out.println("Nera Giedriaus, NEEEERAA!");
        }
        LinkedList<Number> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(6);
        //Nes type LinkedList (konkretesnis)
        numbers.addLast(1);
        numbers.addFirst(0);
        List<Number> otherNumbers = new LinkedList<>();
        //nera addLast, addFirst nes type List (abstraktesnis)
        otherNumbers.add(1);
        otherNumbers.add(5);
    }

    private static List<String> pridetiVardu(List<String> vardai) {
        vardai.add("Tautvydas prisidejo");
        return vardai;
    }

    private static void papildomasFuncionalumas(List<String> vardai) {
        vardai.add("Arunas prisidejo");
    }
}