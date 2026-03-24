package android.app.compat;

@android.annotation.SystemApi
public final class PackageOverride {
    public static final int VALUE_UNDEFINED = 0;
    public static final int VALUE_ENABLED = 1;
    public static final int VALUE_DISABLED = 2;
    private final long mMinVersionCode = 0L;
    private final long mMaxVersionCode = 0L;
    private final boolean mEnabled = false;
    private PackageOverride(long p0, long p1, boolean p2) {}
    public int evaluate(long p0) { return 0; }
    public int evaluateForAllVersions() { return 0; }
    public long getMinVersionCode() { return 0L; }
    public long getMaxVersionCode() { return 0L; }
    public boolean isEnabled() { return false; }
    public void writeToParcel(android.os.Parcel p0) {}
    public static android.app.compat.PackageOverride createFromParcel(android.os.Parcel p0) { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private long mMinVersionCode;
        private long mMaxVersionCode;
        private boolean mEnabled;
        public Builder() {}
        public android.app.compat.PackageOverride.Builder setMinVersionCode(long p0) { return null; }
        public android.app.compat.PackageOverride.Builder setMaxVersionCode(long p0) { return null; }
        public android.app.compat.PackageOverride.Builder setEnabled(boolean p0) { return null; }
        public android.app.compat.PackageOverride build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EvaluatedOverride {
    }
}
