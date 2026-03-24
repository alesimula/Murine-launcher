package android.app.time;

public final class LocationTimeZoneAlgorithmStatus implements android.os.Parcelable {
    public static final int PROVIDER_STATUS_NOT_PRESENT = 1;
    public static final int PROVIDER_STATUS_NOT_READY = 2;
    public static final int PROVIDER_STATUS_IS_CERTAIN = 3;
    public static final int PROVIDER_STATUS_IS_UNCERTAIN = 4;
    public static final android.app.time.LocationTimeZoneAlgorithmStatus NOT_SUPPORTED = null;
    public static final android.app.time.LocationTimeZoneAlgorithmStatus RUNNING_NOT_REPORTED = null;
    public static final android.app.time.LocationTimeZoneAlgorithmStatus NOT_RUNNING = null;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.time.LocationTimeZoneAlgorithmStatus> CREATOR = null;
    public LocationTimeZoneAlgorithmStatus(int p0, int p1, android.service.timezone.TimeZoneProviderStatus p2, int p3, android.service.timezone.TimeZoneProviderStatus p4) {}
    public int getStatus() { return 0; }
    public int getPrimaryProviderStatus() { return 0; }
    @android.annotation.Nullable
    public android.service.timezone.TimeZoneProviderStatus getPrimaryProviderReportedStatus() { return null; }
    public int getSecondaryProviderStatus() { return 0; }
    @android.annotation.Nullable
    public android.service.timezone.TimeZoneProviderStatus getSecondaryProviderReportedStatus() { return null; }
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public static android.app.time.LocationTimeZoneAlgorithmStatus parseCommandlineArg(java.lang.String p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean couldEnableTelephonyFallback() { return false; }
    @android.annotation.NonNull
    public static java.lang.String providerStatusToString(int p0) { return null; }
    public static int providerStatusFromString(java.lang.String p0) { return 0; }
    public static int requireValidProviderStatus(int p0) { return 0; }

    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProviderStatus {
    }
}
