package pz2.task6;
public class Main {
    public static void main(String[] args) {
        Student Ivanov = new Student();
        Ivanov.numberCourse = 2;
        Ivanov.nameStudent = "Ivan";
        Ivanov.show();
        System.out.println("Средний балл: " +Ivanov.count(5, 8, 3));
    }
}