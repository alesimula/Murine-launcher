package android.companion;

public final class AssociationInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.companion.AssociationInfo> CREATOR = null;
    public AssociationInfo(int p0, int p1, java.lang.String p2, android.net.MacAddress p3, java.lang.CharSequence p4, java.lang.String p5, android.companion.AssociatedDevice p6, boolean p7, boolean p8, boolean p9, boolean p10, long p11, long p12, int p13, android.graphics.drawable.Icon p14, android.companion.DeviceId p15, java.util.List<java.lang.String> p16) {}
    public int getId() { return 0; }
    public int getUserId() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.Nullable
    public android.companion.DeviceId getDeviceId() { return null; }
    @android.annotation.Nullable
    public android.net.MacAddress getDeviceMacAddress() { return null; }
    @android.annotation.Nullable
    public java.lang.String getDeviceMacAddressAsString() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getDisplayName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getDeviceProfile() { return null; }
    @android.annotation.Nullable
    public android.companion.AssociatedDevice getAssociatedDevice() { return null; }
    @android.annotation.SuppressLint("UnflaggedApi")
    public boolean isSelfManaged() { return false; }
    public boolean isNotifyOnDeviceNearby() { return false; }
    public long getTimeApprovedMs() { return 0L; }
    public boolean belongsToPackage(int p0, java.lang.String p1) { return false; }
    public boolean isRevoked() { return false; }
    public boolean isPending() { return false; }
    public boolean isActive() { return false; }
    public long getLastTimeConnectedMs() { return 0L; }
    public int getSystemDataSyncFlags() { return 0; }
    @android.annotation.FlaggedApi("android.companion.association_device_icon")
    @android.annotation.Nullable
    public android.graphics.drawable.Icon getDeviceIcon() { return null; }
    @android.annotation.FlaggedApi("android.companion.association_verification")
    @android.annotation.Nullable
    public java.util.List<java.lang.String> getPackagesToNotify() { return null; }
    public boolean isLinkedTo(java.lang.String p0) { return false; }
    public boolean shouldBindWhenPresent() { return false; }
    @android.annotation.NonNull
    public java.lang.String toShortString() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("android.companion.new_association_builder")
    public static final class Builder {
        public Builder(int p0, int p1, java.lang.String p2) {}
        public Builder(android.companion.AssociationInfo p0) {}
        public Builder(int p0, int p1, java.lang.String p2, android.companion.AssociationInfo p3) {}
        @android.annotation.NonNull
        public android.companion.AssociationInfo.Builder setDeviceId(android.companion.DeviceId p0) { return null; }
        @android.annotation.NonNull
        public android.companion.AssociationInfo.Builder setDeviceMacAddress(android.net.MacAddress p0) { return null; }
        @android.annotation.NonNull
        public android.companion.AssociationInfo.Builder setDisplayName(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.companion.AssociationInfo.Builder setDeviceProfile(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.companion.AssociationInfo.Builder setAssociatedDevice(android.companion.AssociatedDevice p0) { return null; }
        @android.annotation.NonNull
        public android.companion.AssociationInfo.Builder setSelfManaged(boolean p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.companion.AssociationInfo.Builder setNotifyOnDeviceNearby(boolean p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.companion.AssociationInfo.Builder setRevoked(boolean p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.companion.AssociationInfo.Builder setPending(boolean p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.companion.AssociationInfo.Builder setTimeApproved(long p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.companion.AssociationInfo.Builder setLastTimeConnected(long p0) { return null; }
        @android.annotation.NonNull
        public android.companion.AssociationInfo.Builder setSystemDataSyncFlags(int p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        @android.annotation.FlaggedApi("android.companion.association_device_icon")
        public android.companion.AssociationInfo.Builder setDeviceIcon(android.graphics.drawable.Icon p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.companion.AssociationInfo.Builder setPackagesToNotify(java.util.List<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.companion.AssociationInfo build() { return null; }
    }
}
