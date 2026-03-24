package android.health.connect.changelog;

public final class ChangeLogsResponse implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.changelog.ChangeLogsResponse> CREATOR = null;
    ChangeLogsResponse() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.changelog.ChangeLogsResponse.DeletedLog> getDeletedLogs() { return null; }
    @android.annotation.FlaggedApi("com.android.healthfitness.flags.phr_change_logs")
    @android.annotation.NonNull
    public java.util.List<android.health.connect.changelog.ChangeLogsResponse.DeletedMedicalResource> getDeletedMedicalResources() { return null; }
    @android.annotation.NonNull
    public java.lang.String getNextChangesToken() { return null; }
    @android.annotation.FlaggedApi("com.android.healthfitness.flags.phr_change_logs")
    @android.annotation.NonNull
    public java.util.List<android.health.connect.datatypes.MedicalResource> getUpsertedMedicalResources() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.datatypes.Record> getUpsertedRecords() { return null; }
    public boolean hasMorePages() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class DeletedLog {
        @android.annotation.FlaggedApi("com.android.healthfitness.flags.phr_change_logs")
        public DeletedLog(java.lang.String p0, java.time.Instant p1) {}
        @java.lang.Deprecated
        @android.annotation.FlaggedApi("com.android.healthfitness.flags.phr_change_logs")
        public DeletedLog(java.lang.String p0, long p1) {}
        @android.annotation.NonNull
        public java.lang.String getDeletedRecordId() { return null; }
        @android.annotation.NonNull
        public java.time.Instant getDeletedTime() { return null; }
    }

    @android.annotation.FlaggedApi("com.android.healthfitness.flags.phr_change_logs")
    public static final class DeletedMedicalResource {
        public DeletedMedicalResource(android.health.connect.MedicalResourceId p0, java.time.Instant p1) {}
        @android.annotation.NonNull
        public java.lang.String getDataSourceId() { return null; }
        @android.annotation.NonNull
        public android.health.connect.MedicalResourceId getDeletedMedicalResourceId() { return null; }
        @android.annotation.NonNull
        public java.time.Instant getDeletedTime() { return null; }
    }
}
