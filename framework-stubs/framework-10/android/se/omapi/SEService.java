package android.se.omapi;

public final class SEService {
    public static final int IO_ERROR = 1;
    public static final int NO_SUCH_ELEMENT_ERROR = 2;
    private android.se.omapi.SEService.SEListener mSEListener;
    private static final java.lang.String TAG = "OMAPI.SEService";
    private final java.lang.Object mLock = null;
    private final android.content.Context mContext = null;
    private volatile android.se.omapi.ISecureElementService mSecureElementService;
    private android.content.ServiceConnection mConnection;
    private final java.util.HashMap<java.lang.String, android.se.omapi.Reader> mReaders = null;
    public SEService(android.content.Context p0, java.util.concurrent.Executor p1, android.se.omapi.SEService.OnConnectedListener p2) {}
    public boolean isConnected() { return false; }
    public android.se.omapi.Reader[] getReaders() { return null; }
    public void shutdown() {}
    public java.lang.String getVersion() { return null; }
    android.se.omapi.ISecureElementListener getListener() { return null; }
    private android.se.omapi.ISecureElementReader getReader(java.lang.String p0) { return null; }

    private class SEListener extends android.se.omapi.ISecureElementListener.Stub {
        public android.se.omapi.SEService.OnConnectedListener mListener;
        public java.util.concurrent.Executor mExecutor;
        private SEListener(android.se.omapi.SEService p0) { super(); }
        public android.os.IBinder asBinder() { return null; }
        public void onConnected() {}
    }

    public static interface OnConnectedListener {
        public void onConnected();
    }
}
