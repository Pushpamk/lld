
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Pushpam");
    }
}

class ThreadPoolExample {
    public static void main (String[] args) {
        // 3 core threads
        int core = Runtime.getRuntime().availableProcessors();
        System.out.println(core);
        
        // for debugging name the thread
        ExecutorService threadPool = Executors.newFixedThreadPool(2, runnable -> {
            Thread thread = new Thread(runnable);
            thread.setName("CustomThread-" + thread.getId());
            return thread;
        });
        
        for (int i = 0; i < 4; i++) {
            threadPool.submit(new MyTask());
        }
        threadPool.shutdown();
    }
}