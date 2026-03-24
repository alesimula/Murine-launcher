package android.os;

public abstract class Vibrator {
    public static final int VIBRATION_INTENSITY_OFF = 0;
    public static final int VIBRATION_INTENSITY_LOW = 1;
    public static final int VIBRATION_INTENSITY_MEDIUM = 2;
    public static final int VIBRATION_INTENSITY_HIGH = 3;
    public static final int VIBRATION_EFFECT_SUPPORT_UNKNOWN = 0;
    public static final int VIBRATION_EFFECT_SUPPORT_YES = 1;
    public static final int VIBRATION_EFFECT_SUPPORT_NO = 2;
    public Vibrator() {}
    protected Vibrator(android.content.Context p0) {}
    public android.os.VibratorInfo getInfo() { return null; }
    public int getDefaultVibrationIntensity(int p0) { return 0; }
    public int getId() { return 0; }
    public abstract boolean hasVibrator();
    public abstract boolean hasAmplitudeControl();
    public boolean hasFrequencyControl() { return false; }
    public boolean areVibrationFeaturesSupported(android.os.VibrationEffect p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.os.vibrator.vendor_vibration_effects")
    public boolean areVendorEffectsSupported() { return false; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.os.vibrator.vendor_vibration_effects")
    public boolean areVendorSessionsSupported() { return false; }
    public boolean hasExternalControl() { return false; }
    public float getResonantFrequency() { return 0.0f; }
    public float getQFactor() { return 0.0f; }
    @android.annotation.SuppressLint("UnflaggedApi")
    @android.annotation.Nullable
    public android.os.vibrator.VibratorFrequencyProfileLegacy getFrequencyProfileLegacy() { return null; }
    @android.annotation.FlaggedApi("android.os.vibrator.normalized_pwle_effects")
    @android.annotation.Nullable
    public android.os.vibrator.VibratorFrequencyProfile getFrequencyProfile() { return null; }
    public float getHapticChannelMaximumAmplitude() { return 0.0f; }
    @android.annotation.FlaggedApi("android.os.vibrator.normalized_pwle_effects")
    public boolean areEnvelopeEffectsSupported() { return false; }
    @android.annotation.FlaggedApi("android.os.vibrator.normalized_pwle_effects")
    @android.annotation.NonNull
    public android.os.vibrator.VibratorEnvelopeEffectInfo getEnvelopeEffectInfo() { return null; }
    @android.annotation.RequiresPermission("android.permission.VIBRATE_ALWAYS_ON")
    public boolean setAlwaysOnEffect(int p0, android.os.VibrationEffect p1, android.os.VibrationAttributes p2) { return false; }
    @android.annotation.RequiresPermission("android.permission.VIBRATE_ALWAYS_ON")
    public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.VibrationEffect p3, android.os.VibrationAttributes p4) { return false; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public void vibrate(long p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public void vibrate(long p0, android.media.AudioAttributes p1) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public void vibrate(long[] p0, int p1) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public void vibrate(long[] p0, int p1, android.media.AudioAttributes p2) {}
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public void vibrate(android.os.VibrationEffect p0) {}
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public void vibrate(android.os.VibrationEffect p0, android.media.AudioAttributes p1) {}
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public void vibrate(android.os.VibrationEffect p0, android.os.VibrationAttributes p1) {}
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public void vibrate(android.os.VibrationEffect p0, android.os.VibrationAttributes p1, java.lang.String p2) {}
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public abstract void vibrate(int p0, java.lang.String p1, android.os.VibrationEffect p2, java.lang.String p3, android.os.VibrationAttributes p4);
    public void performHapticFeedback(int p0, int p1, java.lang.String p2, int p3, int p4) {}
    public void performHapticFeedbackForInputDevice(int p0, int p1, int p2, java.lang.String p3, int p4, int p5) {}
    @android.annotation.NonNull
    public int[] areEffectsSupported(int... p0) { return null; }
    public final int areAllEffectsSupported(int... p0) { return 0; }
    @android.annotation.NonNull
    public boolean[] arePrimitivesSupported(int... p0) { return null; }
    public final boolean areAllPrimitivesSupported(int... p0) { return false; }
    @android.annotation.NonNull
    public int[] getPrimitiveDurations(int... p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public abstract void cancel();
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public abstract void cancel(int p0);
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ACCESS_VIBRATOR_STATE")
    public boolean isVibrating() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ACCESS_VIBRATOR_STATE")
    public void addVibratorStateListener(android.os.Vibrator.OnVibratorStateChangedListener p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ACCESS_VIBRATOR_STATE")
    public void addVibratorStateListener(java.util.concurrent.Executor p0, android.os.Vibrator.OnVibratorStateChangedListener p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ACCESS_VIBRATOR_STATE")
    public void removeVibratorStateListener(android.os.Vibrator.OnVibratorStateChangedListener p0) {}
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.os.vibrator.vendor_vibration_effects")
    @android.annotation.RequiresPermission(allOf={"android.permission.VIBRATE", "android.permission.VIBRATE_VENDOR_EFFECTS", "android.permission.START_VIBRATION_SESSIONS"})
    public void startVendorSession(android.os.VibrationAttributes p0, java.lang.String p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, android.os.vibrator.VendorVibrationSession.Callback p4) {}

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
