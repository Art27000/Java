package pz3.task1;

public class Magistracy extends Student {
    protected boolean scienceWork;

    public Magistracy(String firstName, String lastName, String group, double averageMark){
        super(firstName, lastName, group, averageMark);
        this.scienceWork = true;
    }

    public int getScholarship(){
        if (averageMark == 8){
            return 200;
        }
        else return 180;
    }
}
