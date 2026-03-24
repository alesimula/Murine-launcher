package android.app.backup;

@android.annotation.SystemApi
public final class BackupRestoreEventLogger {
    public static final int DATA_TYPES_ALLOWED = 15;
    public BackupRestoreEventLogger(int p0) {}
    public void logItemsBackedUp(java.lang.String p0, int p1) {}
    public void logItemsBackupFailed(java.lang.String p0, int p1, java.lang.String p2) {}
    public void logBackupMetadata(java.lang.String p0, java.lang.String p1) {}
    public void logItemsRestored(java.lang.String p0, int p1) {}
    public void logItemsRestoreFailed(java.lang.String p0, int p1, java.lang.String p2) {}
    public void logRestoreMetadata(java.lang.String p0, java.lang.String p1) {}
    public java.util.List<android.app.backup.BackupRestoreEventLogger.DataTypeResult> getLoggingResults() { return null; }
    public int getOperationType() { return 0; }
    public void clearData() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BackupRestoreDataType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BackupRestoreError {
    }

    public static final class DataTypeResult implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.backup.BackupRestoreEventLogger.DataTypeResult> CREATOR = null;
        public DataTypeResult(java.lang.String p0) {}
        public java.lang.String getDataType() { return null; }
        public int getSuccessCount() { return 0; }
        public int getFailCount() { return 0; }
        public java.util.Map<java.lang.String, java.lang.Integer> getErrors() { return null; }
        public byte[] getMetadataHash() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
