package casting;

public class Parent {

    String name;

    // A method which prints the data of the parent class
    void showMessage()
    {
        System.out.println("Parent method is called");
    }
    void kapol(){
        System.out.println("kapol downcasting");
    }
}

// Child class
class Child extends Parent {
    int age;

    // Performing overriding
    @Override
    void showMessage()
    {
        System.out.println("Child method is called");
    }

    void kapol1(){
        System.out.println("kapol1  child class downcasting");
    }
}

