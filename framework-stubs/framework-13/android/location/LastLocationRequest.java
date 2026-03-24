package android.location;

@android.annotation.SystemApi
public final class LastLocationRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.location.LastLocationRequest> CREATOR = null;
    @android.annotation.SystemApi
    public boolean isHiddenFromAppOps() { return false; }
    @android.annotation.SystemApi
    public boolean isAdasGnssBypass() { return false; }
    @android.annotation.SystemApi
    public boolean isLocationSettingsIgnored() { return false; }
    public boolean isBypass() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.location.LastLocationRequest p0) {}
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.UPDATE_APP_OPS_STATS")
        public android.location.LastLocationRequest.Builder setHiddenFromAppOps(boolean p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.LOCATION_BYPASS")
        public android.location.LastLocationRequest.Builder setAdasGnssBypass(boolean p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.LOCATION_BYPASS")
        public android.location.LastLocationRequest.Builder setLocationSettingsIgnored(boolean p0) { return null; }
        public android.location.LastLocationRequest build() { return null; }
    }
}
