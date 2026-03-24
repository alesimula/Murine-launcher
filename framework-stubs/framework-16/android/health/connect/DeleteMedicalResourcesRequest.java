package android.health.connect;

@android.annotation.FlaggedApi("com.android.healthfitness.flags.personal_health_record")
public final class DeleteMedicalResourcesRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.DeleteMedicalResourcesRequest> CREATOR = null;
    DeleteMedicalResourcesRequest() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getDataSourceIds() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.Integer> getMedicalResourceTypes() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public Builder(android.health.connect.DeleteMedicalResourcesRequest p0) {}
        public Builder(android.health.connect.DeleteMedicalResourcesRequest.Builder p0) {}
        @android.annotation.NonNull
        public android.health.connect.DeleteMedicalResourcesRequest.Builder addDataSourceId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.DeleteMedicalResourcesRequest.Builder addMedicalResourceType(int p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.DeleteMedicalResourcesRequest build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.DeleteMedicalResourcesRequest.Builder clearDataSourceIds() { return null; }
        @android.annotation.NonNull
        public android.health.connect.DeleteMedicalResourcesRequest.Builder clearMedicalResourceTypes() { return null; }
    }
}
