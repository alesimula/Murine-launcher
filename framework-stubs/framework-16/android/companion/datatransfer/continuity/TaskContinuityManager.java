package android.companion.datatransfer.continuity;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.companion.enable_task_continuity")
public class TaskContinuityManager {
    public static final int HANDOFF_REQUEST_RESULT_SUCCESS = 0;
    public static final int HANDOFF_REQUEST_RESULT_FAILURE_TASK_NOT_FOUND = 1;
    public static final int HANDOFF_REQUEST_RESULT_FAILURE_NO_DATA_PROVIDED_BY_TASK = 2;
    public static final int HANDOFF_REQUEST_RESULT_FAILURE_SENDER_LOST_CONNECTION = 3;
    public static final int HANDOFF_REQUEST_RESULT_FAILURE_TIMEOUT = 4;
    public static final int HANDOFF_REQUEST_RESULT_FAILURE_DEVICE_NOT_FOUND = 5;
    public TaskContinuityManager(android.content.Context p0, android.companion.datatransfer.continuity.ITaskContinuityManager p1) {}
    @android.annotation.NonNull
    public java.util.List<android.companion.datatransfer.continuity.RemoteTask> getRemoteTasks() { return null; }
    public void registerRemoteTaskListener(java.util.concurrent.Executor p0, android.companion.datatransfer.continuity.TaskContinuityManager.RemoteTaskListener p1) {}
    public void unregisterRemoteTaskListener(android.companion.datatransfer.continuity.TaskContinuityManager.RemoteTaskListener p0) {}
    public void requestHandoff(int p0, int p1, java.util.concurrent.Executor p2, android.companion.datatransfer.continuity.TaskContinuityManager.HandoffRequestCallback p3) {}

    public static interface HandoffRequestCallback {
        public void onHandoffRequestFinished(int p0, int p1, int p2);
    }

    private final class HandoffRequestCallbackHolder extends android.companion.datatransfer.continuity.IHandoffRequestCallback.Stub {
        HandoffRequestCallbackHolder(android.companion.datatransfer.continuity.TaskContinuityManager p0, java.util.concurrent.Executor p1, android.companion.datatransfer.continuity.TaskContinuityManager.HandoffRequestCallback p2) { super(); }
        public void onHandoffRequestFinished(int p0, int p1, int p2) throws android.os.RemoteException {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HandoffRequestResultCode {
    }

    public static interface RemoteTaskListener {
        public void onRemoteTasksChanged(java.util.List<android.companion.datatransfer.continuity.RemoteTask> p0);
    }

    private final class RemoteTaskListenerHolder extends android.companion.datatransfer.continuity.IRemoteTaskListener.Stub {
        public RemoteTaskListenerHolder(android.companion.datatransfer.continuity.TaskContinuityManager p0, android.companion.datatransfer.continuity.ITaskContinuityManager p1) { super(); }
        public void registerListener(java.util.concurrent.Executor p0, android.companion.datatransfer.continuity.TaskContinuityManager.RemoteTaskListener p1) throws android.os.RemoteException {}
        public void unregisterListener(android.companion.datatransfer.continuity.TaskContinuityManager.RemoteTaskListener p0) throws android.os.RemoteException {}
        public void onRemoteTasksChanged(java.util.List<android.companion.datatransfer.continuity.RemoteTask> p0) throws android.os.RemoteException {}
    }
}
