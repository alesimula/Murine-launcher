package android.app.wearable;

@android.annotation.SystemApi
public final class WearableSensingDataRequest implements android.os.Parcelable {
    public static final java.lang.String REQUEST_BUNDLE_KEY = "android.app.wearable.WearableSensingDataRequestBundleKey";
    public static final java.lang.String REQUEST_STATUS_CALLBACK_BUNDLE_KEY = "android.app.wearable.WearableSensingDataRequestStatusCallbackBundleKey";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.wearable.WearableSensingDataRequest> CREATOR = null;
    public int getDataType() { return 0; }
    @android.annotation.NonNull
    public android.os.PersistableBundle getRequestDetails() { return null; }
    public int getDataSize() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public java.lang.String toExpandedString() { return null; }
    public static int getMaxRequestSize() { return 0; }
    @android.annotation.NonNull
    public static java.time.Duration getRateLimitWindowSize() { return null; }
    public static int getRateLimit() { return 0; }

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.app.wearable.WearableSensingDataRequest.Builder setRequestDetails(android.os.PersistableBundle p0) { return null; }
        @android.annotation.NonNull
        public android.app.wearable.WearableSensingDataRequest build() { return null; }
    }
}
