package android.telephony;

public class MbmsDownloadSession implements java.lang.AutoCloseable {
    @android.annotation.SystemApi
    public static final java.lang.String MBMS_DOWNLOAD_SERVICE_ACTION = "android.telephony.action.EmbmsDownload";
    public static final java.lang.String MBMS_DOWNLOAD_SERVICE_OVERRIDE_METADATA = "mbms-download-service-override";
    public static final java.lang.String EXTRA_MBMS_DOWNLOAD_RESULT = "android.telephony.extra.MBMS_DOWNLOAD_RESULT";
    public static final java.lang.String EXTRA_MBMS_FILE_INFO = "android.telephony.extra.MBMS_FILE_INFO";
    public static final java.lang.String EXTRA_MBMS_COMPLETED_FILE_URI = "android.telephony.extra.MBMS_COMPLETED_FILE_URI";
    public static final java.lang.String EXTRA_MBMS_DOWNLOAD_REQUEST = "android.telephony.extra.MBMS_DOWNLOAD_REQUEST";
    public static final java.lang.String DEFAULT_TOP_LEVEL_TEMP_DIRECTORY = "androidMbmsTempFileRoot";
    public static final int RESULT_SUCCESSFUL = 1;
    public static final int RESULT_CANCELLED = 2;
    public static final int RESULT_EXPIRED = 3;
    public static final int RESULT_IO_ERROR = 4;
    public static final int RESULT_SERVICE_ID_NOT_DEFINED = 5;
    public static final int RESULT_DOWNLOAD_FAILURE = 6;
    public static final int RESULT_OUT_OF_STORAGE = 7;
    public static final int RESULT_FILE_ROOT_UNREACHABLE = 8;
    public static final int STATUS_UNKNOWN = 0;
    public static final int STATUS_ACTIVELY_DOWNLOADING = 1;
    public static final int STATUS_PENDING_DOWNLOAD = 2;
    public static final int STATUS_PENDING_REPAIR = 3;
    public static final int STATUS_PENDING_DOWNLOAD_WINDOW = 4;
    public static android.telephony.MbmsDownloadSession create(android.content.Context p0, java.util.concurrent.Executor p1, android.telephony.mbms.MbmsDownloadSessionCallback p2) { return null; }
    public static android.telephony.MbmsDownloadSession create(android.content.Context p0, java.util.concurrent.Executor p1, int p2, android.telephony.mbms.MbmsDownloadSessionCallback p3) { return null; }
    public static int getMaximumServiceAnnouncementSize() { return 0; }
    public void requestUpdateFileServices(java.util.List<java.lang.String> p0) {}
    public void addServiceAnnouncement(byte[] p0) {}
    public void setTempFileRootDirectory(java.io.File p0) {}
    public java.io.File getTempFileRootDirectory() { return null; }
    public void download(android.telephony.mbms.DownloadRequest p0) {}
    public java.util.List<android.telephony.mbms.DownloadRequest> listPendingDownloads() { return null; }
    public void addStatusListener(android.telephony.mbms.DownloadRequest p0, java.util.concurrent.Executor p1, android.telephony.mbms.DownloadStatusListener p2) {}
    public void removeStatusListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.DownloadStatusListener p1) {}
    public void addProgressListener(android.telephony.mbms.DownloadRequest p0, java.util.concurrent.Executor p1, android.telephony.mbms.DownloadProgressListener p2) {}
    public void removeProgressListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.DownloadProgressListener p1) {}
    public void cancelDownload(android.telephony.mbms.DownloadRequest p0) {}
    public void requestDownloadState(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.FileInfo p1) {}
    public void resetDownloadKnowledge(android.telephony.mbms.DownloadRequest p0) {}
    public void close() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DownloadResultCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DownloadStatus {
    }
}
