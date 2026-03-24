package android.app;

public class ApplicationErrorReport implements android.os.Parcelable {
    static final java.lang.String SYSTEM_APPS_ERROR_RECEIVER_PROPERTY = "ro.error.receiver.system.apps";
    static final java.lang.String DEFAULT_ERROR_RECEIVER_PROPERTY = "ro.error.receiver.default";
    public static final int TYPE_NONE = 0;
    public static final int TYPE_CRASH = 1;
    public static final int TYPE_ANR = 2;
    public static final int TYPE_BATTERY = 3;
    public static final int TYPE_RUNNING_SERVICE = 5;
    public int type;
    public java.lang.String packageName;
    public java.lang.String installerPackageName;
    public java.lang.String processName;
    public long time;
    public boolean systemApp;
    public android.app.ApplicationErrorReport.CrashInfo crashInfo;
    public android.app.ApplicationErrorReport.AnrInfo anrInfo;
    public android.app.ApplicationErrorReport.BatteryInfo batteryInfo;
    public android.app.ApplicationErrorReport.RunningServiceInfo runningServiceInfo;
    public static final android.os.Parcelable.Creator<android.app.ApplicationErrorReport> CREATOR = null;
    public ApplicationErrorReport() {}
    ApplicationErrorReport(android.os.Parcel p0) {}
    public static android.content.ComponentName getErrorReportReceiver(android.content.Context p0, java.lang.String p1, int p2) { return null; }
    static android.content.ComponentName getErrorReportReceiver(android.content.pm.PackageManager p0, java.lang.String p1, java.lang.String p2) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void dump(android.util.Printer p0, java.lang.String p1) {}

    public static class AnrInfo {
        public java.lang.String activity;
        public java.lang.String cause;
        public java.lang.String info;
        public AnrInfo() {}
        public AnrInfo(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void dump(android.util.Printer p0, java.lang.String p1) {}
    }

    public static class BatteryInfo {
        public int usagePercent;
        public long durationMicros;
        public java.lang.String usageDetails;
        public java.lang.String checkinDetails;
        public BatteryInfo() {}
        public BatteryInfo(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void dump(android.util.Printer p0, java.lang.String p1) {}
    }

    public static class CrashInfo {
        public java.lang.String exceptionClassName;
        public java.lang.String exceptionMessage;
        public java.lang.String throwFileName;
        public java.lang.String throwClassName;
        public java.lang.String throwMethodName;
        public int throwLineNumber;
        public java.lang.String stackTrace;
        public java.lang.String crashTag;
        public CrashInfo() {}
        public CrashInfo(java.lang.Throwable p0) {}
        public void appendStackTrace(java.lang.String p0) {}
        private java.lang.String sanitizeString(java.lang.String p0) { return null; }
        public CrashInfo(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void dump(android.util.Printer p0, java.lang.String p1) {}
    }

    public static class ParcelableCrashInfo extends android.app.ApplicationErrorReport.CrashInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.ApplicationErrorReport.ParcelableCrashInfo> CREATOR = null;
        public ParcelableCrashInfo() { super(); }
        public ParcelableCrashInfo(java.lang.Throwable p0) { super(); }
        public ParcelableCrashInfo(android.os.Parcel p0) { super(); }
        public int describeContents() { return 0; }
    }

    public static class RunningServiceInfo {
        public long durationMillis;
        public java.lang.String serviceDetails;
        public RunningServiceInfo() {}
        public RunningServiceInfo(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void dump(android.util.Printer p0, java.lang.String p1) {}
    }
}
