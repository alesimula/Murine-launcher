package android.app.ondeviceintelligence;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.app.ondeviceintelligence.flags.enable_on_device_intelligence")
public interface ProcessingCallback {
    public void onResult(android.os.Bundle p0);
    public void onError(android.app.ondeviceintelligence.OnDeviceIntelligenceException p0);
    default public void onDataAugmentRequest(android.os.Bundle p0, java.util.function.Consumer<android.os.Bundle> p1) {}
}
