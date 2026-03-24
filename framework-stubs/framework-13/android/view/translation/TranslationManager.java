package android.view.translation;

public final class TranslationManager {
    static final int SYNC_CALLS_TIMEOUT_MS = 60000;
    public static final int STATUS_SYNC_CALL_SUCCESS = 1;
    public static final int STATUS_SYNC_CALL_FAIL = 2;
    public static final java.lang.String EXTRA_CAPABILITIES = "translation_capabilities";
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
        TranslationCapabilityRemoteCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<android.view.translation.TranslationCapability> p1) { super(); }
        public void sendResult(android.os.Bundle p0) {}
    }
}
