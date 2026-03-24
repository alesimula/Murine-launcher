package android.media;

public final class AudioPlaybackConfiguration implements android.os.Parcelable {
    private static final java.lang.String TAG = null;
    private static final boolean DEBUG = false;
    public static final int PLAYER_PIID_INVALID = -1;
    public static final int PLAYER_UPID_INVALID = -1;
    @android.annotation.SystemApi
    public static final int PLAYER_TYPE_UNKNOWN = -1;
    @android.annotation.SystemApi
    public static final int PLAYER_TYPE_JAM_AUDIOTRACK = 1;
    @android.annotation.SystemApi
    public static final int PLAYER_TYPE_JAM_MEDIAPLAYER = 2;
    @android.annotation.SystemApi
    public static final int PLAYER_TYPE_JAM_SOUNDPOOL = 3;
    @android.annotation.SystemApi
    public static final int PLAYER_TYPE_SLES_AUDIOPLAYER_BUFFERQUEUE = 11;
    @android.annotation.SystemApi
    public static final int PLAYER_TYPE_SLES_AUDIOPLAYER_URI_FD = 12;
    public static final int PLAYER_TYPE_AAUDIO = 13;
    public static final int PLAYER_TYPE_HW_SOURCE = 14;
    public static final int PLAYER_TYPE_EXTERNAL_PROXY = 15;
    @android.annotation.SystemApi
    public static final int PLAYER_STATE_UNKNOWN = -1;
    @android.annotation.SystemApi
    public static final int PLAYER_STATE_RELEASED = 0;
    @android.annotation.SystemApi
    public static final int PLAYER_STATE_IDLE = 1;
    @android.annotation.SystemApi
    public static final int PLAYER_STATE_STARTED = 2;
    @android.annotation.SystemApi
    public static final int PLAYER_STATE_PAUSED = 3;
    @android.annotation.SystemApi
    public static final int PLAYER_STATE_STOPPED = 4;
    private final int mPlayerIId = 0;
    private int mPlayerType;
    private int mClientUid;
    private int mClientPid;
    private android.media.AudioPlaybackConfiguration.IPlayerShell mIPlayerShell;
    private int mPlayerState;
    private android.media.AudioAttributes mPlayerAttr;
    public static android.media.AudioPlaybackConfiguration.PlayerDeathMonitor sPlayerDeathMonitor;
    public static final android.os.Parcelable.Creator<android.media.AudioPlaybackConfiguration> CREATOR = null;
    private AudioPlaybackConfiguration(int p0) {}
    public AudioPlaybackConfiguration(android.media.PlayerBase.PlayerIdCard p0, int p1, int p2, int p3) {}
    public void init() {}
    public static android.media.AudioPlaybackConfiguration anonymizedCopy(android.media.AudioPlaybackConfiguration p0) { return null; }
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    @android.annotation.SystemApi
    public int getClientUid() { return 0; }
    @android.annotation.SystemApi
    public int getClientPid() { return 0; }
    @android.annotation.SystemApi
    public int getPlayerType() { return 0; }
    @android.annotation.SystemApi
    public int getPlayerState() { return 0; }
    @android.annotation.SystemApi
    public int getPlayerInterfaceId() { return 0; }
    @android.annotation.SystemApi
    public android.media.PlayerProxy getPlayerProxy() { return null; }
    android.media.IPlayer getIPlayer() { return null; }
    public boolean handleAudioAttributesEvent(android.media.AudioAttributes p0) { return false; }
    public boolean handleStateEvent(int p0) { return false; }
    private void playerDied() {}
    public boolean isActive() { return false; }
    public void dump(java.io.PrintWriter p0) {}
    public static java.lang.String toLogFriendlyString(android.media.AudioPlaybackConfiguration p0) { return null; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private AudioPlaybackConfiguration(android.os.Parcel p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public static java.lang.String toLogFriendlyPlayerType(int p0) { return null; }
    public static java.lang.String toLogFriendlyPlayerState(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PlayerType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PlayerState {
    }

    public static interface PlayerDeathMonitor {
        public void playerDeath(int p0);
    }

    static final class IPlayerShell implements android.os.IBinder.DeathRecipient {
        final android.media.AudioPlaybackConfiguration mMonitor = null;
        private volatile android.media.IPlayer mIPlayer;
        IPlayerShell(android.media.AudioPlaybackConfiguration p0, android.media.IPlayer p1) {}
        synchronized void monitorDeath() {}
        android.media.IPlayer getIPlayer() { return null; }
        public void binderDied() {}
        synchronized void release() {}
    }
}
