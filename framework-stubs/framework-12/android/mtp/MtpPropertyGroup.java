package android.mtp;

class MtpPropertyGroup {
    private static final java.lang.String TAG = null;
    private final android.mtp.MtpPropertyGroup.Property[] mProperties = null;
    private java.lang.String[] mColumns;
    private static final java.lang.String PATH_WHERE = "_data=?";
    public MtpPropertyGroup(int[] p0) {}
    private android.mtp.MtpPropertyGroup.Property createProperty(int p0, java.util.ArrayList<java.lang.String> p1) { return null; }
    public int getPropertyList(android.content.ContentProviderClient p0, java.lang.String p1, android.mtp.MtpStorageManager.MtpObject p2, android.mtp.MtpPropertyList p3) { return 0; }
    private native java.lang.String format_date_time(long p0);

    private class Property {
        int code;
        int type;
        int column;
        Property(android.mtp.MtpPropertyGroup p0, int p1, int p2, int p3) {}
    }
}
