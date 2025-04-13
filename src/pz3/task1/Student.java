package pz3.task1;

public class Student {
    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;
    protected boolean scienceWork;

    public Student(String firstName, String lastName, String group, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
        this.scienceWork = false;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getGroup(){
        return group;
    }

    public double getAverageMark(){
        return averageMark;
    }

    public int getScholarship(){
        if (averageMark == 8){
            return 100;
        }
        else return 80;
    }
}
