package android.os;

@android.annotation.SystemApi
public class IncidentManager {
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
    public static final int FLAG_ALLOW_CONSENTLESS_BUGREPORT = 2;
    public static final int PRIVACY_POLICY_LOCAL = 0;
    public static final int PRIVACY_POLICY_EXPLICIT = 100;
    public static final int PRIVACY_POLICY_AUTO = 200;
    public IncidentManager(android.content.Context p0) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.DUMP", "android.permission.PACKAGE_USAGE_STATS"})
    public void reportIncident(android.os.IncidentReportArgs p0) {}
    @android.annotation.RequiresPermission("android.permission.REQUEST_INCIDENT_REPORT_APPROVAL")
    public void requestAuthorization(int p0, java.lang.String p1, int p2, android.os.IncidentManager.AuthListener p3) {}
    @android.annotation.RequiresPermission("android.permission.REQUEST_INCIDENT_REPORT_APPROVAL")
    public void requestAuthorization(int p0, java.lang.String p1, int p2, java.util.concurrent.Executor p3, android.os.IncidentManager.AuthListener p4) {}
    @android.annotation.RequiresPermission("android.permission.REQUEST_INCIDENT_REPORT_APPROVAL")
    public void cancelAuthorization(android.os.IncidentManager.AuthListener p0) {}
    @android.annotation.RequiresPermission("android.permission.APPROVE_INCIDENT_REPORTS")
    public java.util.List<android.os.IncidentManager.PendingReport> getPendingReports() { return null; }
    @android.annotation.RequiresPermission("android.permission.APPROVE_INCIDENT_REPORTS")
    public void approveReport(android.net.Uri p0) {}
    @android.annotation.RequiresPermission("android.permission.APPROVE_INCIDENT_REPORTS")
    public void denyReport(android.net.Uri p0) {}
    public void registerSection(int p0, java.lang.String p1, java.util.concurrent.Executor p2, android.os.IncidentManager.DumpCallback p3) {}
    public void unregisterSection(int p0) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.DUMP", "android.permission.PACKAGE_USAGE_STATS"})
    @android.annotation.NonNull
    public java.util.List<android.net.Uri> getIncidentReportList(java.lang.String p0) { return null; }
    @android.annotation.RequiresPermission(allOf={"android.permission.DUMP", "android.permission.PACKAGE_USAGE_STATS"})
    @android.annotation.Nullable
    public android.os.IncidentManager.IncidentReport getIncidentReport(android.net.Uri p0) { return null; }
    @android.annotation.RequiresPermission(allOf={"android.permission.DUMP", "android.permission.PACKAGE_USAGE_STATS"})
    public void deleteIncidentReports(android.net.Uri p0) {}

    public static class AuthListener {
        java.util.concurrent.Executor mExecutor;
        android.os.IIncidentAuthListener.Stub mBinder;
        public AuthListener() {}
        public void onReportApproved() {}
        public void onReportDenied() {}
    }

    public static class DumpCallback {
        android.os.IIncidentDumpCallback.Stub mBinder;
        public DumpCallback() {}
        public void onDumpSection(int p0, java.io.OutputStream p1) {}
    }

    @android.annotation.SystemApi
    public static class IncidentReport implements android.os.Parcelable, java.io.Closeable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.os.IncidentManager.IncidentReport> CREATOR = null;
        public IncidentReport(android.os.Parcel p0) {}
        public void close() {}
        public long getTimestamp() { return 0L; }
        public long getPrivacyPolicy() { return 0L; }
        public java.io.InputStream getInputStream() throws java.io.IOException { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @android.annotation.SystemApi
    public static class PendingReport {
        public PendingReport(android.net.Uri p0) {}
        @android.annotation.NonNull
        public java.lang.String getRequestingPackage() { return null; }
        public int getFlags() { return 0; }
        public long getTimestamp() { return 0L; }
        @android.annotation.NonNull
        public android.net.Uri getUri() { return null; }
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PendingReportFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PrivacyPolicy {
    }
}
