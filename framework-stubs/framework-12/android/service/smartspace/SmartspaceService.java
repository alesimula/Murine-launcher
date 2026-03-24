package android.service.smartspace;

@android.annotation.SystemApi
public abstract class SmartspaceService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.smartspace.SmartspaceService";
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "SmartspaceService";
    private final android.util.ArrayMap<android.app.smartspace.SmartspaceSessionId, java.util.ArrayList<android.service.smartspace.SmartspaceService.CallbackWrapper>> mSessionCallbacks = null;
    private android.os.Handler mHandler;
    private final android.service.smartspace.ISmartspaceService mInterface = null;
    public SmartspaceService() { super(); }
    public void onCreate() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    private void doCreateSmartspaceSession(android.app.smartspace.SmartspaceConfig p0, android.app.smartspace.SmartspaceSessionId p1) {}
    public abstract void onCreateSmartspaceSession(android.app.smartspace.SmartspaceConfig p0, android.app.smartspace.SmartspaceSessionId p1);
    public abstract void notifySmartspaceEvent(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.SmartspaceTargetEvent p1);
    public abstract void onRequestSmartspaceUpdate(android.app.smartspace.SmartspaceSessionId p0);
    private void doRegisterSmartspaceUpdates(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.ISmartspaceCallback p1) {}
    private void doUnregisterSmartspaceUpdates(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.ISmartspaceCallback p1) {}
    private void doRequestPredictionUpdate(android.app.smartspace.SmartspaceSessionId p0) {}
    private android.service.smartspace.SmartspaceService.CallbackWrapper findCallbackWrapper(java.util.ArrayList<android.service.smartspace.SmartspaceService.CallbackWrapper> p0, android.app.smartspace.ISmartspaceCallback p1) { return null; }
    private void removeCallbackWrapper(java.util.ArrayList<android.service.smartspace.SmartspaceService.CallbackWrapper> p0, android.service.smartspace.SmartspaceService.CallbackWrapper p1) {}
    public abstract void onDestroySmartspaceSession(android.app.smartspace.SmartspaceSessionId p0);
    private void doDestroy(android.app.smartspace.SmartspaceSessionId p0) {}
    public final void updateSmartspaceTargets(android.app.smartspace.SmartspaceSessionId p0, java.util.List<android.app.smartspace.SmartspaceTarget> p1) {}
    public abstract void onDestroy(android.app.smartspace.SmartspaceSessionId p0);

    private static final class CallbackWrapper implements java.util.function.Consumer<java.util.List<android.app.smartspace.SmartspaceTarget>>, android.os.IBinder.DeathRecipient {
        private final java.util.function.Consumer<android.service.smartspace.SmartspaceService.CallbackWrapper> mOnBinderDied = null;
        private android.app.smartspace.ISmartspaceCallback mCallback;
        CallbackWrapper(android.app.smartspace.ISmartspaceCallback p0, java.util.function.Consumer<android.service.smartspace.SmartspaceService.CallbackWrapper> p1) {}
        public boolean isCallback(android.app.smartspace.ISmartspaceCallback p0) { return false; }
        public void accept(java.util.List<android.app.smartspace.SmartspaceTarget> p0) {}
        public void binderDied() {}
    }
}
