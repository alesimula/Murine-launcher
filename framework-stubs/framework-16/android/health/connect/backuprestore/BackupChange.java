package android.health.connect.backuprestore;

@android.annotation.FlaggedApi("com.android.healthfitness.flags.cloud_backup_and_restore")
public final class BackupChange implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.backuprestore.BackupChange> CREATOR = null;
    BackupChange() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getChangeId() { return null; }
    @android.annotation.Nullable
    public byte[] getData() { return null; }
    public boolean isDeletion() { return false; }
    @android.annotation.NonNull
    public static android.health.connect.backuprestore.BackupChange ofDeletion(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public static android.health.connect.backuprestore.BackupChange ofUpsertion(java.lang.String p0, byte[] p1) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
