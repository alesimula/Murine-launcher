package android.media;

public class MediaHTTPConnection extends android.media.IMediaHTTPConnection.Stub {
    private static final java.lang.String TAG = "MediaHTTPConnection";
    private static final boolean VERBOSE = false;
    private static final int CONNECT_TIMEOUT_MS = 30000;
    @android.annotation.UnsupportedAppUsage
    private long mCurrentOffset;
    @android.annotation.UnsupportedAppUsage
    private java.net.URL mURL;
    @android.annotation.UnsupportedAppUsage
    private java.util.Map<java.lang.String, java.lang.String> mHeaders;
    @android.annotation.UnsupportedAppUsage
    private volatile java.net.HttpURLConnection mConnection;
    @android.annotation.UnsupportedAppUsage
    private long mTotalSize;
    private java.io.InputStream mInputStream;
    @android.annotation.UnsupportedAppUsage
    private boolean mAllowCrossDomainRedirect;
    @android.annotation.UnsupportedAppUsage
    private boolean mAllowCrossProtocolRedirect;
    private static final int HTTP_TEMP_REDIRECT = 307;
    private static final int MAX_REDIRECTS = 20;
    private final java.util.concurrent.atomic.AtomicInteger mNumDisconnectingThreads = null;
    private long mNativeContext;
    @android.annotation.UnsupportedAppUsage
    public MediaHTTPConnection() { super(); }
    @android.annotation.UnsupportedAppUsage
    public synchronized android.os.IBinder connect(java.lang.String p0, java.lang.String p1) { return null; }
    private static boolean parseBoolean(java.lang.String p0) { return false; }
    private synchronized boolean filterOutInternalHeaders(java.lang.String p0, java.lang.String p1) { return false; }
    private synchronized java.util.Map<java.lang.String, java.lang.String> convertHeaderStringToMap(java.lang.String p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public void disconnect() {}
    private synchronized void teardownConnection() {}
    private static final boolean isLocalHost(java.net.URL p0) { return false; }
    private synchronized void seekTo(long p0) throws java.io.IOException {}
    @android.annotation.UnsupportedAppUsage
    public synchronized int readAt(long p0, int p1) { return 0; }
    private synchronized int readAt(long p0, byte[] p1, int p2) { return 0; }
    public synchronized long getSize() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public synchronized java.lang.String getMIMEType() { return null; }
    @android.annotation.UnsupportedAppUsage
    public synchronized java.lang.String getUri() { return null; }
    protected void finalize() {}
    private static final native void native_init();
    private final native void native_setup();
    private final native void native_finalize();
    private final native android.os.IBinder native_getIMemory();
    private final native int native_readAt(long p0, int p1);
}
