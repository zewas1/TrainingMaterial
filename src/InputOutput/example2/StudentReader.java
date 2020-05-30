package InputOutput.example2;

import java.io.*;

public class StudentReader {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("src/InputOutput/example2/StudentList");

        FileInputStream fileInputStream = new FileInputStream(file);

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Student student = (Student) objectInputStream.readObject();
        System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getAge());
    }
}