package android.app;

public class BroadcastStickyCache {
    public static final java.lang.String[] STICKY_BROADCAST_ACTIONS = null;
    public static final android.util.ArrayMap<java.lang.String, java.lang.String> sActionApiNameMap = null;
    public BroadcastStickyCache() {}
    public static boolean useCache(android.content.IntentFilter p0) { return false; }
    public static void invalidateCache(java.lang.String p0) {}
    public static void invalidateAllCaches() {}
    @android.annotation.Nullable
    public static android.content.Intent getIntent(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.IntentFilter p3, java.lang.String p4, int p5, int p6) { return null; }
    public static void clearCacheForTest() {}
    public static void dumpCacheInfo(android.os.ParcelFileDescriptor p0) {}

    private static final record StickyBroadcastFilter(android.content.IntentFilter filter, java.lang.String action) {
        public final java.lang.String toString() { return null; }
        public final int hashCode() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        @android.annotation.NonNull
        public android.content.IntentFilter filter() { return null; }
        @android.annotation.NonNull
        public java.lang.String action() { return null; }
    }
}
