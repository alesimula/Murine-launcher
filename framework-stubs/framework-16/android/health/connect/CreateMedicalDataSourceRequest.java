package android.health.connect;

@android.annotation.FlaggedApi("com.android.healthfitness.flags.personal_health_record")
public final class CreateMedicalDataSourceRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.CreateMedicalDataSourceRequest> CREATOR = null;
    CreateMedicalDataSourceRequest() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getDisplayName() { return null; }
    @android.annotation.NonNull
    public android.net.Uri getFhirBaseUri() { return null; }
    @android.annotation.NonNull
    public android.health.connect.datatypes.FhirVersion getFhirVersion() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(android.health.connect.CreateMedicalDataSourceRequest p0) {}
        public Builder(android.health.connect.CreateMedicalDataSourceRequest.Builder p0) {}
        public Builder(android.net.Uri p0, java.lang.String p1, android.health.connect.datatypes.FhirVersion p2) {}
        @android.annotation.NonNull
        public android.health.connect.CreateMedicalDataSourceRequest build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.CreateMedicalDataSourceRequest.Builder setDisplayName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.CreateMedicalDataSourceRequest.Builder setFhirBaseUri(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.CreateMedicalDataSourceRequest.Builder setFhirVersion(android.health.connect.datatypes.FhirVersion p0) { return null; }
    }
}
