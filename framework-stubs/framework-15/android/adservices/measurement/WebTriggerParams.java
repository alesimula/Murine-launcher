package android.adservices.measurement;

public final class WebTriggerParams implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.measurement.WebTriggerParams> CREATOR = null;
    WebTriggerParams() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.net.Uri getRegistrationUri() { return null; }
    public boolean isDebugKeyAllowed() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(android.net.Uri p0) {}
        @android.annotation.NonNull
        public android.adservices.measurement.WebTriggerParams build() { return null; }
        @android.annotation.NonNull
        public android.adservices.measurement.WebTriggerParams.Builder setDebugKeyAllowed(boolean p0) { return null; }
    }
}
