package android.health.connect.datatypes;

public final class MedicalResource implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.datatypes.MedicalResource> CREATOR = null;
    public static final int MEDICAL_RESOURCE_TYPE_IMMUNIZATION = 1;
    public static final int MEDICAL_RESOURCE_TYPE_UNKNOWN = 0;
    MedicalResource() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getData() { return null; }
    @android.annotation.NonNull
    public java.lang.String getDataSourceId() { return null; }
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    public int getType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) {}
        public Builder(android.health.connect.datatypes.MedicalResource.Builder p0) {}
        public Builder(android.health.connect.datatypes.MedicalResource p0) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalResource build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalResource.Builder setData(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalResource.Builder setDataSourceId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalResource.Builder setId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalResource.Builder setType(int p0) { return null; }
    }
}
