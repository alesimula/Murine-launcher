package android.app.ondeviceintelligence;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.app.ondeviceintelligence.flags.enable_on_device_intelligence")
public final class OnDeviceIntelligenceManager {
    public static final java.lang.String API_VERSION_BUNDLE_KEY = "ApiVersionBundleKey";
    public static final java.lang.String AUGMENT_REQUEST_CONTENT_BUNDLE_KEY = "AugmentRequestContentBundleKey";
    public static final int REQUEST_TYPE_INFERENCE = 0;
    public static final int REQUEST_TYPE_PREPARE = 1;
    public static final int REQUEST_TYPE_EMBEDDINGS = 2;
    public OnDeviceIntelligenceManager(android.content.Context p0, android.app.ondeviceintelligence.IOnDeviceIntelligenceManager p1) {}
    @android.annotation.RequiresPermission("android.permission.USE_ON_DEVICE_INTELLIGENCE")
    public void getVersion(java.util.concurrent.Executor p0, java.util.function.LongConsumer p1) {}
    @android.annotation.Nullable
    @android.annotation.RequiresPermission("android.permission.USE_ON_DEVICE_INTELLIGENCE")
    public java.lang.String getRemoteServicePackageName() { return null; }
    @android.annotation.RequiresPermission("android.permission.USE_ON_DEVICE_INTELLIGENCE")
    public void getFeature(int p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.app.ondeviceintelligence.Feature, android.app.ondeviceintelligence.OnDeviceIntelligenceException> p2) {}
    @android.annotation.RequiresPermission("android.permission.USE_ON_DEVICE_INTELLIGENCE")
    public void listFeatures(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.util.List<android.app.ondeviceintelligence.Feature>, android.app.ondeviceintelligence.OnDeviceIntelligenceException> p1) {}
    @android.annotation.RequiresPermission("android.permission.USE_ON_DEVICE_INTELLIGENCE")
    public void getFeatureDetails(android.app.ondeviceintelligence.Feature p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.app.ondeviceintelligence.FeatureDetails, android.app.ondeviceintelligence.OnDeviceIntelligenceException> p2) {}
    @android.annotation.RequiresPermission("android.permission.USE_ON_DEVICE_INTELLIGENCE")
    public void requestFeatureDownload(android.app.ondeviceintelligence.Feature p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, android.app.ondeviceintelligence.DownloadCallback p3) {}
    @android.annotation.RequiresPermission("android.permission.USE_ON_DEVICE_INTELLIGENCE")
    public void requestTokenInfo(android.app.ondeviceintelligence.Feature p0, android.os.Bundle p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, android.os.OutcomeReceiver<android.app.ondeviceintelligence.TokenInfo, android.app.ondeviceintelligence.OnDeviceIntelligenceException> p4) {}
    @android.annotation.RequiresPermission("android.permission.USE_ON_DEVICE_INTELLIGENCE")
    public void processRequest(android.app.ondeviceintelligence.Feature p0, android.os.Bundle p1, int p2, android.os.CancellationSignal p3, android.app.ondeviceintelligence.ProcessingSignal p4, java.util.concurrent.Executor p5, android.app.ondeviceintelligence.ProcessingCallback p6) {}
    @android.annotation.RequiresPermission("android.permission.USE_ON_DEVICE_INTELLIGENCE")
    public void processRequestStreaming(android.app.ondeviceintelligence.Feature p0, android.os.Bundle p1, int p2, android.os.CancellationSignal p3, android.app.ondeviceintelligence.ProcessingSignal p4, java.util.concurrent.Executor p5, android.app.ondeviceintelligence.StreamingProcessingCallback p6) {}
    @android.annotation.RequiresPermission("android.permission.DUMP")
    public java.util.List<android.app.ondeviceintelligence.InferenceInfo> getLatestInferenceInfo(long p0) { return null; }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface InferenceParams {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.FIELD})
    public static @interface ResponseParams {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.FIELD})
    public static @interface StateParams {
    }
}
