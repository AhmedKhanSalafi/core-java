package casting;

public class Downcasting {

    public static void main(String[] args) {
        Parent p = new Child();
       // p.name = "Shubham";

        // Performing Downcasting Implicitly
        //Child c = new Parent(); // it gives compile-time error

        // Performing Downcasting Explicitly
        Child c = (Child) p;
c.name="ahmed";
        c.age = 18;
        System.out.println(c.name);
        System.out.println(c.age);
        c.showMessage();
        c.kapol();
        c.kapol1();


    }
}
