package annotations.example2;

public class AnnotationTester {
    public static void main(String[] args) {
        // informacija apie klases objekta
        Class<Student> object = Student.class;

        if(object.isAnnotationPresent(StudentInfo.class)){
            StudentInfo studentas = object.getAnnotation(StudentInfo.class);
            System.out.println("Anotacija yra prideta");
            System.out.println(studentas.studentAge());
            System.out.println(studentas.studentName());
        }
    }
}
