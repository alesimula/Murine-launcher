package android.os.vibrator;

public abstract class VibrationEffectSegment implements android.os.Parcelable {
    static final int PARCEL_TOKEN_PREBAKED = 1;
    static final int PARCEL_TOKEN_PRIMITIVE = 2;
    static final int PARCEL_TOKEN_STEP = 3;
    static final int PARCEL_TOKEN_RAMP = 4;
    public static final android.os.Parcelable.Creator<android.os.vibrator.VibrationEffectSegment> CREATOR = null;
    VibrationEffectSegment() {}
    public abstract long getDuration();
    public abstract boolean hasNonZeroAmplitude();
    public abstract void validate();
    public abstract <T extends android.os.vibrator.VibrationEffectSegment> T resolve(int p0);
    public abstract <T extends android.os.vibrator.VibrationEffectSegment> T scale(float p0);
    public abstract <T extends android.os.vibrator.VibrationEffectSegment> T applyEffectStrength(int p0);
}
