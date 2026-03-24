package android.drm;

public class DrmManagerClient implements java.lang.AutoCloseable {
    public static final int ERROR_NONE = 0;
    public static final int ERROR_UNKNOWN = -2000;
    public static final int INVALID_SESSION = -1;
    android.os.HandlerThread mInfoThread;
    android.os.HandlerThread mEventThread;
    private static final java.lang.String TAG = "DrmManagerClient";
    private final java.util.concurrent.atomic.AtomicBoolean mClosed = null;
    private static final int ACTION_REMOVE_ALL_RIGHTS = 1001;
    private static final int ACTION_PROCESS_DRM_INFO = 1002;
    private int mUniqueId;
    private long mNativeContext;
    private android.content.Context mContext;
    private android.drm.DrmManagerClient.InfoHandler mInfoHandler;
    private android.drm.DrmManagerClient.EventHandler mEventHandler;
    private android.drm.DrmManagerClient.OnInfoListener mOnInfoListener;
    private android.drm.DrmManagerClient.OnEventListener mOnEventListener;
    private android.drm.DrmManagerClient.OnErrorListener mOnErrorListener;
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
    private int getEventType(int p0) { return 0; }
    private int getErrorType(int p0) { return 0; }
    private java.lang.String convertUriToPath(android.net.Uri p0) { return null; }
    private native int _initialize();
    private native void _setListeners(int p0, java.lang.Object p1);
    private native void _release(int p0);
    private native void _installDrmEngine(int p0, java.lang.String p1);
    private native android.content.ContentValues _getConstraints(int p0, java.lang.String p1, int p2);
    private native android.content.ContentValues _getMetadata(int p0, java.lang.String p1);
    private native boolean _canHandle(int p0, java.lang.String p1, java.lang.String p2);
    private native android.drm.DrmInfoStatus _processDrmInfo(int p0, android.drm.DrmInfo p1);
    private native android.drm.DrmInfo _acquireDrmInfo(int p0, android.drm.DrmInfoRequest p1);
    private native int _saveRights(int p0, android.drm.DrmRights p1, java.lang.String p2, java.lang.String p3);
    private native int _getDrmObjectType(int p0, java.lang.String p1, java.lang.String p2);
    private native java.lang.String _getOriginalMimeType(int p0, java.lang.String p1, java.io.FileDescriptor p2);
    private native int _checkRightsStatus(int p0, java.lang.String p1, int p2);
    private native int _removeRights(int p0, java.lang.String p1);
    private native int _removeAllRights(int p0);
    private native int _openConvertSession(int p0, java.lang.String p1);
    private native android.drm.DrmConvertedStatus _convertData(int p0, int p1, byte[] p2);
    private native android.drm.DrmConvertedStatus _closeConvertSession(int p0, int p1);
    private native android.drm.DrmSupportInfo[] _getAllSupportInfo(int p0);
    private void createEventThreads() {}
    private void createListeners() {}

    public static interface OnInfoListener {
        public void onInfo(android.drm.DrmManagerClient p0, android.drm.DrmInfoEvent p1);
    }

    public static interface OnEventListener {
        public void onEvent(android.drm.DrmManagerClient p0, android.drm.DrmEvent p1);
    }

    public static interface OnErrorListener {
        public void onError(android.drm.DrmManagerClient p0, android.drm.DrmErrorEvent p1);
    }

    private class InfoHandler extends android.os.Handler {
        public static final int INFO_EVENT_TYPE = 1;
        public InfoHandler(android.drm.DrmManagerClient p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private class EventHandler extends android.os.Handler {
        public EventHandler(android.drm.DrmManagerClient p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
