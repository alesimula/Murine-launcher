package android.os.vibrator;

@android.annotation.FlaggedApi("android.os.vibrator.normalized_pwle_effects")
public final class BasicPwleSegment extends android.os.vibrator.VibrationEffectSegment {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.vibrator.BasicPwleSegment> CREATOR = null;
    BasicPwleSegment(android.os.Parcel p0) { super(); }
    @android.annotation.FlaggedApi("android.os.vibrator.normalized_pwle_effects")
    public BasicPwleSegment(float p0, float p1, float p2, float p3, long p4) { super(); }
    public float getStartIntensity() { return 0.0f; }
    public float getEndIntensity() { return 0.0f; }
    public float getStartSharpness() { return 0.0f; }
    public float getEndSharpness() { return 0.0f; }
    public long getDuration() { return 0L; }
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean areVibrationFeaturesSupported(android.os.VibratorInfo p0) { return false; }
    public boolean isHapticFeedbackCandidate() { return false; }
    public void validate() {}
    @android.annotation.NonNull
    public android.os.vibrator.BasicPwleSegment resolve(int p0) { return null; }
    @android.annotation.NonNull
    public android.os.vibrator.BasicPwleSegment scale(float p0) { return null; }
    @android.annotation.NonNull
    public android.os.vibrator.BasicPwleSegment scaleLinearly(float p0) { return null; }
    @android.annotation.NonNull
    public android.os.vibrator.BasicPwleSegment applyEffectStrength(int p0) { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public java.lang.String toDebugString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
