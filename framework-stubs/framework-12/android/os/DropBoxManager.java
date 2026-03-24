package android.os;

public class DropBoxManager {
    private static final java.lang.String TAG = "DropBoxManager";
    private final android.content.Context mContext = null;
    private final com.android.internal.os.IDropBoxManagerService mService = null;
    public static final int IS_EMPTY = 1;
    public static final int IS_TEXT = 2;
    public static final int IS_GZIPPED = 4;
    private static final int HAS_BYTE_ARRAY = 8;
    public static final java.lang.String ACTION_DROPBOX_ENTRY_ADDED = "android.intent.action.DROPBOX_ENTRY_ADDED";
    public static final java.lang.String EXTRA_TAG = "tag";
    public static final java.lang.String EXTRA_TIME = "time";
    public static final java.lang.String EXTRA_DROPPED_COUNT = "android.os.extra.DROPPED_COUNT";
    public DropBoxManager(android.content.Context p0, com.android.internal.os.IDropBoxManagerService p1) {}
    protected DropBoxManager() {}
    public void addText(java.lang.String p0, java.lang.String p1) {}
    public void addData(java.lang.String p0, byte[] p1, int p2) {}
    public void addFile(java.lang.String p0, java.io.File p1, int p2) throws java.io.IOException {}
    public boolean isTagEnabled(java.lang.String p0) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_LOGS", "android.permission.PACKAGE_USAGE_STATS"})
    public android.os.DropBoxManager.Entry getNextEntry(java.lang.String p0, long p1) { return null; }

    public static class Entry implements android.os.Parcelable, java.io.Closeable {
        private final java.lang.String mTag = null;
        private final long mTimeMillis = 0L;
        private final byte[] mData = null;
        private final android.os.ParcelFileDescriptor mFileDescriptor = null;
        private final int mFlags = 0;
        public static final android.os.Parcelable.Creator<android.os.DropBoxManager.Entry> CREATOR = null;
        public Entry(java.lang.String p0, long p1) {}
        public Entry(java.lang.String p0, long p1, java.lang.String p2) {}
        public Entry(java.lang.String p0, long p1, byte[] p2, int p3) {}
        public Entry(java.lang.String p0, long p1, android.os.ParcelFileDescriptor p2, int p3) {}
        public Entry(java.lang.String p0, long p1, java.io.File p2, int p3) throws java.io.IOException {}
        public void close() {}
        public java.lang.String getTag() { return null; }
        public long getTimeMillis() { return 0L; }
        public int getFlags() { return 0; }
        public java.lang.String getText(int p0) { return null; }
        public java.io.InputStream getInputStream() throws java.io.IOException { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }
}
