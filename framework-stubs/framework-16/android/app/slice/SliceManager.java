package android.app.slice;

@java.lang.Deprecated
public class SliceManager {
    public static final java.lang.String ACTION_REQUEST_SLICE_PERMISSION = "com.android.intent.action.REQUEST_SLICE_PERMISSION";
    public static final java.lang.String CATEGORY_SLICE = "android.app.slice.category.SLICE";
    public static final java.lang.String SLICE_METADATA_KEY = "android.metadata.SLICE_URI";
    public SliceManager(android.content.Context p0, android.os.Handler p1) throws android.os.ServiceManager.ServiceNotFoundException {}
    public void pinSlice(android.net.Uri p0, java.util.Set<android.app.slice.SliceSpec> p1) {}
    public void unpinSlice(android.net.Uri p0) {}
    public boolean hasSliceAccess() { return false; }
    @android.annotation.NonNull
    public java.util.Set<android.app.slice.SliceSpec> getPinnedSpecs(android.net.Uri p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.Uri> getPinnedSlices() { return null; }
    @android.annotation.NonNull
    public java.util.Collection<android.net.Uri> getSliceDescendants(android.net.Uri p0) { return null; }
    @android.annotation.Nullable
    public android.app.slice.Slice bindSlice(android.net.Uri p0, java.util.Set<android.app.slice.SliceSpec> p1) { return null; }
    @android.annotation.Nullable
    public android.net.Uri mapIntentToUri(android.content.Intent p0) { return null; }
    @android.annotation.Nullable
    public android.app.slice.Slice bindSlice(android.content.Intent p0, java.util.Set<android.app.slice.SliceSpec> p1) { return null; }
    public int checkSlicePermission(android.net.Uri p0, int p1, int p2) { return 0; }
    public void grantSlicePermission(java.lang.String p0, android.net.Uri p1) {}
    public void revokeSlicePermission(java.lang.String p0, android.net.Uri p1) {}
    public void enforceSlicePermission(android.net.Uri p0, int p1, int p2, java.lang.String[] p3) {}
    public void grantPermissionFromUser(android.net.Uri p0, java.lang.String p1, boolean p2) {}
}
