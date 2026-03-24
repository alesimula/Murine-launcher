package android.net.wifi;

@android.annotation.SystemApi
public final class WifiMigration {
    private static final java.lang.String LEGACY_WIFI_STORE_DIRECTORY_NAME = "wifi";
    public static final int STORE_FILE_SHARED_GENERAL = 0;
    public static final int STORE_FILE_SHARED_SOFTAP = 1;
    public static final int STORE_FILE_USER_GENERAL = 2;
    public static final int STORE_FILE_USER_NETWORK_SUGGESTIONS = 3;
    private static final android.util.SparseArray<java.lang.String> STORE_ID_TO_FILE_NAME = null;
    private static java.io.File getLegacyWifiSharedDirectory() { return null; }
    private static java.io.File getLegacyWifiUserDirectory(int p0) { return null; }
    private static android.util.AtomicFile getSharedAtomicFile(int p0) { return null; }
    private static android.util.AtomicFile getUserAtomicFile(int p0, int p1) { return null; }
    private WifiMigration() {}
    public static java.io.InputStream convertAndRetrieveSharedConfigStoreFile(int p0) { return null; }
    public static void removeSharedConfigStoreFile(int p0) {}
    public static java.io.InputStream convertAndRetrieveUserConfigStoreFile(int p0, android.os.UserHandle p1) { return null; }
    public static void removeUserConfigStoreFile(int p0, android.os.UserHandle p1) {}
    public static android.net.wifi.WifiMigration.SettingsMigrationData loadFromSettings(android.content.Context p0) { return null; }

    public static final class SettingsMigrationData implements android.os.Parcelable {
        private final boolean mScanAlwaysAvailable = false;
        private final boolean mP2pFactoryResetPending = false;
        private final java.lang.String mP2pDeviceName = null;
        private final boolean mSoftApTimeoutEnabled = false;
        private final boolean mWakeupEnabled = false;
        private final boolean mScanThrottleEnabled = false;
        private final boolean mVerboseLoggingEnabled = false;
        public static final android.os.Parcelable.Creator<android.net.wifi.WifiMigration.SettingsMigrationData> CREATOR = null;
        private SettingsMigrationData(boolean p0, boolean p1, java.lang.String p2, boolean p3, boolean p4, boolean p5, boolean p6) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean isScanAlwaysAvailable() { return false; }
        public boolean isP2pFactoryResetPending() { return false; }
        public java.lang.String getP2pDeviceName() { return null; }
        public boolean isSoftApTimeoutEnabled() { return false; }
        public boolean isWakeUpEnabled() { return false; }
        public boolean isScanThrottleEnabled() { return false; }
        public boolean isVerboseLoggingEnabled() { return false; }

        public static final class Builder {
            private boolean mScanAlwaysAvailable;
            private boolean mP2pFactoryResetPending;
            private java.lang.String mP2pDeviceName;
            private boolean mSoftApTimeoutEnabled;
            private boolean mWakeupEnabled;
            private boolean mScanThrottleEnabled;
            private boolean mVerboseLoggingEnabled;
            public Builder() {}
            public android.net.wifi.WifiMigration.SettingsMigrationData.Builder setScanAlwaysAvailable(boolean p0) { return null; }
            public android.net.wifi.WifiMigration.SettingsMigrationData.Builder setP2pFactoryResetPending(boolean p0) { return null; }
            public android.net.wifi.WifiMigration.SettingsMigrationData.Builder setP2pDeviceName(java.lang.String p0) { return null; }
            public android.net.wifi.WifiMigration.SettingsMigrationData.Builder setSoftApTimeoutEnabled(boolean p0) { return null; }
            public android.net.wifi.WifiMigration.SettingsMigrationData.Builder setWakeUpEnabled(boolean p0) { return null; }
            public android.net.wifi.WifiMigration.SettingsMigrationData.Builder setScanThrottleEnabled(boolean p0) { return null; }
            public android.net.wifi.WifiMigration.SettingsMigrationData.Builder setVerboseLoggingEnabled(boolean p0) { return null; }
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
