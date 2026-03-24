package android.companion;

public final class AssociationRequest implements android.os.Parcelable {
    public static final java.lang.String DEVICE_PROFILE_WATCH = "android.app.role.COMPANION_DEVICE_WATCH";
    @android.annotation.RequiresPermission("android.permission.REQUEST_COMPANION_PROFILE_GLASSES")
    public static final java.lang.String DEVICE_PROFILE_GLASSES = "android.app.role.COMPANION_DEVICE_GLASSES";
    public static final java.lang.String DEVICE_PROFILE_WEARABLE_SENSING = "android.companion.COMPANION_DEVICE_WEARABLE_SENSING";
    @android.annotation.RequiresPermission("android.permission.REQUEST_COMPANION_PROFILE_APP_STREAMING")
    public static final java.lang.String DEVICE_PROFILE_APP_STREAMING = "android.app.role.COMPANION_DEVICE_APP_STREAMING";
    @android.annotation.RequiresPermission("android.permission.REQUEST_COMPANION_PROFILE_NEARBY_DEVICE_STREAMING")
    public static final java.lang.String DEVICE_PROFILE_NEARBY_DEVICE_STREAMING = "android.app.role.COMPANION_DEVICE_NEARBY_DEVICE_STREAMING";
    @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.enable_limited_vdm_role")
    @android.annotation.RequiresPermission("android.permission.REQUEST_COMPANION_PROFILE_VIRTUAL_DEVICE")
    public static final java.lang.String DEVICE_PROFILE_VIRTUAL_DEVICE = "android.app.role.COMPANION_DEVICE_VIRTUAL_DEVICE";
    @android.annotation.RequiresPermission("android.permission.REQUEST_COMPANION_PROFILE_AUTOMOTIVE_PROJECTION")
    public static final java.lang.String DEVICE_PROFILE_AUTOMOTIVE_PROJECTION = "android.app.role.SYSTEM_AUTOMOTIVE_PROJECTION";
    @android.annotation.RequiresPermission("android.permission.REQUEST_COMPANION_PROFILE_COMPUTER")
    public static final java.lang.String DEVICE_PROFILE_COMPUTER = "android.app.role.COMPANION_DEVICE_COMPUTER";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.companion.AssociationRequest> CREATOR = null;
    @android.annotation.Nullable
    public java.lang.String getDeviceProfile() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getDisplayName() { return null; }
    public boolean isSelfManaged() { return false; }
    public boolean isForceConfirmation() { return false; }
    @android.annotation.SuppressLint("UnflaggedApi")
    public boolean isSkipRoleGrant() { return false; }
    public boolean isSingleDevice() { return false; }
    @android.annotation.FlaggedApi("android.companion.association_device_icon")
    @android.annotation.Nullable
    public android.graphics.drawable.Icon getDeviceIcon() { return null; }
    @android.annotation.Nullable
    public java.util.List<java.lang.Integer> getRequestedPerms() { return null; }
    public void setPackageName(java.lang.String p0) {}
    public void setUserId(int p0) {}
    public void setDeviceProfilePrivilegesDescription(java.lang.String p0) {}
    public void setSkipPrompt(boolean p0) {}
    public void setDisplayName(java.lang.CharSequence p0) {}
    public void setAssociatedDevice(android.companion.AssociatedDevice p0) {}
    public void setDeviceIcon(android.graphics.drawable.Icon p0) {}
    public void setRequestedPerms(java.util.List<java.lang.Integer> p0) {}
    @android.annotation.NonNull
    public java.util.List<android.companion.DeviceFilter<?>> getDeviceFilters() { return null; }
    @android.annotation.Nullable
    public android.companion.AssociatedDevice getAssociatedDevice() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPackageName() { return null; }
    public int getUserId() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getDeviceProfilePrivilegesDescription() { return null; }
    public long getCreationTime() { return 0L; }
    public boolean isSkipPrompt() { return false; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    AssociationRequest(android.os.Parcel p0) {}

    public static final class Builder extends android.provider.OneTimeUseBuilder<android.companion.AssociationRequest> {
        public Builder() { super(); }
        @android.annotation.NonNull
        public android.companion.AssociationRequest.Builder setSingleDevice(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.companion.AssociationRequest.Builder addDeviceFilter(android.companion.DeviceFilter<?> p0) { return null; }
        @android.annotation.NonNull
        public android.companion.AssociationRequest.Builder setDeviceProfile(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.companion.AssociationRequest.Builder setDisplayName(java.lang.CharSequence p0) { return null; }
        @android.annotation.RequiresPermission("android.permission.REQUEST_COMPANION_SELF_MANAGED")
        @android.annotation.NonNull
        public android.companion.AssociationRequest.Builder setSelfManaged(boolean p0) { return null; }
        @android.annotation.RequiresPermission("android.permission.REQUEST_COMPANION_SELF_MANAGED")
        @android.annotation.NonNull
        public android.companion.AssociationRequest.Builder setForceConfirmation(boolean p0) { return null; }
        @android.annotation.RequiresPermission("android.permission.ASSOCIATE_COMPANION_DEVICES")
        @android.annotation.SuppressLint("UnflaggedApi")
        @android.annotation.NonNull
        public android.companion.AssociationRequest.Builder setSkipRoleGrant(boolean p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.RequiresPermission("android.permission.REQUEST_COMPANION_SELF_MANAGED")
        @android.annotation.FlaggedApi("android.companion.association_device_icon")
        public android.companion.AssociationRequest.Builder setDeviceIcon(android.graphics.drawable.Icon p0) { return null; }
        @android.annotation.NonNull
        public android.companion.AssociationRequest build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceProfile {
    }
}
