package android.companion;

public final class AssociationRequest implements android.os.Parcelable {
    private static final java.lang.String LOG_TAG = null;
    public static final java.lang.String DEVICE_PROFILE_WATCH = "android.app.role.COMPANION_DEVICE_WATCH";
    private boolean mSingleDevice;
    private java.util.List<android.companion.DeviceFilter<?>> mDeviceFilters;
    @android.companion.AssociationRequest.DeviceProfile
    private java.lang.String mDeviceProfile;
    private java.lang.String mCallingPackage;
    private java.lang.String mDeviceProfilePrivilegesDescription;
    private long mCreationTime;
    private boolean mSkipPrompt;
    public static final android.os.Parcelable.Creator<android.companion.AssociationRequest> CREATOR = null;
    private void onConstructed() {}
    public void setCallingPackage(java.lang.String p0) {}
    public void setDeviceProfilePrivilegesDescription(java.lang.String p0) {}
    public void setSkipPrompt(boolean p0) {}
    public boolean isSingleDevice() { return false; }
    public java.util.List<android.companion.DeviceFilter<?>> getDeviceFilters() { return null; }
    public AssociationRequest(boolean p0, java.util.List<android.companion.DeviceFilter<?>> p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, long p5, boolean p6) {}
    @android.companion.AssociationRequest.DeviceProfile
    public java.lang.String getDeviceProfile() { return null; }
    public java.lang.String getCallingPackage() { return null; }
    public java.lang.String getDeviceProfilePrivilegesDescription() { return null; }
    public long getCreationTime() { return 0L; }
    public boolean isSkipPrompt() { return false; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    AssociationRequest(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}

    public static final class Builder extends android.provider.OneTimeUseBuilder<android.companion.AssociationRequest> {
        private boolean mSingleDevice;
        private java.util.ArrayList<android.companion.DeviceFilter<?>> mDeviceFilters;
        private java.lang.String mDeviceProfile;
        public Builder() { super(); }
        public android.companion.AssociationRequest.Builder setSingleDevice(boolean p0) { return null; }
        public android.companion.AssociationRequest.Builder addDeviceFilter(android.companion.DeviceFilter<?> p0) { return null; }
        public android.companion.AssociationRequest.Builder setDeviceProfile(java.lang.String p0) { return null; }
        public android.companion.AssociationRequest build() { return null; }
    }

    public static @interface DeviceProfile {
    }
}
