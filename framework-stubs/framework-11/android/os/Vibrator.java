package android.os;

public abstract class Vibrator {
    private static final java.lang.String TAG = "Vibrator";
    public static final int VIBRATION_INTENSITY_OFF = 0;
    public static final int VIBRATION_INTENSITY_LOW = 1;
    public static final int VIBRATION_INTENSITY_MEDIUM = 2;
    public static final int VIBRATION_INTENSITY_HIGH = 3;
    public static final int VIBRATION_EFFECT_SUPPORT_UNKNOWN = 0;
    public static final int VIBRATION_EFFECT_SUPPORT_YES = 1;
    public static final int VIBRATION_EFFECT_SUPPORT_NO = 2;
    private final java.lang.String mPackageName = null;
    private int mDefaultHapticFeedbackIntensity;
    private int mDefaultNotificationVibrationIntensity;
    private int mDefaultRingVibrationIntensity;
    public Vibrator() {}
    protected Vibrator(android.content.Context p0) {}
    private void loadVibrationIntensities(android.content.Context p0) {}
    private int loadDefaultIntensity(android.content.Context p0, int p1) { return 0; }
    public int getDefaultHapticFeedbackIntensity() { return 0; }
    public int getDefaultNotificationVibrationIntensity() { return 0; }
    public int getDefaultRingVibrationIntensity() { return 0; }
    public abstract boolean hasVibrator();
    public abstract boolean hasAmplitudeControl();
    public boolean setAlwaysOnEffect(int p0, android.os.VibrationEffect p1, android.media.AudioAttributes p2) { return false; }
    public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.VibrationEffect p3, android.media.AudioAttributes p4) { return false; }
    @java.lang.Deprecated
    public void vibrate(long p0) {}
    @java.lang.Deprecated
    public void vibrate(long p0, android.media.AudioAttributes p1) {}
    @java.lang.Deprecated
    public void vibrate(long[] p0, int p1) {}
    @java.lang.Deprecated
    public void vibrate(long[] p0, int p1, android.media.AudioAttributes p2) {}
    public void vibrate(android.os.VibrationEffect p0) {}
    public void vibrate(android.os.VibrationEffect p0, android.media.AudioAttributes p1) {}
    public abstract void vibrate(int p0, java.lang.String p1, android.os.VibrationEffect p2, java.lang.String p3, android.media.AudioAttributes p4);
    public int[] areEffectsSupported(int... p0) { return null; }
    public final int areAllEffectsSupported(int... p0) { return 0; }
    public boolean[] arePrimitivesSupported(int... p0) { return null; }
    public final boolean areAllPrimitivesSupported(int... p0) { return false; }
    public abstract void cancel();
    @android.annotation.SystemApi
    public boolean isVibrating() { return false; }
    @android.annotation.SystemApi
    public void addVibratorStateListener(android.os.Vibrator.OnVibratorStateChangedListener p0) {}
    @android.annotation.SystemApi
    public void addVibratorStateListener(java.util.concurrent.Executor p0, android.os.Vibrator.OnVibratorStateChangedListener p1) {}
    @android.annotation.SystemApi
    public void removeVibratorStateListener(android.os.Vibrator.OnVibratorStateChangedListener p0) {}

    @android.annotation.SystemApi
    public static interface OnVibratorStateChangedListener {
        public void onVibratorStateChanged(boolean p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VibrationEffectSupport {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VibrationIntensity {
    }
}
