package android.media;

public abstract class VolumeProvider {
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    private final int mControlType = 0;
    private final int mMaxVolume = 0;
    private final java.lang.String mControlId = null;
    private int mCurrentVolume;
    private android.media.VolumeProvider.Callback mCallback;
    public VolumeProvider(int p0, int p1, int p2) {}
    public VolumeProvider(int p0, int p1, int p2, java.lang.String p3) {}
    public final int getVolumeControl() { return 0; }
    public final int getMaxVolume() { return 0; }
    public final int getCurrentVolume() { return 0; }
    public final void setCurrentVolume(int p0) {}
    public final java.lang.String getVolumeControlId() { return null; }
    public void onSetVolumeTo(int p0) {}
    public void onAdjustVolume(int p0) {}
    public void setCallback(android.media.VolumeProvider.Callback p0) {}

    public static abstract class Callback {
        public Callback() {}
        public abstract void onVolumeChanged(android.media.VolumeProvider p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ControlType {
    }
}
