package android.service.ondeviceintelligence;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.app.ondeviceintelligence.flags.enable_on_device_intelligence")
public abstract class OnDeviceIntelligenceService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.ondeviceintelligence.OnDeviceIntelligenceService";
    public OnDeviceIntelligenceService() { super(); }
    public void onCreate() {}
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onReady() {}
    public abstract void onInferenceServiceConnected();
    public abstract void onInferenceServiceDisconnected();
    public final void updateProcessingState(android.os.Bundle p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.os.PersistableBundle, android.app.ondeviceintelligence.OnDeviceIntelligenceException> p2) {}
    public abstract void onGetReadOnlyFeatureFileDescriptorMap(android.app.ondeviceintelligence.Feature p0, java.util.function.Consumer<java.util.Map<java.lang.String, android.os.ParcelFileDescriptor>> p1);
    public abstract void onDownloadFeature(int p0, android.app.ondeviceintelligence.Feature p1, android.os.CancellationSignal p2, android.app.ondeviceintelligence.DownloadCallback p3);
    public abstract void onGetFeatureDetails(int p0, android.app.ondeviceintelligence.Feature p1, android.os.OutcomeReceiver<android.app.ondeviceintelligence.FeatureDetails, android.app.ondeviceintelligence.OnDeviceIntelligenceException> p2);
    public abstract void onGetFeature(int p0, int p1, android.os.OutcomeReceiver<android.app.ondeviceintelligence.Feature, android.app.ondeviceintelligence.OnDeviceIntelligenceException> p2);
    public abstract void onListFeatures(int p0, android.os.OutcomeReceiver<java.util.List<android.app.ondeviceintelligence.Feature>, android.app.ondeviceintelligence.OnDeviceIntelligenceException> p1);
    public abstract void onGetVersion(java.util.function.LongConsumer p0);
}
