package android.media;

public final class MediaCas implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "MediaCas";
    private android.hardware.cas.V1_0.ICas mICas;
    private android.hardware.cas.V1_1.ICas mICasV11;
    private android.hardware.cas.V1_2.ICas mICasV12;
    private android.media.MediaCas.EventListener mListener;
    private android.os.HandlerThread mHandlerThread;
    private android.media.MediaCas.EventHandler mEventHandler;
    private int mPriorityHint;
    private java.lang.String mTvInputServiceSessionId;
    private int mClientId;
    private int mCasSystemId;
    private int mUserId;
    private android.media.tv.tunerresourcemanager.TunerResourceManager mTunerResourceManager;
    private final java.util.Map<android.media.MediaCas.Session, java.lang.Integer> mSessionMap = null;
    public static final int SCRAMBLING_MODE_RESERVED = 0;
    public static final int SCRAMBLING_MODE_DVB_CSA1 = 1;
    public static final int SCRAMBLING_MODE_DVB_CSA2 = 2;
    public static final int SCRAMBLING_MODE_DVB_CSA3_STANDARD = 3;
    public static final int SCRAMBLING_MODE_DVB_CSA3_MINIMAL = 4;
    public static final int SCRAMBLING_MODE_DVB_CSA3_ENHANCE = 5;
    public static final int SCRAMBLING_MODE_DVB_CISSA_V1 = 6;
    public static final int SCRAMBLING_MODE_DVB_IDSA = 7;
    public static final int SCRAMBLING_MODE_MULTI2 = 8;
    public static final int SCRAMBLING_MODE_AES128 = 9;
    public static final int SCRAMBLING_MODE_AES_ECB = 10;
    public static final int SCRAMBLING_MODE_AES_SCTE52 = 11;
    public static final int SCRAMBLING_MODE_TDES_ECB = 12;
    public static final int SCRAMBLING_MODE_TDES_SCTE52 = 13;
    public static final int SESSION_USAGE_LIVE = 0;
    public static final int SESSION_USAGE_PLAYBACK = 1;
    public static final int SESSION_USAGE_RECORD = 2;
    public static final int SESSION_USAGE_TIMESHIFT = 3;
    public static final int PLUGIN_STATUS_PHYSICAL_MODULE_CHANGED = 0;
    public static final int PLUGIN_STATUS_SESSION_NUMBER_CHANGED = 1;
    private static final android.util.Singleton<android.hardware.cas.V1_0.IMediaCasService> sService = null;
    private final android.hardware.cas.V1_2.ICasListener.Stub mBinder = null;
    private final android.media.tv.tunerresourcemanager.TunerResourceManager.ResourcesReclaimListener mResourceListener = null;
    static android.hardware.cas.V1_0.IMediaCasService getService() { return null; }
    private void validateInternalStates() {}
    private void cleanupAndRethrowIllegalState() {}
    private java.util.ArrayList<java.lang.Byte> toByteArray(byte[] p0, int p1, int p2) { return null; }
    private java.util.ArrayList<java.lang.Byte> toByteArray(byte[] p0) { return null; }
    private byte[] toBytes(java.util.ArrayList<java.lang.Byte> p0) { return null; }
    android.media.MediaCas.Session createFromSessionId(java.util.ArrayList<java.lang.Byte> p0) { return null; }
    public static boolean isSystemIdSupported(int p0) { return false; }
    public static android.media.MediaCas.PluginDescriptor[] enumeratePlugins() { return null; }
    private void createPlugin(int p0) throws android.media.MediaCasException.UnsupportedCasException {}
    private void registerClient(android.content.Context p0, java.lang.String p1, int p2) {}
    public MediaCas(int p0) throws android.media.MediaCasException.UnsupportedCasException {}
    public MediaCas(android.content.Context p0, int p1, java.lang.String p2, int p3) throws android.media.MediaCasException.UnsupportedCasException {}
    public MediaCas(android.content.Context p0, int p1, java.lang.String p2, int p3, android.os.Handler p4, android.media.MediaCas.EventListener p5) throws android.media.MediaCasException.UnsupportedCasException {}
    android.os.IHwBinder getBinder() { return null; }
    public void setEventListener(android.media.MediaCas.EventListener p0, android.os.Handler p1) {}
    public void setPrivateData(byte[] p0) throws android.media.MediaCasException {}
    private int getSessionResourceHandle() throws android.media.MediaCasException { return 0; }
    private void addSessionToResourceMap(android.media.MediaCas.Session p0, int p1) {}
    private void removeSessionFromResourceMap(android.media.MediaCas.Session p0) {}
    public android.media.MediaCas.Session openSession() throws android.media.MediaCasException { return null; }
    public android.media.MediaCas.Session openSession(int p0, int p1) throws android.media.MediaCasException { return null; }
    public void processEmm(byte[] p0, int p1, int p2) throws android.media.MediaCasException {}
    public void processEmm(byte[] p0) throws android.media.MediaCasException {}
    public void sendEvent(int p0, int p1, byte[] p2) throws android.media.MediaCasException {}
    public void provision(java.lang.String p0) throws android.media.MediaCasException {}
    public void refreshEntitlements(int p0, byte[] p1) throws android.media.MediaCasException {}
    public void forceResourceLost() {}
    public void close() {}
    protected void finalize() {}

    private class EventHandler extends android.os.Handler {
        private static final int MSG_CAS_EVENT = 0;
        private static final int MSG_CAS_SESSION_EVENT = 1;
        private static final int MSG_CAS_STATUS_EVENT = 2;
        private static final int MSG_CAS_RESOURCE_LOST = 3;
        private static final java.lang.String SESSION_KEY = "sessionId";
        private static final java.lang.String DATA_KEY = "data";
        public EventHandler(android.media.MediaCas p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static interface EventListener {
        public void onEvent(android.media.MediaCas p0, int p1, int p2, byte[] p3);
        default public void onSessionEvent(android.media.MediaCas p0, android.media.MediaCas.Session p1, int p2, int p3, byte[] p4) {}
        default public void onPluginStatusUpdate(android.media.MediaCas p0, int p1, int p2) {}
        default public void onResourceLost(android.media.MediaCas p0) {}
    }

    private class OpenSessionCallback implements android.hardware.cas.V1_0.ICas.openSessionCallback {
        public android.media.MediaCas.Session mSession;
        public int mStatus;
        private OpenSessionCallback(android.media.MediaCas p0) {}
        public void onValues(int p0, java.util.ArrayList<java.lang.Byte> p1) {}
    }

    private class OpenSession_1_2_Callback implements android.hardware.cas.V1_2.ICas.openSession_1_2Callback {
        public android.media.MediaCas.Session mSession;
        public int mStatus;
        private OpenSession_1_2_Callback(android.media.MediaCas p0) {}
        public void onValues(int p0, java.util.ArrayList<java.lang.Byte> p1) {}
    }

    public static class PluginDescriptor {
        private final int mCASystemId = 0;
        private final java.lang.String mName = null;
        private PluginDescriptor() {}
        PluginDescriptor(android.hardware.cas.V1_0.HidlCasPluginDescriptor p0) {}
        public int getSystemId() { return 0; }
        public java.lang.String getName() { return null; }
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PluginStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScramblingMode {
    }

    public final class Session implements java.lang.AutoCloseable {
        final java.util.ArrayList<java.lang.Byte> mSessionId = null;
        boolean mIsClosed;
        Session(java.util.ArrayList<java.lang.Byte> p0) {}
        private void validateSessionInternalStates() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public void setPrivateData(byte[] p0) throws android.media.MediaCasException {}
        public void processEcm(byte[] p0, int p1, int p2) throws android.media.MediaCasException {}
        public void processEcm(byte[] p0) throws android.media.MediaCasException {}
        public void sendSessionEvent(int p0, int p1, byte[] p2) throws android.media.MediaCasException {}
        public byte[] getSessionId() { return null; }
        public void close() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SessionUsage {
    }
}
