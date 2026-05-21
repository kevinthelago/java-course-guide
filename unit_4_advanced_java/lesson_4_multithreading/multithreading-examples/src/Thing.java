public class Thing extends Thread {
    private int threadnumber;

    public Thing(int threadnumber) {
        this.threadnumber = threadnumber;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + threadnumber + " value: " + i);

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted Thread: " + i);
            }
        }
    }
}
