package advancedJavaLearning;

import PrisijungimoSistema.EmailPatterCheck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapAssignment {
    public static void main(String[] args) {

        Map<String, String> vardaiPavardes = new HashMap<>();
        vardaiPavardes.put("Petras", "Petraitis");
        vardaiPavardes.put("Jonas", "Jonaitis");
        vardaiPavardes.put("Tomas", "Tomaitis");

        Map<String, Number> vardaiAmziai = new HashMap<>();
        vardaiAmziai.put("Jonas", 10);
        vardaiAmziai.put("Vasilijus", 30);
        vardaiAmziai.put("Dovydas", 17);

        Map<Integer, String> asmenineInformacija = new HashMap<>();
        asmenineInformacija.put(1996545521, "Kaunas");

        List<String> varduSarasas = new ArrayList<>();
        varduSarasas.add("Variklijus");
        varduSarasas.add("Gaidota");
        varduSarasas.add("Ananasynas");

        Map<String, Map<Integer, String>> vardasAsmenineInfo = new HashMap<>();
        vardasAsmenineInfo.put("Petras", asmenineInformacija);

        Map<String, List> vardaiDraugai = new HashMap<>();
        vardaiDraugai.put("Manvydas", varduSarasas);

        vardaiDraugai.forEach((key, value) -> System.out.println(key + " draugauja su " + value));

        vardasAsmenineInfo.forEach((key, value) -> System.out.println(key + " -> " + value));

    }
}
