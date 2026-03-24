package android.se.omapi;

public final class Reader {
    Reader(android.se.omapi.SEService p0, java.lang.String p1, android.se.omapi.ISecureElementReader p2) {}
    @android.annotation.NonNull
    public java.lang.String getName() { return null; }
    @android.annotation.NonNull
    public android.se.omapi.Session openSession() throws java.io.IOException { return null; }
    public boolean isSecureElementPresent() { return false; }
    @android.annotation.NonNull
    public android.se.omapi.SEService getSEService() { return null; }
    public void closeSessions() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SECURE_ELEMENT_PRIVILEGED_OPERATION")
    public boolean reset() { return false; }
}
