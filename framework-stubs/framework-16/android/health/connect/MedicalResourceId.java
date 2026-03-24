package android.health.connect;

@android.annotation.FlaggedApi("com.android.healthfitness.flags.personal_health_record")
public final class MedicalResourceId implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.MedicalResourceId> CREATOR = null;
    public MedicalResourceId(java.lang.String p0, int p1, java.lang.String p2) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public static android.health.connect.MedicalResourceId fromFhirReference(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.NonNull
    public java.lang.String getDataSourceId() { return null; }
    @android.annotation.NonNull
    public java.lang.String getFhirResourceId() { return null; }
    public int getFhirResourceType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
