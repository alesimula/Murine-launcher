package android.se.omapi;

public final class Reader {
    private static final java.lang.String TAG = "OMAPI.Reader";
    private final java.lang.String mName = null;
    private final android.se.omapi.SEService mService = null;
    private android.se.omapi.ISecureElementReader mReader;
    private final java.lang.Object mLock = null;
    Reader(android.se.omapi.SEService p0, java.lang.String p1, android.se.omapi.ISecureElementReader p2) {}
    public java.lang.String getName() { return null; }
    public android.se.omapi.Session openSession() throws java.io.IOException { return null; }
    public boolean isSecureElementPresent() { return false; }
    public android.se.omapi.SEService getSEService() { return null; }
    public void closeSessions() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SECURE_ELEMENT_PRIVILEGED_OPERATION")
    public boolean reset() { return false; }
}
