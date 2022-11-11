package practicewithmssara3;

public class CalculationOfAverage {
    //Create a method to calculate 4 students' 3, 4, 6 and 5 exams' average respectively.

    public static void main(String[] args) {
     calculateAverage("Ali",55,65,40,87);
     calculateAverage("Tom Hanks",67,90,100,45,69,90);
     calculateAverage("John Travolta",45,50,65);
    }
    public static void calculateAverage(String stdName,double...mark){
        double sum=0;
        for(double w : mark){
            sum=sum+w;
        }
        System.out.println(stdName+"'s Average of exam " +String.format("%.2f",sum/ mark.length));

    }



}
