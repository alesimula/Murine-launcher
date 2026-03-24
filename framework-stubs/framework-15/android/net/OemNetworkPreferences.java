package android.net;

public final class OemNetworkPreferences implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.OemNetworkPreferences> CREATOR = null;
    public static final int OEM_NETWORK_PREFERENCE_OEM_PAID = 1;
    public static final int OEM_NETWORK_PREFERENCE_OEM_PAID_NO_FALLBACK = 2;
    public static final int OEM_NETWORK_PREFERENCE_OEM_PAID_ONLY = 3;
    public static final int OEM_NETWORK_PREFERENCE_OEM_PRIVATE_ONLY = 4;
    public static final int OEM_NETWORK_PREFERENCE_UNINITIALIZED = 0;
    OemNetworkPreferences() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.lang.Integer> getNetworkPreferences() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public Builder(android.net.OemNetworkPreferences p0) {}
        @android.annotation.NonNull
        public android.net.OemNetworkPreferences.Builder addNetworkPreference(java.lang.String p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.net.OemNetworkPreferences build() { return null; }
        @android.annotation.NonNull
        public android.net.OemNetworkPreferences.Builder clearNetworkPreference(java.lang.String p0) { return null; }
    }
}
