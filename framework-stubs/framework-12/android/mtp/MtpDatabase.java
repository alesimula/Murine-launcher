package android.mtp;

public class MtpDatabase implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = null;
    private static final int MAX_THUMB_SIZE = 204800;
    private final android.content.Context mContext = null;
    private final android.content.ContentProviderClient mMediaProvider = null;
    private final java.util.concurrent.atomic.AtomicBoolean mClosed = null;
    private final java.util.HashMap<java.lang.String, android.mtp.MtpStorage> mStorageMap = null;
    private final android.util.SparseArray<android.mtp.MtpPropertyGroup> mPropertyGroupsByProperty = null;
    private final android.util.SparseArray<android.mtp.MtpPropertyGroup> mPropertyGroupsByFormat = null;
    private android.content.SharedPreferences mDeviceProperties;
    private int mBatteryLevel;
    private int mBatteryScale;
    private int mDeviceType;
    private java.lang.String mHostType;
    private boolean mSkipThumbForHost;
    private android.mtp.MtpServer mServer;
    private android.mtp.MtpStorageManager mManager;
    private static final java.lang.String PATH_WHERE = "_data=?";
    private static final java.lang.String NO_MEDIA = ".nomedia";
    private static final int[] PLAYBACK_FORMATS = null;
    private static final int[] FILE_PROPERTIES = null;
    private static final int[] AUDIO_PROPERTIES = null;
    private static final int[] VIDEO_PROPERTIES = null;
    private static final int[] IMAGE_PROPERTIES = null;
    private static final int[] DEVICE_PROPERTIES = null;
    private android.content.BroadcastReceiver mBatteryReceiver;
    private long mNativeContext;
    private int[] getSupportedObjectProperties(int p0) { return null; }
    public static android.net.Uri getObjectPropertiesUri(int p0, java.lang.String p1) { return null; }
    private int[] getSupportedDeviceProperties() { return null; }
    private int[] getSupportedPlaybackFormats() { return null; }
    private int[] getSupportedCaptureFormats() { return null; }
    public MtpDatabase(android.content.Context p0, java.lang.String[] p1) {}
    public void setServer(android.mtp.MtpServer p0) {}
    public android.content.Context getContext() { return null; }
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    public void addStorage(android.os.storage.StorageVolume p0) {}
    public void removeStorage(android.os.storage.StorageVolume p0) {}
    private void initDeviceProperties(android.content.Context p0) {}
    public int beginSendObject(java.lang.String p0, int p1, int p2, int p3) { return 0; }
    private void endSendObject(int p0, boolean p1) {}
    private void rescanFile(java.lang.String p0, int p1, int p2) {}
    private int[] getObjectList(int p0, int p1, int p2) { return null; }
    public int getNumObjects(int p0, int p1, int p2) { return 0; }
    private android.mtp.MtpPropertyList getObjectPropertyList(int p0, int p1, int p2, int p3, int p4) { return null; }
    private int renameFile(int p0, java.lang.String p1) { return 0; }
    private int beginMoveObject(int p0, int p1, int p2) { return 0; }
    private void endMoveObject(int p0, int p1, int p2, int p3, int p4, boolean p5) {}
    private int beginCopyObject(int p0, int p1, int p2) { return 0; }
    private void endCopyObject(int p0, boolean p1) {}
    private static void updateMediaStore(android.content.Context p0, java.io.File p1) {}
    private int setObjectProperty(int p0, int p1, long p2, java.lang.String p3) { return 0; }
    private int getDeviceProperty(int p0, long[] p1, char[] p2) { return 0; }
    private int setDeviceProperty(int p0, long p1, java.lang.String p2) { return 0; }
    private boolean getObjectInfo(int p0, int[] p1, char[] p2, long[] p3) { return false; }
    private int getObjectFilePath(int p0, char[] p1, long[] p2) { return 0; }
    private int openFilePath(java.lang.String p0, boolean p1) { return 0; }
    private int getObjectFormat(int p0) { return 0; }
    private byte[] getThumbnailProcess(java.lang.String p0, android.graphics.Bitmap p1) { return null; }
    public boolean getThumbnailInfo(int p0, long[] p1) { return false; }
    public byte[] getThumbnailData(int p0) { return null; }
    private int beginDeleteObject(int p0) { return 0; }
    private void endDeleteObject(int p0, boolean p1) {}
    private void deleteFromMedia(android.mtp.MtpStorageManager.MtpObject p0, java.nio.file.Path p1, boolean p2) {}
    private int[] getObjectReferences(int p0) { return null; }
    private int setObjectReferences(int p0, int[] p1) { return 0; }
    private final native void native_setup();
    private final native void native_finalize();
}
