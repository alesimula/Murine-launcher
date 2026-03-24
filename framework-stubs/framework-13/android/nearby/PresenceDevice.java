package android.nearby;

public final class PresenceDevice extends android.nearby.NearbyDevice implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.nearby.PresenceDevice> CREATOR = null;
    @android.annotation.NonNull
    public java.lang.String getDeviceId() { return null; }
    @android.annotation.NonNull
    public byte[] getSalt() { return null; }
    @android.annotation.NonNull
    public byte[] getSecretId() { return null; }
    @android.annotation.NonNull
    public byte[] getEncryptedIdentity() { return null; }
    public int getDeviceType() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getDeviceImageUrl() { return null; }
    public long getDiscoveryTimestampMillis() { return 0L; }
    @android.annotation.NonNull
    public java.util.List<android.nearby.DataElement> getExtendedProperties() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder(java.lang.String p0, byte[] p1, byte[] p2, byte[] p3) {}
        @android.annotation.NonNull
        public android.nearby.PresenceDevice.Builder setName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.PresenceDevice.Builder addMedium(int p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.PresenceDevice.Builder setRssi(int p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.PresenceDevice.Builder setDeviceType(int p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.PresenceDevice.Builder setDeviceImageUrl(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.PresenceDevice.Builder setDiscoveryTimestampMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.PresenceDevice.Builder addExtendedProperty(android.nearby.DataElement p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.PresenceDevice build() { return null; }
    }
}
