package android.media;

public final class AudioPlaybackConfiguration implements android.os.Parcelable {
    public static final int PLAYER_PIID_INVALID = -1;
    public static final int PLAYER_UPID_INVALID = -1;
    public static final int PLAYER_DEVICEID_INVALID = 0;
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
    @android.annotation.SystemApi
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
    public static final int PLAYER_UPDATE_DEVICE_ID = 5;
    public static android.media.AudioPlaybackConfiguration.PlayerDeathMonitor sPlayerDeathMonitor;
    public static final android.os.Parcelable.Creator<android.media.AudioPlaybackConfiguration> CREATOR = null;
    public static java.lang.String playerStateToString(int p0) { return null; }
    public AudioPlaybackConfiguration(android.media.PlayerBase.PlayerIdCard p0, int p1, int p2, int p3) {}
    public void init() {}
    public static android.media.AudioPlaybackConfiguration anonymizedCopy(android.media.AudioPlaybackConfiguration p0) { return null; }
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    @android.annotation.SystemApi
    public int getClientUid() { return 0; }
    @android.annotation.SystemApi
    public int getClientPid() { return 0; }
    public android.media.AudioDeviceInfo getAudioDeviceInfo() { return null; }
    @android.annotation.SystemApi
    public int getSessionId() { return 0; }
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
    public boolean handleSessionIdEvent(int p0) { return false; }
    public boolean handleStateEvent(int p0, int p1) { return false; }
    @android.annotation.SystemApi
    public boolean isActive() { return false; }
    public void dump(java.io.PrintWriter p0) {}
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public static java.lang.String toLogFriendlyPlayerType(int p0) { return null; }
    public static java.lang.String toLogFriendlyPlayerState(int p0) { return null; }

    static final class IPlayerShell implements android.os.IBinder.DeathRecipient {
        final android.media.AudioPlaybackConfiguration mMonitor = null;
        IPlayerShell(android.media.AudioPlaybackConfiguration p0, android.media.IPlayer p1) {}
        synchronized void monitorDeath() {}
        android.media.IPlayer getIPlayer() { return null; }
        public void binderDied() {}
        synchronized void release() {}
    }

    public static interface PlayerDeathMonitor {
        public void playerDeath(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PlayerState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PlayerType {
    }
}
