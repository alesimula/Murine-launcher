package android.media;

@android.annotation.FlaggedApi("com.android.media.flags.enable_suggested_device_api")
public final class SuggestedDeviceInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.SuggestedDeviceInfo> CREATOR = null;
    @android.annotation.NonNull
    public java.lang.String getDeviceDisplayName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getRouteId() { return null; }
    public int getType() { return 0; }
    @android.annotation.NonNull
    public android.os.Bundle getExtras() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1, int p2) {}
        @android.annotation.NonNull
        public android.media.SuggestedDeviceInfo build() { return null; }
        @android.annotation.NonNull
        public android.media.SuggestedDeviceInfo.Builder setExtras(android.os.Bundle p0) { return null; }
    }
}
