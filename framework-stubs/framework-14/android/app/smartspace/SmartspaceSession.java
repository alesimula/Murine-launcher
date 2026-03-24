package android.app.smartspace;

@android.annotation.SystemApi
public final class SmartspaceSession implements java.lang.AutoCloseable {
    SmartspaceSession(android.content.Context p0, android.app.smartspace.SmartspaceConfig p1) {}
    public void notifySmartspaceEvent(android.app.smartspace.SmartspaceTargetEvent p0) {}
    public void requestSmartspaceUpdate() {}
    public void addOnTargetsAvailableListener(java.util.concurrent.Executor p0, android.app.smartspace.SmartspaceSession.OnTargetsAvailableListener p1) {}
    public void removeOnTargetsAvailableListener(android.app.smartspace.SmartspaceSession.OnTargetsAvailableListener p0) {}
    protected void finalize() {}
    public void close() {}

    static class CallbackWrapper extends android.app.smartspace.ISmartspaceCallback.Stub {
        CallbackWrapper(java.util.concurrent.Executor p0, java.util.function.Consumer<java.util.List<android.app.smartspace.SmartspaceTarget>> p1) { super(); }
        public void onResult(android.content.pm.ParceledListSlice p0) {}
    }

    public static interface OnTargetsAvailableListener {
        public void onTargetsAvailable(java.util.List<android.app.smartspace.SmartspaceTarget> p0);
    }

    private static class Token {
        static final android.os.IBinder sBinder = null;
    }
}
