package android.media;

@java.lang.Deprecated
public class Metadata {
    public static final int ANY = 0;
    @android.annotation.UnsupportedAppUsage
    public static final int PAUSE_AVAILABLE = 1;
    @android.annotation.UnsupportedAppUsage
    public static final int SEEK_BACKWARD_AVAILABLE = 2;
    @android.annotation.UnsupportedAppUsage
    public static final int SEEK_FORWARD_AVAILABLE = 3;
    @android.annotation.UnsupportedAppUsage
    public static final int SEEK_AVAILABLE = 4;
    public static final int TITLE = 5;
    public static final int COMMENT = 6;
    public static final int COPYRIGHT = 7;
    public static final int ALBUM = 8;
    public static final int ARTIST = 9;
    public static final int AUTHOR = 10;
    public static final int COMPOSER = 11;
    public static final int GENRE = 12;
    public static final int DATE = 13;
    public static final int DURATION = 14;
    public static final int CD_TRACK_NUM = 15;
    public static final int CD_TRACK_MAX = 16;
    public static final int RATING = 17;
    public static final int ALBUM_ART = 18;
    public static final int VIDEO_FRAME = 19;
    public static final int BIT_RATE = 20;
    public static final int AUDIO_BIT_RATE = 21;
    public static final int VIDEO_BIT_RATE = 22;
    public static final int AUDIO_SAMPLE_RATE = 23;
    public static final int VIDEO_FRAME_RATE = 24;
    public static final int MIME_TYPE = 25;
    public static final int AUDIO_CODEC = 26;
    public static final int VIDEO_CODEC = 27;
    public static final int VIDEO_HEIGHT = 28;
    public static final int VIDEO_WIDTH = 29;
    public static final int NUM_TRACKS = 30;
    public static final int DRM_CRIPPLED = 31;
    private static final int LAST_SYSTEM = 31;
    private static final int FIRST_CUSTOM = 8192;
    public static final java.util.Set<java.lang.Integer> MATCH_NONE = null;
    public static final java.util.Set<java.lang.Integer> MATCH_ALL = null;
    public static final int STRING_VAL = 1;
    public static final int INTEGER_VAL = 2;
    public static final int BOOLEAN_VAL = 3;
    public static final int LONG_VAL = 4;
    public static final int DOUBLE_VAL = 5;
    public static final int DATE_VAL = 6;
    public static final int BYTE_ARRAY_VAL = 7;
    private static final int LAST_TYPE = 7;
    private static final java.lang.String TAG = "media.Metadata";
    private static final int kInt32Size = 4;
    private static final int kMetaHeaderSize = 8;
    private static final int kRecordHeaderSize = 12;
    private static final int kMetaMarker = 1296389185;
    private android.os.Parcel mParcel;
    private final java.util.HashMap<java.lang.Integer, java.lang.Integer> mKeyToPosMap = null;
    @android.annotation.UnsupportedAppUsage
    public Metadata() {}
    private boolean scanAllRecords(android.os.Parcel p0, int p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean parse(android.os.Parcel p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public java.util.Set<java.lang.Integer> keySet() { return null; }
    @android.annotation.UnsupportedAppUsage
    public boolean has(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getString(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public int getInt(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public boolean getBoolean(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public long getLong(int p0) { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public double getDouble(int p0) { return 0.0; }
    @android.annotation.UnsupportedAppUsage
    public byte[] getByteArray(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.util.Date getDate(int p0) { return null; }
    public static int lastSytemId() { return 0; }
    public static int firstCustomId() { return 0; }
    public static int lastType() { return 0; }
    private boolean checkMetadataId(int p0) { return false; }
    private void checkType(int p0, int p1) {}
}
