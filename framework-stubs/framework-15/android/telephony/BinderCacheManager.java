package android.telephony;

public class BinderCacheManager<T extends android.os.IInterface> {
    public BinderCacheManager(android.telephony.BinderCacheManager.BinderInterfaceFactory<T> p0) {}
    public T listenOnBinder(java.lang.Object p0, java.lang.Runnable p1) { return null; }
    public T getBinder() { return null; }
    public T removeRunnable(java.lang.Object p0) { return null; }

    private class BinderDeathTracker implements android.os.IBinder.DeathRecipient {
        BinderDeathTracker(T p0) {}
        public boolean addListener(java.lang.Object p0, java.lang.Runnable p1) { return false; }
        public void removeListener(java.lang.Object p0) {}
        public void binderDied() {}
        public T getConnection() { return null; }
        public boolean isAlive() { return false; }
    }

    public static interface BinderInterfaceFactory<T extends java.lang.Object> {
        public T create();
    }
}
