package android.service.contentcapture;

@android.annotation.SystemApi
public interface DataShareReadAdapter {
    public void onStart(android.os.ParcelFileDescriptor p0);
    public void onError(int p0);
}
