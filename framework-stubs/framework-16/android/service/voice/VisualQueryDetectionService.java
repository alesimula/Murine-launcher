package android.service.voice;

@android.annotation.SystemApi
public abstract class VisualQueryDetectionService extends android.app.Service implements android.service.voice.SandboxedDetectionInitializer {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.voice.VisualQueryDetectionService";
    public static final java.lang.String KEY_INITIALIZATION_STATUS = "initialization_status";
    public VisualQueryDetectionService() { super(); }
    @android.annotation.SuppressLint("OnNameExpected")
    @android.annotation.Nullable
    public java.lang.Object getSystemService(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public void onUpdateState(android.os.PersistableBundle p0, android.os.SharedMemory p1, long p2, java.util.function.IntConsumer p3) {}
    @android.annotation.Nullable
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onStartDetection() {}
    public void onStopDetection() {}
    public final void gainedAttention() {}
    @android.annotation.SuppressLint("UnflaggedApi")
    public final void gainedAttention(android.service.voice.VisualQueryAttentionResult p0) {}
    public final void lostAttention() {}
    @android.annotation.SuppressLint("UnflaggedApi")
    public final void lostAttention(int p0) {}
    public final void streamQuery(java.lang.String p0) throws java.lang.IllegalStateException {}
    @android.annotation.SuppressLint("UnflaggedApi")
    public final void streamQuery(android.service.voice.VisualQueryDetectedResult p0) {}
    public final void rejectQuery() throws java.lang.IllegalStateException {}
    public final void finishQuery() throws java.lang.IllegalStateException {}
    @android.annotation.NonNull
    public java.io.FileInputStream openFileInput(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
}
