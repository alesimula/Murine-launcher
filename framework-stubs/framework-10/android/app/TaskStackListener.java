package android.app;

public abstract class TaskStackListener extends android.app.ITaskStackListener.Stub {
    public TaskStackListener() { super(); }
    @android.annotation.UnsupportedAppUsage
    public void onTaskStackChanged() throws android.os.RemoteException {}
    @android.annotation.UnsupportedAppUsage
    public void onActivityPinned(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
    @android.annotation.UnsupportedAppUsage
    public void onActivityUnpinned() throws android.os.RemoteException {}
    @android.annotation.UnsupportedAppUsage
    public void onPinnedActivityRestartAttempt(boolean p0) throws android.os.RemoteException {}
    @android.annotation.UnsupportedAppUsage
    public void onPinnedStackAnimationStarted() throws android.os.RemoteException {}
    @android.annotation.UnsupportedAppUsage
    public void onPinnedStackAnimationEnded() throws android.os.RemoteException {}
    @android.annotation.UnsupportedAppUsage
    public void onActivityForcedResizable(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
    @android.annotation.UnsupportedAppUsage
    public void onActivityDismissingDockedStack() throws android.os.RemoteException {}
    public void onActivityLaunchOnSecondaryDisplayFailed(android.app.ActivityManager.RunningTaskInfo p0, int p1) throws android.os.RemoteException {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void onActivityLaunchOnSecondaryDisplayFailed() throws android.os.RemoteException {}
    @android.annotation.UnsupportedAppUsage
    public void onActivityLaunchOnSecondaryDisplayRerouted(android.app.ActivityManager.RunningTaskInfo p0, int p1) throws android.os.RemoteException {}
    public void onTaskCreated(int p0, android.content.ComponentName p1) throws android.os.RemoteException {}
    @android.annotation.UnsupportedAppUsage
    public void onTaskRemoved(int p0) throws android.os.RemoteException {}
    public void onTaskMovedToFront(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void onTaskMovedToFront(int p0) throws android.os.RemoteException {}
    public void onTaskRemovalStarted(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
    @java.lang.Deprecated
    public void onTaskRemovalStarted(int p0) throws android.os.RemoteException {}
    public void onTaskDescriptionChanged(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
    @java.lang.Deprecated
    public void onTaskDescriptionChanged(int p0, android.app.ActivityManager.TaskDescription p1) throws android.os.RemoteException {}
    @android.annotation.UnsupportedAppUsage
    public void onActivityRequestedOrientationChanged(int p0, int p1) throws android.os.RemoteException {}
    @android.annotation.UnsupportedAppUsage
    public void onTaskProfileLocked(int p0, int p1) throws android.os.RemoteException {}
    @android.annotation.UnsupportedAppUsage
    public void onTaskSnapshotChanged(int p0, android.app.ActivityManager.TaskSnapshot p1) throws android.os.RemoteException {}
    @android.annotation.UnsupportedAppUsage
    public void onSizeCompatModeActivityChanged(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
    public void onBackPressedOnTaskRoot(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
    public void onSingleTaskDisplayDrawn(int p0) throws android.os.RemoteException {}
    public void onTaskDisplayChanged(int p0, int p1) throws android.os.RemoteException {}
}
