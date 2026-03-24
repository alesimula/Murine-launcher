package android.health.connect;

@android.annotation.FlaggedApi("com.android.healthfitness.flags.personal_health_record")
public final class MedicalResourceTypeInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.MedicalResourceTypeInfo> CREATOR = null;
    public MedicalResourceTypeInfo(int p0, java.util.Set<android.health.connect.datatypes.MedicalDataSource> p1) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<android.health.connect.datatypes.MedicalDataSource> getContributingDataSources() { return null; }
    public int getMedicalResourceType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
