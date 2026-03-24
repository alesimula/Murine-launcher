package android.health.connect.backuprestore;

@android.annotation.FlaggedApi("com.android.healthfitness.flags.cloud_backup_and_restore")
public final class GetLatestMetadataForBackupResponse implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.backuprestore.GetLatestMetadataForBackupResponse> CREATOR = null;
    public GetLatestMetadataForBackupResponse(int p0, android.health.connect.backuprestore.BackupMetadata p1) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public int getCurrentVersion() { return 0; }
    @android.annotation.NonNull
    public android.health.connect.backuprestore.BackupMetadata getMetadata() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
