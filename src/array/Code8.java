package array;

public class Code8 {

    public static void main(String[] args) {


        //find the avg of array element
        int arr []= {55,88,44};
        double sum=0;
        for (int e: arr){
            sum=sum+e;
        }
        double avg =sum/arr.length;
        System.out.println("avg of array element:"+" "+avg);
    }
}
