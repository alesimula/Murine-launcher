package android.health.connect;

public final class UpsertMedicalResourceRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.UpsertMedicalResourceRequest> CREATOR = null;
    UpsertMedicalResourceRequest() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getData() { return null; }
    @android.annotation.NonNull
    public long getDataSourceId() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(long p0, java.lang.String p1) {}
        public Builder(android.health.connect.UpsertMedicalResourceRequest.Builder p0) {}
        public Builder(android.health.connect.UpsertMedicalResourceRequest p0) {}
        @android.annotation.NonNull
        public android.health.connect.UpsertMedicalResourceRequest build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.UpsertMedicalResourceRequest.Builder setData(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.UpsertMedicalResourceRequest.Builder setDataSourceId(long p0) { return null; }
    }
}
