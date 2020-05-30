package InputOutput.example2;

import java.io.*;

public class StudentWritter {

    public static void main(String[] args) throws IOException {
        Student student = new Student ("Harry","Potter", 16);

        File file = new File("src/InputOutput/example2/StudentList");

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        String convertedToString;
        objectOutputStream.writeObject(student);
    }
}
