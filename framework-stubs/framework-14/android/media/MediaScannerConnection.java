package android.media;

public class MediaScannerConnection implements android.content.ServiceConnection {
    public MediaScannerConnection(android.content.Context p0, android.media.MediaScannerConnection.MediaScannerConnectionClient p1) {}
    public void connect() {}
    public void disconnect() {}
    public synchronized boolean isConnected() { return false; }
    public void scanFile(java.lang.String p0, java.lang.String p1) {}
    public static void scanFile(android.content.Context p0, java.lang.String[] p1, java.lang.String[] p2, android.media.MediaScannerConnection.OnScanCompletedListener p3) {}
    public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
    public void onServiceDisconnected(android.content.ComponentName p0) {}

    public static interface OnScanCompletedListener {
        public void onScanCompleted(java.lang.String p0, android.net.Uri p1);
    }

    public static interface MediaScannerConnectionClient extends android.media.MediaScannerConnection.OnScanCompletedListener {
        public void onMediaScannerConnected();
    }

    @java.lang.Deprecated
    static class ClientProxy implements android.media.MediaScannerConnection.MediaScannerConnectionClient {
        final java.lang.String[] mPaths = null;
        final java.lang.String[] mMimeTypes = null;
        final android.media.MediaScannerConnection.OnScanCompletedListener mClient = null;
        android.media.MediaScannerConnection mConnection;
        int mNextPath;
        ClientProxy(java.lang.String[] p0, java.lang.String[] p1, android.media.MediaScannerConnection.OnScanCompletedListener p2) {}
        public void onMediaScannerConnected() {}
        public void onScanCompleted(java.lang.String p0, android.net.Uri p1) {}
        void scanNextPath() {}
    }
}
