package android.app;

public final class StatsQuery {
    public static final int DIALECT_SQLITE = 1;
    public static final int DIALECT_UNKNOWN = 0;
    StatsQuery() {}
    public int getMinSqlClientVersion() { return 0; }
    @android.annotation.Nullable
    public byte[] getPolicyConfig() { return null; }
    @android.annotation.NonNull
    public java.lang.String getRawSql() { return null; }
    public int getSqlDialect() { return 0; }

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.app.StatsQuery build() { return null; }
        @android.annotation.NonNull
        public android.app.StatsQuery.Builder setMinSqlClientVersion(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.StatsQuery.Builder setPolicyConfig(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.app.StatsQuery.Builder setSqlDialect(int p0) { return null; }
    }
}
