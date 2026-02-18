//     int count = 0;
// }
// class MySynTask implements Runnable {
//     Counter counter;
//     private int cc = 0;

//     MySynTask(Counter counter) {
//         this.counter = counter;
//     }

//     @Override
//     public void run() {
//         // synchronized (MySynTask.class) {
//             counter.count++;
//         // }
//         cc++;
//     }
//     public int getCc() {
//         return cc;
//     }
// }

class MyTask {
    private boolean isTrue = true;
    public void runTask() {
        while (isTrue)
            System.out.println("True");
    }
    public void stopTask() {
        isTrue = false;
        if (!isTrue)
            System.out.println("Stopped");
    }
}

class SynchronizedExample {
    public static void main (String[] args) {
        // Counter counter = new Counter();
        // ExecutorService executor = Executors.newFixedThreadPool(5);
        MyTask myTask = new MyTask();

        // Runnable myTask = new MySynTask(counter);
        // for (int i = 0; i < 20; i++) {
        //     // executor.submit(myTask);
            
        // }
        Thread workerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                myTask.runTask();
            }
        });
        workerThread.start();
        try {
           Thread.sleep(2000); 
        } catch (Exception e) {
            System.err.println(e);
        }
        myTask.stopTask();
        // executor.shutdown();
        // while (!executor.isTerminated()) {}
        // System.out.print(counter.count);
    }
}