package android.companion;

public final class DeviceId implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.companion.DeviceId> CREATOR = null;
    public DeviceId(java.lang.String p0, android.net.MacAddress p1, byte[] p2) {}
    @android.annotation.Nullable
    public java.lang.String getMacAddressAsString() { return null; }
    @android.annotation.Nullable
    public java.lang.String getCustomId() { return null; }
    @android.annotation.Nullable
    public android.net.MacAddress getMacAddress() { return null; }
    @android.annotation.FlaggedApi("android.companion.association_verification")
    @android.annotation.Nullable
    public byte[] getKey() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.companion.DeviceId.Builder setCustomId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.companion.DeviceId.Builder setMacAddress(android.net.MacAddress p0) { return null; }
        @android.annotation.NonNull
        public android.companion.DeviceId build() { return null; }
    }
}
