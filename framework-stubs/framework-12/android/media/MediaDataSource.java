package android.media;

public abstract class MediaDataSource implements java.io.Closeable {
    public MediaDataSource() {}
    public abstract int readAt(long p0, byte[] p1, int p2, int p3) throws java.io.IOException;
    public abstract long getSize() throws java.io.IOException;
}
