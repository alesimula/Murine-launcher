package android.media;

@java.lang.Deprecated
public class MediaScanner implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "MediaScanner";
    @android.annotation.UnsupportedAppUsage
    private static final java.lang.String[] FILES_PRESCAN_PROJECTION = null;
    private static final java.lang.String[] ID_PROJECTION = null;
    private static final int FILES_PRESCAN_ID_COLUMN_INDEX = 0;
    private static final int FILES_PRESCAN_PATH_COLUMN_INDEX = 1;
    private static final int FILES_PRESCAN_FORMAT_COLUMN_INDEX = 2;
    private static final int FILES_PRESCAN_DATE_MODIFIED_COLUMN_INDEX = 3;
    private static final int FILES_PRESCAN_MEDIA_TYPE_COLUMN_INDEX = 4;
    private static final java.lang.String[] PLAYLIST_MEMBERS_PROJECTION = null;
    private static final int ID_PLAYLISTS_COLUMN_INDEX = 0;
    private static final int PATH_PLAYLISTS_COLUMN_INDEX = 1;
    private static final int DATE_MODIFIED_PLAYLISTS_COLUMN_INDEX = 2;
    private static final java.lang.String RINGTONES_DIR = "/ringtones/";
    private static final java.lang.String NOTIFICATIONS_DIR = "/notifications/";
    private static final java.lang.String ALARMS_DIR = "/alarms/";
    private static final java.lang.String MUSIC_DIR = "/music/";
    private static final java.lang.String PODCASTS_DIR = "/podcasts/";
    private static final java.lang.String AUDIOBOOKS_DIR = "/audiobooks/";
    public static final java.lang.String SCANNED_BUILD_PREFS_NAME = "MediaScanBuild";
    public static final java.lang.String LAST_INTERNAL_SCAN_FINGERPRINT = "lastScanFingerprint";
    private static final java.lang.String SYSTEM_SOUNDS_DIR = null;
    private static final java.lang.String OEM_SOUNDS_DIR = null;
    private static final java.lang.String PRODUCT_SOUNDS_DIR = null;
    private static java.lang.String sLastInternalScanFingerprint;
    private static final java.lang.String[] ID3_GENRES = null;
    private long mNativeContext;
    @android.annotation.UnsupportedAppUsage
    private final android.content.Context mContext = null;
    @android.annotation.UnsupportedAppUsage
    private final java.lang.String mPackageName = null;
    private final java.lang.String mVolumeName = null;
    private final android.content.ContentProviderClient mMediaProvider = null;
    @android.annotation.UnsupportedAppUsage
    private final android.net.Uri mAudioUri = null;
    private final android.net.Uri mVideoUri = null;
    private final android.net.Uri mImagesUri = null;
    private final android.net.Uri mPlaylistsUri = null;
    @android.annotation.UnsupportedAppUsage
    private final android.net.Uri mFilesUri = null;
    private final android.net.Uri mFilesFullUri = null;
    private final boolean mProcessPlaylists = false;
    private final boolean mProcessGenres = false;
    private int mMtpObjectHandle;
    private final java.util.concurrent.atomic.AtomicBoolean mClosed = null;
    private static final boolean ENABLE_BULK_INSERTS = true;
    private int mOriginalCount;
    private boolean mDefaultRingtoneSet;
    private boolean mDefaultNotificationSet;
    private boolean mDefaultAlarmSet;
    @android.annotation.UnsupportedAppUsage
    private java.lang.String mDefaultRingtoneFilename;
    @android.annotation.UnsupportedAppUsage
    private java.lang.String mDefaultNotificationFilename;
    @android.annotation.UnsupportedAppUsage
    private java.lang.String mDefaultAlarmAlertFilename;
    private static final java.lang.String DEFAULT_RINGTONE_PROPERTY_PREFIX = "ro.config.";
    private final android.graphics.BitmapFactory.Options mBitmapOptions = null;
    private final java.util.ArrayList<android.media.MediaScanner.PlaylistEntry> mPlaylistEntries = null;
    private final java.util.ArrayList<android.media.MediaScanner.FileEntry> mPlayLists = null;
    @android.annotation.UnsupportedAppUsage
    private android.media.MediaInserter mMediaInserter;
    private android.drm.DrmManagerClient mDrmManagerClient;
    @android.annotation.UnsupportedAppUsage
    private final android.media.MediaScanner.MyMediaScannerClient mClient = null;
    private static java.util.HashMap<java.lang.String, java.lang.String> mNoMediaPaths;
    private static java.util.HashMap<java.lang.String, java.lang.String> mMediaPaths;
    @android.annotation.UnsupportedAppUsage
    public MediaScanner(android.content.Context p0, java.lang.String p1) {}
    private void setDefaultRingtoneFileNames() {}
    @android.annotation.UnsupportedAppUsage
    private boolean isDrmEnabled() { return false; }
    private static boolean isSystemSoundWithMetadata(java.lang.String p0) { return false; }
    private java.lang.String settingSetIndicatorName(java.lang.String p0) { return null; }
    private boolean wasRingtoneAlreadySet(java.lang.String p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    private void prescan(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
    @android.annotation.UnsupportedAppUsage
    private void postscan(java.lang.String[] p0) throws android.os.RemoteException {}
    private void releaseResources() {}
    public void scanDirectories(java.lang.String[] p0) {}
    @android.annotation.UnsupportedAppUsage
    public android.net.Uri scanSingleFile(java.lang.String p0, java.lang.String p1) { return null; }
    private static boolean isNoMediaFile(java.lang.String p0) { return false; }
    public static void clearMediaPathCache(boolean p0, boolean p1) {}
    @android.annotation.UnsupportedAppUsage
    public static boolean isNoMediaPath(java.lang.String p0) { return false; }
    public void scanMtpFile(java.lang.String p0, int p1, int p2) {}
    @android.annotation.UnsupportedAppUsage
    android.media.MediaScanner.FileEntry makeEntryFor(java.lang.String p0) { return null; }
    private int matchPaths(java.lang.String p0, java.lang.String p1) { return 0; }
    private boolean matchEntries(long p0, java.lang.String p1) { return false; }
    private void cachePlaylistEntry(java.lang.String p0, java.lang.String p1) {}
    private void processCachedPlaylist(android.database.Cursor p0, android.content.ContentValues p1, android.net.Uri p2) {}
    private void processM3uPlayList(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.content.ContentValues p3, android.database.Cursor p4) {}
    private void processPlsPlayList(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.content.ContentValues p3, android.database.Cursor p4) {}
    private void processWplPlayList(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.content.ContentValues p3, android.database.Cursor p4) {}
    private void processPlayList(android.media.MediaScanner.FileEntry p0, android.database.Cursor p1) throws android.os.RemoteException {}
    private void processPlayLists() throws android.os.RemoteException {}
    private native void processDirectory(java.lang.String p0, android.media.MediaScannerClient p1);
    private native boolean processFile(java.lang.String p0, java.lang.String p1, android.media.MediaScannerClient p2);
    @android.annotation.UnsupportedAppUsage
    private native void setLocale(java.lang.String p0);
    public native byte[] extractAlbumArt(java.io.FileDescriptor p0);
    private static final native void native_init();
    private final native void native_setup();
    private final native void native_finalize();
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}

    class WplHandler implements android.sax.ElementListener {
        java.lang.String playListDirectory;
        public WplHandler(android.media.MediaScanner p0, java.lang.String p1, android.net.Uri p2, android.database.Cursor p3) {}
        public void start(org.xml.sax.Attributes p0) {}
        public void end() {}
        org.xml.sax.ContentHandler getContentHandler() { return null; }
    }

    private static class PlaylistEntry {
        java.lang.String path;
        long bestmatchid;
        int bestmatchlevel;
        private PlaylistEntry() {}
    }

    private class MyMediaScannerClient implements android.media.MediaScannerClient {
        private final java.text.SimpleDateFormat mDateFormatter = null;
        private java.lang.String mArtist;
        private java.lang.String mAlbumArtist;
        private java.lang.String mAlbum;
        private java.lang.String mTitle;
        private java.lang.String mComposer;
        private java.lang.String mGenre;
        @android.annotation.UnsupportedAppUsage
        private java.lang.String mMimeType;
        @java.lang.Deprecated
        @android.annotation.UnsupportedAppUsage
        private int mFileType;
        private int mTrack;
        private int mYear;
        private int mDuration;
        @android.annotation.UnsupportedAppUsage
        private java.lang.String mPath;
        private long mDate;
        private long mLastModified;
        private long mFileSize;
        private java.lang.String mWriter;
        private int mCompilation;
        @android.annotation.UnsupportedAppUsage
        private boolean mIsDrm;
        @android.annotation.UnsupportedAppUsage
        private boolean mNoMedia;
        private boolean mScanSuccess;
        private int mWidth;
        private int mHeight;
        private int mColorStandard;
        private int mColorTransfer;
        private int mColorRange;
        public MyMediaScannerClient(android.media.MediaScanner p0) {}
        @android.annotation.UnsupportedAppUsage
        public android.media.MediaScanner.FileEntry beginFile(java.lang.String p0, java.lang.String p1, long p2, long p3, boolean p4, boolean p5) { return null; }
        @android.annotation.UnsupportedAppUsage
        public void scanFile(java.lang.String p0, long p1, long p2, boolean p3, boolean p4) {}
        @android.annotation.UnsupportedAppUsage
        public android.net.Uri doScanFile(java.lang.String p0, java.lang.String p1, long p2, long p3, boolean p4, boolean p5, boolean p6) { return null; }
        private long parseDate(java.lang.String p0) { return 0L; }
        private int parseSubstring(java.lang.String p0, int p1, int p2) { return 0; }
        @android.annotation.UnsupportedAppUsage
        public void handleStringTag(java.lang.String p0, java.lang.String p1) {}
        private boolean convertGenreCode(java.lang.String p0, java.lang.String p1) { return false; }
        private void testGenreNameConverter() {}
        public java.lang.String getGenreName(java.lang.String p0) { return null; }
        private boolean processImageFile(java.lang.String p0) { return false; }
        @android.annotation.UnsupportedAppUsage
        public void setMimeType(java.lang.String p0) {}
        @android.annotation.UnsupportedAppUsage
        private android.content.ContentValues toValues() { return null; }
        @android.annotation.UnsupportedAppUsage
        private android.net.Uri endFile(android.media.MediaScanner.FileEntry p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6) throws android.os.RemoteException { return null; }
        private boolean doesPathHaveFilename(java.lang.String p0, java.lang.String p1) { return false; }
        private void setRingtoneIfNotSet(java.lang.String p0, android.net.Uri p1, long p2) {}
        @java.lang.Deprecated
        @android.annotation.UnsupportedAppUsage
        private int getFileTypeFromDrm(java.lang.String p0) { return 0; }
        private void getMimeTypeFromDrm(java.lang.String p0) {}
    }

    static class MediaBulkDeleter {
        java.lang.StringBuilder whereClause;
        java.util.ArrayList<java.lang.String> whereArgs;
        final android.content.ContentProviderClient mProvider = null;
        final android.net.Uri mBaseUri = null;
        public MediaBulkDeleter(android.content.ContentProviderClient p0, android.net.Uri p1) {}
        public void delete(long p0) throws android.os.RemoteException {}
        public void flush() throws android.os.RemoteException {}
    }

    private static class FileEntry {
        @android.annotation.UnsupportedAppUsage
        long mRowId;
        java.lang.String mPath;
        long mLastModified;
        int mFormat;
        int mMediaType;
        @android.annotation.UnsupportedAppUsage
        boolean mLastModifiedChanged;
        @java.lang.Deprecated
        @android.annotation.UnsupportedAppUsage
        FileEntry(long p0, java.lang.String p1, long p2, int p3) {}
        FileEntry(long p0, java.lang.String p1, long p2, int p3, int p4) {}
        public java.lang.String toString() { return null; }
    }
}
