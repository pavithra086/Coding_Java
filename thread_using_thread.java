package Practice_2;

public class thread_using_thread extends  Thread{

    public void run()
    {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        thread_using_thread t = new thread_using_thread();
        t.start();
    }
}
