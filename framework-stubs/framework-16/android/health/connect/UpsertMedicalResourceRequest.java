package android.health.connect;

@android.annotation.FlaggedApi("com.android.healthfitness.flags.personal_health_record")
public final class UpsertMedicalResourceRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.UpsertMedicalResourceRequest> CREATOR = null;
    UpsertMedicalResourceRequest() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getData() { return null; }
    @android.annotation.NonNull
    public java.lang.String getDataSourceId() { return null; }
    @android.annotation.NonNull
    public android.health.connect.datatypes.FhirVersion getFhirVersion() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(android.health.connect.UpsertMedicalResourceRequest p0) {}
        public Builder(android.health.connect.UpsertMedicalResourceRequest.Builder p0) {}
        public Builder(java.lang.String p0, android.health.connect.datatypes.FhirVersion p1, java.lang.String p2) {}
        @android.annotation.NonNull
        public android.health.connect.UpsertMedicalResourceRequest build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.UpsertMedicalResourceRequest.Builder setData(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.UpsertMedicalResourceRequest.Builder setDataSourceId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.UpsertMedicalResourceRequest.Builder setFhirVersion(android.health.connect.datatypes.FhirVersion p0) { return null; }
    }
}
