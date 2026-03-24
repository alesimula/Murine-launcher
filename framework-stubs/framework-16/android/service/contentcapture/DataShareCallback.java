package android.service.contentcapture;

@android.annotation.SystemApi
public interface DataShareCallback {
    public void onAccept(java.util.concurrent.Executor p0, android.service.contentcapture.DataShareReadAdapter p1);
    public void onReject();
}
