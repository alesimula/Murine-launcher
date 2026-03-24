package android.os;

public abstract class FileObserver {
    public static final int ACCESS = 1;
    public static final int MODIFY = 2;
    public static final int ATTRIB = 4;
    public static final int CLOSE_WRITE = 8;
    public static final int CLOSE_NOWRITE = 16;
    public static final int OPEN = 32;
    public static final int MOVED_FROM = 64;
    public static final int MOVED_TO = 128;
    public static final int CREATE = 256;
    public static final int DELETE = 512;
    public static final int DELETE_SELF = 1024;
    public static final int MOVE_SELF = 2048;
    public static final int ALL_EVENTS = 4095;
    private static final java.lang.String LOG_TAG = "FileObserver";
    @android.annotation.UnsupportedAppUsage
    private static android.os.FileObserver.ObserverThread s_observerThread;
    private final java.util.List<java.io.File> mFiles = null;
    private int[] mDescriptors;
    private final int mMask = 0;
    @java.lang.Deprecated
    public FileObserver(java.lang.String p0) {}
    public FileObserver(java.io.File p0) {}
    public FileObserver(java.util.List<java.io.File> p0) {}
    @java.lang.Deprecated
    public FileObserver(java.lang.String p0, int p1) {}
    public FileObserver(java.io.File p0, int p1) {}
    public FileObserver(java.util.List<java.io.File> p0, int p1) {}
    protected void finalize() {}
    public void startWatching() {}
    public void stopWatching() {}
    public abstract void onEvent(int p0, java.lang.String p1);

    private static class ObserverThread extends java.lang.Thread {
        private java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference> m_observers;
        private int m_fd;
        public ObserverThread() { super(); }
        public void run() {}
        public int[] startWatching(java.util.List<java.io.File> p0, int p1, android.os.FileObserver p2) { return null; }
        public void stopWatching(int[] p0) {}
        @android.annotation.UnsupportedAppUsage
        public void onEvent(int p0, int p1, java.lang.String p2) {}
        private native int init();
        private native void observe(int p0);
        private native void startWatching(int p0, java.lang.String[] p1, int p2, int[] p3);
        private native void stopWatching(int p0, int[] p1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NotifyEventType {
    }
}
