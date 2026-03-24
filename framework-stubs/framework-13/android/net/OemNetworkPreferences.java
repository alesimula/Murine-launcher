package android.net;

public final class OemNetworkPreferences implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.OemNetworkPreferences> CREATOR = null;
    public static final int OEM_NETWORK_PREFERENCE_OEM_PAID = 1;
    public static final int OEM_NETWORK_PREFERENCE_OEM_PAID_NO_FALLBACK = 2;
    public static final int OEM_NETWORK_PREFERENCE_OEM_PAID_ONLY = 3;
    public static final int OEM_NETWORK_PREFERENCE_OEM_PRIVATE_ONLY = 4;
    public static final int OEM_NETWORK_PREFERENCE_UNINITIALIZED = 0;
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.lang.Integer> getNetworkPreferences() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.net.OemNetworkPreferences p0) {}
        @android.annotation.NonNull
        public android.net.OemNetworkPreferences.Builder addNetworkPreference(java.lang.String p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.net.OemNetworkPreferences.Builder clearNetworkPreference(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.OemNetworkPreferences build() { return null; }
    }
}
