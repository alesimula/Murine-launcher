package android.service.timezone;

@android.annotation.SystemApi
public final class TimeZoneProviderStatus implements android.os.Parcelable {
    public static final int DEPENDENCY_STATUS_UNKNOWN = 0;
    public static final int DEPENDENCY_STATUS_NOT_APPLICABLE = 1;
    public static final int DEPENDENCY_STATUS_OK = 2;
    public static final int DEPENDENCY_STATUS_TEMPORARILY_UNAVAILABLE = 3;
    public static final int DEPENDENCY_STATUS_BLOCKED_BY_ENVIRONMENT = 4;
    public static final int DEPENDENCY_STATUS_DEGRADED_BY_SETTINGS = 5;
    public static final int DEPENDENCY_STATUS_BLOCKED_BY_SETTINGS = 6;
    public static final int OPERATION_STATUS_UNKNOWN = 0;
    public static final int OPERATION_STATUS_NOT_APPLICABLE = 1;
    public static final int OPERATION_STATUS_OK = 2;
    public static final int OPERATION_STATUS_FAILED = 3;
    public static final android.os.Parcelable.Creator<android.service.timezone.TimeZoneProviderStatus> CREATOR = null;
    public int getLocationDetectionDependencyStatus() { return 0; }
    public int getConnectivityDependencyStatus() { return 0; }
    public int getTimeZoneResolutionOperationStatus() { return 0; }
    public java.lang.String toString() { return null; }
    public static android.service.timezone.TimeZoneProviderStatus parseProviderStatus(java.lang.String p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean couldEnableTelephonyFallback() { return false; }
    public static java.lang.String operationStatusToString(int p0) { return null; }
    public static int operationStatusFromString(java.lang.String p0) { return 0; }
    public static java.lang.String dependencyStatusToString(int p0) { return null; }
    public static int dependencyStatusFromString(java.lang.String p0) { return 0; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.service.timezone.TimeZoneProviderStatus p0) {}
        public android.service.timezone.TimeZoneProviderStatus.Builder setLocationDetectionDependencyStatus(int p0) { return null; }
        public android.service.timezone.TimeZoneProviderStatus.Builder setConnectivityDependencyStatus(int p0) { return null; }
        public android.service.timezone.TimeZoneProviderStatus.Builder setTimeZoneResolutionOperationStatus(int p0) { return null; }
        public android.service.timezone.TimeZoneProviderStatus build() { return null; }
    }

    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DependencyStatus {
    }

    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OperationStatus {
    }
}
