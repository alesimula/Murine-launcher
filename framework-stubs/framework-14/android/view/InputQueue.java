package android.view;

public final class InputQueue {
    public InputQueue() {}
    protected void finalize() throws java.lang.Throwable {}
    public void dispose() {}
    public void dispose(boolean p0) {}
    public long getNativePtr() { return 0L; }
    public void sendInputEvent(android.view.InputEvent p0, java.lang.Object p1, boolean p2, android.view.InputQueue.FinishedInputEventCallback p3) {}

    public static interface Callback {
        public void onInputQueueCreated(android.view.InputQueue p0);
        public void onInputQueueDestroyed(android.view.InputQueue p0);
    }

    private final class ActiveInputEvent {
        public java.lang.Object mToken;
        public android.view.InputQueue.FinishedInputEventCallback mCallback;
        public void recycle() {}
    }

    public static interface FinishedInputEventCallback {
        public void onFinishedInputEvent(java.lang.Object p0, boolean p1);
    }
}
