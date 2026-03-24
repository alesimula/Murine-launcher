package android.database;

public abstract class ContentObserver {
    private static final long ADD_CONTENT_OBSERVER_FLAGS = 150939131L;
    private final java.lang.Object mLock = null;
    private android.database.ContentObserver.Transport mTransport;
    android.os.Handler mHandler;
    public ContentObserver(android.os.Handler p0) {}
    public android.database.IContentObserver getContentObserver() { return null; }
    public android.database.IContentObserver releaseContentObserver() { return null; }
    public boolean deliverSelfNotifications() { return false; }
    public void onChange(boolean p0) {}
    public void onChange(boolean p0, android.net.Uri p1) {}
    public void onChange(boolean p0, android.net.Uri p1, int p2) {}
    public void onChange(boolean p0, java.util.Collection<android.net.Uri> p1, int p2) {}
    public void onChange(boolean p0, java.util.Collection<android.net.Uri> p1, int p2, int p3) {}
    @java.lang.Deprecated
    public final void dispatchChange(boolean p0) {}
    public final void dispatchChange(boolean p0, android.net.Uri p1) {}
    public final void dispatchChange(boolean p0, android.net.Uri p1, int p2) {}
    public final void dispatchChange(boolean p0, java.util.Collection<android.net.Uri> p1, int p2) {}
    public final void dispatchChange(boolean p0, java.util.Collection<android.net.Uri> p1, int p2, int p3) {}

    private static final class Transport extends android.database.IContentObserver.Stub {
        private android.database.ContentObserver mContentObserver;
        public Transport(android.database.ContentObserver p0) { super(); }
        public void onChange(boolean p0, android.net.Uri p1, int p2) {}
        public void onChangeEtc(boolean p0, android.net.Uri[] p1, int p2, int p3) {}
        public void releaseContentObserver() {}
    }
}
