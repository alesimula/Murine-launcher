package android.net.thread;

public final class ThreadNetworkController {
    public static final int DEVICE_ROLE_CHILD = 2;
    public static final int DEVICE_ROLE_DETACHED = 1;
    public static final int DEVICE_ROLE_LEADER = 4;
    public static final int DEVICE_ROLE_ROUTER = 3;
    public static final int DEVICE_ROLE_STOPPED = 0;
    public static final int STATE_DISABLED = 0;
    public static final int STATE_DISABLING = 2;
    public static final int STATE_ENABLED = 1;
    public static final int THREAD_VERSION_1_3 = 4;
    ThreadNetworkController() {}
    public void createRandomizedDataset(java.lang.String p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.net.thread.ActiveOperationalDataset, android.net.thread.ThreadNetworkException> p2) {}
    public int getThreadVersion() { return 0; }
    public static boolean isAttached(int p0) { return false; }
    public void join(android.net.thread.ActiveOperationalDataset p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.net.thread.ThreadNetworkException> p2) {}
    public void leave(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, android.net.thread.ThreadNetworkException> p1) {}
    public void registerOperationalDatasetCallback(java.util.concurrent.Executor p0, android.net.thread.ThreadNetworkController.OperationalDatasetCallback p1) {}
    public void registerStateCallback(java.util.concurrent.Executor p0, android.net.thread.ThreadNetworkController.StateCallback p1) {}
    public void scheduleMigration(android.net.thread.PendingOperationalDataset p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.net.thread.ThreadNetworkException> p2) {}
    public void setEnabled(boolean p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.net.thread.ThreadNetworkException> p2) {}
    public void unregisterOperationalDatasetCallback(android.net.thread.ThreadNetworkController.OperationalDatasetCallback p0) {}
    public void unregisterStateCallback(android.net.thread.ThreadNetworkController.StateCallback p0) {}

    public static interface OperationalDatasetCallback {
        public void onActiveOperationalDatasetChanged(android.net.thread.ActiveOperationalDataset p0);
        default public void onPendingOperationalDatasetChanged(android.net.thread.PendingOperationalDataset p0) {}
    }

    public static interface StateCallback {
        public void onDeviceRoleChanged(int p0);
        default public void onPartitionIdChanged(long p0) {}
        default public void onThreadEnableStateChanged(int p0) {}
    }
}
