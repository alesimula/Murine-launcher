package android.companion;

public final class AssociationRequest implements android.os.Parcelable {
    public static final java.lang.String DEVICE_PROFILE_WATCH = "android.app.role.COMPANION_DEVICE_WATCH";
    @android.annotation.RequiresPermission("android.permission.REQUEST_COMPANION_PROFILE_GLASSES")
    public static final java.lang.String DEVICE_PROFILE_GLASSES = "android.app.role.COMPANION_DEVICE_GLASSES";
    @android.annotation.RequiresPermission("android.permission.REQUEST_COMPANION_PROFILE_APP_STREAMING")
    public static final java.lang.String DEVICE_PROFILE_APP_STREAMING = "android.app.role.COMPANION_DEVICE_APP_STREAMING";
    @android.annotation.RequiresPermission("android.permission.REQUEST_COMPANION_PROFILE_NEARBY_DEVICE_STREAMING")
    public static final java.lang.String DEVICE_PROFILE_NEARBY_DEVICE_STREAMING = "android.app.role.COMPANION_DEVICE_NEARBY_DEVICE_STREAMING";
    @android.annotation.RequiresPermission("android.permission.REQUEST_COMPANION_PROFILE_AUTOMOTIVE_PROJECTION")
    public static final java.lang.String DEVICE_PROFILE_AUTOMOTIVE_PROJECTION = "android.app.role.SYSTEM_AUTOMOTIVE_PROJECTION";
    @android.annotation.RequiresPermission("android.permission.REQUEST_COMPANION_PROFILE_COMPUTER")
    public static final java.lang.String DEVICE_PROFILE_COMPUTER = "android.app.role.COMPANION_DEVICE_COMPUTER";
    public static final android.os.Parcelable.Creator<android.companion.AssociationRequest> CREATOR = null;
    public java.lang.String getDeviceProfile() { return null; }
    public java.lang.CharSequence getDisplayName() { return null; }
    public boolean isSelfManaged() { return false; }
    public boolean isForceConfirmation() { return false; }
    public boolean isSingleDevice() { return false; }
    public void setPackageName(java.lang.String p0) {}
    public void setUserId(int p0) {}
    public void setDeviceProfilePrivilegesDescription(java.lang.String p0) {}
    public void setSkipPrompt(boolean p0) {}
    public void setDisplayName(java.lang.CharSequence p0) {}
    public void setAssociatedDevice(android.companion.AssociatedDevice p0) {}
    public java.util.List<android.companion.DeviceFilter<?>> getDeviceFilters() { return null; }
    public android.companion.AssociatedDevice getAssociatedDevice() { return null; }
    public java.lang.String getPackageName() { return null; }
    public int getUserId() { return 0; }
    public java.lang.String getDeviceProfilePrivilegesDescription() { return null; }
    public long getCreationTime() { return 0L; }
    public boolean isSkipPrompt() { return false; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    AssociationRequest(android.os.Parcel p0) {}

    public static final class Builder extends android.provider.OneTimeUseBuilder<android.companion.AssociationRequest> {
        public Builder() { super(); }
        public android.companion.AssociationRequest.Builder setSingleDevice(boolean p0) { return null; }
        public android.companion.AssociationRequest.Builder addDeviceFilter(android.companion.DeviceFilter<?> p0) { return null; }
        public android.companion.AssociationRequest.Builder setDeviceProfile(java.lang.String p0) { return null; }
        public android.companion.AssociationRequest.Builder setDisplayName(java.lang.CharSequence p0) { return null; }
        @android.annotation.RequiresPermission("android.permission.REQUEST_COMPANION_SELF_MANAGED")
        public android.companion.AssociationRequest.Builder setSelfManaged(boolean p0) { return null; }
        @android.annotation.RequiresPermission("android.permission.REQUEST_COMPANION_SELF_MANAGED")
        public android.companion.AssociationRequest.Builder setForceConfirmation(boolean p0) { return null; }
        public android.companion.AssociationRequest build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceProfile {
    }
}
