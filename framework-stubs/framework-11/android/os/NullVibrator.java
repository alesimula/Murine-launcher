package android.os;

public class NullVibrator extends android.os.Vibrator {
    private static final android.os.NullVibrator sInstance = null;
    private NullVibrator() { super(); }
    public static android.os.NullVibrator getInstance() { return null; }
    public boolean hasVibrator() { return false; }
    public boolean isVibrating() { return false; }
    public boolean hasAmplitudeControl() { return false; }
    public void vibrate(int p0, java.lang.String p1, android.os.VibrationEffect p2, java.lang.String p3, android.media.AudioAttributes p4) {}
    public void cancel() {}
}
