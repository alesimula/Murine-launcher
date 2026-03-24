package android.media;

public abstract class PlayerBase {
    protected android.media.AudioAttributes mAttributes;
    protected float mLeftVolume;
    protected float mRightVolume;
    protected float mAuxEffectSendLevel;
    protected int mPlayerIId;
    PlayerBase(android.media.AudioAttributes p0, int p1) {}
    public int getPlayerIId() { return 0; }
    protected void baseRegisterPlayer(int p0) {}
    void baseUpdateAudioAttributes(android.media.AudioAttributes p0) {}
    void baseUpdateSessionId(int p0) {}
    void baseUpdateDeviceIds(java.util.List<android.media.AudioDeviceInfo> p0) {}
    void baseStart(int[] p0) {}
    void baseSetStartDelayMs(int p0) {}
    protected int getStartDelayMs() { return 0; }
    void basePause() {}
    void baseStop() {}
    void baseSetPan(float p0) {}
    void setVolumeMultiplier(float p0) {}
    void baseSetVolume(float p0, float p1) {}
    int baseSetAuxEffectSendLevel(float p0) { return 0; }
    void baseRelease() {}
    public void setStartDelayMs(int p0) {}
    abstract void playerSetVolume(boolean p0, float p1, float p2);
    abstract int playerApplyVolumeShaper(android.media.VolumeShaper.Configuration p0, android.media.VolumeShaper.Operation p1);
    @android.annotation.Nullable
    abstract android.media.VolumeShaper.State playerGetVolumeShaperState(int p0);
    abstract int playerSetAuxEffectSendLevel(boolean p0, float p1);
    abstract void playerStart();
    abstract void playerPause();
    abstract void playerStop();
    public static void deprecateStreamTypeForPlayback(int p0, java.lang.String p1, java.lang.String p2) throws java.lang.IllegalArgumentException {}
    protected java.lang.String getCurrentOpPackageName() { return null; }
    protected static int resolvePlaybackSessionId(android.content.Context p0, int p1) { return 0; }

    private static class IPlayerWrapper extends android.media.IPlayer.Stub {
        public IPlayerWrapper(android.media.PlayerBase p0) { super(); }
        public void start() {}
        public void pause() {}
        public void stop() {}
        public void setVolume(float p0) {}
        public void setPan(float p0) {}
        public void setStartDelayMs(int p0) {}
        public void applyVolumeShaper(android.media.VolumeShaperConfiguration p0, android.media.VolumeShaperOperation p1) {}
    }

    public static class PlayerIdCard implements android.os.Parcelable {
        public final int mPlayerType = 0;
        public static final int AUDIO_ATTRIBUTES_NONE = 0;
        public static final int AUDIO_ATTRIBUTES_DEFINED = 1;
        public final android.media.AudioAttributes mAttributes = null;
        public final android.media.IPlayer mIPlayer = null;
        public final int mSessionId = 0;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.media.PlayerBase.PlayerIdCard> CREATOR = null;
        PlayerIdCard(int p0, android.media.AudioAttributes p1, android.media.IPlayer p2, int p3) {}
        public int hashCode() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
    }
}
