package logic;

public class SwappingTwoNum {

    public static void main(String[] args)
    {
        int a = 5;
        int b = 10;

        // print statement
        System.out.println("Before swapping, a = " + a
                + " and b = " + b);

        a = a + b;//15
        b = a - b;//5
        a = a - b;//10

        System.out.println("After swapping, a = " + a
                + " and b = " + b);
    }
}
