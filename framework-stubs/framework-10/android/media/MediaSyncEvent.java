package android.media;

public class MediaSyncEvent {
    public static final int SYNC_EVENT_NONE = 0;
    public static final int SYNC_EVENT_PRESENTATION_COMPLETE = 1;
    private final int mType = 0;
    private int mAudioSession;
    public static android.media.MediaSyncEvent createEvent(int p0) throws java.lang.IllegalArgumentException { return null; }
    private MediaSyncEvent(int p0) {}
    public android.media.MediaSyncEvent setAudioSessionId(int p0) throws java.lang.IllegalArgumentException { return null; }
    public int getType() { return 0; }
    public int getAudioSessionId() { return 0; }
    private static boolean isValidType(int p0) { return false; }
}
