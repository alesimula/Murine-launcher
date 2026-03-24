package android.app;

public final class BackgroundStartPrivileges {
    public static final android.app.BackgroundStartPrivileges NONE = null;
    public static final android.app.BackgroundStartPrivileges ALLOW_BAL = null;
    public static final android.app.BackgroundStartPrivileges ALLOW_FGS = null;
    public static android.app.BackgroundStartPrivileges allowBackgroundActivityStarts(android.os.IBinder p0) { return null; }
    @android.annotation.NonNull
    public android.app.BackgroundStartPrivileges merge(android.app.BackgroundStartPrivileges p0) { return null; }
    @android.annotation.NonNull
    public static android.app.BackgroundStartPrivileges merge(java.util.List<android.app.BackgroundStartPrivileges> p0) { return null; }
    public boolean allowsBackgroundActivityStarts() { return false; }
    public boolean allowsBackgroundFgsStarts() { return false; }
    public boolean allowsAny() { return false; }
    public boolean allowsNothing() { return false; }
    @android.annotation.Nullable
    public android.os.IBinder getOriginatingToken() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
