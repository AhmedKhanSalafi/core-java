package array;

public class Code5 {

    public static void main(String[] args) {


        //  display median value of array
        //if lenth is odd ,print middle element
        //or else print avg of middle two element
int [] arr= {6,2,8,9,1,6,7,5};
int n= arr.length;

if(n%2!=0){
    System.out.println(arr[n/2]);
}else {
    int x = arr[n/2-1];
    int y = arr[n/2];

    System.out.println(" print avg of middle two element"+((x+y)/2));
}




    }
}