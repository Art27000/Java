package pz2.task6;
public class Student {
    public int numberCourse;
    public String nameStudent;
    public void show(){
        System.out.println("This is name Student: " + nameStudent + "\n" + "This is numberCourse: " + numberCourse);
    }
    public Student(){
        numberCourse = 1;
        nameStudent = "Ivan";
    }
    public Student(int numberCourse, String nameStudent){
        this.nameStudent = nameStudent;
        this.numberCourse = numberCourse;
    }
    public double count(int a, int b, int c){
        int marks = a + b + c;
        double i = 3;
        return marks/i;
    }
}
