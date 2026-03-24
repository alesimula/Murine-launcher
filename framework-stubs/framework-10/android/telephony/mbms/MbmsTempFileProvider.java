package android.telephony.mbms;

public class MbmsTempFileProvider extends android.content.ContentProvider {
    public static final java.lang.String TEMP_FILE_ROOT_PREF_FILE_NAME = "MbmsTempFileRootPrefs";
    public static final java.lang.String TEMP_FILE_ROOT_PREF_NAME = "mbms_temp_file_root";
    private java.lang.String mAuthority;
    private android.content.Context mContext;
    public MbmsTempFileProvider() { super(); }
    public boolean onCreate() { return false; }
    public android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) { return null; }
    public java.lang.String getType(android.net.Uri p0) { return null; }
    public android.net.Uri insert(android.net.Uri p0, android.content.ContentValues p1) { return null; }
    public int delete(android.net.Uri p0, java.lang.String p1, java.lang.String[] p2) { return 0; }
    public int update(android.net.Uri p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3) { return 0; }
    public android.os.ParcelFileDescriptor openFile(android.net.Uri p0, java.lang.String p1) throws java.io.FileNotFoundException { return null; }
    public void attachInfo(android.content.Context p0, android.content.pm.ProviderInfo p1) {}
    public static android.net.Uri getUriForFile(android.content.Context p0, java.lang.String p1, java.io.File p2) { return null; }
    public static java.io.File getFileForUri(android.content.Context p0, java.lang.String p1, android.net.Uri p2) throws java.io.FileNotFoundException { return null; }
    public static java.io.File getEmbmsTempFileDir(android.content.Context p0) { return null; }
}
