package excutors.sync;

import excutors.MyThread;
import org.springframework.core.task.SyncTaskExecutor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public class SyncTaskExecutorTest {
    public static void main(String[] args) {
        Executor executor = new SyncTaskExecutor();
        List<Runnable> list = new ArrayList<>();
        int i = 0;
        while (i < 6) {
            list.add(new MyThread(i + ""));
            i++;
        }
        Iterator<Runnable> iterator = list.iterator();
        while (iterator.hasNext()) {
            Runnable next = iterator.next();
            executor.execute(next);
        }
        System.out.println(Thread.currentThread().getName() + " ---> " + "end");
    }
}
