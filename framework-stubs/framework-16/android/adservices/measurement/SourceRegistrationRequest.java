package android.adservices.measurement;

public final class SourceRegistrationRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.measurement.SourceRegistrationRequest> CREATOR = null;
    SourceRegistrationRequest() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public android.view.InputEvent getInputEvent() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.Uri> getRegistrationUris() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.util.List<android.net.Uri> p0) {}
        @android.annotation.NonNull
        public android.adservices.measurement.SourceRegistrationRequest build() { return null; }
        @android.annotation.NonNull
        public android.adservices.measurement.SourceRegistrationRequest.Builder setInputEvent(android.view.InputEvent p0) { return null; }
    }
}
