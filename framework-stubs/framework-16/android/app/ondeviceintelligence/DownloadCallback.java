package android.app.ondeviceintelligence;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.app.ondeviceintelligence.flags.enable_on_device_intelligence")
public interface DownloadCallback {
    public static final int DOWNLOAD_FAILURE_STATUS_UNKNOWN = 0;
    public static final int DOWNLOAD_FAILURE_STATUS_NOT_ENOUGH_DISK_SPACE = 1;
    public static final int DOWNLOAD_FAILURE_STATUS_NETWORK_FAILURE = 2;
    public static final int DOWNLOAD_FAILURE_STATUS_DOWNLOADING = 3;
    public static final int DOWNLOAD_FAILURE_STATUS_UNAVAILABLE = 4;
    default public void onDownloadStarted(long p0) {}
    public void onDownloadFailed(int p0, java.lang.String p1, android.os.PersistableBundle p2);
    default public void onDownloadProgress(long p0) {}
    public void onDownloadCompleted(android.os.PersistableBundle p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DownloadFailureStatus {
    }
}
