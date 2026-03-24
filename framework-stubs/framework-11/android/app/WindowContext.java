package android.app;

public class WindowContext extends android.content.ContextWrapper {
    private final android.view.WindowManagerImpl mWindowManager = null;
    private final android.view.IWindowManager mWms = null;
    private final android.app.WindowTokenClient mToken = null;
    private boolean mOwnsToken;
    public WindowContext(android.content.Context p0, int p1, android.os.Bundle p2) { super(null); }
    private static android.app.ContextImpl createBaseWindowContext(android.content.Context p0, android.os.IBinder p1) { return null; }
    public java.lang.Object getSystemService(java.lang.String p0) { return null; }
    protected void finalize() throws java.lang.Throwable {}
    public void release() {}
    void destroy() {}
}
