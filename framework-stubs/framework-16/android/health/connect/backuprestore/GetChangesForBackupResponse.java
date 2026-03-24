package android.health.connect.backuprestore;

@android.annotation.FlaggedApi("com.android.healthfitness.flags.cloud_backup_and_restore")
public final class GetChangesForBackupResponse implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.backuprestore.GetChangesForBackupResponse> CREATOR = null;
    public GetChangesForBackupResponse(int p0, java.util.List<android.health.connect.backuprestore.BackupChange> p1, java.lang.String p2) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.backuprestore.BackupChange> getChanges() { return null; }
    public int getCurrentVersion() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getNextChangeToken() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
