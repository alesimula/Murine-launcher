package android.media;

@java.lang.Deprecated
public class MediaScanner implements java.lang.AutoCloseable {
    @java.lang.Deprecated
    private static final java.lang.String[] FILES_PRESCAN_PROJECTION = null;
    @java.lang.Deprecated
    private final android.content.Context mContext = null;
    @java.lang.Deprecated
    private final java.lang.String mPackageName = null;
    @java.lang.Deprecated
    private final android.net.Uri mAudioUri = null;
    @java.lang.Deprecated
    private final android.net.Uri mFilesUri = null;
    @java.lang.Deprecated
    private java.lang.String mDefaultRingtoneFilename;
    @java.lang.Deprecated
    private java.lang.String mDefaultNotificationFilename;
    @java.lang.Deprecated
    private java.lang.String mDefaultAlarmAlertFilename;
    @java.lang.Deprecated
    private android.media.MediaInserter mMediaInserter;
    @java.lang.Deprecated
    private final android.media.MediaScanner.MyMediaScannerClient mClient = null;
    @java.lang.Deprecated
    public MediaScanner(android.content.Context p0, java.lang.String p1) {}
    @java.lang.Deprecated
    private boolean isDrmEnabled() { return false; }
    @java.lang.Deprecated
    private void prescan(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
    @java.lang.Deprecated
    private void postscan(java.lang.String[] p0) throws android.os.RemoteException {}
    @java.lang.Deprecated
    public android.net.Uri scanSingleFile(java.lang.String p0, java.lang.String p1) { return null; }
    @java.lang.Deprecated
    public static boolean isNoMediaPath(java.lang.String p0) { return false; }
    @java.lang.Deprecated
    android.media.MediaScanner.FileEntry makeEntryFor(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    private void setLocale(java.lang.String p0) {}
    public void close() {}

    private static class FileEntry {
        @java.lang.Deprecated
        long mRowId;
        @java.lang.Deprecated
        boolean mLastModifiedChanged;
        @java.lang.Deprecated
        FileEntry(long p0, java.lang.String p1, long p2, int p3) {}
    }

    private class MyMediaScannerClient implements android.media.MediaScannerClient {
        @java.lang.Deprecated
        private java.lang.String mMimeType;
        @java.lang.Deprecated
        private int mFileType;
        @java.lang.Deprecated
        private java.lang.String mPath;
        @java.lang.Deprecated
        private boolean mIsDrm;
        @java.lang.Deprecated
        private boolean mNoMedia;
        public MyMediaScannerClient(android.media.MediaScanner p0) {}
        @java.lang.Deprecated
        public android.media.MediaScanner.FileEntry beginFile(java.lang.String p0, java.lang.String p1, long p2, long p3, boolean p4, boolean p5) { return null; }
        @java.lang.Deprecated
        public void scanFile(java.lang.String p0, long p1, long p2, boolean p3, boolean p4) {}
        @java.lang.Deprecated
        public android.net.Uri doScanFile(java.lang.String p0, java.lang.String p1, long p2, long p3, boolean p4, boolean p5, boolean p6) { return null; }
        @java.lang.Deprecated
        public void handleStringTag(java.lang.String p0, java.lang.String p1) {}
        @java.lang.Deprecated
        public void setMimeType(java.lang.String p0) {}
        @java.lang.Deprecated
        private android.content.ContentValues toValues() { return null; }
        @java.lang.Deprecated
        private android.net.Uri endFile(android.media.MediaScanner.FileEntry p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6) throws android.os.RemoteException { return null; }
        @java.lang.Deprecated
        private int getFileTypeFromDrm(java.lang.String p0) { return 0; }
    }
}
