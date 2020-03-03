package excutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        int i = 0;
        while (i < 6) {
            executorService.execute(new MyThread(i + ""));
            i++;
        }

        System.out.println("end");
    }
}
