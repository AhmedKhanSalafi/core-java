package thread;

public class Code1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread has ended");
    }

    public static void main(String[] args) {
        Code1 ex = new Code1();
        Thread t1= new Thread(ex);
        t1.start();
        System.out.println("Hi");
    }
}
