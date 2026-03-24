package android.os;

public class SystemVibrator extends android.os.Vibrator {
    private static final java.lang.String TAG = "Vibrator";
    private final android.os.IVibratorService mService = null;
    private final android.os.Binder mToken = null;
    private final android.content.Context mContext = null;
    private final android.util.ArrayMap<android.os.Vibrator.OnVibratorStateChangedListener, android.os.SystemVibrator.OnVibratorStateChangedListenerDelegate> mDelegates = null;
    public SystemVibrator() { super(); }
    public SystemVibrator(android.content.Context p0) { super(); }
    public boolean hasVibrator() { return false; }
    public boolean isVibrating() { return false; }
    public void addVibratorStateListener(java.util.concurrent.Executor p0, android.os.Vibrator.OnVibratorStateChangedListener p1) {}
    public void addVibratorStateListener(android.os.Vibrator.OnVibratorStateChangedListener p0) {}
    public void removeVibratorStateListener(android.os.Vibrator.OnVibratorStateChangedListener p0) {}
    public boolean hasAmplitudeControl() { return false; }
    public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.VibrationEffect p3, android.media.AudioAttributes p4) { return false; }
    public void vibrate(int p0, java.lang.String p1, android.os.VibrationEffect p2, java.lang.String p3, android.media.AudioAttributes p4) {}
    public int[] areEffectsSupported(int... p0) { return null; }
    public boolean[] arePrimitivesSupported(int... p0) { return null; }
    public void cancel() {}

    private class OnVibratorStateChangedListenerDelegate extends android.os.IVibratorStateListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.os.Vibrator.OnVibratorStateChangedListener mListener = null;
        OnVibratorStateChangedListenerDelegate(android.os.SystemVibrator p0, android.os.Vibrator.OnVibratorStateChangedListener p1, java.util.concurrent.Executor p2) { super(); }
        public void onVibrating(boolean p0) {}
    }
}
