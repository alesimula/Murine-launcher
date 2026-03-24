package android.health.connect.datatypes;

@android.annotation.FlaggedApi("com.android.healthfitness.flags.personal_health_record")
public final class FhirVersion implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.datatypes.FhirVersion> CREATOR = null;
    FhirVersion() {}
    public int describeContents() { return 0; }
    public int getMajor() { return 0; }
    public int getMinor() { return 0; }
    public int getPatch() { return 0; }
    public boolean isSupportedFhirVersion() { return false; }
    @android.annotation.NonNull
    public static android.health.connect.datatypes.FhirVersion parseFhirVersion(java.lang.String p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
