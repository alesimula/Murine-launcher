package android.media.audiofx;

public class HapticGenerator extends android.media.audiofx.AudioEffect implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "HapticGenerator";
    private android.media.audiofx.AudioEffect mVolumeControlEffect;
    public static boolean isAvailable() { return false; }
    public static android.media.audiofx.HapticGenerator create(int p0) { return null; }
    private HapticGenerator(int p0) { super((java.util.UUID)null, (android.media.AudioDeviceAttributes)null); }
    public int setEnabled(boolean p0) { return 0; }
    public void release() {}
    public void close() {}
}
