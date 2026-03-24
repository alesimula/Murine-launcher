package android.os;

@android.annotation.SystemApi
public class IncidentManager {
    private static final java.lang.String TAG = "IncidentManager";
    public static final java.lang.String URI_SCHEME = "content";
    public static final java.lang.String URI_AUTHORITY = "android.os.IncidentManager";
    public static final java.lang.String URI_PATH = "/pending";
    public static final java.lang.String URI_PARAM_ID = "id";
    public static final java.lang.String URI_PARAM_REPORT_ID = "r";
    public static final java.lang.String URI_PARAM_CALLING_PACKAGE = "pkg";
    public static final java.lang.String URI_PARAM_TIMESTAMP = "t";
    public static final java.lang.String URI_PARAM_FLAGS = "flags";
    public static final java.lang.String URI_PARAM_RECEIVER_CLASS = "receiver";
    public static final int FLAG_CONFIRMATION_DIALOG = 1;
    public static final int PRIVACY_POLICY_LOCAL = 0;
    public static final int PRIVACY_POLICY_EXPLICIT = 100;
    public static final int PRIVACY_POLICY_AUTO = 200;
    private final android.content.Context mContext = null;
    private java.lang.Object mLock;
    private android.os.IIncidentManager mIncidentService;
    private android.os.IIncidentCompanion mCompanionService;
    public IncidentManager(android.content.Context p0) {}
    public void reportIncident(android.os.IncidentReportArgs p0) {}
    public void requestAuthorization(int p0, java.lang.String p1, int p2, android.os.IncidentManager.AuthListener p3) {}
    public void requestAuthorization(int p0, java.lang.String p1, int p2, java.util.concurrent.Executor p3, android.os.IncidentManager.AuthListener p4) {}
    public void cancelAuthorization(android.os.IncidentManager.AuthListener p0) {}
    public java.util.List<android.os.IncidentManager.PendingReport> getPendingReports() { return null; }
    public void approveReport(android.net.Uri p0) {}
    public void denyReport(android.net.Uri p0) {}
    public java.util.List<android.net.Uri> getIncidentReportList(java.lang.String p0) { return null; }
    public android.os.IncidentManager.IncidentReport getIncidentReport(android.net.Uri p0) { return null; }
    public void deleteIncidentReports(android.net.Uri p0) {}
    private void reportIncidentInternal(android.os.IncidentReportArgs p0) {}
    private android.os.IIncidentManager getIIncidentManagerLocked() throws android.os.RemoteException { return null; }
    private android.os.IIncidentCompanion getCompanionServiceLocked() throws android.os.RemoteException { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PrivacyPolicy {
    }

    @android.annotation.SystemApi
    public static class PendingReport {
        private final android.net.Uri mUri = null;
        private final int mFlags = 0;
        private final java.lang.String mRequestingPackage = null;
        private final long mTimestamp = 0L;
        public PendingReport(android.net.Uri p0) {}
        public java.lang.String getRequestingPackage() { return null; }
        public int getFlags() { return 0; }
        public long getTimestamp() { return 0L; }
        public android.net.Uri getUri() { return null; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    @android.annotation.SystemApi
    public static class IncidentReport implements android.os.Parcelable, java.io.Closeable {
        private final long mTimestampNs = 0L;
        private final int mPrivacyPolicy = 0;
        private android.os.ParcelFileDescriptor mFileDescriptor;
        public static final android.os.Parcelable.Creator<android.os.IncidentManager.IncidentReport> CREATOR = null;
        public IncidentReport(android.os.Parcel p0) {}
        public void close() {}
        public long getTimestamp() { return 0L; }
        public long getPrivacyPolicy() { return 0L; }
        public java.io.InputStream getInputStream() throws java.io.IOException { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class AuthListener {
        java.util.concurrent.Executor mExecutor;
        android.os.IIncidentAuthListener.Stub mBinder;
        public AuthListener() {}
        public void onReportApproved() {}
        public void onReportDenied() {}
    }
}
