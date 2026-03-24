package android.media;

public final class MediaCas implements java.lang.AutoCloseable {
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
    public static final int SCRAMBLING_MODE_AES_CBC = 14;
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
    static android.hardware.cas.IMediaCasService getService() { return null; }
    static android.hardware.cas.V1_0.IMediaCasService getServiceHidl() { return null; }
    android.media.MediaCas.Session createFromSessionId(byte[] p0) { return null; }
    public static boolean isSystemIdSupported(int p0) { return false; }
    public static android.media.MediaCas.PluginDescriptor[] enumeratePlugins() { return null; }
    public MediaCas(int p0) throws android.media.MediaCasException.UnsupportedCasException {}
    public MediaCas(android.content.Context p0, int p1, java.lang.String p2, int p3) throws android.media.MediaCasException.UnsupportedCasException {}
    public MediaCas(android.content.Context p0, int p1, java.lang.String p2, int p3, android.os.Handler p4, android.media.MediaCas.EventListener p5) throws android.media.MediaCasException.UnsupportedCasException {}
    android.os.IHwBinder getBinder() { return null; }
    public boolean isAidlHal() { return false; }
    public void setEventListener(android.media.MediaCas.EventListener p0, android.os.Handler p1) {}
    public void setPrivateData(byte[] p0) throws android.media.MediaCasException {}
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

    public static interface EventListener {
        public void onEvent(android.media.MediaCas p0, int p1, int p2, byte[] p3);
        default public void onSessionEvent(android.media.MediaCas p0, android.media.MediaCas.Session p1, int p2, int p3, byte[] p4) {}
        default public void onPluginStatusUpdate(android.media.MediaCas p0, int p1, int p2) {}
        default public void onResourceLost(android.media.MediaCas p0) {}
    }

    public static class PluginDescriptor {
        PluginDescriptor(android.hardware.cas.AidlCasPluginDescriptor p0) {}
        PluginDescriptor(android.hardware.cas.V1_0.HidlCasPluginDescriptor p0) {}
        public int getSystemId() { return 0; }
        public java.lang.String getName() { return null; }
        public java.lang.String toString() { return null; }
    }

    public final class Session implements java.lang.AutoCloseable {
        final byte[] mSessionId = null;
        boolean mIsClosed;
        Session(android.media.MediaCas p0, byte[] p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public void setPrivateData(byte[] p0) throws android.media.MediaCasException {}
        public void processEcm(byte[] p0, int p1, int p2) throws android.media.MediaCasException {}
        public void processEcm(byte[] p0) throws android.media.MediaCasException {}
        public void sendSessionEvent(int p0, int p1, byte[] p2) throws android.media.MediaCasException {}
        public byte[] getSessionId() { return null; }
        public void close() {}
    }

    private class EventHandler extends android.os.Handler {
        public EventHandler(android.media.MediaCas p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private class OpenSessionCallback implements android.hardware.cas.V1_0.ICas.openSessionCallback {
        public android.media.MediaCas.Session mSession;
        public int mStatus;
        public void onValues(int p0, java.util.ArrayList<java.lang.Byte> p1) {}
    }

    private class OpenSession_1_2_Callback implements android.hardware.cas.V1_2.ICas.openSession_1_2Callback {
        public android.media.MediaCas.Session mSession;
        public int mStatus;
        public void onValues(int p0, java.util.ArrayList<java.lang.Byte> p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PluginStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScramblingMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SessionUsage {
    }
}
