package android.media;

public final class RemoteDisplay {
    public static final int DISPLAY_FLAG_SECURE = 1;
    public static final int DISPLAY_ERROR_UNKOWN = 1;
    public static final int DISPLAY_ERROR_CONNECTION_DROPPED = 2;
    protected void finalize() throws java.lang.Throwable {}
    public static android.media.RemoteDisplay listen(java.lang.String p0, android.media.RemoteDisplay.Listener p1, android.os.Handler p2, java.lang.String p3) { return null; }
    public void dispose() {}
    public void pause() {}
    public void resume() {}

    public static interface Listener {
        public void onDisplayConnected(android.view.Surface p0, int p1, int p2, int p3, int p4);
        public void onDisplayDisconnected();
        public void onDisplayError(int p0);
    }
}
