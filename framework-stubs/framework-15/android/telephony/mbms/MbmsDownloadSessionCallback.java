package android.telephony.mbms;

public class MbmsDownloadSessionCallback {
    public MbmsDownloadSessionCallback() {}
    public void onError(int p0, java.lang.String p1) {}
    public void onFileServicesUpdated(java.util.List<android.telephony.mbms.FileServiceInfo> p0) {}
    public void onMiddlewareReady() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface DownloadError {
    }
}
