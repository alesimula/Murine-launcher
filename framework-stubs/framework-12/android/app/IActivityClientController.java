package android.app;

public interface IActivityClientController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.IActivityClientController";
    public void activityIdle(android.os.IBinder p0, android.content.res.Configuration p1, boolean p2) throws android.os.RemoteException;
    public void activityResumed(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void activityTopResumedStateLost() throws android.os.RemoteException;
    public void activityPaused(android.os.IBinder p0) throws android.os.RemoteException;
    public void activityStopped(android.os.IBinder p0, android.os.Bundle p1, android.os.PersistableBundle p2, java.lang.CharSequence p3) throws android.os.RemoteException;
    public void activityDestroyed(android.os.IBinder p0) throws android.os.RemoteException;
    public void activityRelaunched(android.os.IBinder p0) throws android.os.RemoteException;
    public void reportSizeConfigurations(android.os.IBinder p0, android.window.SizeConfigurationBuckets p1) throws android.os.RemoteException;
    public boolean moveActivityTaskToBack(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public boolean shouldUpRecreateTask(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean navigateUpTo(android.os.IBinder p0, android.content.Intent p1, int p2, android.content.Intent p3) throws android.os.RemoteException;
    public boolean releaseActivityInstance(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean finishActivity(android.os.IBinder p0, int p1, android.content.Intent p2, int p3) throws android.os.RemoteException;
    public boolean finishActivityAffinity(android.os.IBinder p0) throws android.os.RemoteException;
    public void finishSubActivity(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean isTopOfTask(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean willActivityBeVisible(android.os.IBinder p0) throws android.os.RemoteException;
    public int getDisplayId(android.os.IBinder p0) throws android.os.RemoteException;
    public int getTaskForActivity(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public android.content.ComponentName getCallingActivity(android.os.IBinder p0) throws android.os.RemoteException;
    public java.lang.String getCallingPackage(android.os.IBinder p0) throws android.os.RemoteException;
    public int getLaunchedFromUid(android.os.IBinder p0) throws android.os.RemoteException;
    public java.lang.String getLaunchedFromPackage(android.os.IBinder p0) throws android.os.RemoteException;
    public void setRequestedOrientation(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public int getRequestedOrientation(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean convertFromTranslucent(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean convertToTranslucent(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException;
    public boolean isImmersive(android.os.IBinder p0) throws android.os.RemoteException;
    public void setImmersive(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public boolean enterPictureInPictureMode(android.os.IBinder p0, android.app.PictureInPictureParams p1) throws android.os.RemoteException;
    public void setPictureInPictureParams(android.os.IBinder p0, android.app.PictureInPictureParams p1) throws android.os.RemoteException;
    public void toggleFreeformWindowingMode(android.os.IBinder p0) throws android.os.RemoteException;
    public void startLockTaskModeByToken(android.os.IBinder p0) throws android.os.RemoteException;
    public void stopLockTaskModeByToken(android.os.IBinder p0) throws android.os.RemoteException;
    public void showLockTaskEscapeMessage(android.os.IBinder p0) throws android.os.RemoteException;
    public void setTaskDescription(android.os.IBinder p0, android.app.ActivityManager.TaskDescription p1) throws android.os.RemoteException;
    public boolean showAssistFromActivity(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException;
    public boolean isRootVoiceInteraction(android.os.IBinder p0) throws android.os.RemoteException;
    public void startLocalVoiceInteraction(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void stopLocalVoiceInteraction(android.os.IBinder p0) throws android.os.RemoteException;
    public void setShowWhenLocked(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void setInheritShowWhenLocked(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void setTurnScreenOn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void reportActivityFullyDrawn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void overridePendingTransition(android.os.IBinder p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public int setVrMode(android.os.IBinder p0, boolean p1, android.content.ComponentName p2) throws android.os.RemoteException;
    public void setDisablePreviewScreenshots(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void invalidateHomeTaskSnapshot(android.os.IBinder p0) throws android.os.RemoteException;
    public void dismissKeyguard(android.os.IBinder p0, com.android.internal.policy.IKeyguardDismissCallback p1, java.lang.CharSequence p2) throws android.os.RemoteException;
    public void registerRemoteAnimations(android.os.IBinder p0, android.view.RemoteAnimationDefinition p1) throws android.os.RemoteException;
    public void unregisterRemoteAnimations(android.os.IBinder p0) throws android.os.RemoteException;
    public void onBackPressedOnTaskRoot(android.os.IBinder p0, android.app.IRequestFinishCallback p1) throws android.os.RemoteException;
    public void splashScreenAttached(android.os.IBinder p0) throws android.os.RemoteException;

    public static class Default implements android.app.IActivityClientController {
        public Default() {}
        public void activityIdle(android.os.IBinder p0, android.content.res.Configuration p1, boolean p2) throws android.os.RemoteException {}
        public void activityResumed(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void activityTopResumedStateLost() throws android.os.RemoteException {}
        public void activityPaused(android.os.IBinder p0) throws android.os.RemoteException {}
        public void activityStopped(android.os.IBinder p0, android.os.Bundle p1, android.os.PersistableBundle p2, java.lang.CharSequence p3) throws android.os.RemoteException {}
        public void activityDestroyed(android.os.IBinder p0) throws android.os.RemoteException {}
        public void activityRelaunched(android.os.IBinder p0) throws android.os.RemoteException {}
        public void reportSizeConfigurations(android.os.IBinder p0, android.window.SizeConfigurationBuckets p1) throws android.os.RemoteException {}
        public boolean moveActivityTaskToBack(android.os.IBinder p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean shouldUpRecreateTask(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean navigateUpTo(android.os.IBinder p0, android.content.Intent p1, int p2, android.content.Intent p3) throws android.os.RemoteException { return false; }
        public boolean releaseActivityInstance(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public boolean finishActivity(android.os.IBinder p0, int p1, android.content.Intent p2, int p3) throws android.os.RemoteException { return false; }
        public boolean finishActivityAffinity(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public void finishSubActivity(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public boolean isTopOfTask(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public boolean willActivityBeVisible(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public int getDisplayId(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public int getTaskForActivity(android.os.IBinder p0, boolean p1) throws android.os.RemoteException { return 0; }
        public android.content.ComponentName getCallingActivity(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public java.lang.String getCallingPackage(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public int getLaunchedFromUid(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getLaunchedFromPackage(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public void setRequestedOrientation(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public int getRequestedOrientation(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public boolean convertFromTranslucent(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public boolean convertToTranslucent(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException { return false; }
        public boolean isImmersive(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public void setImmersive(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public boolean enterPictureInPictureMode(android.os.IBinder p0, android.app.PictureInPictureParams p1) throws android.os.RemoteException { return false; }
        public void setPictureInPictureParams(android.os.IBinder p0, android.app.PictureInPictureParams p1) throws android.os.RemoteException {}
        public void toggleFreeformWindowingMode(android.os.IBinder p0) throws android.os.RemoteException {}
        public void startLockTaskModeByToken(android.os.IBinder p0) throws android.os.RemoteException {}
        public void stopLockTaskModeByToken(android.os.IBinder p0) throws android.os.RemoteException {}
        public void showLockTaskEscapeMessage(android.os.IBinder p0) throws android.os.RemoteException {}
        public void setTaskDescription(android.os.IBinder p0, android.app.ActivityManager.TaskDescription p1) throws android.os.RemoteException {}
        public boolean showAssistFromActivity(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException { return false; }
        public boolean isRootVoiceInteraction(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public void startLocalVoiceInteraction(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void stopLocalVoiceInteraction(android.os.IBinder p0) throws android.os.RemoteException {}
        public void setShowWhenLocked(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void setInheritShowWhenLocked(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void setTurnScreenOn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void reportActivityFullyDrawn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void overridePendingTransition(android.os.IBinder p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
        public int setVrMode(android.os.IBinder p0, boolean p1, android.content.ComponentName p2) throws android.os.RemoteException { return 0; }
        public void setDisablePreviewScreenshots(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void invalidateHomeTaskSnapshot(android.os.IBinder p0) throws android.os.RemoteException {}
        public void dismissKeyguard(android.os.IBinder p0, com.android.internal.policy.IKeyguardDismissCallback p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
        public void registerRemoteAnimations(android.os.IBinder p0, android.view.RemoteAnimationDefinition p1) throws android.os.RemoteException {}
        public void unregisterRemoteAnimations(android.os.IBinder p0) throws android.os.RemoteException {}
        public void onBackPressedOnTaskRoot(android.os.IBinder p0, android.app.IRequestFinishCallback p1) throws android.os.RemoteException {}
        public void splashScreenAttached(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IActivityClientController {
        static final int TRANSACTION_activityIdle = 1;
        static final int TRANSACTION_activityResumed = 2;
        static final int TRANSACTION_activityTopResumedStateLost = 3;
        static final int TRANSACTION_activityPaused = 4;
        static final int TRANSACTION_activityStopped = 5;
        static final int TRANSACTION_activityDestroyed = 6;
        static final int TRANSACTION_activityRelaunched = 7;
        static final int TRANSACTION_reportSizeConfigurations = 8;
        static final int TRANSACTION_moveActivityTaskToBack = 9;
        static final int TRANSACTION_shouldUpRecreateTask = 10;
        static final int TRANSACTION_navigateUpTo = 11;
        static final int TRANSACTION_releaseActivityInstance = 12;
        static final int TRANSACTION_finishActivity = 13;
        static final int TRANSACTION_finishActivityAffinity = 14;
        static final int TRANSACTION_finishSubActivity = 15;
        static final int TRANSACTION_isTopOfTask = 16;
        static final int TRANSACTION_willActivityBeVisible = 17;
        static final int TRANSACTION_getDisplayId = 18;
        static final int TRANSACTION_getTaskForActivity = 19;
        static final int TRANSACTION_getCallingActivity = 20;
        static final int TRANSACTION_getCallingPackage = 21;
        static final int TRANSACTION_getLaunchedFromUid = 22;
        static final int TRANSACTION_getLaunchedFromPackage = 23;
        static final int TRANSACTION_setRequestedOrientation = 24;
        static final int TRANSACTION_getRequestedOrientation = 25;
        static final int TRANSACTION_convertFromTranslucent = 26;
        static final int TRANSACTION_convertToTranslucent = 27;
        static final int TRANSACTION_isImmersive = 28;
        static final int TRANSACTION_setImmersive = 29;
        static final int TRANSACTION_enterPictureInPictureMode = 30;
        static final int TRANSACTION_setPictureInPictureParams = 31;
        static final int TRANSACTION_toggleFreeformWindowingMode = 32;
        static final int TRANSACTION_startLockTaskModeByToken = 33;
        static final int TRANSACTION_stopLockTaskModeByToken = 34;
        static final int TRANSACTION_showLockTaskEscapeMessage = 35;
        static final int TRANSACTION_setTaskDescription = 36;
        static final int TRANSACTION_showAssistFromActivity = 37;
        static final int TRANSACTION_isRootVoiceInteraction = 38;
        static final int TRANSACTION_startLocalVoiceInteraction = 39;
        static final int TRANSACTION_stopLocalVoiceInteraction = 40;
        static final int TRANSACTION_setShowWhenLocked = 41;
        static final int TRANSACTION_setInheritShowWhenLocked = 42;
        static final int TRANSACTION_setTurnScreenOn = 43;
        static final int TRANSACTION_reportActivityFullyDrawn = 44;
        static final int TRANSACTION_overridePendingTransition = 45;
        static final int TRANSACTION_setVrMode = 46;
        static final int TRANSACTION_setDisablePreviewScreenshots = 47;
        static final int TRANSACTION_invalidateHomeTaskSnapshot = 48;
        static final int TRANSACTION_dismissKeyguard = 49;
        static final int TRANSACTION_registerRemoteAnimations = 50;
        static final int TRANSACTION_unregisterRemoteAnimations = 51;
        static final int TRANSACTION_onBackPressedOnTaskRoot = 52;
        static final int TRANSACTION_splashScreenAttached = 53;
        public Stub() { super(); }
        public static android.app.IActivityClientController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IActivityClientController p0) { return false; }
        public static android.app.IActivityClientController getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IActivityClientController {
            private android.os.IBinder mRemote;
            public static android.app.IActivityClientController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void activityIdle(android.os.IBinder p0, android.content.res.Configuration p1, boolean p2) throws android.os.RemoteException {}
            public void activityResumed(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void activityTopResumedStateLost() throws android.os.RemoteException {}
            public void activityPaused(android.os.IBinder p0) throws android.os.RemoteException {}
            public void activityStopped(android.os.IBinder p0, android.os.Bundle p1, android.os.PersistableBundle p2, java.lang.CharSequence p3) throws android.os.RemoteException {}
            public void activityDestroyed(android.os.IBinder p0) throws android.os.RemoteException {}
            public void activityRelaunched(android.os.IBinder p0) throws android.os.RemoteException {}
            public void reportSizeConfigurations(android.os.IBinder p0, android.window.SizeConfigurationBuckets p1) throws android.os.RemoteException {}
            public boolean moveActivityTaskToBack(android.os.IBinder p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean shouldUpRecreateTask(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean navigateUpTo(android.os.IBinder p0, android.content.Intent p1, int p2, android.content.Intent p3) throws android.os.RemoteException { return false; }
            public boolean releaseActivityInstance(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public boolean finishActivity(android.os.IBinder p0, int p1, android.content.Intent p2, int p3) throws android.os.RemoteException { return false; }
            public boolean finishActivityAffinity(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public void finishSubActivity(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public boolean isTopOfTask(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public boolean willActivityBeVisible(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public int getDisplayId(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public int getTaskForActivity(android.os.IBinder p0, boolean p1) throws android.os.RemoteException { return 0; }
            public android.content.ComponentName getCallingActivity(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public java.lang.String getCallingPackage(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public int getLaunchedFromUid(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getLaunchedFromPackage(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public void setRequestedOrientation(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public int getRequestedOrientation(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public boolean convertFromTranslucent(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public boolean convertToTranslucent(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException { return false; }
            public boolean isImmersive(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public void setImmersive(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public boolean enterPictureInPictureMode(android.os.IBinder p0, android.app.PictureInPictureParams p1) throws android.os.RemoteException { return false; }
            public void setPictureInPictureParams(android.os.IBinder p0, android.app.PictureInPictureParams p1) throws android.os.RemoteException {}
            public void toggleFreeformWindowingMode(android.os.IBinder p0) throws android.os.RemoteException {}
            public void startLockTaskModeByToken(android.os.IBinder p0) throws android.os.RemoteException {}
            public void stopLockTaskModeByToken(android.os.IBinder p0) throws android.os.RemoteException {}
            public void showLockTaskEscapeMessage(android.os.IBinder p0) throws android.os.RemoteException {}
            public void setTaskDescription(android.os.IBinder p0, android.app.ActivityManager.TaskDescription p1) throws android.os.RemoteException {}
            public boolean showAssistFromActivity(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException { return false; }
            public boolean isRootVoiceInteraction(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public void startLocalVoiceInteraction(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void stopLocalVoiceInteraction(android.os.IBinder p0) throws android.os.RemoteException {}
            public void setShowWhenLocked(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void setInheritShowWhenLocked(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void setTurnScreenOn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void reportActivityFullyDrawn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void overridePendingTransition(android.os.IBinder p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
            public int setVrMode(android.os.IBinder p0, boolean p1, android.content.ComponentName p2) throws android.os.RemoteException { return 0; }
            public void setDisablePreviewScreenshots(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void invalidateHomeTaskSnapshot(android.os.IBinder p0) throws android.os.RemoteException {}
            public void dismissKeyguard(android.os.IBinder p0, com.android.internal.policy.IKeyguardDismissCallback p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
            public void registerRemoteAnimations(android.os.IBinder p0, android.view.RemoteAnimationDefinition p1) throws android.os.RemoteException {}
            public void unregisterRemoteAnimations(android.os.IBinder p0) throws android.os.RemoteException {}
            public void onBackPressedOnTaskRoot(android.os.IBinder p0, android.app.IRequestFinishCallback p1) throws android.os.RemoteException {}
            public void splashScreenAttached(android.os.IBinder p0) throws android.os.RemoteException {}
        }
    }
}
