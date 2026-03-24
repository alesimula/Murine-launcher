package android.health.connect;

public final class HealthConnectDataState implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.HealthConnectDataState> CREATOR = null;
    public static final int MIGRATION_STATE_ALLOWED = 4;
    public static final int MIGRATION_STATE_APP_UPGRADE_REQUIRED = 1;
    public static final int MIGRATION_STATE_COMPLETE = 5;
    public static final int MIGRATION_STATE_IDLE = 0;
    public static final int MIGRATION_STATE_IN_PROGRESS = 3;
    public static final int MIGRATION_STATE_MODULE_UPGRADE_REQUIRED = 2;
    public static final int RESTORE_ERROR_FETCHING_DATA = 2;
    public static final int RESTORE_ERROR_NONE = 0;
    public static final int RESTORE_ERROR_UNKNOWN = 1;
    public static final int RESTORE_ERROR_VERSION_DIFF = 3;
    public static final int RESTORE_STATE_IDLE = 0;
    public static final int RESTORE_STATE_IN_PROGRESS = 2;
    public static final int RESTORE_STATE_PENDING = 1;
    HealthConnectDataState() {}
    public int describeContents() { return 0; }
    public int getDataMigrationState() { return 0; }
    public int getDataRestoreError() { return 0; }
    public int getDataRestoreState() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
