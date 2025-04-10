package pz2.task5;
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
    public double count(int a, int b, int c){
        int marks = a + b + c;
        double i = 3;
        return marks/i;
    }
}
