package android.service.voice;

@android.annotation.SystemApi
public interface SandboxedDetectionInitializer {
    public static final int INITIALIZATION_STATUS_SUCCESS = 0;
    public static final int INITIALIZATION_STATUS_UNKNOWN = 100;
    public static final java.lang.String KEY_INITIALIZATION_STATUS = "initialization_status";
    public static final int MAXIMUM_NUMBER_OF_INITIALIZATION_STATUS_CUSTOM_ERROR = 2;
    public static int getMaxCustomInitializationStatus() { return 0; }
    public static java.util.function.IntConsumer createInitializationStatusConsumer(android.os.IRemoteCallback p0) { return null; }
    public void onUpdateState(android.os.PersistableBundle p0, android.os.SharedMemory p1, long p2, java.util.function.IntConsumer p3);
}
