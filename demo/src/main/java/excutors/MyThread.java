package excutors;

public class MyThread implements Runnable{
    private String i;

    public MyThread(String i) {
        this.i = i;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ---> " + i);
    }
}
