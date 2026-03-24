package android.util;

public final class Pools {
    private Pools() {}

    public static class SynchronizedPool<T extends java.lang.Object> extends android.util.Pools.SimplePool<T> {
        private final java.lang.Object mLock = null;
        public SynchronizedPool(int p0, java.lang.Object p1) { super(0); }
        @android.annotation.UnsupportedAppUsage
        public SynchronizedPool(int p0) { super(0); }
        @android.annotation.UnsupportedAppUsage
        public T acquire() { return null; }
        @android.annotation.UnsupportedAppUsage
        public boolean release(T p0) { return false; }
    }

    public static class SimplePool<T extends java.lang.Object> implements android.util.Pools.Pool<T> {
        @android.annotation.UnsupportedAppUsage
        private final java.lang.Object[] mPool = null;
        private int mPoolSize;
        @android.annotation.UnsupportedAppUsage
        public SimplePool(int p0) {}
        @android.annotation.UnsupportedAppUsage
        public T acquire() { return null; }
        @android.annotation.UnsupportedAppUsage
        public boolean release(T p0) { return false; }
        private boolean isInPool(T p0) { return false; }
    }

    public static interface Pool<T extends java.lang.Object> {
        @android.annotation.UnsupportedAppUsage
        public T acquire();
        @android.annotation.UnsupportedAppUsage
        public boolean release(T p0);
    }
}
