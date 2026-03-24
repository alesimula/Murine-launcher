package android.health.connect;

@android.annotation.FlaggedApi("com.android.healthfitness.flags.personal_health_record")
public final class ReadMedicalResourcesInitialRequest extends android.health.connect.ReadMedicalResourcesRequest {
    ReadMedicalResourcesInitialRequest() { super(); }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getDataSourceIds() { return null; }
    public int getMedicalResourceType() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.ReadMedicalResourcesInitialRequest p0) {}
        public Builder(android.health.connect.ReadMedicalResourcesInitialRequest.Builder p0) {}
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.health.connect.ReadMedicalResourcesInitialRequest.Builder addDataSourceId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.ReadMedicalResourcesInitialRequest.Builder addDataSourceIds(java.util.Set<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.ReadMedicalResourcesInitialRequest build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.ReadMedicalResourcesInitialRequest.Builder clearDataSourceIds() { return null; }
        @android.annotation.NonNull
        public android.health.connect.ReadMedicalResourcesInitialRequest.Builder setMedicalResourceType(int p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.ReadMedicalResourcesInitialRequest.Builder setPageSize(int p0) { return null; }
    }
}
