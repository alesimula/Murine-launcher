package android.view.translation;

public final class TranslationManager {
    private static final java.lang.String TAG = "TranslationManager";
    static final int SYNC_CALLS_TIMEOUT_MS = 60000;
    public static final int STATUS_SYNC_CALL_SUCCESS = 1;
    public static final int STATUS_SYNC_CALL_FAIL = 2;
    public static final java.lang.String EXTRA_CAPABILITIES = "translation_capabilities";
    private final android.util.ArrayMap<android.util.Pair<java.lang.Integer, java.lang.Integer>, java.util.ArrayList<android.app.PendingIntent>> mTranslationCapabilityUpdateListeners = null;
    private final java.util.Map<java.util.function.Consumer<android.view.translation.TranslationCapability>, android.os.IRemoteCallback> mCapabilityCallbacks = null;
    private static final java.util.Random ID_GENERATOR = null;
    private final java.lang.Object mLock = null;
    private final android.content.Context mContext = null;
    private final android.view.translation.ITranslationManager mService = null;
    private final android.util.SparseArray<android.view.translation.Translator> mTranslators = null;
    private final android.util.ArrayMap<android.view.translation.TranslationContext, java.lang.Integer> mTranslatorIds = null;
    private final android.os.Handler mHandler = null;
    private static final java.util.concurrent.atomic.AtomicInteger sAvailableRequestId = null;
    public TranslationManager(android.content.Context p0, android.view.translation.ITranslationManager p1) {}
    public void createOnDeviceTranslator(android.view.translation.TranslationContext p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.view.translation.Translator> p2) {}
    @java.lang.Deprecated
    public android.view.translation.Translator createOnDeviceTranslator(android.view.translation.TranslationContext p0) { return null; }
    @java.lang.Deprecated
    public android.view.translation.Translator createTranslator(android.view.translation.TranslationContext p0) { return null; }
    public java.util.Set<android.view.translation.TranslationCapability> getOnDeviceTranslationCapabilities(int p0, int p1) { return null; }
    @java.lang.Deprecated
    public java.util.Set<android.view.translation.TranslationCapability> getTranslationCapabilities(int p0, int p1) { return null; }
    public void addOnDeviceTranslationCapabilityUpdateListener(java.util.concurrent.Executor p0, java.util.function.Consumer<android.view.translation.TranslationCapability> p1) {}
    @java.lang.Deprecated
    public void addOnDeviceTranslationCapabilityUpdateListener(int p0, int p1, android.app.PendingIntent p2) {}
    @java.lang.Deprecated
    public void addTranslationCapabilityUpdateListener(int p0, int p1, android.app.PendingIntent p2) {}
    public void removeOnDeviceTranslationCapabilityUpdateListener(java.util.function.Consumer<android.view.translation.TranslationCapability> p0) {}
    @java.lang.Deprecated
    public void removeOnDeviceTranslationCapabilityUpdateListener(int p0, int p1, android.app.PendingIntent p2) {}
    @java.lang.Deprecated
    public void removeTranslationCapabilityUpdateListener(int p0, int p1, android.app.PendingIntent p2) {}
    public android.app.PendingIntent getOnDeviceTranslationSettingsActivityIntent() { return null; }
    @java.lang.Deprecated
    public android.app.PendingIntent getTranslationSettingsActivityIntent() { return null; }
    void removeTranslator(int p0) {}
    java.util.concurrent.atomic.AtomicInteger getAvailableRequestId() { return null; }

    private static class TranslationCapabilityRemoteCallback extends android.os.IRemoteCallback.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final java.util.function.Consumer<android.view.translation.TranslationCapability> mListener = null;
        TranslationCapabilityRemoteCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<android.view.translation.TranslationCapability> p1) { super(); }
        public void sendResult(android.os.Bundle p0) {}
        private void onTranslationCapabilityUpdate(android.os.Bundle p0) {}
    }
}
