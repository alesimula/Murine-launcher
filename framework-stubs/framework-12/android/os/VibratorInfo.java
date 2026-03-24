package android.os;

public class VibratorInfo implements android.os.Parcelable {
    private static final java.lang.String TAG = "VibratorInfo";
    public static final android.os.VibratorInfo EMPTY_VIBRATOR_INFO = null;
    private final int mId = 0;
    private final long mCapabilities = 0L;
    private final android.util.SparseBooleanArray mSupportedEffects = null;
    private final android.util.SparseBooleanArray mSupportedBraking = null;
    private final android.util.SparseIntArray mSupportedPrimitives = null;
    private final int mPrimitiveDelayMax = 0;
    private final int mCompositionSizeMax = 0;
    private final int mPwlePrimitiveDurationMax = 0;
    private final int mPwleSizeMax = 0;
    private final float mQFactor = 0.0f;
    private final android.os.VibratorInfo.FrequencyMapping mFrequencyMapping = null;
    public static final android.os.Parcelable.Creator<android.os.VibratorInfo> CREATOR = null;
    VibratorInfo(android.os.Parcel p0) {}
    public VibratorInfo(int p0, long p1, android.util.SparseBooleanArray p2, android.util.SparseBooleanArray p3, android.util.SparseIntArray p4, int p5, int p6, int p7, int p8, float p9, android.os.VibratorInfo.FrequencyMapping p10) {}
    protected VibratorInfo(int p0, int p1, android.os.VibratorInfo p2) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int getId() { return 0; }
    public boolean hasAmplitudeControl() { return false; }
    public int getDefaultBraking() { return 0; }
    public int isEffectSupported(int p0) { return 0; }
    public boolean isPrimitiveSupported(int p0) { return false; }
    public int getPrimitiveDuration(int p0) { return 0; }
    public int getPrimitiveDelayMax() { return 0; }
    public int getCompositionSizeMax() { return 0; }
    public int getPwlePrimitiveDurationMax() { return 0; }
    public int getPwleSizeMax() { return 0; }
    public boolean hasCapability(long p0) { return false; }
    public float getResonantFrequency() { return 0.0f; }
    public float getQFactor() { return 0.0f; }
    public android.util.Range<java.lang.Float> getFrequencyRange() { return null; }
    public float getMaxAmplitude(float p0) { return 0.0f; }
    public float getAbsoluteFrequency(float p0) { return 0.0f; }
    protected long getCapabilities() { return 0L; }
    private java.lang.String[] getCapabilitiesNames() { return null; }
    private java.lang.String[] getSupportedEffectsNames() { return null; }
    private java.lang.String[] getSupportedBrakingNames() { return null; }
    private java.lang.String[] getSupportedPrimitivesNames() { return null; }

    public static final class Builder {
        private final int mId = 0;
        private long mCapabilities;
        private android.util.SparseBooleanArray mSupportedEffects;
        private android.util.SparseBooleanArray mSupportedBraking;
        private android.util.SparseIntArray mSupportedPrimitives;
        private int mPrimitiveDelayMax;
        private int mCompositionSizeMax;
        private int mPwlePrimitiveDurationMax;
        private int mPwleSizeMax;
        private float mQFactor;
        private android.os.VibratorInfo.FrequencyMapping mFrequencyMapping;
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
        public android.os.VibratorInfo.Builder setFrequencyMapping(android.os.VibratorInfo.FrequencyMapping p0) { return null; }
        public android.os.VibratorInfo build() { return null; }
        private static android.util.SparseBooleanArray toSparseBooleanArray(int[] p0) { return null; }
    }

    public static final class FrequencyMapping implements android.os.Parcelable {
        private final float mMinFrequencyHz = 0.0f;
        private final float mResonantFrequencyHz = 0.0f;
        private final float mFrequencyResolutionHz = 0.0f;
        private final float mSuggestedSafeRangeHz = 0.0f;
        private final float[] mMaxAmplitudes = null;
        private final android.util.Range<java.lang.Float> mRelativeFrequencyRange = null;
        public static final android.os.Parcelable.Creator<android.os.VibratorInfo.FrequencyMapping> CREATOR = null;
        FrequencyMapping(android.os.Parcel p0) {}
        public FrequencyMapping(float p0, float p1, float p2, float p3, float[] p4) {}
        public boolean isEmpty() { return false; }
        public float toHertz(float p0) { return 0.0f; }
        public float getMaxAmplitude(float p0) { return 0.0f; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
