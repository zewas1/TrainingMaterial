package InputOutput.example1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MyFileWritter {
    public static void main(String[] args) throws IOException {
        File failas = new File ("src/InputOutput/example1/vardai.txt");

        List<String> names = Arrays.asList("Thomas", "Michael", "Kobe");

        System.out.println("Writing to file...");

        BufferedWriter br = new BufferedWriter(new FileWriter(failas));

        for (String name : names ){
            try {
                br.write(name + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        br.close();
    }
}
