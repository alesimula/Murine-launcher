package android.os;

public abstract class TokenWatcher {
    private java.lang.Runnable mNotificationTask;
    private java.util.WeakHashMap<android.os.IBinder, android.os.TokenWatcher.Death> mTokens;
    private android.os.Handler mHandler;
    private java.lang.String mTag;
    private int mNotificationQueue;
    private volatile boolean mAcquired;
    public TokenWatcher(android.os.Handler p0, java.lang.String p1) {}
    public abstract void acquired();
    public abstract void released();
    public void acquire(android.os.IBinder p0, java.lang.String p1) {}
    public void cleanup(android.os.IBinder p0, boolean p1) {}
    public void release(android.os.IBinder p0) {}
    public boolean isAcquired() { return false; }
    public void dump() {}
    public void dump(java.io.PrintWriter p0) {}
    private java.util.ArrayList<java.lang.String> dumpInternal() { return null; }
    private void sendNotificationLocked(boolean p0) {}

    private class Death implements android.os.IBinder.DeathRecipient {
        android.os.IBinder token;
        java.lang.String tag;
        Death(android.os.TokenWatcher p0, android.os.IBinder p1, java.lang.String p2) {}
        public void binderDied() {}
        protected void finalize() throws java.lang.Throwable {}
    }
}
