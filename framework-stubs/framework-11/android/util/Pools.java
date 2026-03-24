package android.util;

public final class Pools {
    private Pools() {}

    public static interface Pool<T extends java.lang.Object> {
        public T acquire();
        public boolean release(T p0);
    }

    public static class SimplePool<T extends java.lang.Object> implements android.util.Pools.Pool<T> {
        private final java.lang.Object[] mPool = null;
        private int mPoolSize;
        public SimplePool(int p0) {}
        public T acquire() { return null; }
        public boolean release(T p0) { return false; }
        private boolean isInPool(T p0) { return false; }
    }

    public static class SynchronizedPool<T extends java.lang.Object> extends android.util.Pools.SimplePool<T> {
        private final java.lang.Object mLock = null;
        public SynchronizedPool(int p0, java.lang.Object p1) { super(0); }
        public SynchronizedPool(int p0) { super(0); }
        public T acquire() { return null; }
        public boolean release(T p0) { return false; }
    }
}
