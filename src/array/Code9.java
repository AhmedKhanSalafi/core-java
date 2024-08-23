package array;

public class Code9 {

    public static void main(String[] args) {


        //find elenent which are greater than avg of all array element
        int arr[] = {55, 88, 44};
        double sum = 0;
        for (int e : arr) {
            sum = sum + e;
        }
        double avg = sum / arr.length;
        System.out.println("avg of array element:" + " " + avg);

        for (int x: arr){
            if(x>avg){
                System.out.println(x);
            }
        }

    }
}