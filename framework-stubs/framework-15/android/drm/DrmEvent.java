package android.drm;

@java.lang.Deprecated
public class DrmEvent {
    public static final int TYPE_ALL_RIGHTS_REMOVED = 1001;
    public static final int TYPE_DRM_INFO_PROCESSED = 1002;
    public static final java.lang.String DRM_INFO_STATUS_OBJECT = "drm_info_status_object";
    public static final java.lang.String DRM_INFO_OBJECT = "drm_info_object";
    protected DrmEvent(int p0, int p1, java.lang.String p2, java.util.HashMap<java.lang.String, java.lang.Object> p3) {}
    protected DrmEvent(int p0, int p1, java.lang.String p2) {}
    public int getUniqueId() { return 0; }
    public int getType() { return 0; }
    public java.lang.String getMessage() { return null; }
    public java.lang.Object getAttribute(java.lang.String p0) { return null; }
}
