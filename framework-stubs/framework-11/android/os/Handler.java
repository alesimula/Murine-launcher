package android.os;

public class Handler {
    private static final boolean FIND_POTENTIAL_LEAKS = false;
    private static final java.lang.String TAG = "Handler";
    private static android.os.Handler MAIN_THREAD_HANDLER;
    final android.os.Looper mLooper = null;
    final android.os.MessageQueue mQueue = null;
    final android.os.Handler.Callback mCallback = null;
    final boolean mAsynchronous = false;
    android.os.IMessenger mMessenger;
    public void handleMessage(android.os.Message p0) {}
    public void dispatchMessage(android.os.Message p0) {}
    @java.lang.Deprecated
    public Handler() {}
    @java.lang.Deprecated
    public Handler(android.os.Handler.Callback p0) {}
    public Handler(android.os.Looper p0) {}
    public Handler(android.os.Looper p0, android.os.Handler.Callback p1) {}
    public Handler(boolean p0) {}
    public Handler(android.os.Handler.Callback p0, boolean p1) {}
    public Handler(android.os.Looper p0, android.os.Handler.Callback p1, boolean p2) {}
    public static android.os.Handler createAsync(android.os.Looper p0) { return null; }
    public static android.os.Handler createAsync(android.os.Looper p0, android.os.Handler.Callback p1) { return null; }
    public static android.os.Handler getMain() { return null; }
    public static android.os.Handler mainIfNull(android.os.Handler p0) { return null; }
    public java.lang.String getTraceName(android.os.Message p0) { return null; }
    public java.lang.String getMessageName(android.os.Message p0) { return null; }
    public final android.os.Message obtainMessage() { return null; }
    public final android.os.Message obtainMessage(int p0) { return null; }
    public final android.os.Message obtainMessage(int p0, java.lang.Object p1) { return null; }
    public final android.os.Message obtainMessage(int p0, int p1, int p2) { return null; }
    public final android.os.Message obtainMessage(int p0, int p1, int p2, java.lang.Object p3) { return null; }
    public final boolean post(java.lang.Runnable p0) { return false; }
    public final boolean postAtTime(java.lang.Runnable p0, long p1) { return false; }
    public final boolean postAtTime(java.lang.Runnable p0, java.lang.Object p1, long p2) { return false; }
    public final boolean postDelayed(java.lang.Runnable p0, long p1) { return false; }
    public final boolean postDelayed(java.lang.Runnable p0, int p1, long p2) { return false; }
    public final boolean postDelayed(java.lang.Runnable p0, java.lang.Object p1, long p2) { return false; }
    public final boolean postAtFrontOfQueue(java.lang.Runnable p0) { return false; }
    public final boolean runWithScissors(java.lang.Runnable p0, long p1) { return false; }
    public final void removeCallbacks(java.lang.Runnable p0) {}
    public final void removeCallbacks(java.lang.Runnable p0, java.lang.Object p1) {}
    public final boolean sendMessage(android.os.Message p0) { return false; }
    public final boolean sendEmptyMessage(int p0) { return false; }
    public final boolean sendEmptyMessageDelayed(int p0, long p1) { return false; }
    public final boolean sendEmptyMessageAtTime(int p0, long p1) { return false; }
    public final boolean sendMessageDelayed(android.os.Message p0, long p1) { return false; }
    public boolean sendMessageAtTime(android.os.Message p0, long p1) { return false; }
    public final boolean sendMessageAtFrontOfQueue(android.os.Message p0) { return false; }
    public final boolean executeOrSendMessage(android.os.Message p0) { return false; }
    private boolean enqueueMessage(android.os.MessageQueue p0, android.os.Message p1, long p2) { return false; }
    public final void removeMessages(int p0) {}
    public final void removeMessages(int p0, java.lang.Object p1) {}
    public final void removeEqualMessages(int p0, java.lang.Object p1) {}
    public final void removeCallbacksAndMessages(java.lang.Object p0) {}
    public final void removeCallbacksAndEqualMessages(java.lang.Object p0) {}
    public final boolean hasMessages(int p0) { return false; }
    public final boolean hasMessagesOrCallbacks() { return false; }
    public final boolean hasMessages(int p0, java.lang.Object p1) { return false; }
    public final boolean hasEqualMessages(int p0, java.lang.Object p1) { return false; }
    public final boolean hasCallbacks(java.lang.Runnable p0) { return false; }
    public final android.os.Looper getLooper() { return null; }
    public final void dump(android.util.Printer p0, java.lang.String p1) {}
    public final void dumpMine(android.util.Printer p0, java.lang.String p1) {}
    public java.lang.String toString() { return null; }
    final android.os.IMessenger getIMessenger() { return null; }
    private static android.os.Message getPostMessage(java.lang.Runnable p0) { return null; }
    private static android.os.Message getPostMessage(java.lang.Runnable p0, java.lang.Object p1) { return null; }
    private static void handleCallback(android.os.Message p0) {}

    private static final class BlockingRunnable implements java.lang.Runnable {
        private final java.lang.Runnable mTask = null;
        private boolean mDone;
        public BlockingRunnable(java.lang.Runnable p0) {}
        public void run() {}
        public boolean postAndWait(android.os.Handler p0, long p1) { return false; }
    }

    public static interface Callback {
        public boolean handleMessage(android.os.Message p0);
    }

    private final class MessengerImpl extends android.os.IMessenger.Stub {
        private MessengerImpl(android.os.Handler p0) { super(); }
        public void send(android.os.Message p0) {}
    }
}
