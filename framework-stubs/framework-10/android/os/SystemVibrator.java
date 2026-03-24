package android.os;

public class SystemVibrator extends android.os.Vibrator {
    private static final java.lang.String TAG = "Vibrator";
    private final android.os.IVibratorService mService = null;
    private final android.os.Binder mToken = null;
    @android.annotation.UnsupportedAppUsage
    public SystemVibrator() { super(); }
    @android.annotation.UnsupportedAppUsage
    public SystemVibrator(android.content.Context p0) { super(); }
    public boolean hasVibrator() { return false; }
    public boolean hasAmplitudeControl() { return false; }
    public void vibrate(int p0, java.lang.String p1, android.os.VibrationEffect p2, java.lang.String p3, android.media.AudioAttributes p4) {}
    public void cancel() {}
}
