package InputOutput.example3;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Example1 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/InputOutput/example3/thigns.txt");

        List<String> fileLines = Files.readAllLines(path);

        for (String eilute : fileLines){
            System.out.println(eilute);
        }

        List<String> lineInsert = Arrays.asList("maybe", "next", "time");
        Files.write(path, lineInsert);
    }
}