package android.database;

public abstract class ContentObserver {
    private final java.lang.Object mLock = null;
    private android.database.ContentObserver.Transport mTransport;
    android.os.Handler mHandler;
    public ContentObserver(android.os.Handler p0) {}
    public android.database.IContentObserver getContentObserver() { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.database.IContentObserver releaseContentObserver() { return null; }
    public boolean deliverSelfNotifications() { return false; }
    public void onChange(boolean p0) {}
    public void onChange(boolean p0, android.net.Uri p1) {}
    public void onChange(boolean p0, android.net.Uri p1, int p2) {}
    @java.lang.Deprecated
    public final void dispatchChange(boolean p0) {}
    public final void dispatchChange(boolean p0, android.net.Uri p1) {}
    private void dispatchChange(boolean p0, android.net.Uri p1, int p2) {}

    private static final class Transport extends android.database.IContentObserver.Stub {
        private android.database.ContentObserver mContentObserver;
        public Transport(android.database.ContentObserver p0) { super(); }
        public void onChange(boolean p0, android.net.Uri p1, int p2) {}
        public void releaseContentObserver() {}
    }

    private final class NotificationRunnable implements java.lang.Runnable {
        private final boolean mSelfChange = false;
        private final android.net.Uri mUri = null;
        private final int mUserId = 0;
        public NotificationRunnable(android.database.ContentObserver p0, boolean p1, android.net.Uri p2, int p3) {}
        public void run() {}
    }
}
