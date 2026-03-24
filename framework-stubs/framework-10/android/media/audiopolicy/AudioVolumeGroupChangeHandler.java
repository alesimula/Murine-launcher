package android.media.audiopolicy;

public class AudioVolumeGroupChangeHandler {
    private android.os.Handler mHandler;
    private android.os.HandlerThread mHandlerThread;
    private final java.util.ArrayList<android.media.AudioManager.VolumeGroupCallback> mListeners = null;
    private static final java.lang.String TAG = "AudioVolumeGroupChangeHandler";
    private static final int AUDIOVOLUMEGROUP_EVENT_VOLUME_CHANGED = 1000;
    private static final int AUDIOVOLUMEGROUP_EVENT_NEW_LISTENER = 4;
    private long mJniCallback;
    public AudioVolumeGroupChangeHandler() {}
    public void init() {}
    private native void native_setup(java.lang.Object p0);
    protected void finalize() {}
    private native void native_finalize();
    public void registerListener(android.media.AudioManager.VolumeGroupCallback p0) {}
    public void unregisterListener(android.media.AudioManager.VolumeGroupCallback p0) {}
    android.os.Handler handler() { return null; }
    private static void postEventFromNative(java.lang.Object p0, int p1, int p2, int p3, java.lang.Object p4) {}
}
