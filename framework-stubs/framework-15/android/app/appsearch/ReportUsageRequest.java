package android.app.appsearch;

public final class ReportUsageRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.ReportUsageRequest> CREATOR = null;
    ReportUsageRequest() {}
    public final int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getDocumentId() { return null; }
    @android.annotation.NonNull
    public java.lang.String getNamespace() { return null; }
    public long getUsageTimestampMillis() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1) {}
        @android.annotation.NonNull
        public android.app.appsearch.ReportUsageRequest build() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.ReportUsageRequest.Builder setUsageTimestampMillis(long p0) { return null; }
    }
}
