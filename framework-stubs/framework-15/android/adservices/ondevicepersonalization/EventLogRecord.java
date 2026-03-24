package android.adservices.ondevicepersonalization;

public final class EventLogRecord implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.ondevicepersonalization.EventLogRecord> CREATOR = null;
    EventLogRecord() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public android.content.ContentValues getData() { return null; }
    @android.annotation.Nullable
    public android.adservices.ondevicepersonalization.RequestLogRecord getRequestLogRecord() { return null; }
    public int getRowIndex() { return 0; }
    @android.annotation.NonNull
    public java.time.Instant getTime() { return null; }
    public int getType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.EventLogRecord build() { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.EventLogRecord.Builder setData(android.content.ContentValues p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.EventLogRecord.Builder setRequestLogRecord(android.adservices.ondevicepersonalization.RequestLogRecord p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.EventLogRecord.Builder setRowIndex(int p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.EventLogRecord.Builder setType(int p0) { return null; }
    }
}
