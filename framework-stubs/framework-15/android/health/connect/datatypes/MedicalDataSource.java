package android.health.connect.datatypes;

public final class MedicalDataSource implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.datatypes.MedicalDataSource> CREATOR = null;
    MedicalDataSource() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getDisplayName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getFhirBaseUri() { return null; }
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
        public Builder(android.health.connect.datatypes.MedicalDataSource.Builder p0) {}
        public Builder(android.health.connect.datatypes.MedicalDataSource p0) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalDataSource build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalDataSource.Builder setDisplayName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalDataSource.Builder setFhirBaseUri(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalDataSource.Builder setId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalDataSource.Builder setPackageName(java.lang.String p0) { return null; }
    }
}
