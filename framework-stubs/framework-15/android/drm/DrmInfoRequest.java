package android.drm;

@java.lang.Deprecated
public class DrmInfoRequest {
    public static final int TYPE_REGISTRATION_INFO = 1;
    public static final int TYPE_UNREGISTRATION_INFO = 2;
    public static final int TYPE_RIGHTS_ACQUISITION_INFO = 3;
    public static final int TYPE_RIGHTS_ACQUISITION_PROGRESS_INFO = 4;
    public static final java.lang.String ACCOUNT_ID = "account_id";
    public static final java.lang.String SUBSCRIPTION_ID = "subscription_id";
    public DrmInfoRequest(int p0, java.lang.String p1) {}
    public java.lang.String getMimeType() { return null; }
    public int getInfoType() { return 0; }
    public void put(java.lang.String p0, java.lang.Object p1) {}
    public java.lang.Object get(java.lang.String p0) { return null; }
    public java.util.Iterator<java.lang.String> keyIterator() { return null; }
    public java.util.Iterator<java.lang.Object> iterator() { return null; }
    boolean isValid() { return false; }
    static boolean isValidType(int p0) { return false; }
}
