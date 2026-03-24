package android.app.smartspace;

@android.annotation.SystemApi
public final class SmartspaceSession implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = null;
    private static final boolean DEBUG = false;
    private final android.app.smartspace.ISmartspaceManager mInterface = null;
    private final java.util.concurrent.atomic.AtomicBoolean mIsClosed = null;
    private final android.app.smartspace.SmartspaceSessionId mSessionId = null;
    private final android.util.ArrayMap<android.app.smartspace.SmartspaceSession.OnTargetsAvailableListener, android.app.smartspace.SmartspaceSession.CallbackWrapper> mRegisteredCallbacks = null;
    private final android.os.IBinder mToken = null;
    SmartspaceSession(android.content.Context p0, android.app.smartspace.SmartspaceConfig p1) {}
    public void notifySmartspaceEvent(android.app.smartspace.SmartspaceTargetEvent p0) {}
    public void requestSmartspaceUpdate() {}
    public void addOnTargetsAvailableListener(java.util.concurrent.Executor p0, android.app.smartspace.SmartspaceSession.OnTargetsAvailableListener p1) {}
    public void removeOnTargetsAvailableListener(android.app.smartspace.SmartspaceSession.OnTargetsAvailableListener p0) {}
    private void destroy() {}
    protected void finalize() {}
    public void close() {}

    static class CallbackWrapper extends android.app.smartspace.ISmartspaceCallback.Stub {
        private final java.util.function.Consumer<java.util.List<android.app.smartspace.SmartspaceTarget>> mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        CallbackWrapper(java.util.concurrent.Executor p0, java.util.function.Consumer<java.util.List<android.app.smartspace.SmartspaceTarget>> p1) { super(); }
        public void onResult(android.content.pm.ParceledListSlice p0) {}
    }

    public static interface OnTargetsAvailableListener {
        public void onTargetsAvailable(java.util.List<android.app.smartspace.SmartspaceTarget> p0);
    }
}
