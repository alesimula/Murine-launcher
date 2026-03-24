package android.os;

public abstract class VibrationEffect implements android.os.Parcelable {
    private static final int PARCEL_TOKEN_ONE_SHOT = 1;
    private static final int PARCEL_TOKEN_WAVEFORM = 2;
    private static final int PARCEL_TOKEN_EFFECT = 3;
    public static final int DEFAULT_AMPLITUDE = -1;
    public static final int MAX_AMPLITUDE = 255;
    public static final int EFFECT_CLICK = 0;
    public static final int EFFECT_DOUBLE_CLICK = 1;
    public static final int EFFECT_TICK = 2;
    public static final int EFFECT_THUD = 3;
    public static final int EFFECT_POP = 4;
    public static final int EFFECT_HEAVY_CLICK = 5;
    public static final int EFFECT_TEXTURE_TICK = 21;
    public static final int EFFECT_STRENGTH_LIGHT = 0;
    public static final int EFFECT_STRENGTH_MEDIUM = 1;
    public static final int EFFECT_STRENGTH_STRONG = 2;
    public static final int[] RINGTONES = null;
    public static final android.os.Parcelable.Creator<android.os.VibrationEffect> CREATOR = null;
    public VibrationEffect() {}
    public static android.os.VibrationEffect createOneShot(long p0, int p1) { return null; }
    public static android.os.VibrationEffect createWaveform(long[] p0, int p1) { return null; }
    public static android.os.VibrationEffect createWaveform(long[] p0, int[] p1, int p2) { return null; }
    public static android.os.VibrationEffect createPredefined(int p0) { return null; }
    public static android.os.VibrationEffect get(int p0) { return null; }
    public static android.os.VibrationEffect get(int p0, boolean p1) { return null; }
    public static android.os.VibrationEffect get(android.net.Uri p0, android.content.Context p1) { return null; }
    public int describeContents() { return 0; }
    public abstract void validate();
    public abstract long getDuration();
    protected static int scale(int p0, float p1, int p2) { return 0; }

    public static class Waveform extends android.os.VibrationEffect implements android.os.Parcelable {
        private final long[] mTimings = null;
        private final int[] mAmplitudes = null;
        private final int mRepeat = 0;
        public static final android.os.Parcelable.Creator<android.os.VibrationEffect.Waveform> CREATOR = null;
        public Waveform(android.os.Parcel p0) { super(); }
        public Waveform(long[] p0, int[] p1, int p2) { super(); }
        public long[] getTimings() { return null; }
        public int[] getAmplitudes() { return null; }
        public int getRepeatIndex() { return 0; }
        public long getDuration() { return 0L; }
        public android.os.VibrationEffect.Waveform scale(float p0, int p1) { return null; }
        public android.os.VibrationEffect.Waveform resolve(int p0) { return null; }
        public void validate() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        private static boolean hasNonZeroEntry(long[] p0) { return false; }
    }

    public static class Prebaked extends android.os.VibrationEffect implements android.os.Parcelable {
        private final int mEffectId = 0;
        private final boolean mFallback = false;
        private int mEffectStrength;
        public static final android.os.Parcelable.Creator<android.os.VibrationEffect.Prebaked> CREATOR = null;
        public Prebaked(android.os.Parcel p0) { super(); }
        public Prebaked(int p0, boolean p1) { super(); }
        public int getId() { return 0; }
        public boolean shouldFallback() { return false; }
        public long getDuration() { return 0L; }
        public void setEffectStrength(int p0) {}
        public int getEffectStrength() { return 0; }
        private static boolean isValidEffectStrength(int p0) { return false; }
        public void validate() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class OneShot extends android.os.VibrationEffect implements android.os.Parcelable {
        private final long mDuration = 0L;
        private final int mAmplitude = 0;
        public static final android.os.Parcelable.Creator<android.os.VibrationEffect.OneShot> CREATOR = null;
        public OneShot(android.os.Parcel p0) { super(); }
        public OneShot(long p0, int p1) { super(); }
        public long getDuration() { return 0L; }
        public int getAmplitude() { return 0; }
        public android.os.VibrationEffect.OneShot scale(float p0, int p1) { return null; }
        public android.os.VibrationEffect.OneShot resolve(int p0) { return null; }
        public void validate() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EffectType {
    }
}
