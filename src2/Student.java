import javax.sql.rowset.spi.SyncResolver;
import  java.util.regex.Pattern;
import   java.util.regex.Matcher;

public class Student {

    private String surname;
    private String name;
    private int marks;

    public Student (String surname, String name, int marks){
        this.surname = surname;
        this.name= name;
        this.marks=marks;
    }


    public void Check(){
        if (String.valueOf(marks).matches("^[1-9][0-9]?$|^100$")) {
            if(marks <= 25){
                System.out.print("Повторочка для " + surname + "  ");
            }else if (marks >= 26 && marks <= 49){
                System.out.print("Комісія або компонентна для " + surname + "  " + "оцінка" + " "+ marks + " ");
            }else if (marks >= 50 && marks <= 70){
                System.out.print("Непогано у " + surname + "  " + "оцінка" + " " + marks + " ");
            }else if (marks >= 71 && marks <= 87){
                System.out.print("Гарний рівень у " + surname + "  " + "оцінка" +" " +  marks + " ");
            }else if (marks >= 88){
                System.out.print("Супер у" + surname + "  " + "оцінка" + " " + marks + " ");
            }
        } else {
            System.out.println("Оцінка може бути написав від 0 до 100");

        }

    }


}