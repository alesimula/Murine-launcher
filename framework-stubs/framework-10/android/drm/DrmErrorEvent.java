package android.drm;

public class DrmErrorEvent extends android.drm.DrmEvent {
    public static final int TYPE_RIGHTS_NOT_INSTALLED = 2001;
    public static final int TYPE_RIGHTS_RENEWAL_NOT_ALLOWED = 2002;
    public static final int TYPE_NOT_SUPPORTED = 2003;
    public static final int TYPE_OUT_OF_MEMORY = 2004;
    public static final int TYPE_NO_INTERNET_CONNECTION = 2005;
    public static final int TYPE_PROCESS_DRM_INFO_FAILED = 2006;
    public static final int TYPE_REMOVE_ALL_RIGHTS_FAILED = 2007;
    public static final int TYPE_ACQUIRE_DRM_INFO_FAILED = 2008;
    public DrmErrorEvent(int p0, int p1, java.lang.String p2) { super(0, 0, (java.lang.String)null); }
    public DrmErrorEvent(int p0, int p1, java.lang.String p2, java.util.HashMap<java.lang.String, java.lang.Object> p3) { super(0, 0, (java.lang.String)null); }
    private void checkTypeValidity(int p0) {}
}
