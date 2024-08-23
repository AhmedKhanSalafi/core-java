package labPractice;

public class Mobile {


    int rate ;
    String name ;
    String color;

    void displayMobileDetail(int rate,String name,String color){
        System.out.println(rate+" "+name+" "+color);

    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.displayMobileDetail(100,"sumsung","white");

//        Mobile m2 = new Mobile();
//        m2.displayMobileDetail();
//        Mobile m3 = new Mobile();
//        m3.displayMobileDetail();
    }
}
