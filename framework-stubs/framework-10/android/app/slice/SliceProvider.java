package android.app.slice;

public abstract class SliceProvider extends android.content.ContentProvider {
    public static final java.lang.String SLICE_TYPE = "vnd.android.slice";
    private static final java.lang.String TAG = "SliceProvider";
    public static final java.lang.String EXTRA_BIND_URI = "slice_uri";
    public static final java.lang.String EXTRA_SUPPORTED_SPECS = "supported_specs";
    public static final java.lang.String METHOD_SLICE = "bind_slice";
    public static final java.lang.String METHOD_MAP_INTENT = "map_slice";
    public static final java.lang.String METHOD_MAP_ONLY_INTENT = "map_only";
    public static final java.lang.String METHOD_PIN = "pin";
    public static final java.lang.String METHOD_UNPIN = "unpin";
    public static final java.lang.String METHOD_GET_DESCENDANTS = "get_descendants";
    public static final java.lang.String METHOD_GET_PERMISSIONS = "get_permissions";
    public static final java.lang.String EXTRA_INTENT = "slice_intent";
    public static final java.lang.String EXTRA_SLICE = "slice";
    public static final java.lang.String EXTRA_SLICE_DESCENDANTS = "slice_descendants";
    public static final java.lang.String EXTRA_PKG = "pkg";
    public static final java.lang.String EXTRA_PROVIDER_PKG = "provider_pkg";
    public static final java.lang.String EXTRA_RESULT = "result";
    private static final boolean DEBUG = false;
    private static final long SLICE_BIND_ANR = 2000L;
    private final java.lang.String[] mAutoGrantPermissions = null;
    private java.lang.String mCallback;
    private android.app.slice.SliceManager mSliceManager;
    private final java.lang.Runnable mAnr = null;
    public SliceProvider(java.lang.String... p0) { super(); }
    public SliceProvider() { super(); }
    public void attachInfo(android.content.Context p0, android.content.pm.ProviderInfo p1) {}
    public android.app.slice.Slice onBindSlice(android.net.Uri p0, java.util.Set<android.app.slice.SliceSpec> p1) { return null; }
    @java.lang.Deprecated
    public android.app.slice.Slice onBindSlice(android.net.Uri p0, java.util.List<android.app.slice.SliceSpec> p1) { return null; }
    public void onSlicePinned(android.net.Uri p0) {}
    public void onSliceUnpinned(android.net.Uri p0) {}
    public java.util.Collection<android.net.Uri> onGetSliceDescendants(android.net.Uri p0) { return null; }
    public android.net.Uri onMapIntentToUri(android.content.Intent p0) { return null; }
    public android.app.PendingIntent onCreatePermissionRequest(android.net.Uri p0) { return null; }
    public final int update(android.net.Uri p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3) { return 0; }
    public final int delete(android.net.Uri p0, java.lang.String p1, java.lang.String[] p2) { return 0; }
    public final android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) { return null; }
    public final android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, android.os.CancellationSignal p5) { return null; }
    public final android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, android.os.Bundle p2, android.os.CancellationSignal p3) { return null; }
    public final android.net.Uri insert(android.net.Uri p0, android.content.ContentValues p1) { return null; }
    public final java.lang.String getType(android.net.Uri p0) { return null; }
    public android.os.Bundle call(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) { return null; }
    private java.util.Collection<android.net.Uri> handleGetDescendants(android.net.Uri p0) { return null; }
    private void handlePinSlice(android.net.Uri p0) {}
    private void handleUnpinSlice(android.net.Uri p0) {}
    private android.app.slice.Slice handleBindSlice(android.net.Uri p0, java.util.List<android.app.slice.SliceSpec> p1, java.lang.String p2, int p3, int p4) { return null; }
    public android.app.slice.Slice createPermissionSlice(android.content.Context p0, android.net.Uri p1, java.lang.String p2) { return null; }
    public static android.app.PendingIntent createPermissionIntent(android.content.Context p0, android.net.Uri p1, java.lang.String p2) { return null; }
    public static java.lang.CharSequence getPermissionString(android.content.Context p0, java.lang.String p1) { return null; }
    private android.app.slice.Slice onBindSliceStrict(android.net.Uri p0, java.util.List<android.app.slice.SliceSpec> p1) { return null; }
}
