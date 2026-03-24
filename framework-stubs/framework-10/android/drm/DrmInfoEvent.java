package android.drm;

public class DrmInfoEvent extends android.drm.DrmEvent {
    public static final int TYPE_ALREADY_REGISTERED_BY_ANOTHER_ACCOUNT = 1;
    public static final int TYPE_REMOVE_RIGHTS = 2;
    public static final int TYPE_RIGHTS_INSTALLED = 3;
    public static final int TYPE_WAIT_FOR_RIGHTS = 4;
    public static final int TYPE_ACCOUNT_ALREADY_REGISTERED = 5;
    public static final int TYPE_RIGHTS_REMOVED = 6;
    public DrmInfoEvent(int p0, int p1, java.lang.String p2) { super(0, 0, (java.lang.String)null); }
    public DrmInfoEvent(int p0, int p1, java.lang.String p2, java.util.HashMap<java.lang.String, java.lang.Object> p3) { super(0, 0, (java.lang.String)null); }
    private void checkTypeValidity(int p0) {}
}
