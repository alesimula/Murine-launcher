package android.health.connect.datatypes;

@android.annotation.FlaggedApi("com.android.healthfitness.flags.personal_health_record")
public final class MedicalDataSource implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.datatypes.MedicalDataSource> CREATOR = null;
    MedicalDataSource() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getDisplayName() { return null; }
    @android.annotation.NonNull
    public android.net.Uri getFhirBaseUri() { return null; }
    @android.annotation.NonNull
    public android.health.connect.datatypes.FhirVersion getFhirVersion() { return null; }
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    @android.annotation.Nullable
    public java.time.Instant getLastDataUpdateTime() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(android.health.connect.datatypes.MedicalDataSource p0) {}
        public Builder(android.health.connect.datatypes.MedicalDataSource.Builder p0) {}
        public Builder(java.lang.String p0, java.lang.String p1, android.net.Uri p2, java.lang.String p3, android.health.connect.datatypes.FhirVersion p4) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalDataSource build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalDataSource.Builder setDisplayName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalDataSource.Builder setFhirBaseUri(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalDataSource.Builder setFhirVersion(android.health.connect.datatypes.FhirVersion p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalDataSource.Builder setId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalDataSource.Builder setLastDataUpdateTime(java.time.Instant p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalDataSource.Builder setPackageName(java.lang.String p0) { return null; }
    }
}
