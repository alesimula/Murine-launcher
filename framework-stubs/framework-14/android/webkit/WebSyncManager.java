package android.webkit;

@java.lang.Deprecated
abstract class WebSyncManager implements java.lang.Runnable {
    protected static final java.lang.String LOGTAG = "websync";
    protected android.webkit.WebViewDatabase mDataBase;
    protected android.os.Handler mHandler;
    protected WebSyncManager(android.content.Context p0, java.lang.String p1) {}
    protected java.lang.Object clone() throws java.lang.CloneNotSupportedException { return null; }
    public void run() {}
    public void sync() {}
    public void resetSync() {}
    public void startSync() {}
    public void stopSync() {}
    protected void onSyncInit() {}
    abstract void syncFromRamToFlash();
}
