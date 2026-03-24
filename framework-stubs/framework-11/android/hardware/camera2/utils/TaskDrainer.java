package android.hardware.camera2.utils;

public class TaskDrainer<T extends java.lang.Object> {
    private static final java.lang.String TAG = "TaskDrainer";
    private final boolean DEBUG = false;
    private final java.util.concurrent.Executor mExecutor = null;
    private final android.hardware.camera2.utils.TaskDrainer.DrainListener mListener = null;
    private final java.lang.String mName = null;
    private final java.util.Set<T> mTaskSet = null;
    private final java.util.Set<T> mEarlyFinishedTaskSet = null;
    private final java.lang.Object mLock = null;
    private boolean mDraining;
    private boolean mDrainFinished;
    public TaskDrainer(java.util.concurrent.Executor p0, android.hardware.camera2.utils.TaskDrainer.DrainListener p1) {}
    public TaskDrainer(java.util.concurrent.Executor p0, android.hardware.camera2.utils.TaskDrainer.DrainListener p1, java.lang.String p2) {}
    public void taskStarted(T p0) {}
    public void taskFinished(T p0) {}
    public void beginDrain() {}
    private void checkIfDrainFinished() {}
    private void postDrained() {}

    public static interface DrainListener {
        public void onDrained();
    }
}
