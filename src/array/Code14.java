package array;

public class Code14 {

    public static void main(String[] args) {

        //print sum even number of array using loop
int[]arr={22,33,44,};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum =  sum + arr[i];
            }

            }
            System.out.println("print sum even number of array using loop:"+sum);
        }
    }