package android.os;

public abstract class ProxyFileDescriptorCallback {
    public ProxyFileDescriptorCallback() {}
    public long onGetSize() throws android.system.ErrnoException { return 0L; }
    public int onRead(long p0, int p1, byte[] p2) throws android.system.ErrnoException { return 0; }
    public int onWrite(long p0, int p1, byte[] p2) throws android.system.ErrnoException { return 0; }
    public void onFsync() throws android.system.ErrnoException {}
    public abstract void onRelease();
}
