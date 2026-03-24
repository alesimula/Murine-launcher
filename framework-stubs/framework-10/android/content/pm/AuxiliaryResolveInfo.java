package android.content.pm;

public final class AuxiliaryResolveInfo {
    public final android.content.ComponentName installFailureActivity = null;
    public final boolean needsPhaseTwo = false;
    public final java.lang.String token = null;
    public final android.content.Intent failureIntent = null;
    public final java.util.List<android.content.pm.AuxiliaryResolveInfo.AuxiliaryFilter> filters = null;
    public AuxiliaryResolveInfo(java.lang.String p0, boolean p1, android.content.Intent p2, java.util.List<android.content.pm.AuxiliaryResolveInfo.AuxiliaryFilter> p3) {}
    public AuxiliaryResolveInfo(android.content.ComponentName p0, android.content.Intent p1, java.util.List<android.content.pm.AuxiliaryResolveInfo.AuxiliaryFilter> p2) {}
    public AuxiliaryResolveInfo(android.content.ComponentName p0, java.lang.String p1, long p2, java.lang.String p3) {}

    public static final class AuxiliaryFilter extends android.content.IntentFilter {
        public final android.content.pm.InstantAppResolveInfo resolveInfo = null;
        public final java.lang.String packageName = null;
        public final long versionCode = 0L;
        public final java.lang.String splitName = null;
        public final android.os.Bundle extras = null;
        public AuxiliaryFilter(android.content.IntentFilter p0, android.content.pm.InstantAppResolveInfo p1, java.lang.String p2, android.os.Bundle p3) { super(); }
        public AuxiliaryFilter(android.content.pm.InstantAppResolveInfo p0, java.lang.String p1, android.os.Bundle p2) { super(); }
        public AuxiliaryFilter(java.lang.String p0, long p1, java.lang.String p2) { super(); }
        public java.lang.String toString() { return null; }
    }
}
