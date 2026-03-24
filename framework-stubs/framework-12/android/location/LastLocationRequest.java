package android.location;

@android.annotation.SystemApi
public final class LastLocationRequest implements android.os.Parcelable {
    private final boolean mHiddenFromAppOps = false;
    private final boolean mAdasGnssBypass = false;
    private final boolean mLocationSettingsIgnored = false;
    public static final android.os.Parcelable.Creator<android.location.LastLocationRequest> CREATOR = null;
    private LastLocationRequest(boolean p0, boolean p1, boolean p2) {}
    public boolean isHiddenFromAppOps() { return false; }
    public boolean isAdasGnssBypass() { return false; }
    public boolean isLocationSettingsIgnored() { return false; }
    public boolean isBypass() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private boolean mHiddenFromAppOps;
        private boolean mAdasGnssBypass;
        private boolean mLocationSettingsIgnored;
        public Builder() {}
        public Builder(android.location.LastLocationRequest p0) {}
        @android.annotation.RequiresPermission("android.permission.UPDATE_APP_OPS_STATS")
        public android.location.LastLocationRequest.Builder setHiddenFromAppOps(boolean p0) { return null; }
        @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
        public android.location.LastLocationRequest.Builder setAdasGnssBypass(boolean p0) { return null; }
        @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
        public android.location.LastLocationRequest.Builder setLocationSettingsIgnored(boolean p0) { return null; }
        public android.location.LastLocationRequest build() { return null; }
    }
}
