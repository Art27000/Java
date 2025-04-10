package pz2.task1;
public class Main {
    public static void main(String[] args) {
        Student Ivanov = new Student();
        Ivanov.nameStudent = "Ivan";
        Ivanov.numberCourse = 1;
        Student Petrov = new Student();
        Petrov.numberCourse = 2;
        Petrov.nameStudent = "Petr";
        System.out.println(Ivanov.nameStudent + "\t" + Ivanov.numberCourse);
        System.out.println(Petrov.nameStudent + "\t" + Petrov.numberCourse);
    }
}
