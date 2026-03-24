package android.media;

public class JetPlayer {
    private static int MAXTRACKS;
    private static final int JET_EVENT = 1;
    private static final int JET_USERID_UPDATE = 2;
    private static final int JET_NUMQUEUEDSEGMENT_UPDATE = 3;
    private static final int JET_PAUSE_UPDATE = 4;
    private static final int JET_EVENT_VAL_MASK = 127;
    private static final int JET_EVENT_CTRL_MASK = 16256;
    private static final int JET_EVENT_CHAN_MASK = 245760;
    private static final int JET_EVENT_TRACK_MASK = 16515072;
    private static final int JET_EVENT_SEG_MASK = -16777216;
    private static final int JET_EVENT_CTRL_SHIFT = 7;
    private static final int JET_EVENT_CHAN_SHIFT = 14;
    private static final int JET_EVENT_TRACK_SHIFT = 18;
    private static final int JET_EVENT_SEG_SHIFT = 24;
    private static final int JET_OUTPUT_RATE = 22050;
    private static final int JET_OUTPUT_CHANNEL_CONFIG = 12;
    private android.media.JetPlayer.NativeEventHandler mEventHandler;
    private android.os.Looper mInitializationLooper;
    private final java.lang.Object mEventListenerLock = null;
    private android.media.JetPlayer.OnJetEventListener mJetEventListener;
    private static android.media.JetPlayer singletonRef;
    @android.annotation.UnsupportedAppUsage
    private long mNativePlayerInJavaObj;
    private static final java.lang.String TAG = "JetPlayer-J";
    public static android.media.JetPlayer getJetPlayer() { return null; }
    public java.lang.Object clone() throws java.lang.CloneNotSupportedException { return null; }
    private JetPlayer() {}
    protected void finalize() {}
    public void release() {}
    public static int getMaxTracks() { return 0; }
    public boolean loadJetFile(java.lang.String p0) { return false; }
    public boolean loadJetFile(android.content.res.AssetFileDescriptor p0) { return false; }
    public boolean closeJetFile() { return false; }
    public boolean play() { return false; }
    public boolean pause() { return false; }
    public boolean queueJetSegment(int p0, int p1, int p2, int p3, int p4, byte p5) { return false; }
    public boolean queueJetSegmentMuteArray(int p0, int p1, int p2, int p3, boolean[] p4, byte p5) { return false; }
    public boolean setMuteFlags(int p0, boolean p1) { return false; }
    public boolean setMuteArray(boolean[] p0, boolean p1) { return false; }
    public boolean setMuteFlag(int p0, boolean p1, boolean p2) { return false; }
    public boolean triggerClip(int p0) { return false; }
    public boolean clearQueue() { return false; }
    public void setEventListener(android.media.JetPlayer.OnJetEventListener p0) {}
    public void setEventListener(android.media.JetPlayer.OnJetEventListener p0, android.os.Handler p1) {}
    private final native boolean native_setup(java.lang.Object p0, int p1, int p2);
    private final native void native_finalize();
    private final native void native_release();
    private final native boolean native_loadJetFromFile(java.lang.String p0);
    private final native boolean native_loadJetFromFileD(java.io.FileDescriptor p0, long p1, long p2);
    private final native boolean native_closeJetFile();
    private final native boolean native_playJet();
    private final native boolean native_pauseJet();
    private final native boolean native_queueJetSegment(int p0, int p1, int p2, int p3, int p4, byte p5);
    private final native boolean native_queueJetSegmentMuteArray(int p0, int p1, int p2, int p3, boolean[] p4, byte p5);
    private final native boolean native_setMuteFlags(int p0, boolean p1);
    private final native boolean native_setMuteArray(boolean[] p0, boolean p1);
    private final native boolean native_setMuteFlag(int p0, boolean p1, boolean p2);
    private final native boolean native_triggerClip(int p0);
    private final native boolean native_clearQueue();
    @android.annotation.UnsupportedAppUsage
    private static void postEventFromNative(java.lang.Object p0, int p1, int p2, int p3) {}
    private static void logd(java.lang.String p0) {}
    private static void loge(java.lang.String p0) {}

    public static interface OnJetEventListener {
        public void onJetEvent(android.media.JetPlayer p0, short p1, byte p2, byte p3, byte p4, byte p5);
        public void onJetUserIdUpdate(android.media.JetPlayer p0, int p1, int p2);
        public void onJetNumQueuedSegmentUpdate(android.media.JetPlayer p0, int p1);
        public void onJetPauseUpdate(android.media.JetPlayer p0, int p1);
    }

    private class NativeEventHandler extends android.os.Handler {
        private android.media.JetPlayer mJet;
        public NativeEventHandler(android.media.JetPlayer p0, android.media.JetPlayer p1, android.os.Looper p2) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
