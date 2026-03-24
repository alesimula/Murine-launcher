package android.net.wifi;

@android.annotation.SystemApi
public final class WifiMigration {
    public static final int STORE_FILE_SHARED_GENERAL = 0;
    public static final int STORE_FILE_SHARED_SOFTAP = 1;
    public static final int STORE_FILE_USER_GENERAL = 2;
    public static final int STORE_FILE_USER_NETWORK_SUGGESTIONS = 3;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.net.wifi.flags.legacy_keystore_to_wifi_blobstore_migration_read_only")
    public static final int KEYSTORE_MIGRATION_SUCCESS_MIGRATION_COMPLETE = 0;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.net.wifi.flags.legacy_keystore_to_wifi_blobstore_migration_read_only")
    public static final int KEYSTORE_MIGRATION_SUCCESS_MIGRATION_NOT_NEEDED = 1;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.net.wifi.flags.legacy_keystore_to_wifi_blobstore_migration_read_only")
    public static final int KEYSTORE_MIGRATION_FAILURE_ENCOUNTERED_EXCEPTION = 2;
    @android.annotation.Nullable
    public static java.io.InputStream convertAndRetrieveSharedConfigStoreFile(int p0) { return null; }
    public static void removeSharedConfigStoreFile(int p0) {}
    @android.annotation.Nullable
    public static java.io.InputStream convertAndRetrieveUserConfigStoreFile(int p0, android.os.UserHandle p1) { return null; }
    public static void removeUserConfigStoreFile(int p0, android.os.UserHandle p1) {}
    @android.annotation.NonNull
    public static android.net.wifi.WifiMigration.SettingsMigrationData loadFromSettings(android.content.Context p0) { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.net.wifi.flags.legacy_keystore_to_wifi_blobstore_migration_read_only")
    public static void migrateLegacyKeystoreToWifiBlobstore(java.util.concurrent.Executor p0, java.util.function.IntConsumer p1) {}
    public static int migrateLegacyKeystoreToWifiBlobstoreInternal() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface KeystoreMigrationStatus {
    }

    public static final class SettingsMigrationData implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.net.wifi.WifiMigration.SettingsMigrationData> CREATOR = null;
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean isScanAlwaysAvailable() { return false; }
        public boolean isP2pFactoryResetPending() { return false; }
        @android.annotation.Nullable
        public java.lang.String getP2pDeviceName() { return null; }
        public boolean isSoftApTimeoutEnabled() { return false; }
        public boolean isWakeUpEnabled() { return false; }
        public boolean isScanThrottleEnabled() { return false; }
        public boolean isVerboseLoggingEnabled() { return false; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.net.wifi.WifiMigration.SettingsMigrationData.Builder setScanAlwaysAvailable(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.net.wifi.WifiMigration.SettingsMigrationData.Builder setP2pFactoryResetPending(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.net.wifi.WifiMigration.SettingsMigrationData.Builder setP2pDeviceName(java.lang.String p0) { return null; }
            @android.annotation.NonNull
            public android.net.wifi.WifiMigration.SettingsMigrationData.Builder setSoftApTimeoutEnabled(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.net.wifi.WifiMigration.SettingsMigrationData.Builder setWakeUpEnabled(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.net.wifi.WifiMigration.SettingsMigrationData.Builder setScanThrottleEnabled(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.net.wifi.WifiMigration.SettingsMigrationData.Builder setVerboseLoggingEnabled(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.net.wifi.WifiMigration.SettingsMigrationData build() { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SharedStoreFileId {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserStoreFileId {
    }
}
