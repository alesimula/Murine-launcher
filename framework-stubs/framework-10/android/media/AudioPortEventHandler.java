package android.media;

class AudioPortEventHandler {
    private android.os.Handler mHandler;
    private android.os.HandlerThread mHandlerThread;
    private final java.util.ArrayList<android.media.AudioManager.OnAudioPortUpdateListener> mListeners = null;
    private static final java.lang.String TAG = "AudioPortEventHandler";
    private static final int AUDIOPORT_EVENT_PORT_LIST_UPDATED = 1;
    private static final int AUDIOPORT_EVENT_PATCH_LIST_UPDATED = 2;
    private static final int AUDIOPORT_EVENT_SERVICE_DIED = 3;
    private static final int AUDIOPORT_EVENT_NEW_LISTENER = 4;
    private static final long RESCHEDULE_MESSAGE_DELAY_MS = 100L;
    @android.annotation.UnsupportedAppUsage
    private long mJniCallback;
    AudioPortEventHandler() {}
    void init() {}
    private native void native_setup(java.lang.Object p0);
    protected void finalize() {}
    private native void native_finalize();
    void registerListener(android.media.AudioManager.OnAudioPortUpdateListener p0) {}
    void unregisterListener(android.media.AudioManager.OnAudioPortUpdateListener p0) {}
    android.os.Handler handler() { return null; }
    @android.annotation.UnsupportedAppUsage
    private static void postEventFromNative(java.lang.Object p0, int p1, int p2, int p3, java.lang.Object p4) {}
}
