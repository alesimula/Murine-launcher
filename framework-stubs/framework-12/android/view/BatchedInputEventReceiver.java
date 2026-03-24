package android.view;

public class BatchedInputEventReceiver extends android.view.InputEventReceiver {
    private android.view.Choreographer mChoreographer;
    private boolean mBatchingEnabled;
    private boolean mBatchedInputScheduled;
    private final android.view.BatchedInputEventReceiver.BatchedInputRunnable mBatchedInputRunnable = null;
    public BatchedInputEventReceiver(android.view.InputChannel p0, android.os.Looper p1, android.view.Choreographer p2) { super(null, null); }
    public void onBatchedInputEventPending(int p0) {}
    public void dispose() {}
    public void setBatchingEnabled(boolean p0) {}
    void doConsumeBatchedInput(long p0) {}
    private void scheduleBatchedInput() {}
    private void unscheduleBatchedInput() {}

    private final class BatchedInputRunnable implements java.lang.Runnable {
        private BatchedInputRunnable(android.view.BatchedInputEventReceiver p0) {}
        public void run() {}
    }
}
