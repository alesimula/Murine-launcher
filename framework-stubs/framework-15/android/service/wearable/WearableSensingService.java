package android.service.wearable;

@android.annotation.SystemApi
public abstract class WearableSensingService extends android.app.Service {
    public static final java.lang.String STATUS_RESPONSE_BUNDLE_KEY = "android.app.wearable.WearableSensingStatusBundleKey";
    public static final java.lang.String HOTWORD_AUDIO_STREAM_BUNDLE_KEY = "android.app.wearable.HotwordAudioStreamBundleKey";
    public static final java.lang.String SERVICE_INTERFACE = "android.service.wearable.WearableSensingService";
    public WearableSensingService() { super(); }
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.FlaggedApi("android.app.wearable.enable_provide_wearable_connection_api")
    public void onSecureConnectionProvided(android.os.ParcelFileDescriptor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    public abstract void onDataStreamProvided(android.os.ParcelFileDescriptor p0, java.util.function.Consumer<java.lang.Integer> p1);
    public abstract void onDataProvided(android.os.PersistableBundle p0, android.os.SharedMemory p1, java.util.function.Consumer<java.lang.Integer> p2);
    @android.annotation.FlaggedApi("android.app.wearable.enable_data_request_observer_api")
    public void onDataRequestObserverRegistered(int p0, java.lang.String p1, android.service.wearable.WearableSensingDataRequester p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    @android.annotation.FlaggedApi("android.app.wearable.enable_data_request_observer_api")
    public void onDataRequestObserverUnregistered(int p0, java.lang.String p1, android.service.wearable.WearableSensingDataRequester p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    @android.annotation.FlaggedApi("android.app.wearable.enable_hotword_wearable_sensing_api")
    public void onStartHotwordRecognition(java.util.function.Consumer<android.service.voice.HotwordAudioStream> p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    @android.annotation.FlaggedApi("android.app.wearable.enable_hotword_wearable_sensing_api")
    public void onStopHotwordRecognition(java.util.function.Consumer<java.lang.Integer> p0) {}
    @android.annotation.FlaggedApi("android.app.wearable.enable_hotword_wearable_sensing_api")
    public void onValidatedByHotwordDetectionService() {}
    @android.annotation.FlaggedApi("android.app.wearable.enable_hotword_wearable_sensing_api")
    public void onStopHotwordAudioStream() {}
    public abstract void onStartDetection(android.app.ambientcontext.AmbientContextEventRequest p0, java.lang.String p1, java.util.function.Consumer<android.service.ambientcontext.AmbientContextDetectionServiceStatus> p2, java.util.function.Consumer<android.service.ambientcontext.AmbientContextDetectionResult> p3);
    public abstract void onStopDetection(java.lang.String p0);
    public abstract void onQueryServiceStatus(java.util.Set<java.lang.Integer> p0, java.lang.String p1, java.util.function.Consumer<android.service.ambientcontext.AmbientContextDetectionServiceStatus> p2);
    @android.annotation.NonNull
    public java.io.FileInputStream openFileInput(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
}
