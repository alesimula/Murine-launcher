package android.os.vibrator;

public final class RampSegment extends android.os.vibrator.VibrationEffectSegment {
    private final float mStartAmplitude = 0.0f;
    private final float mStartFrequency = 0.0f;
    private final float mEndAmplitude = 0.0f;
    private final float mEndFrequency = 0.0f;
    private final int mDuration = 0;
    public static final android.os.Parcelable.Creator<android.os.vibrator.RampSegment> CREATOR = null;
    RampSegment(android.os.Parcel p0) { super(); }
    public RampSegment(float p0, float p1, float p2, float p3, int p4) { super(); }
    public boolean equals(java.lang.Object p0) { return false; }
    public float getStartAmplitude() { return 0.0f; }
    public float getEndAmplitude() { return 0.0f; }
    public float getStartFrequency() { return 0.0f; }
    public float getEndFrequency() { return 0.0f; }
    public long getDuration() { return 0L; }
    public boolean hasNonZeroAmplitude() { return false; }
    public void validate() {}
    public android.os.vibrator.RampSegment resolve(int p0) { return null; }
    public android.os.vibrator.RampSegment scale(float p0) { return null; }
    public android.os.vibrator.RampSegment applyEffectStrength(int p0) { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
