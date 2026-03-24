package android.net.http;

public class ConnectionMigrationOptions {
    public static final int MIGRATION_OPTION_DISABLED = 2;
    public static final int MIGRATION_OPTION_ENABLED = 1;
    public static final int MIGRATION_OPTION_UNSPECIFIED = 0;
    ConnectionMigrationOptions() {}
    public int getAllowNonDefaultNetworkUsage() { return 0; }
    public int getDefaultNetworkMigration() { return 0; }
    public int getPathDegradationMigration() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.http.ConnectionMigrationOptions build() { return null; }
        @android.annotation.NonNull
        public android.net.http.ConnectionMigrationOptions.Builder setAllowNonDefaultNetworkUsage(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.http.ConnectionMigrationOptions.Builder setDefaultNetworkMigration(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.http.ConnectionMigrationOptions.Builder setPathDegradationMigration(int p0) { return null; }
    }
}
