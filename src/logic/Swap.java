package logic;

public class Swap {

    public static void main(String[] args)
    {
        int x = 100, y = 200;

        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Swapping using three
        // Variables
        int temp = x;
//
        temp=y;
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
