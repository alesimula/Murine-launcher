package android.app.ondeviceintelligence;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.app.ondeviceintelligence.flags.enable_on_device_intelligence")
public interface StreamingProcessingCallback extends android.app.ondeviceintelligence.ProcessingCallback {
    public void onPartialResult(android.os.Bundle p0);
}
