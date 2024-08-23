package array;

public class Code10 {
    public static void main(String[] args) {

        //increase each value by one in array

        int arr[] = {55, 88, 44};

        for (int i=0;i<= args.length;i++){
            arr[i]++;
        }
        System.out.println("array element");
        for (int el :arr )
            System.out.println("increase each value by one in array:"+el);
    }
}
