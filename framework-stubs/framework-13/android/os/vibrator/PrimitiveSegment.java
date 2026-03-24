package android.os.vibrator;

public final class PrimitiveSegment extends android.os.vibrator.VibrationEffectSegment {
    public static final android.os.Parcelable.Creator<android.os.vibrator.PrimitiveSegment> CREATOR = null;
    PrimitiveSegment(android.os.Parcel p0) { super(); }
    public PrimitiveSegment(int p0, float p1, int p2) { super(); }
    public int getPrimitiveId() { return 0; }
    public float getScale() { return 0.0f; }
    public int getDelay() { return 0; }
    public long getDuration() { return 0L; }
    public boolean isHapticFeedbackCandidate() { return false; }
    public boolean hasNonZeroAmplitude() { return false; }
    public android.os.vibrator.PrimitiveSegment resolve(int p0) { return null; }
    public android.os.vibrator.PrimitiveSegment scale(float p0) { return null; }
    public android.os.vibrator.PrimitiveSegment applyEffectStrength(int p0) { return null; }
    public void validate() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
