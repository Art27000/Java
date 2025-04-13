package pz2.task2;
public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student();
        ivanov.numberCourse = 2;
        ivanov.nameStudent = "Ivan";
        Student petrov = ivanov;
        System.out.println(ivanov.nameStudent + "\t" + ivanov.numberCourse);
        System.out.println(petrov.nameStudent + "\t" + petrov.numberCourse);
        ivanov.numberCourse = 4;
        ivanov.nameStudent = "Dmitry";
        System.out.println(ivanov.nameStudent + "\t" + ivanov.numberCourse);
        System.out.println(petrov.nameStudent + "\t" + petrov.numberCourse);

    }
}