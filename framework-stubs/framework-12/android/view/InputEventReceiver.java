package android.view;

public abstract class InputEventReceiver {
    private static final java.lang.String TAG = "InputEventReceiver";
    private long mReceiverPtr;
    private android.view.InputChannel mInputChannel;
    private android.os.MessageQueue mMessageQueue;
    private final android.util.SparseIntArray mSeqMap = null;
    private static native long nativeInit(java.lang.ref.WeakReference<android.view.InputEventReceiver> p0, android.view.InputChannel p1, android.os.MessageQueue p2);
    private static native void nativeDispose(long p0);
    private static native void nativeFinishInputEvent(long p0, int p1, boolean p2);
    private static native void nativeReportTimeline(long p0, int p1, long p2, long p3);
    private static native boolean nativeConsumeBatchedInputEvents(long p0, long p1);
    private static native java.lang.String nativeDump(long p0, java.lang.String p1);
    public InputEventReceiver(android.view.InputChannel p0, android.os.Looper p1) {}
    protected void finalize() throws java.lang.Throwable {}
    public void dispose() {}
    private void dispose(boolean p0) {}
    public void onInputEvent(android.view.InputEvent p0) {}
    public void onFocusEvent(boolean p0, boolean p1) {}
    public void onPointerCaptureEvent(boolean p0) {}
    public void onDragEvent(boolean p0, float p1, float p2) {}
    public void onBatchedInputEventPending(int p0) {}
    public final void finishInputEvent(android.view.InputEvent p0, boolean p1) {}
    public final void reportTimeline(int p0, long p1, long p2) {}
    public final boolean consumeBatchedInputEvents(long p0) { return false; }
    public android.os.IBinder getToken() { return null; }
    private void dispatchInputEvent(int p0, android.view.InputEvent p1) {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}

    public static interface Factory {
        public android.view.InputEventReceiver createInputEventReceiver(android.view.InputChannel p0, android.os.Looper p1);
    }
}
