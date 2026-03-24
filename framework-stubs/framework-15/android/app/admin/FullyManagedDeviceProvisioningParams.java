package android.app.admin;

@android.annotation.SystemApi
public final class FullyManagedDeviceProvisioningParams implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.admin.FullyManagedDeviceProvisioningParams> CREATOR = null;
    @android.annotation.NonNull
    public android.content.ComponentName getDeviceAdminComponentName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getOwnerName() { return null; }
    public boolean isLeaveAllSystemAppsEnabled() { return false; }
    @android.annotation.Nullable
    public java.lang.String getTimeZone() { return null; }
    public long getLocalTime() { return 0L; }
    @android.annotation.Nullable
    @android.annotation.SuppressLint("UseIcu")
    public java.util.Locale getLocale() { return null; }
    public boolean canDeviceOwnerGrantSensorsPermissions() { return false; }
    @android.annotation.NonNull
    public android.os.PersistableBundle getAdminExtras() { return null; }
    public boolean isDemoDevice() { return false; }
    public void logParams(java.lang.String p0) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        boolean mDeviceOwnerCanGrantSensorsPermissions;
        boolean mDemoDevice;
        public Builder(android.content.ComponentName p0, java.lang.String p1) {}
        @android.annotation.NonNull
        public android.app.admin.FullyManagedDeviceProvisioningParams.Builder setLeaveAllSystemAppsEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.admin.FullyManagedDeviceProvisioningParams.Builder setTimeZone(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.admin.FullyManagedDeviceProvisioningParams.Builder setLocalTime(long p0) { return null; }
        @android.annotation.NonNull
        public android.app.admin.FullyManagedDeviceProvisioningParams.Builder setLocale(java.util.Locale p0) { return null; }
        @android.annotation.NonNull
        public android.app.admin.FullyManagedDeviceProvisioningParams.Builder setCanDeviceOwnerGrantSensorsPermissions(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.admin.FullyManagedDeviceProvisioningParams.Builder setAdminExtras(android.os.PersistableBundle p0) { return null; }
        @android.annotation.NonNull
        public android.app.admin.FullyManagedDeviceProvisioningParams.Builder setDemoDevice(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.admin.FullyManagedDeviceProvisioningParams build() { return null; }
    }
}
