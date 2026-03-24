package android.os;

public abstract class TokenWatcher {
    public TokenWatcher(android.os.Handler p0, java.lang.String p1) {}
    public abstract void acquired();
    public abstract void released();
    public void acquire(android.os.IBinder p0, java.lang.String p1) {}
    public void cleanup(android.os.IBinder p0, boolean p1) {}
    public void release(android.os.IBinder p0) {}
    public boolean isAcquired() { return false; }
    public void dump() {}
    public void dump(java.io.PrintWriter p0) {}

    private class Death implements android.os.IBinder.DeathRecipient {
        android.os.IBinder token;
        java.lang.String tag;
        Death(android.os.TokenWatcher p0, android.os.IBinder p1, java.lang.String p2) {}
        public void binderDied() {}
        protected void finalize() throws java.lang.Throwable {}
    }
}
