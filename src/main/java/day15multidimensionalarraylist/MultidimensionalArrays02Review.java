package day15multidimensionalarraylist;

public class MultidimensionalArrays02Review {
    public static void main(String[] args) {
        //Example 1: Print the elements which have "a" from a 2 dimensional String array. { {"learn", "java", "it"}, {"is", "easy"} }
        String arr[][] = {{"learn", "java", "it"}, {"is", "easy"}};
        for(String[] w:arr ){
            for(String m : w){
                if(m.contains("a")){
                    System.out.println(m);
                }
            }
        }

        //Example 2: Create an integer multidimensional array then find the sum of the elements

        int brr[][]={{12,3},{5,8,9},{10,20}};

        int sum=0;
        for(int[]w:brr){
            for(int m : w){
                sum =sum+m;
            }
        }
        System.out.println(sum);





    }
}
