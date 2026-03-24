package android.net;

public final class ProfileNetworkPreference implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.ProfileNetworkPreference> CREATOR = null;
    public int getPreference() { return 0; }
    @android.annotation.NonNull
    public int[] getIncludedUids() { return null; }
    @android.annotation.NonNull
    public int[] getExcludedUids() { return null; }
    public int getPreferenceEnterpriseId() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.ProfileNetworkPreference.Builder setPreference(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.ProfileNetworkPreference.Builder setIncludedUids(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.ProfileNetworkPreference.Builder setExcludedUids(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.ProfileNetworkPreference build() { return null; }
        @android.annotation.NonNull
        public android.net.ProfileNetworkPreference.Builder setPreferenceEnterpriseId(int p0) { return null; }
    }
}
