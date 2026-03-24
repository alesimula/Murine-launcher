package android.service.ondeviceintelligence;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.app.ondeviceintelligence.flags.enable_on_device_intelligence")
public abstract class OnDeviceSandboxedInferenceService extends android.app.Service {
    public static final java.lang.String INFERENCE_INFO_BUNDLE_KEY = "inference_info";
    public static final java.lang.String SERVICE_INTERFACE = "android.service.ondeviceintelligence.OnDeviceSandboxedInferenceService";
    public static final java.lang.String REGISTER_MODEL_UPDATE_CALLBACK_BUNDLE_KEY = "register_model_update_callback";
    public static final java.lang.String MODEL_LOADED_BUNDLE_KEY = "model_loaded";
    public static final java.lang.String MODEL_UNLOADED_BUNDLE_KEY = "model_unloaded";
    public static final java.lang.String DEVICE_CONFIG_UPDATE_BUNDLE_KEY = "device_config_update";
    public OnDeviceSandboxedInferenceService() { super(); }
    public void onCreate() {}
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.NonNull
    public abstract void onTokenInfoRequest(int p0, android.app.ondeviceintelligence.Feature p1, android.os.Bundle p2, android.os.CancellationSignal p3, android.os.OutcomeReceiver<android.app.ondeviceintelligence.TokenInfo, android.app.ondeviceintelligence.OnDeviceIntelligenceException> p4);
    @android.annotation.NonNull
    public abstract void onProcessRequestStreaming(int p0, android.app.ondeviceintelligence.Feature p1, android.os.Bundle p2, int p3, android.os.CancellationSignal p4, android.app.ondeviceintelligence.ProcessingSignal p5, android.app.ondeviceintelligence.StreamingProcessingCallback p6);
    @android.annotation.NonNull
    public abstract void onProcessRequest(int p0, android.app.ondeviceintelligence.Feature p1, android.os.Bundle p2, int p3, android.os.CancellationSignal p4, android.app.ondeviceintelligence.ProcessingSignal p5, android.app.ondeviceintelligence.ProcessingCallback p6);
    public abstract void onUpdateProcessingState(android.os.Bundle p0, android.os.OutcomeReceiver<android.os.PersistableBundle, android.app.ondeviceintelligence.OnDeviceIntelligenceException> p1);
    public final java.io.FileInputStream openFileInput(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
    public final void getReadOnlyFileDescriptor(java.lang.String p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.os.ParcelFileDescriptor> p2) throws java.io.FileNotFoundException {}
    public final void fetchFeatureFileDescriptorMap(android.app.ondeviceintelligence.Feature p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.util.Map<java.lang.String, android.os.ParcelFileDescriptor>> p2) {}
    @android.annotation.SuppressLint("OnNameExpected")
    @android.annotation.NonNull
    public java.util.concurrent.Executor getCallbackExecutor() { return null; }
}
