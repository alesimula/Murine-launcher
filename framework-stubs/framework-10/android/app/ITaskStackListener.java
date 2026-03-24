package android.app;

public interface ITaskStackListener extends android.os.IInterface {
    public static final int FORCED_RESIZEABLE_REASON_SPLIT_SCREEN = 1;
    public static final int FORCED_RESIZEABLE_REASON_SECONDARY_DISPLAY = 2;
    public void onTaskStackChanged() throws android.os.RemoteException;
    public void onActivityPinned(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void onActivityUnpinned() throws android.os.RemoteException;
    public void onPinnedActivityRestartAttempt(boolean p0) throws android.os.RemoteException;
    public void onPinnedStackAnimationStarted() throws android.os.RemoteException;
    public void onPinnedStackAnimationEnded() throws android.os.RemoteException;
    public void onActivityForcedResizable(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void onActivityDismissingDockedStack() throws android.os.RemoteException;
    public void onActivityLaunchOnSecondaryDisplayFailed(android.app.ActivityManager.RunningTaskInfo p0, int p1) throws android.os.RemoteException;
    public void onActivityLaunchOnSecondaryDisplayRerouted(android.app.ActivityManager.RunningTaskInfo p0, int p1) throws android.os.RemoteException;
    public void onTaskCreated(int p0, android.content.ComponentName p1) throws android.os.RemoteException;
    public void onTaskRemoved(int p0) throws android.os.RemoteException;
    public void onTaskMovedToFront(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException;
    public void onTaskDescriptionChanged(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException;
    public void onActivityRequestedOrientationChanged(int p0, int p1) throws android.os.RemoteException;
    public void onTaskRemovalStarted(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException;
    public void onTaskProfileLocked(int p0, int p1) throws android.os.RemoteException;
    public void onTaskSnapshotChanged(int p0, android.app.ActivityManager.TaskSnapshot p1) throws android.os.RemoteException;
    public void onSizeCompatModeActivityChanged(int p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void onBackPressedOnTaskRoot(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException;
    public void onSingleTaskDisplayDrawn(int p0) throws android.os.RemoteException;
    public void onTaskDisplayChanged(int p0, int p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.app.ITaskStackListener {
        private static final java.lang.String DESCRIPTOR = "android.app.ITaskStackListener";
        static final int TRANSACTION_onTaskStackChanged = 1;
        static final int TRANSACTION_onActivityPinned = 2;
        static final int TRANSACTION_onActivityUnpinned = 3;
        static final int TRANSACTION_onPinnedActivityRestartAttempt = 4;
        static final int TRANSACTION_onPinnedStackAnimationStarted = 5;
        static final int TRANSACTION_onPinnedStackAnimationEnded = 6;
        static final int TRANSACTION_onActivityForcedResizable = 7;
        static final int TRANSACTION_onActivityDismissingDockedStack = 8;
        static final int TRANSACTION_onActivityLaunchOnSecondaryDisplayFailed = 9;
        static final int TRANSACTION_onActivityLaunchOnSecondaryDisplayRerouted = 10;
        static final int TRANSACTION_onTaskCreated = 11;
        static final int TRANSACTION_onTaskRemoved = 12;
        static final int TRANSACTION_onTaskMovedToFront = 13;
        static final int TRANSACTION_onTaskDescriptionChanged = 14;
        static final int TRANSACTION_onActivityRequestedOrientationChanged = 15;
        static final int TRANSACTION_onTaskRemovalStarted = 16;
        static final int TRANSACTION_onTaskProfileLocked = 17;
        static final int TRANSACTION_onTaskSnapshotChanged = 18;
        static final int TRANSACTION_onSizeCompatModeActivityChanged = 19;
        static final int TRANSACTION_onBackPressedOnTaskRoot = 20;
        static final int TRANSACTION_onSingleTaskDisplayDrawn = 21;
        static final int TRANSACTION_onTaskDisplayChanged = 22;
        public Stub() { super(); }
        public static android.app.ITaskStackListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.ITaskStackListener p0) { return false; }
        public static android.app.ITaskStackListener getDefaultImpl() { return null; }

        private static class Proxy implements android.app.ITaskStackListener {
            private android.os.IBinder mRemote;
            public static android.app.ITaskStackListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onTaskStackChanged() throws android.os.RemoteException {}
            public void onActivityPinned(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onActivityUnpinned() throws android.os.RemoteException {}
            public void onPinnedActivityRestartAttempt(boolean p0) throws android.os.RemoteException {}
            public void onPinnedStackAnimationStarted() throws android.os.RemoteException {}
            public void onPinnedStackAnimationEnded() throws android.os.RemoteException {}
            public void onActivityForcedResizable(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void onActivityDismissingDockedStack() throws android.os.RemoteException {}
            public void onActivityLaunchOnSecondaryDisplayFailed(android.app.ActivityManager.RunningTaskInfo p0, int p1) throws android.os.RemoteException {}
            public void onActivityLaunchOnSecondaryDisplayRerouted(android.app.ActivityManager.RunningTaskInfo p0, int p1) throws android.os.RemoteException {}
            public void onTaskCreated(int p0, android.content.ComponentName p1) throws android.os.RemoteException {}
            public void onTaskRemoved(int p0) throws android.os.RemoteException {}
            public void onTaskMovedToFront(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
            public void onTaskDescriptionChanged(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
            public void onActivityRequestedOrientationChanged(int p0, int p1) throws android.os.RemoteException {}
            public void onTaskRemovalStarted(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
            public void onTaskProfileLocked(int p0, int p1) throws android.os.RemoteException {}
            public void onTaskSnapshotChanged(int p0, android.app.ActivityManager.TaskSnapshot p1) throws android.os.RemoteException {}
            public void onSizeCompatModeActivityChanged(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void onBackPressedOnTaskRoot(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
            public void onSingleTaskDisplayDrawn(int p0) throws android.os.RemoteException {}
            public void onTaskDisplayChanged(int p0, int p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.app.ITaskStackListener {
        public Default() {}
        public void onTaskStackChanged() throws android.os.RemoteException {}
        public void onActivityPinned(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onActivityUnpinned() throws android.os.RemoteException {}
        public void onPinnedActivityRestartAttempt(boolean p0) throws android.os.RemoteException {}
        public void onPinnedStackAnimationStarted() throws android.os.RemoteException {}
        public void onPinnedStackAnimationEnded() throws android.os.RemoteException {}
        public void onActivityForcedResizable(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void onActivityDismissingDockedStack() throws android.os.RemoteException {}
        public void onActivityLaunchOnSecondaryDisplayFailed(android.app.ActivityManager.RunningTaskInfo p0, int p1) throws android.os.RemoteException {}
        public void onActivityLaunchOnSecondaryDisplayRerouted(android.app.ActivityManager.RunningTaskInfo p0, int p1) throws android.os.RemoteException {}
        public void onTaskCreated(int p0, android.content.ComponentName p1) throws android.os.RemoteException {}
        public void onTaskRemoved(int p0) throws android.os.RemoteException {}
        public void onTaskMovedToFront(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        public void onTaskDescriptionChanged(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        public void onActivityRequestedOrientationChanged(int p0, int p1) throws android.os.RemoteException {}
        public void onTaskRemovalStarted(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        public void onTaskProfileLocked(int p0, int p1) throws android.os.RemoteException {}
        public void onTaskSnapshotChanged(int p0, android.app.ActivityManager.TaskSnapshot p1) throws android.os.RemoteException {}
        public void onSizeCompatModeActivityChanged(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void onBackPressedOnTaskRoot(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        public void onSingleTaskDisplayDrawn(int p0) throws android.os.RemoteException {}
        public void onTaskDisplayChanged(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
