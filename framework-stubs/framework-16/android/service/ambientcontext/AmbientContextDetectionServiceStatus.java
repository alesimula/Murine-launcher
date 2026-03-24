package android.service.ambientcontext;

@android.annotation.SystemApi
public final class AmbientContextDetectionServiceStatus implements android.os.Parcelable {
    public static final java.lang.String STATUS_RESPONSE_BUNDLE_KEY = "android.app.ambientcontext.AmbientContextServiceStatusBundleKey";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.ambientcontext.AmbientContextDetectionServiceStatus> CREATOR = null;
    AmbientContextDetectionServiceStatus(int p0, java.lang.String p1) {}
    public int getStatusCode() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    AmbientContextDetectionServiceStatus(android.os.Parcel p0) {}

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.service.ambientcontext.AmbientContextDetectionServiceStatus.Builder setStatusCode(int p0) { return null; }
        @android.annotation.NonNull
        public android.service.ambientcontext.AmbientContextDetectionServiceStatus build() { return null; }
    }
}
