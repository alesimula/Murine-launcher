package android.se.omapi;

public final class Session {
    private final java.lang.Object mLock = null;
    private final android.se.omapi.SEService mService = null;
    private final android.se.omapi.Reader mReader = null;
    private final android.se.omapi.ISecureElementSession mSession = null;
    private static final java.lang.String TAG = "OMAPI.Session";
    Session(android.se.omapi.SEService p0, android.se.omapi.ISecureElementSession p1, android.se.omapi.Reader p2) {}
    public android.se.omapi.Reader getReader() { return null; }
    public byte[] getATR() { return null; }
    public void close() {}
    public boolean isClosed() { return false; }
    public void closeChannels() {}
    public android.se.omapi.Channel openBasicChannel(byte[] p0, byte p1) throws java.io.IOException { return null; }
    public android.se.omapi.Channel openBasicChannel(byte[] p0) throws java.io.IOException { return null; }
    public android.se.omapi.Channel openLogicalChannel(byte[] p0, byte p1) throws java.io.IOException { return null; }
    public android.se.omapi.Channel openLogicalChannel(byte[] p0) throws java.io.IOException { return null; }
}
