package pz2.task8;

public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student();
        Student petrov = new Student(ivanov);
        ivanov.numberCourse = 2;
        ivanov.nameStudent = "Ivan";
        ivanov.show();
        System.out.println("Средний балл: " + ivanov.count(5, 8, 3));
    }
}