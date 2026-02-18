package waitnotifyexample;

class WaitAndNotify {
    private boolean flag = true;
    private final Object lock = new Object();

    public void doWait() {
        synchronized(lock) {
            while (flag) {
                System.out.println("Only one thread can access this, current thread - " + Thread.currentThread().getName());
            }
        }
    }

    public void notifyEkThreadKo() {
        synchronized(lock) {
            flag = false;
            lock.notify();
            System.out.println("Only one thread has been notified");
        }
    }

    public void notifySabThreadKo() {
        synchronized (lock) {
            lock.notifyAll();
            flag = false;
            System.out.print("All threads have been notified");
        }
    }
}