package android.companion;

public final class AssociationInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.companion.AssociationInfo> CREATOR = null;
    public AssociationInfo(int p0, int p1, java.lang.String p2, android.net.MacAddress p3, java.lang.CharSequence p4, java.lang.String p5, android.companion.AssociatedDevice p6, boolean p7, boolean p8, boolean p9, long p10, long p11, int p12) {}
    public int getId() { return 0; }
    public int getUserId() { return 0; }
    @android.annotation.SystemApi
    public java.lang.String getPackageName() { return null; }
    public android.net.MacAddress getDeviceMacAddress() { return null; }
    public java.lang.String getDeviceMacAddressAsString() { return null; }
    public java.lang.CharSequence getDisplayName() { return null; }
    public java.lang.String getDeviceProfile() { return null; }
    public android.companion.AssociatedDevice getAssociatedDevice() { return null; }
    @android.annotation.SystemApi
    public boolean isSelfManaged() { return false; }
    public boolean isNotifyOnDeviceNearby() { return false; }
    public long getTimeApprovedMs() { return 0L; }
    public boolean belongsToPackage(int p0, java.lang.String p1) { return false; }
    public boolean isRevoked() { return false; }
    public java.lang.Long getLastTimeConnectedMs() { return null; }
    public int getSystemDataSyncFlags() { return 0; }
    public boolean isLinkedTo(java.lang.String p0) { return false; }
    public boolean shouldBindWhenPresent() { return false; }
    public java.lang.String toShortString() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static android.companion.AssociationInfo.NonActionableBuilder builder(android.companion.AssociationInfo p0) { return null; }

    public static final class Builder implements android.companion.AssociationInfo.NonActionableBuilder {
        public android.companion.AssociationInfo.Builder setLastTimeConnected(long p0) { return null; }
        public android.companion.AssociationInfo.Builder setNotifyOnDeviceNearby(boolean p0) { return null; }
        public android.companion.AssociationInfo.Builder setRevoked(boolean p0) { return null; }
        public android.companion.AssociationInfo.Builder setSystemDataSyncFlags(int p0) { return null; }
        public android.companion.AssociationInfo build() { return null; }
    }

    public static interface NonActionableBuilder {
        public android.companion.AssociationInfo.Builder setNotifyOnDeviceNearby(boolean p0);
        public android.companion.AssociationInfo.Builder setLastTimeConnected(long p0);
        public android.companion.AssociationInfo.Builder setRevoked(boolean p0);
        public android.companion.AssociationInfo.Builder setSystemDataSyncFlags(int p0);
    }
}
