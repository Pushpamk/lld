package waitnotifyexample;

class Main {
    public static void main (String[] args) {
        WaitAndNotify obj = new WaitAndNotify();
        Thread waiter1 = new Thread(() -> obj.doWait(), "waiter-1");
        Thread waiter2 = new Thread(() -> obj.doWait(), "waiter-1");
        waiter1.start();
        waiter2.start();
        try {
        Thread.sleep(2000);
        } catch (Exception e) {
            System.out.print(e);
        } 
    }
}