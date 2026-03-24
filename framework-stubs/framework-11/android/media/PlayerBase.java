package android.media;

public abstract class PlayerBase {
    private static final java.lang.String TAG = "PlayerBase";
    private static final boolean DEBUG_APP_OPS = false;
    private static final boolean DEBUG = false;
    private static android.media.IAudioService sService;
    private static final boolean USE_AUDIOFLINGER_MUTING_FOR_OP = true;
    protected android.media.AudioAttributes mAttributes;
    protected float mLeftVolume;
    protected float mRightVolume;
    protected float mAuxEffectSendLevel;
    private final java.lang.Object mLock = null;
    private com.android.internal.app.IAppOpsService mAppOps;
    private com.android.internal.app.IAppOpsCallback mAppOpsCallback;
    private boolean mHasAppOpsPlayAudio;
    private final int mImplType = 0;
    private int mPlayerIId;
    private int mState;
    private int mStartDelayMs;
    private float mPanMultiplierL;
    private float mPanMultiplierR;
    private float mVolMultiplier;
    PlayerBase(android.media.AudioAttributes p0, int p1) {}
    protected void baseRegisterPlayer() {}
    void baseUpdateAudioAttributes(android.media.AudioAttributes p0) {}
    private void updateState(int p0) {}
    void baseStart() {}
    void baseSetStartDelayMs(int p0) {}
    protected int getStartDelayMs() { return 0; }
    void basePause() {}
    void baseStop() {}
    void baseSetPan(float p0) {}
    private void updatePlayerVolume() {}
    void setVolumeMultiplier(float p0) {}
    void baseSetVolume(float p0, float p1) {}
    int baseSetAuxEffectSendLevel(float p0) { return 0; }
    void baseRelease() {}
    private void updateAppOpsPlayAudio() {}
    void updateAppOpsPlayAudio_sync(boolean p0) {}
    boolean isRestricted_sync() { return false; }
    private static android.media.IAudioService getService() { return null; }
    public void setStartDelayMs(int p0) {}
    abstract void playerSetVolume(boolean p0, float p1, float p2);
    abstract int playerApplyVolumeShaper(android.media.VolumeShaper.Configuration p0, android.media.VolumeShaper.Operation p1);
    abstract android.media.VolumeShaper.State playerGetVolumeShaperState(int p0);
    abstract int playerSetAuxEffectSendLevel(boolean p0, float p1);
    abstract void playerStart();
    abstract void playerPause();
    abstract void playerStop();
    public static void deprecateStreamTypeForPlayback(int p0, java.lang.String p1, java.lang.String p2) throws java.lang.IllegalArgumentException {}
    protected java.lang.String getCurrentOpPackageName() { return null; }

    private static class IAppOpsCallbackWrapper extends com.android.internal.app.IAppOpsCallback.Stub {
        private final java.lang.ref.WeakReference<android.media.PlayerBase> mWeakPB = null;
        public IAppOpsCallbackWrapper(android.media.PlayerBase p0) { super(); }
        public void opChanged(int p0, int p1, java.lang.String p2) {}
    }

    private static class IPlayerWrapper extends android.media.IPlayer.Stub {
        private final java.lang.ref.WeakReference<android.media.PlayerBase> mWeakPB = null;
        public IPlayerWrapper(android.media.PlayerBase p0) { super(); }
        public void start() {}
        public void pause() {}
        public void stop() {}
        public void setVolume(float p0) {}
        public void setPan(float p0) {}
        public void setStartDelayMs(int p0) {}
        public void applyVolumeShaper(android.media.VolumeShaper.Configuration p0, android.media.VolumeShaper.Operation p1) {}
    }

    public static class PlayerIdCard implements android.os.Parcelable {
        public final int mPlayerType = 0;
        public static final int AUDIO_ATTRIBUTES_NONE = 0;
        public static final int AUDIO_ATTRIBUTES_DEFINED = 1;
        public final android.media.AudioAttributes mAttributes = null;
        public final android.media.IPlayer mIPlayer = null;
        public static final android.os.Parcelable.Creator<android.media.PlayerBase.PlayerIdCard> CREATOR = null;
        PlayerIdCard(int p0, android.media.AudioAttributes p1, android.media.IPlayer p2) {}
        public int hashCode() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        private PlayerIdCard(android.os.Parcel p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
    }
}
