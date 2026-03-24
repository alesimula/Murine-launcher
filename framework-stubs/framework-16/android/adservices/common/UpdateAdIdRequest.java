package android.adservices.common;

public final class UpdateAdIdRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.common.UpdateAdIdRequest> CREATOR = null;
    UpdateAdIdRequest() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getAdId() { return null; }
    public boolean isLimitAdTrackingEnabled() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.adservices.common.UpdateAdIdRequest build() { return null; }
        @android.annotation.NonNull
        public android.adservices.common.UpdateAdIdRequest.Builder setLimitAdTrackingEnabled(boolean p0) { return null; }
    }
}
