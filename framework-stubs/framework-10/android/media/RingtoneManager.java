package android.media;

public class RingtoneManager {
    private static final java.lang.String TAG = "RingtoneManager";
    public static final int TYPE_RINGTONE = 1;
    public static final int TYPE_NOTIFICATION = 2;
    public static final int TYPE_ALARM = 4;
    public static final int TYPE_ALL = 7;
    public static final java.lang.String ACTION_RINGTONE_PICKER = "android.intent.action.RINGTONE_PICKER";
    public static final java.lang.String EXTRA_RINGTONE_SHOW_DEFAULT = "android.intent.extra.ringtone.SHOW_DEFAULT";
    public static final java.lang.String EXTRA_RINGTONE_SHOW_SILENT = "android.intent.extra.ringtone.SHOW_SILENT";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_RINGTONE_INCLUDE_DRM = "android.intent.extra.ringtone.INCLUDE_DRM";
    public static final java.lang.String EXTRA_RINGTONE_EXISTING_URI = "android.intent.extra.ringtone.EXISTING_URI";
    public static final java.lang.String EXTRA_RINGTONE_DEFAULT_URI = "android.intent.extra.ringtone.DEFAULT_URI";
    public static final java.lang.String EXTRA_RINGTONE_TYPE = "android.intent.extra.ringtone.TYPE";
    public static final java.lang.String EXTRA_RINGTONE_TITLE = "android.intent.extra.ringtone.TITLE";
    public static final java.lang.String EXTRA_RINGTONE_AUDIO_ATTRIBUTES_FLAGS = "android.intent.extra.ringtone.AUDIO_ATTRIBUTES_FLAGS";
    public static final java.lang.String EXTRA_RINGTONE_PICKED_URI = "android.intent.extra.ringtone.PICKED_URI";
    private static final java.lang.String[] INTERNAL_COLUMNS = null;
    private static final java.lang.String[] MEDIA_COLUMNS = null;
    public static final int ID_COLUMN_INDEX = 0;
    public static final int TITLE_COLUMN_INDEX = 1;
    public static final int URI_COLUMN_INDEX = 2;
    private final android.app.Activity mActivity = null;
    private final android.content.Context mContext = null;
    @android.annotation.UnsupportedAppUsage
    private android.database.Cursor mCursor;
    private int mType;
    private final java.util.List<java.lang.String> mFilterColumns = null;
    private boolean mStopPreviousRingtone;
    private android.media.Ringtone mPreviousRingtone;
    private boolean mIncludeParentRingtones;
    public RingtoneManager(android.app.Activity p0) {}
    public RingtoneManager(android.app.Activity p0, boolean p1) {}
    public RingtoneManager(android.content.Context p0) {}
    public RingtoneManager(android.content.Context p0, boolean p1) {}
    public void setType(int p0) {}
    public int inferStreamType() { return 0; }
    public void setStopPreviousRingtone(boolean p0) {}
    public boolean getStopPreviousRingtone() { return false; }
    public void stopPreviousRingtone() {}
    @java.lang.Deprecated
    public boolean getIncludeDrm() { return false; }
    @java.lang.Deprecated
    public void setIncludeDrm(boolean p0) {}
    public android.database.Cursor getCursor() { return null; }
    private android.database.Cursor getParentProfileRingtones() { return null; }
    public android.media.Ringtone getRingtone(int p0) { return null; }
    public android.net.Uri getRingtoneUri(int p0) { return null; }
    private static android.net.Uri getUriFromCursor(android.content.Context p0, android.database.Cursor p1) { return null; }
    public int getRingtonePosition(android.net.Uri p0) { return 0; }
    public static android.net.Uri getValidRingtoneUri(android.content.Context p0) { return null; }
    private static android.net.Uri getValidRingtoneUriFromCursorAndClose(android.content.Context p0, android.database.Cursor p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    private android.database.Cursor getInternalRingtones() { return null; }
    private android.database.Cursor getMediaRingtones() { return null; }
    @android.annotation.UnsupportedAppUsage
    private android.database.Cursor getMediaRingtones(android.content.Context p0) { return null; }
    private void setFilterColumnsList(int p0) {}
    private static java.lang.String constructBooleanTrueWhereClause(java.util.List<java.lang.String> p0) { return null; }
    private android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) { return null; }
    private android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, android.content.Context p5) { return null; }
    public static android.media.Ringtone getRingtone(android.content.Context p0, android.net.Uri p1) { return null; }
    public static android.media.Ringtone getRingtone(android.content.Context p0, android.net.Uri p1, android.media.VolumeShaper.Configuration p2) { return null; }
    @android.annotation.UnsupportedAppUsage
    private static android.media.Ringtone getRingtone(android.content.Context p0, android.net.Uri p1, int p2) { return null; }
    @android.annotation.UnsupportedAppUsage
    private static android.media.Ringtone getRingtone(android.content.Context p0, android.net.Uri p1, int p2, android.media.VolumeShaper.Configuration p3) { return null; }
    public static void disableSyncFromParent(android.content.Context p0) {}
    public static void enableSyncFromParent(android.content.Context p0) {}
    public static android.net.Uri getActualDefaultRingtoneUri(android.content.Context p0, int p1) { return null; }
    public static void setActualDefaultRingtoneUri(android.content.Context p0, int p1, android.net.Uri p2) {}
    private static boolean isInternalRingtoneUri(android.net.Uri p0) { return false; }
    private static boolean isExternalRingtoneUri(android.net.Uri p0) { return false; }
    private static boolean isRingtoneUriInStorage(android.net.Uri p0, android.net.Uri p1) { return false; }
    public android.net.Uri addCustomExternalRingtone(android.net.Uri p0, int p1) throws java.io.FileNotFoundException, java.lang.IllegalArgumentException, java.io.IOException { return null; }
    private static final java.lang.String getExternalDirectoryForType(int p0) { return null; }
    private static java.io.InputStream openRingtone(android.content.Context p0, android.net.Uri p1) throws java.io.IOException { return null; }
    private static java.lang.String getSettingForType(int p0) { return null; }
    public static android.net.Uri getCacheForType(int p0) { return null; }
    public static android.net.Uri getCacheForType(int p0, int p1) { return null; }
    public static boolean isDefault(android.net.Uri p0) { return false; }
    public static int getDefaultType(android.net.Uri p0) { return 0; }
    public static android.net.Uri getDefaultUri(int p0) { return null; }
    public static android.content.res.AssetFileDescriptor openDefaultRingtoneUri(android.content.Context p0, android.net.Uri p1) throws java.io.FileNotFoundException { return null; }
    public boolean hasHapticChannels(int p0) { return false; }
    public static boolean hasHapticChannels(android.net.Uri p0) { return false; }
    private static android.content.Context createPackageContextAsUser(android.content.Context p0, int p1) { return null; }
}
