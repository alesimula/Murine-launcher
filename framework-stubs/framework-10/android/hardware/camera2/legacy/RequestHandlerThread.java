package android.hardware.camera2.legacy;

public class RequestHandlerThread extends android.os.HandlerThread {
    public static final int MSG_POKE_IDLE_HANDLER = -1;
    private final android.os.ConditionVariable mStarted = null;
    private final android.os.ConditionVariable mIdle = null;
    private android.os.Handler.Callback mCallback;
    private volatile android.os.Handler mHandler;
    private final android.os.MessageQueue.IdleHandler mIdleHandler = null;
    public RequestHandlerThread(java.lang.String p0, android.os.Handler.Callback p1) { super((java.lang.String)null); }
    protected void onLooperPrepared() {}
    public void waitUntilStarted() {}
    public android.os.Handler getHandler() { return null; }
    public android.os.Handler waitAndGetHandler() { return null; }
    public boolean hasAnyMessages(int[] p0) { return false; }
    public void removeMessages(int[] p0) {}
    public void waitUntilIdle() {}
}
