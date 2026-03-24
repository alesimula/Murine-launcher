package android.se.omapi;

public final class SEService {
    public static final int IO_ERROR = 1;
    public static final int NO_SUCH_ELEMENT_ERROR = 2;
    public static final java.lang.String ACTION_SECURE_ELEMENT_STATE_CHANGED = "android.se.omapi.action.SECURE_ELEMENT_STATE_CHANGED";
    public static final java.lang.String EXTRA_READER_NAME = "android.se.omapi.extra.READER_NAME";
    public static final java.lang.String EXTRA_READER_STATE = "android.se.omapi.extra.READER_STATE";
    public SEService(android.content.Context p0, java.util.concurrent.Executor p1, android.se.omapi.SEService.OnConnectedListener p2) {}
    public boolean isConnected() { return false; }
    @android.annotation.NonNull
    public android.se.omapi.Reader[] getReaders() { return null; }
    @android.annotation.NonNull
    public android.se.omapi.Reader getUiccReader(int p0) { return null; }
    public void shutdown() {}
    @android.annotation.NonNull
    public java.lang.String getVersion() { return null; }
    @android.annotation.NonNull
    android.se.omapi.ISecureElementListener getListener() { return null; }

    public static interface OnConnectedListener {
        public void onConnected();
    }

    private class SEListener extends android.se.omapi.ISecureElementListener.Stub {
        public android.se.omapi.SEService.OnConnectedListener mListener;
        public java.util.concurrent.Executor mExecutor;
        public android.os.IBinder asBinder() { return null; }
        public void onConnected() {}
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
    }
}
