package android.media;

@java.lang.Deprecated
public abstract class MediaMetadataEditor {
    public static final int BITMAP_KEY_ARTWORK = 100;
    public static final int RATING_KEY_BY_OTHERS = 101;
    public static final int RATING_KEY_BY_USER = 268435457;
    public static final int KEY_EDITABLE_MASK = 536870911;
    protected long mEditableKeys;
    protected boolean mMetadataChanged;
    protected boolean mApplied;
    protected boolean mArtworkChanged;
    protected android.graphics.Bitmap mEditorArtwork;
    protected android.os.Bundle mEditorMetadata;
    protected android.media.MediaMetadata.Builder mMetadataBuilder;
    protected static final int METADATA_TYPE_INVALID = -1;
    protected static final int METADATA_TYPE_LONG = 0;
    protected static final int METADATA_TYPE_STRING = 1;
    protected static final int METADATA_TYPE_BITMAP = 2;
    protected static final int METADATA_TYPE_RATING = 3;
    protected static final android.util.SparseIntArray METADATA_KEYS_TYPE = null;
    protected MediaMetadataEditor() {}
    public abstract void apply();
    public synchronized void clear() {}
    public synchronized void addEditableKey(int p0) {}
    public synchronized void removeEditableKeys() {}
    public synchronized int[] getEditableKeys() { return null; }
    public synchronized android.media.MediaMetadataEditor putString(int p0, java.lang.String p1) throws java.lang.IllegalArgumentException { return null; }
    public synchronized android.media.MediaMetadataEditor putLong(int p0, long p1) throws java.lang.IllegalArgumentException { return null; }
    public synchronized android.media.MediaMetadataEditor putBitmap(int p0, android.graphics.Bitmap p1) throws java.lang.IllegalArgumentException { return null; }
    public synchronized android.media.MediaMetadataEditor putObject(int p0, java.lang.Object p1) throws java.lang.IllegalArgumentException { return null; }
    public synchronized long getLong(int p0, long p1) throws java.lang.IllegalArgumentException { return 0L; }
    public synchronized java.lang.String getString(int p0, java.lang.String p1) throws java.lang.IllegalArgumentException { return null; }
    public synchronized android.graphics.Bitmap getBitmap(int p0, android.graphics.Bitmap p1) throws java.lang.IllegalArgumentException { return null; }
    public synchronized java.lang.Object getObject(int p0, java.lang.Object p1) throws java.lang.IllegalArgumentException { return null; }
}
