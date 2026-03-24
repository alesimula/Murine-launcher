package android.os;

public abstract class VibrationEffect implements android.os.Parcelable {
    private static final float SCALE_GAMMA = 0.6499999761581421f;
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
    public static android.os.VibrationEffect.Composition startComposition() { return null; }
    public static android.os.VibrationEffect.WaveformBuilder startWaveform() { return null; }
    public int describeContents() { return 0; }
    public abstract void validate();
    public abstract long getDuration();
    public abstract <T extends android.os.VibrationEffect> T resolve(int p0);
    public abstract <T extends android.os.VibrationEffect> T scale(float p0);
    public <T extends android.os.VibrationEffect> T applyEffectStrength(int p0) { return null; }
    public static float scale(float p0, float p1) { return 0.0f; }
    public static java.lang.String effectIdToString(int p0) { return null; }
    public static java.lang.String effectStrengthToString(int p0) { return null; }

    public static final class Composed extends android.os.VibrationEffect {
        private final java.util.ArrayList<android.os.vibrator.VibrationEffectSegment> mSegments = null;
        private final int mRepeatIndex = 0;
        public static final android.os.Parcelable.Creator<android.os.VibrationEffect.Composed> CREATOR = null;
        Composed(android.os.Parcel p0) { super(); }
        Composed(android.os.vibrator.VibrationEffectSegment p0) { super(); }
        public Composed(java.util.List<? extends android.os.vibrator.VibrationEffectSegment> p0, int p1) { super(); }
        public java.util.List<android.os.vibrator.VibrationEffectSegment> getSegments() { return null; }
        public int getRepeatIndex() { return 0; }
        public void validate() {}
        public long getDuration() { return 0L; }
        public android.os.VibrationEffect.Composed resolve(int p0) { return null; }
        public android.os.VibrationEffect.Composed scale(float p0) { return null; }
        public android.os.VibrationEffect.Composed applyEffectStrength(int p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class Composition {
        public static final int PRIMITIVE_NOOP = 0;
        public static final int PRIMITIVE_CLICK = 1;
        public static final int PRIMITIVE_THUD = 2;
        public static final int PRIMITIVE_SPIN = 3;
        public static final int PRIMITIVE_QUICK_RISE = 4;
        public static final int PRIMITIVE_SLOW_RISE = 5;
        public static final int PRIMITIVE_QUICK_FALL = 6;
        public static final int PRIMITIVE_TICK = 7;
        public static final int PRIMITIVE_LOW_TICK = 8;
        private final java.util.ArrayList<android.os.vibrator.VibrationEffectSegment> mSegments = null;
        private int mRepeatIndex;
        Composition() {}
        public android.os.VibrationEffect.Composition addEffect(android.os.VibrationEffect p0) { return null; }
        public android.os.VibrationEffect.Composition addEffect(android.os.VibrationEffect p0, int p1) { return null; }
        public android.os.VibrationEffect.Composition addPrimitive(int p0) { return null; }
        public android.os.VibrationEffect.Composition addPrimitive(int p0, float p1) { return null; }
        public android.os.VibrationEffect.Composition addPrimitive(int p0, float p1, int p2) { return null; }
        private android.os.VibrationEffect.Composition addSegment(android.os.vibrator.VibrationEffectSegment p0) { return null; }
        private android.os.VibrationEffect.Composition addSegments(android.os.VibrationEffect p0) { return null; }
        public android.os.VibrationEffect compose() { return null; }
        public static java.lang.String primitiveToString(int p0) { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface PrimitiveType {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EffectType {
    }

    public static final class WaveformBuilder {
        private java.util.ArrayList<android.os.vibrator.VibrationEffectSegment> mSegments;
        WaveformBuilder() {}
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.os.VibrationEffect.WaveformBuilder addStep(float p0, int p1) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.os.VibrationEffect.WaveformBuilder addStep(float p0, float p1, int p2) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.os.VibrationEffect.WaveformBuilder addRamp(float p0, int p1) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.os.VibrationEffect.WaveformBuilder addRamp(float p0, float p1, int p2) { return null; }
        public android.os.VibrationEffect build() { return null; }
        public android.os.VibrationEffect build(int p0) { return null; }
        private float getPreviousFrequency() { return 0.0f; }
        private float getPreviousAmplitude() { return 0.0f; }
    }
}
