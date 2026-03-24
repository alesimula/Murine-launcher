package android.companion;

@android.annotation.FlaggedApi("android.companion.device_presence")
public final class ObservingDevicePresenceRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.companion.ObservingDevicePresenceRequest> CREATOR = null;
    public int getAssociationId() { return 0; }
    @android.annotation.Nullable
    public android.os.ParcelUuid getUuid() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder extends android.provider.OneTimeUseBuilder<android.companion.ObservingDevicePresenceRequest> {
        public Builder() { super(); }
        @android.annotation.NonNull
        public android.companion.ObservingDevicePresenceRequest.Builder setAssociationId(int p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.RequiresPermission(allOf={"android.permission.REQUEST_OBSERVE_DEVICE_UUID_PRESENCE", "android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"})
        public android.companion.ObservingDevicePresenceRequest.Builder setUuid(android.os.ParcelUuid p0) { return null; }
        @android.annotation.NonNull
        public android.companion.ObservingDevicePresenceRequest build() { return null; }
    }
}
