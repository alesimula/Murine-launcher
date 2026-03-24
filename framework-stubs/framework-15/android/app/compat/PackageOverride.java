package android.app.compat;

@android.annotation.SystemApi
public final class PackageOverride {
    public static final int VALUE_UNDEFINED = 0;
    public static final int VALUE_ENABLED = 1;
    public static final int VALUE_DISABLED = 2;
    public int evaluate(long p0) { return 0; }
    public int evaluateForAllVersions() { return 0; }
    public long getMinVersionCode() { return 0L; }
    public long getMaxVersionCode() { return 0L; }
    public boolean isEnabled() { return false; }
    public void writeToParcel(android.os.Parcel p0) {}
    public static android.app.compat.PackageOverride createFromParcel(android.os.Parcel p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.app.compat.PackageOverride.Builder setMinVersionCode(long p0) { return null; }
        @android.annotation.NonNull
        public android.app.compat.PackageOverride.Builder setMaxVersionCode(long p0) { return null; }
        @android.annotation.NonNull
        public android.app.compat.PackageOverride.Builder setEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.compat.PackageOverride build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EvaluatedOverride {
    }
}
