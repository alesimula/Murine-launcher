package android.app;

public abstract class ClientTransactionHandler {
    public ClientTransactionHandler() {}
    void scheduleTransaction(android.app.servertransaction.ClientTransaction p0) {}
    public void executeTransaction(android.app.servertransaction.ClientTransaction p0) {}
    public boolean isExecutingLocalTransaction() { return false; }
    abstract android.app.servertransaction.TransactionExecutor getTransactionExecutor();
    abstract void sendMessage(int p0, java.lang.Object p1);
    public abstract android.app.Activity getActivity(android.os.IBinder p0);
    public abstract void updatePendingConfiguration(android.content.res.Configuration p0);
    public abstract void updateProcessState(int p0, boolean p1);
    public abstract void countLaunchingActivities(int p0);
    public abstract java.util.Map<android.os.IBinder, android.app.servertransaction.DestroyActivityItem> getActivitiesToBeDestroyed();
    public abstract void handleDestroyActivity(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, boolean p2, java.lang.String p3);
    public abstract void handlePauseActivity(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, boolean p2, boolean p3, android.app.servertransaction.PendingTransactionActions p4, java.lang.String p5);
    public abstract void handleResumeActivity(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, boolean p2, boolean p3, java.lang.String p4);
    public abstract void handleTopResumedActivityChanged(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, java.lang.String p2);
    public abstract void handleStopActivity(android.app.ActivityThread.ActivityClientRecord p0, android.app.servertransaction.PendingTransactionActions p1, boolean p2, java.lang.String p3);
    public abstract void reportStop(android.app.servertransaction.PendingTransactionActions p0);
    public abstract void performRestartActivity(android.app.ActivityThread.ActivityClientRecord p0, boolean p1);
    public abstract void reportRefresh(android.app.ActivityThread.ActivityClientRecord p0);
    public abstract void updatePendingActivityConfiguration(android.os.IBinder p0, android.content.res.Configuration p1);
    public abstract void handleActivityConfigurationChanged(android.app.ActivityThread.ActivityClientRecord p0, android.content.res.Configuration p1, int p2, android.window.ActivityWindowInfo p3);
    public abstract void handleWindowContextInfoChanged(android.os.IBinder p0, android.window.WindowContextInfo p1);
    public abstract void handleWindowContextWindowRemoval(android.os.IBinder p0);
    public abstract void handleSendResult(android.app.ActivityThread.ActivityClientRecord p0, java.util.List<android.app.ResultInfo> p1, java.lang.String p2);
    public abstract void handleNewIntent(android.app.ActivityThread.ActivityClientRecord p0, java.util.List<com.android.internal.content.ReferrerIntent> p1);
    public abstract void handlePictureInPictureRequested(android.app.ActivityThread.ActivityClientRecord p0);
    public abstract void handlePictureInPictureStateChanged(android.app.ActivityThread.ActivityClientRecord p0, android.app.PictureInPictureUiState p1);
    public abstract boolean isHandleSplashScreenExit(android.os.IBinder p0);
    public abstract void handleAttachSplashScreenView(android.app.ActivityThread.ActivityClientRecord p0, android.window.SplashScreenView.SplashScreenViewParcelable p1, android.view.SurfaceControl p2);
    public abstract android.app.Activity handleLaunchActivity(android.app.ActivityThread.ActivityClientRecord p0, android.app.servertransaction.PendingTransactionActions p1, int p2, android.content.Intent p3);
    public abstract void handleStartActivity(android.app.ActivityThread.ActivityClientRecord p0, android.app.servertransaction.PendingTransactionActions p1, android.app.ActivityOptions.SceneTransitionInfo p2);
    public abstract android.app.LoadedApk getPackageInfoNoCheck(android.content.pm.ApplicationInfo p0);
    public abstract void handleConfigurationChanged(android.content.res.Configuration p0, int p1);
    public abstract android.app.ActivityThread.ActivityClientRecord getActivityClient(android.os.IBinder p0);
    public abstract android.app.ActivityThread.ActivityClientRecord prepareRelaunchActivity(android.os.IBinder p0, java.util.List<android.app.ResultInfo> p1, java.util.List<com.android.internal.content.ReferrerIntent> p2, int p3, android.util.MergedConfiguration p4, boolean p5, android.window.ActivityWindowInfo p6);
    public abstract void handleRelaunchActivity(android.app.ActivityThread.ActivityClientRecord p0, android.app.servertransaction.PendingTransactionActions p1);
    public abstract void reportRelaunch(android.app.ActivityThread.ActivityClientRecord p0);
}
