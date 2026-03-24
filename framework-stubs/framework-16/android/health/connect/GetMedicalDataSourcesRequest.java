package android.health.connect;

@android.annotation.FlaggedApi("com.android.healthfitness.flags.personal_health_record")
public final class GetMedicalDataSourcesRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.GetMedicalDataSourcesRequest> CREATOR = null;
    GetMedicalDataSourcesRequest() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getPackageNames() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public Builder(android.health.connect.GetMedicalDataSourcesRequest p0) {}
        public Builder(android.health.connect.GetMedicalDataSourcesRequest.Builder p0) {}
        @android.annotation.NonNull
        public android.health.connect.GetMedicalDataSourcesRequest.Builder addPackageName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.GetMedicalDataSourcesRequest build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.GetMedicalDataSourcesRequest.Builder clearPackageNames() { return null; }
    }
}
