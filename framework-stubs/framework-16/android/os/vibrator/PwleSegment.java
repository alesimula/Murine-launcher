package android.os.vibrator;

@android.annotation.FlaggedApi("android.os.vibrator.normalized_pwle_effects")
public final class PwleSegment extends android.os.vibrator.VibrationEffectSegment {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.vibrator.PwleSegment> CREATOR = null;
    PwleSegment(android.os.Parcel p0) { super(); }
    @android.annotation.FlaggedApi("android.os.vibrator.normalized_pwle_effects")
    public PwleSegment(float p0, float p1, float p2, float p3, long p4) { super(); }
    public float getStartAmplitude() { return 0.0f; }
    public float getEndAmplitude() { return 0.0f; }
    public float getStartFrequencyHz() { return 0.0f; }
    public float getEndFrequencyHz() { return 0.0f; }
    public long getDuration() { return 0L; }
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean areVibrationFeaturesSupported(android.os.VibratorInfo p0) { return false; }
    public boolean isHapticFeedbackCandidate() { return false; }
    public void validate() {}
    @android.annotation.NonNull
    public android.os.vibrator.PwleSegment resolve(int p0) { return null; }
    @android.annotation.NonNull
    public android.os.vibrator.PwleSegment scale(float p0) { return null; }
    @android.annotation.NonNull
    public android.os.vibrator.PwleSegment scaleLinearly(float p0) { return null; }
    @android.annotation.NonNull
    public android.os.vibrator.PwleSegment applyEffectStrength(int p0) { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public java.lang.String toDebugString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
