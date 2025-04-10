package pz2.task2;
public class Main {
    public static void main(String[] args) {
        Student Ivanov = new Student();
        Ivanov.numberCourse = 2;
        Ivanov.nameStudent = "Ivan";
        Student Petrov = Ivanov;
        System.out.println(Ivanov.nameStudent + "\t" + Ivanov.numberCourse);
        System.out.println(Petrov.nameStudent + "\t" + Petrov.numberCourse);
        Ivanov.numberCourse = 4;
        Ivanov.nameStudent = "Dmitry";
        System.out.println(Ivanov.nameStudent + "\t" + Ivanov.numberCourse);
        System.out.println(Petrov.nameStudent + "\t" + Petrov.numberCourse);

    }
}