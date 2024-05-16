public class MyThread extends Thread {
    private String threadName;

    public MyThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadName + " is running...");
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + threadName + " is doing something...");
            try {
                Thread.sleep(1000); // Dừng luồng trong 1 giây
            } catch (InterruptedException e) {
                System.out.println("Thread " + threadName + " interrupted.");
            }
        }
        System.out.println("Thread " + threadName + " exiting...");
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        // Bắt đầu thực thi các luồng
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
