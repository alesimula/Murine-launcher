package android.os;

public class HandlerThread extends java.lang.Thread {
    int mPriority;
    int mTid;
    android.os.Looper mLooper;
    public HandlerThread(java.lang.String p0) { super(); }
    public HandlerThread(java.lang.String p0, int p1) { super(); }
    protected void onCreated() {}
    protected void onCreated$ravenwood() {}
    protected void onLooperPrepared() {}
    public void run() {}
    public android.os.Looper getLooper() { return null; }
    @android.annotation.NonNull
    public android.os.Handler getThreadHandler() { return null; }
    @android.annotation.NonNull
    public java.util.concurrent.Executor getThreadExecutor() { return null; }
    public boolean quit() { return false; }
    public boolean quitSafely() { return false; }
    public int getThreadId() { return 0; }
}
