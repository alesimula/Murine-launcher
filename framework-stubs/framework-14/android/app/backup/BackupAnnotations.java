package android.app.backup;

public class BackupAnnotations {
    public BackupAnnotations() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BackupDestination {
        public static final int CLOUD = 0;
        public static final int DEVICE_TRANSFER = 1;
        public static final int ADB_BACKUP = 2;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OperationType {
        public static final int UNKNOWN = -1;
        public static final int BACKUP = 0;
        public static final int RESTORE = 1;
    }
}
