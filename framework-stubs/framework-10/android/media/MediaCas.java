package android.media;

public final class MediaCas implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "MediaCas";
    private android.hardware.cas.V1_0.ICas mICas;
    private android.hardware.cas.V1_1.ICas mICasV11;
    private android.media.MediaCas.EventListener mListener;
    private android.os.HandlerThread mHandlerThread;
    private android.media.MediaCas.EventHandler mEventHandler;
    private static final android.util.Singleton<android.hardware.cas.V1_0.IMediaCasService> sService = null;
    private final android.hardware.cas.V1_1.ICasListener.Stub mBinder = null;
    static android.hardware.cas.V1_0.IMediaCasService getService() { return null; }
    private void validateInternalStates() {}
    private void cleanupAndRethrowIllegalState() {}
    private java.util.ArrayList<java.lang.Byte> toByteArray(byte[] p0, int p1, int p2) { return null; }
    private java.util.ArrayList<java.lang.Byte> toByteArray(byte[] p0) { return null; }
    private byte[] toBytes(java.util.ArrayList<java.lang.Byte> p0) { return null; }
    android.media.MediaCas.Session createFromSessionId(java.util.ArrayList<java.lang.Byte> p0) { return null; }
    public static boolean isSystemIdSupported(int p0) { return false; }
    public static android.media.MediaCas.PluginDescriptor[] enumeratePlugins() { return null; }
    public MediaCas(int p0) throws android.media.MediaCasException.UnsupportedCasException {}
    android.os.IHwBinder getBinder() { return null; }
    public void setEventListener(android.media.MediaCas.EventListener p0, android.os.Handler p1) {}
    public void setPrivateData(byte[] p0) throws android.media.MediaCasException {}
    public android.media.MediaCas.Session openSession() throws android.media.MediaCasException { return null; }
    public void processEmm(byte[] p0, int p1, int p2) throws android.media.MediaCasException {}
    public void processEmm(byte[] p0) throws android.media.MediaCasException {}
    public void sendEvent(int p0, int p1, byte[] p2) throws android.media.MediaCasException {}
    public void provision(java.lang.String p0) throws android.media.MediaCasException {}
    public void refreshEntitlements(int p0, byte[] p1) throws android.media.MediaCasException {}
    public void close() {}
    protected void finalize() {}

    public final class Session implements java.lang.AutoCloseable {
        final java.util.ArrayList<java.lang.Byte> mSessionId = null;
        Session(java.util.ArrayList<java.lang.Byte> p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public void setPrivateData(byte[] p0) throws android.media.MediaCasException {}
        public void processEcm(byte[] p0, int p1, int p2) throws android.media.MediaCasException {}
        public void processEcm(byte[] p0) throws android.media.MediaCasException {}
        public void sendSessionEvent(int p0, int p1, byte[] p2) throws android.media.MediaCasException {}
        public void close() {}
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

    private class OpenSessionCallback implements android.hardware.cas.V1_0.ICas.openSessionCallback {
        public android.media.MediaCas.Session mSession;
        public int mStatus;
        private OpenSessionCallback(android.media.MediaCas p0) {}
        public void onValues(int p0, java.util.ArrayList<java.lang.Byte> p1) {}
    }

    public static interface EventListener {
        public void onEvent(android.media.MediaCas p0, int p1, int p2, byte[] p3);
        default public void onSessionEvent(android.media.MediaCas p0, android.media.MediaCas.Session p1, int p2, int p3, byte[] p4) {}
    }

    private class EventHandler extends android.os.Handler {
        private static final int MSG_CAS_EVENT = 0;
        private static final int MSG_CAS_SESSION_EVENT = 1;
        private static final java.lang.String SESSION_KEY = "sessionId";
        private static final java.lang.String DATA_KEY = "data";
        public EventHandler(android.media.MediaCas p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
