package android.media.audiofx;

public class HapticGenerator extends android.media.audiofx.AudioEffect implements java.lang.AutoCloseable {
    HapticGenerator() { super((java.util.UUID)null, (android.media.AudioDeviceAttributes)null); }
    public static boolean isAvailable() { return false; }
    public static android.media.audiofx.HapticGenerator create(int p0) { return null; }
    public int setEnabled(boolean p0) { return 0; }
    public void release() {}
    public void close() {}
}
