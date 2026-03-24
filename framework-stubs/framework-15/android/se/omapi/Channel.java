package android.se.omapi;

public final class Channel implements java.nio.channels.Channel {
    Channel(android.se.omapi.SEService p0, android.se.omapi.Session p1, android.se.omapi.ISecureElementChannel p2) {}
    public void close() {}
    public boolean isOpen() { return false; }
    public boolean isBasicChannel() { return false; }
    @android.annotation.NonNull
    public byte[] transmit(byte[] p0) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public android.se.omapi.Session getSession() { return null; }
    @android.annotation.Nullable
    public byte[] getSelectResponse() { return null; }
    public boolean selectNext() throws java.io.IOException { return false; }
}
