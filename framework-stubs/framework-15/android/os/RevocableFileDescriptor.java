package android.os;

public class RevocableFileDescriptor {
    public RevocableFileDescriptor() {}
    public RevocableFileDescriptor(android.content.Context p0, java.io.File p1) throws java.io.IOException {}
    public RevocableFileDescriptor(android.content.Context p0, java.io.FileDescriptor p1) throws java.io.IOException {}
    public RevocableFileDescriptor(android.content.Context p0, java.io.FileDescriptor p1, android.os.Handler p2) throws java.io.IOException {}
    public void init(android.content.Context p0, java.io.FileDescriptor p1) throws java.io.IOException {}
    public void init(android.content.Context p0, java.io.FileDescriptor p1, android.os.Handler p2) throws java.io.IOException {}
    public android.os.ParcelFileDescriptor getRevocableFileDescriptor() { return null; }
    public void revoke() {}
    public void addOnCloseListener(android.os.ParcelFileDescriptor.OnCloseListener p0) {}
    public boolean isRevoked() { return false; }
}
