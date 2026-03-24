package android.media;

public abstract class AudioManagerInternal {
    public AudioManagerInternal() {}
    public abstract void adjustSuggestedStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5);
    public abstract void adjustStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5);
    public abstract void setStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5);
    public abstract void setRingerModeDelegate(android.media.AudioManagerInternal.RingerModeDelegate p0);
    public abstract int getRingerModeInternal();
    public abstract void setRingerModeInternal(int p0, java.lang.String p1);
    public abstract void silenceRingerModeInternal(java.lang.String p0);
    public abstract void updateRingerModeAffectedStreamsInternal();
    public abstract void setAccessibilityServiceUids(android.util.IntArray p0);
    public abstract void setInputMethodServiceUid(int p0);

    public static interface RingerModeDelegate {
        public int onSetRingerModeExternal(int p0, int p1, java.lang.String p2, int p3, android.media.VolumePolicy p4);
        public int onSetRingerModeInternal(int p0, int p1, java.lang.String p2, int p3, android.media.VolumePolicy p4);
        public boolean canVolumeDownEnterSilent();
        public int getRingerModeAffectedStreams(int p0);
    }
}
