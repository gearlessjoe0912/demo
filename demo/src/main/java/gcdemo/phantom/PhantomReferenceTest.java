package gcdemo.phantom;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {
    public static void main(String[] args) {
        ReferenceQueue<String> referenceQueue = new ReferenceQueue<>();
        PhantomReference<String> phantomReference = new PhantomReference<>(new String("222"), referenceQueue);
        System.out.println(referenceQueue.poll());
        System.gc();
        try {
            Thread.sleep(300L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(referenceQueue.poll());
    }
}
