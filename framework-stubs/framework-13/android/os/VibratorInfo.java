package android.os;

public class VibratorInfo implements android.os.Parcelable {
    public static final android.os.VibratorInfo EMPTY_VIBRATOR_INFO = null;
    public static final android.os.Parcelable.Creator<android.os.VibratorInfo> CREATOR = null;
    VibratorInfo(android.os.Parcel p0) {}
    public VibratorInfo(int p0, android.os.VibratorInfo p1) {}
    public VibratorInfo(int p0, long p1, android.util.SparseBooleanArray p2, android.util.SparseBooleanArray p3, android.util.SparseIntArray p4, int p5, int p6, int p7, int p8, float p9, android.os.VibratorInfo.FrequencyProfile p10) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int getId() { return 0; }
    public boolean hasAmplitudeControl() { return false; }
    public int getDefaultBraking() { return 0; }
    public android.util.SparseBooleanArray getSupportedBraking() { return null; }
    public boolean isBrakingSupportKnown() { return false; }
    public boolean hasBrakingSupport(int p0) { return false; }
    public boolean isEffectSupportKnown() { return false; }
    public int isEffectSupported(int p0) { return 0; }
    public android.util.SparseBooleanArray getSupportedEffects() { return null; }
    public boolean isPrimitiveSupported(int p0) { return false; }
    public int getPrimitiveDuration(int p0) { return 0; }
    public android.util.SparseIntArray getSupportedPrimitives() { return null; }
    public int getPrimitiveDelayMax() { return 0; }
    public int getCompositionSizeMax() { return 0; }
    public int getPwlePrimitiveDurationMax() { return 0; }
    public int getPwleSizeMax() { return 0; }
    public boolean hasCapability(long p0) { return false; }
    public float getResonantFrequencyHz() { return 0.0f; }
    public float getQFactor() { return 0.0f; }
    public android.os.VibratorInfo.FrequencyProfile getFrequencyProfile() { return null; }
    protected long getCapabilities() { return 0L; }

    public static final class Builder {
        public Builder(int p0) {}
        public android.os.VibratorInfo.Builder setCapabilities(long p0) { return null; }
        public android.os.VibratorInfo.Builder setSupportedEffects(int... p0) { return null; }
        public android.os.VibratorInfo.Builder setSupportedBraking(int... p0) { return null; }
        public android.os.VibratorInfo.Builder setPwlePrimitiveDurationMax(int p0) { return null; }
        public android.os.VibratorInfo.Builder setPwleSizeMax(int p0) { return null; }
        public android.os.VibratorInfo.Builder setSupportedPrimitive(int p0, int p1) { return null; }
        public android.os.VibratorInfo.Builder setPrimitiveDelayMax(int p0) { return null; }
        public android.os.VibratorInfo.Builder setCompositionSizeMax(int p0) { return null; }
        public android.os.VibratorInfo.Builder setQFactor(float p0) { return null; }
        public android.os.VibratorInfo.Builder setFrequencyProfile(android.os.VibratorInfo.FrequencyProfile p0) { return null; }
        public android.os.VibratorInfo build() { return null; }
    }

    public static final class FrequencyProfile implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.os.VibratorInfo.FrequencyProfile> CREATOR = null;
        FrequencyProfile(android.os.Parcel p0) {}
        public FrequencyProfile(float p0, float p1, float p2, float[] p3) {}
        public boolean isEmpty() { return false; }
        public android.util.Range<java.lang.Float> getFrequencyRangeHz() { return null; }
        public float getMaxAmplitude(float p0) { return 0.0f; }
        public float[] getMaxAmplitudes() { return null; }
        public float getFrequencyResolutionHz() { return 0.0f; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
