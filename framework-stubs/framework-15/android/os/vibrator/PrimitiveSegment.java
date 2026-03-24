package android.os.vibrator;

public final class PrimitiveSegment extends android.os.vibrator.VibrationEffectSegment {
    public static final float DEFAULT_SCALE = 1.0f;
    public static final int DEFAULT_DELAY_MILLIS = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.vibrator.PrimitiveSegment> CREATOR = null;
    PrimitiveSegment(android.os.Parcel p0) { super(); }
    public PrimitiveSegment(int p0, float p1, int p2) { super(); }
    public int getPrimitiveId() { return 0; }
    public float getScale() { return 0.0f; }
    public int getDelay() { return 0; }
    public long getDuration() { return 0L; }
    public boolean areVibrationFeaturesSupported(android.os.VibratorInfo p0) { return false; }
    public boolean isHapticFeedbackCandidate() { return false; }
    @android.annotation.NonNull
    public android.os.vibrator.PrimitiveSegment resolve(int p0) { return null; }
    @android.annotation.NonNull
    public android.os.vibrator.PrimitiveSegment scale(float p0) { return null; }
    @android.annotation.NonNull
    public android.os.vibrator.PrimitiveSegment scaleLinearly(float p0) { return null; }
    @android.annotation.NonNull
    public android.os.vibrator.PrimitiveSegment applyEffectStrength(int p0) { return null; }
    public void validate() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public java.lang.String toDebugString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
