import java.util.*;



public class journalGroup {
    public static void main(String[] args) {
        List<Student>studentList = new LinkedList<>();


        Student student = new Student("Kosiba", "Ayaka",167);
        Student student1 = new  Student ("Vorsh", "Oleh", 50);
        Student student2 = new Student("Beshe", "Martin",71);


       student.Check();
       student1.Check();
       student2.Check();

    }

}

