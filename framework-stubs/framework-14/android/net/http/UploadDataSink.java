package android.net.http;

public abstract class UploadDataSink {
    public UploadDataSink() {}
    public abstract void onReadSucceeded(boolean p0);
    public abstract void onReadError(java.lang.Exception p0);
    public abstract void onRewindSucceeded();
    public abstract void onRewindError(java.lang.Exception p0);
}
