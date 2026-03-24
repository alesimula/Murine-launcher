package android.view;

public abstract class InputEventReceiver {
    public InputEventReceiver(android.view.InputChannel p0, android.os.Looper p1) {}
    protected void finalize() throws java.lang.Throwable {}
    public void dispose() {}
    public void onInputEvent(android.view.InputEvent p0) {}
    public void onFocusEvent(boolean p0) {}
    public void onPointerCaptureEvent(boolean p0) {}
    public void onDragEvent(boolean p0, float p1, float p2) {}
    public void onTouchModeChanged(boolean p0) {}
    public void onBatchedInputEventPending(int p0) {}
    public final void finishInputEvent(android.view.InputEvent p0, boolean p1) {}
    public final void reportTimeline(int p0, long p1, long p2) {}
    public final boolean consumeBatchedInputEvents(long p0) { return false; }
    public android.os.IBinder getToken() { return null; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}

    public static interface Factory {
        public android.view.InputEventReceiver createInputEventReceiver(android.view.InputChannel p0, android.os.Looper p1);
    }
}
