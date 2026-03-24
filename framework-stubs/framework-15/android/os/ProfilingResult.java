package android.os;

@android.annotation.FlaggedApi("android.os.profiling.telemetry_apis")
public final class ProfilingResult implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.ProfilingResult> CREATOR = null;
    public static final int ERROR_FAILED_EXECUTING = 4;
    public static final int ERROR_FAILED_INVALID_REQUEST = 7;
    public static final int ERROR_FAILED_NO_DISK_SPACE = 6;
    public static final int ERROR_FAILED_POST_PROCESSING = 5;
    public static final int ERROR_FAILED_PROFILING_IN_PROGRESS = 3;
    public static final int ERROR_FAILED_RATE_LIMIT_PROCESS = 2;
    public static final int ERROR_FAILED_RATE_LIMIT_SYSTEM = 1;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_UNKNOWN = 8;
    ProfilingResult() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public int getErrorCode() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getResultFilePath() { return null; }
    @android.annotation.Nullable
    public java.lang.String getTag() { return null; }
    @android.annotation.Nullable
    public java.lang.String getErrorMessage() { return null; }
}
