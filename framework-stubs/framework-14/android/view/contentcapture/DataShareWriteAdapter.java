package android.view.contentcapture;

public interface DataShareWriteAdapter {
    public void onWrite(android.os.ParcelFileDescriptor p0);
    public void onRejected();
    default public void onError(int p0) {}
}
