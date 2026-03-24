package android.adservices.ondevicepersonalization;

public final class RequestLogRecord implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.ondevicepersonalization.RequestLogRecord> CREATOR = null;
    RequestLogRecord() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.content.ContentValues> getRows() { return null; }
    @android.annotation.NonNull
    public java.time.Instant getTime() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.RequestLogRecord.Builder addRow(android.content.ContentValues p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.RequestLogRecord build() { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.RequestLogRecord.Builder setRows(java.util.List<android.content.ContentValues> p0) { return null; }
    }
}
