package android.app.servertransaction;

class ObjectPool {
    private static final java.lang.Object sPoolSync = null;
    private static final java.util.Map<java.lang.Class, java.util.ArrayList<? extends android.app.servertransaction.ObjectPoolItem>> sPoolMap = null;
    private static final int MAX_POOL_SIZE = 50;
    ObjectPool() {}
    public static <T extends android.app.servertransaction.ObjectPoolItem> T obtain(java.lang.Class<T> p0) { return null; }
    public static <T extends android.app.servertransaction.ObjectPoolItem> void recycle(T p0) {}
}
