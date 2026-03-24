package android.net.http;

public abstract class UploadDataProvider implements java.io.Closeable {
    public UploadDataProvider() {}
    public abstract long getLength() throws java.io.IOException;
    public abstract void read(android.net.http.UploadDataSink p0, java.nio.ByteBuffer p1) throws java.io.IOException;
    public abstract void rewind(android.net.http.UploadDataSink p0) throws java.io.IOException;
    public void close() throws java.io.IOException {}
}
