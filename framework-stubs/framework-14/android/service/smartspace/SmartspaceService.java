package android.service.smartspace;

@android.annotation.SystemApi
public abstract class SmartspaceService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.smartspace.SmartspaceService";
    public SmartspaceService() { super(); }
    public void onCreate() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onCreateSmartspaceSession(android.app.smartspace.SmartspaceConfig p0, android.app.smartspace.SmartspaceSessionId p1);
    public abstract void notifySmartspaceEvent(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.SmartspaceTargetEvent p1);
    public abstract void onRequestSmartspaceUpdate(android.app.smartspace.SmartspaceSessionId p0);
    public abstract void onDestroySmartspaceSession(android.app.smartspace.SmartspaceSessionId p0);
    public final void updateSmartspaceTargets(android.app.smartspace.SmartspaceSessionId p0, java.util.List<android.app.smartspace.SmartspaceTarget> p1) {}
    public abstract void onDestroy(android.app.smartspace.SmartspaceSessionId p0);

    private static final class CallbackWrapper implements java.util.function.Consumer<java.util.List<android.app.smartspace.SmartspaceTarget>>, android.os.IBinder.DeathRecipient {
        CallbackWrapper(android.app.smartspace.ISmartspaceCallback p0, java.util.function.Consumer<android.service.smartspace.SmartspaceService.CallbackWrapper> p1) {}
        public boolean isCallback(android.app.smartspace.ISmartspaceCallback p0) { return false; }
        public void accept(java.util.List<android.app.smartspace.SmartspaceTarget> p0) {}
        public void destroy() {}
        public void binderDied() {}
    }
}
