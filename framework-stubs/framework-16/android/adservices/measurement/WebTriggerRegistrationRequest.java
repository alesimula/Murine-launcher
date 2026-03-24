package android.adservices.measurement;

public final class WebTriggerRegistrationRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.measurement.WebTriggerRegistrationRequest> CREATOR = null;
    WebTriggerRegistrationRequest() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.net.Uri getDestination() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.adservices.measurement.WebTriggerParams> getTriggerParams() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.util.List<android.adservices.measurement.WebTriggerParams> p0, android.net.Uri p1) {}
        @android.annotation.NonNull
        public android.adservices.measurement.WebTriggerRegistrationRequest build() { return null; }
    }
}
