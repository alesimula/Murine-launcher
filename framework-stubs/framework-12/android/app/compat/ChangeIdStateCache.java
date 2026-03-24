package android.app.compat;

public final class ChangeIdStateCache extends android.app.PropertyInvalidatedCache<android.app.compat.ChangeIdStateQuery, java.lang.Boolean> {
    private static final java.lang.String CACHE_KEY = "cache_key.is_compat_change_enabled";
    private static final int MAX_ENTRIES = 20;
    private static boolean sDisabled;
    public ChangeIdStateCache() { super(0, (java.lang.String)null); }
    public static void disable() {}
    public static void invalidate() {}
    protected java.lang.Boolean recompute(android.app.compat.ChangeIdStateQuery p0) { return null; }
}
