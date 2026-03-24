package android.view;

public class BatchedInputEventReceiver extends android.view.InputEventReceiver {
    public BatchedInputEventReceiver(android.view.InputChannel p0, android.os.Looper p1, android.view.Choreographer p2) { super(null, null); }
    public void onBatchedInputEventPending(int p0) {}
    public void dispose() {}
    public void setBatchingEnabled(boolean p0) {}
    protected void doConsumeBatchedInput(long p0) {}

    private final class BatchedInputRunnable implements java.lang.Runnable {
        public void run() {}
    }

    public static class SimpleBatchedInputEventReceiver extends android.view.BatchedInputEventReceiver {
        protected android.view.BatchedInputEventReceiver.SimpleBatchedInputEventReceiver.InputEventListener mListener;
        public SimpleBatchedInputEventReceiver(android.view.InputChannel p0, android.os.Looper p1, android.view.Choreographer p2, android.view.BatchedInputEventReceiver.SimpleBatchedInputEventReceiver.InputEventListener p3) { super(null, null, null); }
        public void onInputEvent(android.view.InputEvent p0) {}

        public static interface InputEventListener {
            public boolean onInputEvent(android.view.InputEvent p0);
        }
    }
}
