package android.health.connect.datatypes;

@android.annotation.FlaggedApi("com.android.healthfitness.flags.personal_health_record")
public final class FhirResource implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.datatypes.FhirResource> CREATOR = null;
    public static final int FHIR_RESOURCE_TYPE_ALLERGY_INTOLERANCE = 2;
    public static final int FHIR_RESOURCE_TYPE_CONDITION = 4;
    public static final int FHIR_RESOURCE_TYPE_ENCOUNTER = 12;
    public static final int FHIR_RESOURCE_TYPE_IMMUNIZATION = 1;
    public static final int FHIR_RESOURCE_TYPE_LOCATION = 13;
    public static final int FHIR_RESOURCE_TYPE_MEDICATION = 6;
    public static final int FHIR_RESOURCE_TYPE_MEDICATION_REQUEST = 7;
    public static final int FHIR_RESOURCE_TYPE_MEDICATION_STATEMENT = 8;
    public static final int FHIR_RESOURCE_TYPE_OBSERVATION = 3;
    public static final int FHIR_RESOURCE_TYPE_ORGANIZATION = 14;
    public static final int FHIR_RESOURCE_TYPE_PATIENT = 9;
    public static final int FHIR_RESOURCE_TYPE_PRACTITIONER = 10;
    public static final int FHIR_RESOURCE_TYPE_PRACTITIONER_ROLE = 11;
    public static final int FHIR_RESOURCE_TYPE_PROCEDURE = 5;
    FhirResource() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getData() { return null; }
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    public int getType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(android.health.connect.datatypes.FhirResource p0) {}
        public Builder(android.health.connect.datatypes.FhirResource.Builder p0) {}
        public Builder(int p0, java.lang.String p1, java.lang.String p2) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.FhirResource build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.FhirResource.Builder setData(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.FhirResource.Builder setId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.FhirResource.Builder setType(int p0) { return null; }
    }
}
