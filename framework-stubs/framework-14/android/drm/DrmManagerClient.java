package android.drm;

@java.lang.Deprecated
public class DrmManagerClient implements java.lang.AutoCloseable {
    public static final int ERROR_NONE = 0;
    public static final int ERROR_UNKNOWN = -2000;
    public static final int INVALID_SESSION = -1;
    android.os.HandlerThread mInfoThread;
    android.os.HandlerThread mEventThread;
    public static void notify(java.lang.Object p0, int p1, int p2, java.lang.String p3) {}
    public DrmManagerClient(android.content.Context p0) {}
    protected void finalize() throws java.lang.Throwable {}
    public void close() {}
    @java.lang.Deprecated
    public void release() {}
    public synchronized void setOnInfoListener(android.drm.DrmManagerClient.OnInfoListener p0) {}
    public synchronized void setOnEventListener(android.drm.DrmManagerClient.OnEventListener p0) {}
    public synchronized void setOnErrorListener(android.drm.DrmManagerClient.OnErrorListener p0) {}
    public java.lang.String[] getAvailableDrmEngines() { return null; }
    public java.util.Collection<android.drm.DrmSupportInfo> getAvailableDrmSupportInfo() { return null; }
    public android.content.ContentValues getConstraints(java.lang.String p0, int p1) { return null; }
    public android.content.ContentValues getMetadata(java.lang.String p0) { return null; }
    public android.content.ContentValues getConstraints(android.net.Uri p0, int p1) { return null; }
    public android.content.ContentValues getMetadata(android.net.Uri p0) { return null; }
    public int saveRights(android.drm.DrmRights p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException { return 0; }
    public void installDrmEngine(java.lang.String p0) {}
    public boolean canHandle(java.lang.String p0, java.lang.String p1) { return false; }
    public boolean canHandle(android.net.Uri p0, java.lang.String p1) { return false; }
    public int processDrmInfo(android.drm.DrmInfo p0) { return 0; }
    public android.drm.DrmInfo acquireDrmInfo(android.drm.DrmInfoRequest p0) { return null; }
    public int acquireRights(android.drm.DrmInfoRequest p0) { return 0; }
    public int getDrmObjectType(java.lang.String p0, java.lang.String p1) { return 0; }
    public int getDrmObjectType(android.net.Uri p0, java.lang.String p1) { return 0; }
    public java.lang.String getOriginalMimeType(java.lang.String p0) { return null; }
    public java.lang.String getOriginalMimeType(android.net.Uri p0) { return null; }
    public int checkRightsStatus(java.lang.String p0) { return 0; }
    public int checkRightsStatus(android.net.Uri p0) { return 0; }
    public int checkRightsStatus(java.lang.String p0, int p1) { return 0; }
    public int checkRightsStatus(android.net.Uri p0, int p1) { return 0; }
    public int removeRights(java.lang.String p0) { return 0; }
    public int removeRights(android.net.Uri p0) { return 0; }
    public int removeAllRights() { return 0; }
    public int openConvertSession(java.lang.String p0) { return 0; }
    public android.drm.DrmConvertedStatus convertData(int p0, byte[] p1) { return null; }
    public android.drm.DrmConvertedStatus closeConvertSession(int p0) { return null; }

    public static interface OnInfoListener {
        public void onInfo(android.drm.DrmManagerClient p0, android.drm.DrmInfoEvent p1);
    }

    public static interface OnEventListener {
        public void onEvent(android.drm.DrmManagerClient p0, android.drm.DrmEvent p1);
    }

    public static interface OnErrorListener {
        public void onError(android.drm.DrmManagerClient p0, android.drm.DrmErrorEvent p1);
    }

    private class EventHandler extends android.os.Handler {
        public EventHandler(android.drm.DrmManagerClient p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private class InfoHandler extends android.os.Handler {
        public static final int INFO_EVENT_TYPE = 1;
        public InfoHandler(android.drm.DrmManagerClient p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
