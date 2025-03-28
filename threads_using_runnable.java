package Practice_2;

public class threads_using_runnable implements Runnable {

    @Override
    public void run() {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        threads_using_runnable runn = new threads_using_runnable();
        Thread t = new Thread(runn);
        t.start();
    }
}
