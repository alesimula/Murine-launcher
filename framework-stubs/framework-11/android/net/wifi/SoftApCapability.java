package android.net.wifi;

public final class SoftApCapability implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.SoftApCapability> CREATOR = null;
    public static final long SOFTAP_FEATURE_ACS_OFFLOAD = 1L;
    public static final long SOFTAP_FEATURE_CLIENT_FORCE_DISCONNECT = 2L;
    public static final long SOFTAP_FEATURE_WPA3_SAE = 4L;
    SoftApCapability() {}
    public int getMaxSupportedClients() { return 0; }
    public boolean areFeaturesSupported(long p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
