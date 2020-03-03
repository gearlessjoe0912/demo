package gcdemo.soft;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

public class SoftReferenceTest {
    // 弱引用队列
    private final static ReferenceQueue<GCTarget> REFERENCE_QUEUE = new ReferenceQueue<>();

    public static void main(String[] args) {
        GCTargetSoftReference softReference = new GCTargetSoftReference(new GCTarget("a"), REFERENCE_QUEUE);
        String str = "";
        Reference<? extends GCTarget> reference = null;
        for (int i = 0; i < 1024 * 500; i++) {
            str += "a";
            if ((reference = REFERENCE_QUEUE.poll()) != null) {
                System.out.println("poll = " + ((GCTargetSoftReference)(reference)).id);
            }
        }
        System.gc();
        System.out.println(softReference.get());
    }
}
