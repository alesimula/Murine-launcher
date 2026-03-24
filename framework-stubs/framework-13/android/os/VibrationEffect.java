package android.os;

public abstract class VibrationEffect implements android.os.Parcelable {
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
    public static android.os.VibrationEffect.WaveformBuilder startWaveform(android.os.VibrationEffect.VibrationParameter p0) { return null; }
    public static android.os.VibrationEffect.WaveformBuilder startWaveform(android.os.VibrationEffect.VibrationParameter p0, android.os.VibrationEffect.VibrationParameter p1) { return null; }
    public int describeContents() { return 0; }
    public abstract void validate();
    public abstract long getDuration();
    public boolean isHapticFeedbackCandidate() { return false; }
    public abstract <T extends android.os.VibrationEffect> T resolve(int p0);
    public abstract <T extends android.os.VibrationEffect> T scale(float p0);
    public <T extends android.os.VibrationEffect> T applyEffectStrength(int p0) { return null; }
    public static float scale(float p0, float p1) { return 0.0f; }
    public static java.lang.String effectIdToString(int p0) { return null; }
    public static java.lang.String effectStrengthToString(int p0) { return null; }

    private static final class AmplitudeVibrationParameter extends android.os.VibrationEffect.VibrationParameter {
        public final float amplitude = 0.0f;
        AmplitudeVibrationParameter(float p0) { super(); }
    }

    public static final class Composed extends android.os.VibrationEffect {
        public static final android.os.Parcelable.Creator<android.os.VibrationEffect.Composed> CREATOR = null;
        Composed(android.os.Parcel p0) { super(); }
        Composed(android.os.vibrator.VibrationEffectSegment p0) { super(); }
        public Composed(java.util.List<? extends android.os.vibrator.VibrationEffectSegment> p0, int p1) { super(); }
        public java.util.List<android.os.vibrator.VibrationEffectSegment> getSegments() { return null; }
        public int getRepeatIndex() { return 0; }
        public void validate() {}
        public long getDuration() { return 0L; }
        public boolean isHapticFeedbackCandidate() { return false; }
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
        Composition() {}
        public android.os.VibrationEffect.Composition addOffDuration(java.time.Duration p0) { return null; }
        public android.os.VibrationEffect.Composition addEffect(android.os.VibrationEffect p0) { return null; }
        public android.os.VibrationEffect.Composition repeatEffectIndefinitely(android.os.VibrationEffect p0) { return null; }
        public android.os.VibrationEffect.Composition addPrimitive(int p0) { return null; }
        public android.os.VibrationEffect.Composition addPrimitive(int p0, float p1) { return null; }
        public android.os.VibrationEffect.Composition addPrimitive(int p0, float p1, int p2) { return null; }
        public android.os.VibrationEffect compose() { return null; }
        public static java.lang.String primitiveToString(int p0) { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface PrimitiveType {
        }

        public static final class UnreachableAfterRepeatingIndefinitelyException extends java.lang.IllegalStateException {
            UnreachableAfterRepeatingIndefinitelyException() { super(); }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EffectType {
    }

    private static final class FrequencyVibrationParameter extends android.os.VibrationEffect.VibrationParameter {
        public final float frequencyHz = 0.0f;
        FrequencyVibrationParameter(float p0) { super(); }
    }

    public static class VibrationParameter {
        VibrationParameter() {}
        public static android.os.VibrationEffect.VibrationParameter targetAmplitude(float p0) { return null; }
        public static android.os.VibrationEffect.VibrationParameter targetFrequency(float p0) { return null; }
    }

    public static final class WaveformBuilder {
        WaveformBuilder() {}
        public android.os.VibrationEffect.WaveformBuilder addTransition(java.time.Duration p0, android.os.VibrationEffect.VibrationParameter p1) { return null; }
        public android.os.VibrationEffect.WaveformBuilder addTransition(java.time.Duration p0, android.os.VibrationEffect.VibrationParameter p1, android.os.VibrationEffect.VibrationParameter p2) { return null; }
        public android.os.VibrationEffect.WaveformBuilder addSustain(java.time.Duration p0) { return null; }
        public android.os.VibrationEffect build() { return null; }
    }
}
