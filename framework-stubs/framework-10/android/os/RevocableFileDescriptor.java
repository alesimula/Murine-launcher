package android.os;

public class RevocableFileDescriptor {
    private static final java.lang.String TAG = "RevocableFileDescriptor";
    private static final boolean DEBUG = true;
    private java.io.FileDescriptor mInner;
    private android.os.ParcelFileDescriptor mOuter;
    private volatile boolean mRevoked;
    private final android.os.ProxyFileDescriptorCallback mCallback = null;
    public RevocableFileDescriptor() {}
    public RevocableFileDescriptor(android.content.Context p0, java.io.File p1) throws java.io.IOException {}
    public RevocableFileDescriptor(android.content.Context p0, java.io.FileDescriptor p1) throws java.io.IOException {}
    public void init(android.content.Context p0, java.io.FileDescriptor p1) throws java.io.IOException {}
    public android.os.ParcelFileDescriptor getRevocableFileDescriptor() { return null; }
    public void revoke() {}
    public boolean isRevoked() { return false; }
}
