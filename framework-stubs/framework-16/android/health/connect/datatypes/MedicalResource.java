package android.health.connect.datatypes;

@android.annotation.FlaggedApi("com.android.healthfitness.flags.personal_health_record")
public final class MedicalResource implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.datatypes.MedicalResource> CREATOR = null;
    public static final int MEDICAL_RESOURCE_TYPE_ALLERGIES_INTOLERANCES = 2;
    public static final int MEDICAL_RESOURCE_TYPE_CONDITIONS = 7;
    public static final int MEDICAL_RESOURCE_TYPE_LABORATORY_RESULTS = 6;
    public static final int MEDICAL_RESOURCE_TYPE_MEDICATIONS = 9;
    public static final int MEDICAL_RESOURCE_TYPE_PERSONAL_DETAILS = 10;
    public static final int MEDICAL_RESOURCE_TYPE_PRACTITIONER_DETAILS = 11;
    public static final int MEDICAL_RESOURCE_TYPE_PREGNANCY = 3;
    public static final int MEDICAL_RESOURCE_TYPE_PROCEDURES = 8;
    public static final int MEDICAL_RESOURCE_TYPE_SOCIAL_HISTORY = 4;
    public static final int MEDICAL_RESOURCE_TYPE_VACCINES = 1;
    public static final int MEDICAL_RESOURCE_TYPE_VISITS = 12;
    public static final int MEDICAL_RESOURCE_TYPE_VITAL_SIGNS = 5;
    MedicalResource() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getDataSourceId() { return null; }
    @android.annotation.NonNull
    public android.health.connect.datatypes.FhirResource getFhirResource() { return null; }
    @android.annotation.NonNull
    public android.health.connect.datatypes.FhirVersion getFhirVersion() { return null; }
    @android.annotation.NonNull
    public android.health.connect.MedicalResourceId getId() { return null; }
    public int getType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(android.health.connect.datatypes.MedicalResource p0) {}
        public Builder(android.health.connect.datatypes.MedicalResource.Builder p0) {}
        public Builder(int p0, java.lang.String p1, android.health.connect.datatypes.FhirVersion p2, android.health.connect.datatypes.FhirResource p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalResource build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalResource.Builder setDataSourceId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalResource.Builder setFhirResource(android.health.connect.datatypes.FhirResource p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalResource.Builder setFhirVersion(android.health.connect.datatypes.FhirVersion p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MedicalResource.Builder setType(int p0) { return null; }
    }
}
