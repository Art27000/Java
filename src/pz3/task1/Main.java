package pz3.task1;

public class Main {
    public static void main(String[] args) {
        Student st = new Student("Maksim", "Petrov", "2", 8);
        Magistracy mag = new Magistracy("Artsiom", "Harbuz", "1", 9);
        st = mag;
        System.out.println(st.getFirstName());
        System.out.println(st.getScholarship());

        Student students[] = new Student[5];
        students[0] = new Student("Ivan", "Ivanov", "3", 10);
        students[1] = new Magistracy("Fedor", "Fedorov", "2", 8);
        students[2] = new Student("Evgeniy", "Sobolev", "1", 7);
        students[3] = new Student("Dmitry", "Ershov", "2", 6);
        students[4] = new Magistracy("Petr", "Petrov", "3", 5);

        for(int i = 0; i < students.length; i++){
            System.out.println("Scholarship for student " + (int)(i+1) + " is: " + students[i].getScholarship());
        }
    }
}