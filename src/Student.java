import javax.sql.rowset.spi.SyncResolver;

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
        if(marks <= 25){
            System.out.print("Повторочка для " + surname + "  ");
        }else if (marks >= 26 && marks <= 49){
            System.out.print("Комісія або компонентна для " + surname + "  ");
        }else if (marks >= 50 && marks <= 70){
            System.out.print("Непогано у " + surname + "  ");
        }else if (marks >= 71 && marks <= 87){
            System.out.print("Гарний рівень у " + surname + "  ");
        }else if (marks >= 88){
            System.out.print("Супер у" + surname + "  ");
        }
    }
}