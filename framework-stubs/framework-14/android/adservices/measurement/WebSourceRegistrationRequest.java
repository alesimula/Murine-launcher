package android.adservices.measurement;

public final class WebSourceRegistrationRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.measurement.WebSourceRegistrationRequest> CREATOR = null;
    WebSourceRegistrationRequest() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.adservices.measurement.WebSourceParams> getSourceParams() { return null; }
    @android.annotation.NonNull
    public android.net.Uri getTopOriginUri() { return null; }
    @android.annotation.Nullable
    public android.view.InputEvent getInputEvent() { return null; }
    @android.annotation.Nullable
    public android.net.Uri getAppDestination() { return null; }
    @android.annotation.Nullable
    public android.net.Uri getWebDestination() { return null; }
    @android.annotation.Nullable
    public android.net.Uri getVerifiedDestination() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.util.List<android.adservices.measurement.WebSourceParams> p0, android.net.Uri p1) {}
        @android.annotation.NonNull
        public android.adservices.measurement.WebSourceRegistrationRequest.Builder setInputEvent(android.view.InputEvent p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.measurement.WebSourceRegistrationRequest.Builder setAppDestination(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.measurement.WebSourceRegistrationRequest.Builder setWebDestination(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.measurement.WebSourceRegistrationRequest.Builder setVerifiedDestination(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.measurement.WebSourceRegistrationRequest build() { return null; }
    }
}
