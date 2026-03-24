package android.companion;

public final class SystemDataTransferRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.companion.SystemDataTransferRequest> CREATOR = null;
    public SystemDataTransferRequest(int p0, boolean p1, java.util.List<java.lang.String> p2) {}
    public int getAssociationId() { return 0; }
    public boolean isPermissionSyncAllPackages() { return false; }
    public java.util.List<java.lang.String> getPermissionSyncPackages() { return null; }
    SystemDataTransferRequest(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static final class Builder extends android.provider.OneTimeUseBuilder<android.companion.SystemDataTransferRequest> {
        public Builder(int p0) { super(); }
        public android.companion.SystemDataTransferRequest.Builder setPermissionSyncAllPackages() { return null; }
        public android.companion.SystemDataTransferRequest.Builder setPermissionSyncPackages(java.util.List<java.lang.String> p0) { return null; }
        public android.companion.SystemDataTransferRequest build() { return null; }
    }
}
