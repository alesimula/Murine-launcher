package android.os.vibrator;

public abstract class VibrationEffectSegment implements android.os.Parcelable {
    static final int PARCEL_TOKEN_PREBAKED = 1;
    static final int PARCEL_TOKEN_PRIMITIVE = 2;
    static final int PARCEL_TOKEN_STEP = 3;
    static final int PARCEL_TOKEN_RAMP = 4;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.vibrator.VibrationEffectSegment> CREATOR = null;
    VibrationEffectSegment() {}
    public abstract long getDuration();
    public abstract boolean areVibrationFeaturesSupported(android.os.VibratorInfo p0);
    public abstract boolean isHapticFeedbackCandidate();
    public abstract void validate();
    @android.annotation.NonNull
    public abstract <T extends android.os.vibrator.VibrationEffectSegment> T resolve(int p0);
    @android.annotation.NonNull
    public abstract <T extends android.os.vibrator.VibrationEffectSegment> T scale(float p0);
    @android.annotation.NonNull
    public abstract <T extends android.os.vibrator.VibrationEffectSegment> T scaleLinearly(float p0);
    @android.annotation.NonNull
    public abstract <T extends android.os.vibrator.VibrationEffectSegment> T applyEffectStrength(int p0);
    public abstract java.lang.String toDebugString();
    public static void checkFrequencyArgument(float p0, java.lang.String p1) {}
    public static void checkDurationArgument(long p0, java.lang.String p1) {}
    protected static boolean amplitudeRequiresAmplitudeControl(float p0) { return false; }
    protected static boolean frequencyRequiresFrequencyControl(float p0) { return false; }
}
