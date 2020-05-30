package InputOutput.example1;

import java.io.*;

public class MyFilelReader {
    public static void main(String[] args) {

        File failas = new File("src/InputOutput/example1/masinos.txt");

        try  {
           BufferedReader bufferedReader = new BufferedReader (new FileReader(failas));
           String eilute;
            System.out.println("Spausdiname failo turini apacioje: ");
            while ((eilute = bufferedReader.readLine()) != null){
                System.out.println(eilute);
            }
            bufferedReader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
