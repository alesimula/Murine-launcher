package android.health.connect;

@android.annotation.FlaggedApi("com.android.healthfitness.flags.personal_health_record")
public final class ReadMedicalResourcesResponse implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.ReadMedicalResourcesResponse> CREATOR = null;
    public ReadMedicalResourcesResponse(java.util.List<android.health.connect.datatypes.MedicalResource> p0, java.lang.String p1, int p2) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.datatypes.MedicalResource> getMedicalResources() { return null; }
    @android.annotation.Nullable
    public java.lang.String getNextPageToken() { return null; }
    public int getRemainingCount() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
