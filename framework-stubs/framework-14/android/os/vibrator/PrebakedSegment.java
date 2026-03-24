package android.os.vibrator;

public final class PrebakedSegment extends android.os.vibrator.VibrationEffectSegment {
    public static final android.os.Parcelable.Creator<android.os.vibrator.PrebakedSegment> CREATOR = null;
    PrebakedSegment(android.os.Parcel p0) { super(); }
    public PrebakedSegment(int p0, boolean p1, int p2) { super(); }
    public int getEffectId() { return 0; }
    public int getEffectStrength() { return 0; }
    public boolean shouldFallback() { return false; }
    public long getDuration() { return 0L; }
    public boolean areVibrationFeaturesSupported(android.os.Vibrator p0) { return false; }
    public boolean isHapticFeedbackCandidate() { return false; }
    public boolean hasNonZeroAmplitude() { return false; }
    public android.os.vibrator.PrebakedSegment resolve(int p0) { return null; }
    public android.os.vibrator.PrebakedSegment scale(float p0) { return null; }
    public android.os.vibrator.PrebakedSegment applyEffectStrength(int p0) { return null; }
    public void validate() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
