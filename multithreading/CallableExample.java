import java.util.concurrent.*;

class DemoCallable implements Callable<String> {
    @Override
    public String call()  throws Exception {
        return "Pushpam Kumar";
    }
}

class CallableExample {
    public static void main (String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> task1 = new DemoCallable();
        Callable<String> task2 = new DemoCallable();

        try {
            Future<String> resultTask1 = executor.submit(task1); // it is a blocking task i.e main thread will get blocked
            Future<String> resultTask2 = executor.submit(task2);
            System.out.println(resultTask1 + " " + resultTask2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
