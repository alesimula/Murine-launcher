package android.app.appsearch;

public final class ReportSystemUsageRequest {
    ReportSystemUsageRequest() {}
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getDatabaseName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getNamespace() { return null; }
    @android.annotation.NonNull
    public java.lang.String getDocumentId() { return null; }
    public long getUsageTimestampMillis() { return 0L; }

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
        @android.annotation.NonNull
        public android.app.appsearch.ReportSystemUsageRequest.Builder setUsageTimestampMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.ReportSystemUsageRequest build() { return null; }
    }
}
