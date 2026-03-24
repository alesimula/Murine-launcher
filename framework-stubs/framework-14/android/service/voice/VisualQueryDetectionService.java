package android.service.voice;

@android.annotation.SystemApi
public abstract class VisualQueryDetectionService extends android.app.Service implements android.service.voice.SandboxedDetectionInitializer {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.voice.VisualQueryDetectionService";
    public static final java.lang.String KEY_INITIALIZATION_STATUS = "initialization_status";
    public VisualQueryDetectionService() { super(); }
    @android.annotation.SuppressLint("OnNameExpected")
    public java.lang.Object getSystemService(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public void onUpdateState(android.os.PersistableBundle p0, android.os.SharedMemory p1, long p2, java.util.function.IntConsumer p3) {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onStartDetection() {}
    public void onStopDetection() {}
    public final void gainedAttention() {}
    public final void lostAttention() {}
    public final void streamQuery(java.lang.String p0) throws java.lang.IllegalStateException {}
    public final void rejectQuery() throws java.lang.IllegalStateException {}
    public final void finishQuery() throws java.lang.IllegalStateException {}
}
