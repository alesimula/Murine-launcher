package android.nearby;

public final class ScanRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.nearby.ScanRequest> CREATOR = null;
    public static final int SCAN_MODE_BALANCED = 1;
    public static final int SCAN_MODE_LOW_LATENCY = 2;
    public static final int SCAN_MODE_LOW_POWER = 0;
    public static final int SCAN_MODE_NO_POWER = -1;
    public static final int SCAN_TYPE_FAST_PAIR = 1;
    public static final int SCAN_TYPE_NEARBY_PRESENCE = 2;
    ScanRequest() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.nearby.ScanFilter> getScanFilters() { return null; }
    public int getScanMode() { return 0; }
    public int getScanType() { return 0; }
    @android.annotation.NonNull
    public android.os.WorkSource getWorkSource() { return null; }
    public boolean isBleEnabled() { return false; }
    public boolean isOffloadOnly() { return false; }
    public static boolean isValidScanMode(int p0) { return false; }
    public static boolean isValidScanType(int p0) { return false; }
    @android.annotation.NonNull
    public static java.lang.String scanModeToString(int p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.nearby.ScanRequest.Builder addScanFilter(android.nearby.ScanFilter p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.ScanRequest build() { return null; }
        @android.annotation.NonNull
        public android.nearby.ScanRequest.Builder setBleEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.ScanRequest.Builder setOffloadOnly(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.ScanRequest.Builder setScanMode(int p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.ScanRequest.Builder setScanType(int p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.ScanRequest.Builder setWorkSource(android.os.WorkSource p0) { return null; }
    }
}
