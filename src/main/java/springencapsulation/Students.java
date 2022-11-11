package springencapsulation;

public class Students {
    //data hiding ==>Encapsulation
    //to do that we use private keyword

    private String name ="Ali Can";
    private int grade=11;
    private boolean isSuccessful=true;

    public Students() {
    }

    public Students(String name, int grade, boolean isSuccessful) {
        this.name = name;
        this.grade = grade;
        this.isSuccessful = isSuccessful;
    }

    public String getName() {//getter method is for reading data
        return name;
    }

    public void setName(String name) {//setters are for updating data in usage
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }
}
