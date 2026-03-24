package android.companion;

public final class AssociationInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.companion.AssociationInfo> CREATOR = null;
    public AssociationInfo(int p0, int p1, java.lang.String p2, java.lang.String p3, android.net.MacAddress p4, java.lang.CharSequence p5, java.lang.String p6, android.companion.AssociatedDevice p7, boolean p8, boolean p9, boolean p10, boolean p11, long p12, long p13, int p14) {}
    public int getId() { return 0; }
    public int getUserId() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.FlaggedApi("android.companion.association_tag")
    @android.annotation.Nullable
    public java.lang.String getTag() { return null; }
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
        @android.annotation.FlaggedApi("android.companion.association_tag")
        @android.annotation.NonNull
        public android.companion.AssociationInfo.Builder setTag(java.lang.String p0) { return null; }
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
        public android.companion.AssociationInfo build() { return null; }
    }
}
