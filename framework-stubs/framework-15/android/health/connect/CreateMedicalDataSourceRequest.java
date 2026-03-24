package android.health.connect;

public final class CreateMedicalDataSourceRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.CreateMedicalDataSourceRequest> CREATOR = null;
    CreateMedicalDataSourceRequest() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getDisplayName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getFhirBaseUri() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1) {}
        public Builder(android.health.connect.CreateMedicalDataSourceRequest.Builder p0) {}
        public Builder(android.health.connect.CreateMedicalDataSourceRequest p0) {}
        @android.annotation.NonNull
        public android.health.connect.CreateMedicalDataSourceRequest build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.CreateMedicalDataSourceRequest.Builder setDisplayName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.CreateMedicalDataSourceRequest.Builder setFhirBaseUri(java.lang.String p0) { return null; }
    }
}
