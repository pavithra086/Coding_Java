package Practice_2;

import practice1.extendingthread;

import java.util.concurrent.*;

public class thread_using_call implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int a =9;
        return a;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex= Executors.newSingleThreadExecutor();
        Future<Integer> future = ex.submit(new thread_using_call());
        System.out.println(future.get());

    }
}
