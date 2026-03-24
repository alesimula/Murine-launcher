package android.view;

public class BatchedInputEventReceiver extends android.view.InputEventReceiver {
    android.view.Choreographer mChoreographer;
    private boolean mBatchedInputScheduled;
    private final android.view.BatchedInputEventReceiver.BatchedInputRunnable mBatchedInputRunnable = null;
    @android.annotation.UnsupportedAppUsage
    public BatchedInputEventReceiver(android.view.InputChannel p0, android.os.Looper p1, android.view.Choreographer p2) { super(null, null); }
    public void onBatchedInputEventPending() {}
    public void dispose() {}
    void doConsumeBatchedInput(long p0) {}
    private void scheduleBatchedInput() {}
    private void unscheduleBatchedInput() {}

    private final class BatchedInputRunnable implements java.lang.Runnable {
        private BatchedInputRunnable(android.view.BatchedInputEventReceiver p0) {}
        public void run() {}
    }
}
