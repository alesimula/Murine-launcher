package android.health.connect;

public final class ReadMedicalResourcesRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.ReadMedicalResourcesRequest> CREATOR = null;
    ReadMedicalResourcesRequest() {}
    public int describeContents() { return 0; }
    public int getMedicalResourceType() { return 0; }
    public int getPageSize() { return 0; }
    public long getPageToken() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0) {}
        public Builder(android.health.connect.ReadMedicalResourcesRequest.Builder p0) {}
        public Builder(android.health.connect.ReadMedicalResourcesRequest p0) {}
        @android.annotation.NonNull
        public android.health.connect.ReadMedicalResourcesRequest build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.ReadMedicalResourcesRequest.Builder setMedicalResourceType(int p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.ReadMedicalResourcesRequest.Builder setPageSize(int p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.ReadMedicalResourcesRequest.Builder setPageToken(long p0) { return null; }
    }
}
