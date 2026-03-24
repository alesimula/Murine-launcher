package android.app;

public abstract class ClientTransactionHandler {
    public ClientTransactionHandler() {}
    void scheduleTransaction(android.app.servertransaction.ClientTransaction p0) {}
    public void executeTransaction(android.app.servertransaction.ClientTransaction p0) {}
    abstract android.app.servertransaction.TransactionExecutor getTransactionExecutor();
    abstract void sendMessage(int p0, java.lang.Object p1);
    public abstract android.app.Activity getActivity(android.os.IBinder p0);
    public abstract void updatePendingConfiguration(android.content.res.Configuration p0);
    public abstract void updateProcessState(int p0, boolean p1);
    public abstract void countLaunchingActivities(int p0);
    public abstract java.util.Map<android.os.IBinder, android.app.servertransaction.ClientTransactionItem> getActivitiesToBeDestroyed();
    public abstract void handleDestroyActivity(android.os.IBinder p0, boolean p1, int p2, boolean p3, java.lang.String p4);
    public abstract void handlePauseActivity(android.os.IBinder p0, boolean p1, boolean p2, int p3, android.app.servertransaction.PendingTransactionActions p4, java.lang.String p5);
    public abstract void handleResumeActivity(android.os.IBinder p0, boolean p1, boolean p2, java.lang.String p3);
    public abstract void handleTopResumedActivityChanged(android.os.IBinder p0, boolean p1, java.lang.String p2);
    public abstract void handleStopActivity(android.os.IBinder p0, int p1, android.app.servertransaction.PendingTransactionActions p2, boolean p3, java.lang.String p4);
    public abstract void reportStop(android.app.servertransaction.PendingTransactionActions p0);
    public abstract void performRestartActivity(android.os.IBinder p0, boolean p1);
    public abstract void updatePendingActivityConfiguration(android.os.IBinder p0, android.content.res.Configuration p1);
    public abstract void handleActivityConfigurationChanged(android.os.IBinder p0, android.content.res.Configuration p1, int p2);
    public abstract void handleSendResult(android.os.IBinder p0, java.util.List<android.app.ResultInfo> p1, java.lang.String p2);
    public abstract void handleNewIntent(android.os.IBinder p0, java.util.List<com.android.internal.content.ReferrerIntent> p1);
    public abstract void handlePictureInPictureRequested(android.os.IBinder p0);
    public abstract android.app.Activity handleLaunchActivity(android.app.ActivityThread.ActivityClientRecord p0, android.app.servertransaction.PendingTransactionActions p1, android.content.Intent p2);
    public abstract void handleStartActivity(android.os.IBinder p0, android.app.servertransaction.PendingTransactionActions p1);
    public abstract android.app.LoadedApk getPackageInfoNoCheck(android.content.pm.ApplicationInfo p0, android.content.res.CompatibilityInfo p1);
    public abstract void handleConfigurationChanged(android.content.res.Configuration p0);
    public abstract void handleFixedRotationAdjustments(android.os.IBinder p0, android.view.DisplayAdjustments.FixedRotationAdjustments p1);
    public abstract android.app.ActivityThread.ActivityClientRecord getActivityClient(android.os.IBinder p0);
    public abstract android.app.ActivityThread.ActivityClientRecord prepareRelaunchActivity(android.os.IBinder p0, java.util.List<android.app.ResultInfo> p1, java.util.List<com.android.internal.content.ReferrerIntent> p2, int p3, android.util.MergedConfiguration p4, boolean p5);
    public abstract void handleRelaunchActivity(android.app.ActivityThread.ActivityClientRecord p0, android.app.servertransaction.PendingTransactionActions p1);
    public abstract void reportRelaunch(android.os.IBinder p0, android.app.servertransaction.PendingTransactionActions p1);
}
