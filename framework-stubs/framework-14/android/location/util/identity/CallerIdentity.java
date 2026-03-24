package android.location.util.identity;

public final class CallerIdentity {
    public static android.location.util.identity.CallerIdentity forTest(int p0, int p1, java.lang.String p2, java.lang.String p3) { return null; }
    public static android.location.util.identity.CallerIdentity forTest(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return null; }
    public static android.location.util.identity.CallerIdentity forAggregation(android.location.util.identity.CallerIdentity p0) { return null; }
    public static android.location.util.identity.CallerIdentity fromContext(android.content.Context p0) { return null; }
    public static android.location.util.identity.CallerIdentity fromBinder(android.content.Context p0, java.lang.String p1, java.lang.String p2) { return null; }
    public static android.location.util.identity.CallerIdentity fromBinder(android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return null; }
    public static android.location.util.identity.CallerIdentity fromBinderUnsafe(java.lang.String p0, java.lang.String p1) { return null; }
    public static android.location.util.identity.CallerIdentity fromBinderUnsafe(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    public int getUid() { return 0; }
    public int getPid() { return 0; }
    public int getUserId() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getAttributionTag() { return null; }
    public java.lang.String getListenerId() { return null; }
    public boolean isSystemServer() { return false; }
    public boolean isMyUser() { return false; }
    public boolean isMyUid() { return false; }
    public boolean isMyProcess() { return false; }
    public android.os.WorkSource addToWorkSource(android.os.WorkSource p0) { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    private static class Loader {
    }
}
