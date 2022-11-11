package day23review;

public class Student {

    public String name ="Yasemin Orman";
    private String stdId="YO123";
    private double stdGpa=3.8;
    private String disease ="Heart Disease";
    private boolean successful=false;

    public void setDisease(String disease) {
        this.disease = disease;
    }
    public void setStdGpa(double stdGpa){
        this.stdGpa=stdGpa;
    }
    public void setSuccessful(boolean successful){
        this.successful=successful;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getStdId() {
        return stdId;
    }

    public double getStdGpa() {
        return stdGpa;
    }
    public String getDisease(){
        return disease;
    }

    public static void main(String[] args) {


    }
}
