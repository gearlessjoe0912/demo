package gcdemo.soft;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

public class GCTargetSoftReference extends SoftReference<GCTarget> {

    public String id;

    public GCTargetSoftReference(GCTarget gcTarget, ReferenceQueue<? super GCTarget> queue) {
        super(gcTarget, queue);
        this.id = gcTarget.id;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing GCTargetSoftReference " + id);
    }
}
