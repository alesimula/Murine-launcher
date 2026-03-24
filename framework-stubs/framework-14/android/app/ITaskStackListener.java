package android.app;

public interface ITaskStackListener extends android.os.IInterface {
    public static final int FORCED_RESIZEABLE_REASON_SPLIT_SCREEN = 1;
    public static final int FORCED_RESIZEABLE_REASON_SECONDARY_DISPLAY = 2;
    public void onTaskStackChanged() throws android.os.RemoteException;
    public void onActivityPinned(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void onActivityUnpinned() throws android.os.RemoteException;
    public void onActivityRestartAttempt(android.app.ActivityManager.RunningTaskInfo p0, boolean p1, boolean p2, boolean p3) throws android.os.RemoteException;
    public void onActivityForcedResizable(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void onActivityDismissingDockedTask() throws android.os.RemoteException;
    public void onActivityLaunchOnSecondaryDisplayFailed(android.app.ActivityManager.RunningTaskInfo p0, int p1) throws android.os.RemoteException;
    public void onActivityLaunchOnSecondaryDisplayRerouted(android.app.ActivityManager.RunningTaskInfo p0, int p1) throws android.os.RemoteException;
    public void onTaskCreated(int p0, android.content.ComponentName p1) throws android.os.RemoteException;
    public void onTaskRemoved(int p0) throws android.os.RemoteException;
    public void onTaskMovedToFront(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException;
    public void onTaskDescriptionChanged(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException;
    public void onActivityRequestedOrientationChanged(int p0, int p1) throws android.os.RemoteException;
    public void onTaskRemovalStarted(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException;
    public void onTaskProfileLocked(android.app.ActivityManager.RunningTaskInfo p0, int p1) throws android.os.RemoteException;
    public void onTaskSnapshotChanged(int p0, android.window.TaskSnapshot p1) throws android.os.RemoteException;
    public void onBackPressedOnTaskRoot(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException;
    public void onTaskDisplayChanged(int p0, int p1) throws android.os.RemoteException;
    public void onRecentTaskListUpdated() throws android.os.RemoteException;
    public void onRecentTaskListFrozenChanged(boolean p0) throws android.os.RemoteException;
    public void onTaskFocusChanged(int p0, boolean p1) throws android.os.RemoteException;
    public void onTaskRequestedOrientationChanged(int p0, int p1) throws android.os.RemoteException;
    public void onActivityRotation(int p0) throws android.os.RemoteException;
    public void onTaskMovedToBack(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException;
    public void onLockTaskModeChanged(int p0) throws android.os.RemoteException;

    public static class Default implements android.app.ITaskStackListener {
        public Default() {}
        public void onTaskStackChanged() throws android.os.RemoteException {}
        public void onActivityPinned(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onActivityUnpinned() throws android.os.RemoteException {}
        public void onActivityRestartAttempt(android.app.ActivityManager.RunningTaskInfo p0, boolean p1, boolean p2, boolean p3) throws android.os.RemoteException {}
        public void onActivityForcedResizable(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void onActivityDismissingDockedTask() throws android.os.RemoteException {}
        public void onActivityLaunchOnSecondaryDisplayFailed(android.app.ActivityManager.RunningTaskInfo p0, int p1) throws android.os.RemoteException {}
        public void onActivityLaunchOnSecondaryDisplayRerouted(android.app.ActivityManager.RunningTaskInfo p0, int p1) throws android.os.RemoteException {}
        public void onTaskCreated(int p0, android.content.ComponentName p1) throws android.os.RemoteException {}
        public void onTaskRemoved(int p0) throws android.os.RemoteException {}
        public void onTaskMovedToFront(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        public void onTaskDescriptionChanged(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        public void onActivityRequestedOrientationChanged(int p0, int p1) throws android.os.RemoteException {}
        public void onTaskRemovalStarted(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        public void onTaskProfileLocked(android.app.ActivityManager.RunningTaskInfo p0, int p1) throws android.os.RemoteException {}
        public void onTaskSnapshotChanged(int p0, android.window.TaskSnapshot p1) throws android.os.RemoteException {}
        public void onBackPressedOnTaskRoot(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        public void onTaskDisplayChanged(int p0, int p1) throws android.os.RemoteException {}
        public void onRecentTaskListUpdated() throws android.os.RemoteException {}
        public void onRecentTaskListFrozenChanged(boolean p0) throws android.os.RemoteException {}
        public void onTaskFocusChanged(int p0, boolean p1) throws android.os.RemoteException {}
        public void onTaskRequestedOrientationChanged(int p0, int p1) throws android.os.RemoteException {}
        public void onActivityRotation(int p0) throws android.os.RemoteException {}
        public void onTaskMovedToBack(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        public void onLockTaskModeChanged(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.ITaskStackListener {
        public static final java.lang.String DESCRIPTOR = "android.app.ITaskStackListener";
        static final int TRANSACTION_onTaskStackChanged = 1;
        static final int TRANSACTION_onActivityPinned = 2;
        static final int TRANSACTION_onActivityUnpinned = 3;
        static final int TRANSACTION_onActivityRestartAttempt = 4;
        static final int TRANSACTION_onActivityForcedResizable = 5;
        static final int TRANSACTION_onActivityDismissingDockedTask = 6;
        static final int TRANSACTION_onActivityLaunchOnSecondaryDisplayFailed = 7;
        static final int TRANSACTION_onActivityLaunchOnSecondaryDisplayRerouted = 8;
        static final int TRANSACTION_onTaskCreated = 9;
        static final int TRANSACTION_onTaskRemoved = 10;
        static final int TRANSACTION_onTaskMovedToFront = 11;
        static final int TRANSACTION_onTaskDescriptionChanged = 12;
        static final int TRANSACTION_onActivityRequestedOrientationChanged = 13;
        static final int TRANSACTION_onTaskRemovalStarted = 14;
        static final int TRANSACTION_onTaskProfileLocked = 15;
        static final int TRANSACTION_onTaskSnapshotChanged = 16;
        static final int TRANSACTION_onBackPressedOnTaskRoot = 17;
        static final int TRANSACTION_onTaskDisplayChanged = 18;
        static final int TRANSACTION_onRecentTaskListUpdated = 19;
        static final int TRANSACTION_onRecentTaskListFrozenChanged = 20;
        static final int TRANSACTION_onTaskFocusChanged = 21;
        static final int TRANSACTION_onTaskRequestedOrientationChanged = 22;
        static final int TRANSACTION_onActivityRotation = 23;
        static final int TRANSACTION_onTaskMovedToBack = 24;
        static final int TRANSACTION_onLockTaskModeChanged = 25;
        public Stub() { super(); }
        public static android.app.ITaskStackListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.ITaskStackListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onTaskStackChanged() throws android.os.RemoteException {}
            public void onActivityPinned(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onActivityUnpinned() throws android.os.RemoteException {}
            public void onActivityRestartAttempt(android.app.ActivityManager.RunningTaskInfo p0, boolean p1, boolean p2, boolean p3) throws android.os.RemoteException {}
            public void onActivityForcedResizable(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void onActivityDismissingDockedTask() throws android.os.RemoteException {}
            public void onActivityLaunchOnSecondaryDisplayFailed(android.app.ActivityManager.RunningTaskInfo p0, int p1) throws android.os.RemoteException {}
            public void onActivityLaunchOnSecondaryDisplayRerouted(android.app.ActivityManager.RunningTaskInfo p0, int p1) throws android.os.RemoteException {}
            public void onTaskCreated(int p0, android.content.ComponentName p1) throws android.os.RemoteException {}
            public void onTaskRemoved(int p0) throws android.os.RemoteException {}
            public void onTaskMovedToFront(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
            public void onTaskDescriptionChanged(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
            public void onActivityRequestedOrientationChanged(int p0, int p1) throws android.os.RemoteException {}
            public void onTaskRemovalStarted(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
            public void onTaskProfileLocked(android.app.ActivityManager.RunningTaskInfo p0, int p1) throws android.os.RemoteException {}
            public void onTaskSnapshotChanged(int p0, android.window.TaskSnapshot p1) throws android.os.RemoteException {}
            public void onBackPressedOnTaskRoot(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
            public void onTaskDisplayChanged(int p0, int p1) throws android.os.RemoteException {}
            public void onRecentTaskListUpdated() throws android.os.RemoteException {}
            public void onRecentTaskListFrozenChanged(boolean p0) throws android.os.RemoteException {}
            public void onTaskFocusChanged(int p0, boolean p1) throws android.os.RemoteException {}
            public void onTaskRequestedOrientationChanged(int p0, int p1) throws android.os.RemoteException {}
            public void onActivityRotation(int p0) throws android.os.RemoteException {}
            public void onTaskMovedToBack(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
            public void onLockTaskModeChanged(int p0) throws android.os.RemoteException {}
        }
    }
}
