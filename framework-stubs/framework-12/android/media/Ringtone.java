package android.media;

public class Ringtone {
    private static final java.lang.String TAG = "Ringtone";
    private static final boolean LOGD = true;
    private static final java.lang.String[] MEDIA_COLUMNS = null;
    private static final java.lang.String MEDIA_SELECTION = "mime_type LIKE 'audio/%' OR mime_type IN ('application/ogg', 'application/x-flac')";
    private static final java.util.ArrayList<android.media.Ringtone> sActiveRingtones = null;
    private final android.content.Context mContext = null;
    private final android.media.AudioManager mAudioManager = null;
    private android.media.VolumeShaper.Configuration mVolumeShaperConfig;
    private android.media.VolumeShaper mVolumeShaper;
    private final boolean mAllowRemote = false;
    private final android.media.IRingtonePlayer mRemotePlayer = null;
    private final android.os.Binder mRemoteToken = null;
    private android.media.MediaPlayer mLocalPlayer;
    private final android.media.Ringtone.MyOnCompletionListener mCompletionListener = null;
    private android.media.audiofx.HapticGenerator mHapticGenerator;
    private android.net.Uri mUri;
    private java.lang.String mTitle;
    private android.media.AudioAttributes mAudioAttributes;
    private boolean mIsLooping;
    private float mVolume;
    private boolean mHapticGeneratorEnabled;
    private final java.lang.Object mPlaybackSettingsLock = null;
    public Ringtone(android.content.Context p0, boolean p1) {}
    @java.lang.Deprecated
    public void setStreamType(int p0) {}
    @java.lang.Deprecated
    public int getStreamType() { return 0; }
    public void setAudioAttributes(android.media.AudioAttributes p0) throws java.lang.IllegalArgumentException {}
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    public void setLooping(boolean p0) {}
    public boolean isLooping() { return false; }
    public void setVolume(float p0) {}
    public float getVolume() { return 0.0f; }
    public boolean setHapticGeneratorEnabled(boolean p0) { return false; }
    public boolean isHapticGeneratorEnabled() { return false; }
    private void applyPlaybackProperties_sync() {}
    public java.lang.String getTitle(android.content.Context p0) { return null; }
    public static java.lang.String getTitle(android.content.Context p0, android.net.Uri p1, boolean p2, boolean p3) { return null; }
    public void setUri(android.net.Uri p0) {}
    public void setUri(android.net.Uri p0, android.media.VolumeShaper.Configuration p1) {}
    public android.net.Uri getUri() { return null; }
    public void play() {}
    public void stop() {}
    private void destroyLocalPlayer() {}
    private void startLocalPlayer() {}
    public boolean isPlaying() { return false; }
    private boolean playFallbackRingtone() { return false; }
    void setTitle(java.lang.String p0) {}
    protected void finalize() {}

    class MyOnCompletionListener implements android.media.MediaPlayer.OnCompletionListener {
        MyOnCompletionListener(android.media.Ringtone p0) {}
        public void onCompletion(android.media.MediaPlayer p0) {}
    }
}
