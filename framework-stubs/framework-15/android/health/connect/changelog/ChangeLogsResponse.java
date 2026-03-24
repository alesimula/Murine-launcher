package android.health.connect.changelog;

public final class ChangeLogsResponse implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.changelog.ChangeLogsResponse> CREATOR = null;
    ChangeLogsResponse() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.changelog.ChangeLogsResponse.DeletedLog> getDeletedLogs() { return null; }
    @android.annotation.NonNull
    public java.lang.String getNextChangesToken() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.datatypes.Record> getUpsertedRecords() { return null; }
    public boolean hasMorePages() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class DeletedLog {
        public DeletedLog(java.lang.String p0, long p1) {}
        @android.annotation.NonNull
        public java.lang.String getDeletedRecordId() { return null; }
        @android.annotation.NonNull
        public java.time.Instant getDeletedTime() { return null; }
    }
}
