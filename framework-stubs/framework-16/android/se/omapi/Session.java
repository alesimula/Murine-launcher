package android.se.omapi;

public final class Session {
    Session(android.se.omapi.SEService p0, android.se.omapi.ISecureElementSession p1, android.se.omapi.Reader p2) {}
    @android.annotation.NonNull
    public android.se.omapi.Reader getReader() { return null; }
    @android.annotation.Nullable
    public byte[] getATR() { return null; }
    public void close() {}
    public boolean isClosed() { return false; }
    public void closeChannels() {}
    @android.annotation.Nullable
    public android.se.omapi.Channel openBasicChannel(byte[] p0, byte p1) throws java.io.IOException { return null; }
    @android.annotation.Nullable
    public android.se.omapi.Channel openBasicChannel(byte[] p0) throws java.io.IOException { return null; }
    @android.annotation.Nullable
    public android.se.omapi.Channel openLogicalChannel(byte[] p0, byte p1) throws java.io.IOException { return null; }
    @android.annotation.Nullable
    public android.se.omapi.Channel openLogicalChannel(byte[] p0) throws java.io.IOException { return null; }
}
