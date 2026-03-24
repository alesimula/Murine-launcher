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
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.VibrationEffect> CREATOR = null;
    public VibrationEffect() {}
    public static android.os.VibrationEffect createOneShot(long p0, int p1) { return null; }
    public static android.os.VibrationEffect createWaveform(long[] p0, int p1) { return null; }
    @android.annotation.Nullable
    public abstract long[] computeCreateWaveformOffOnTimingsOrNull();
    public static android.os.VibrationEffect createWaveform(long[] p0, int[] p1, int p2) { return null; }
    @android.annotation.NonNull
    public static android.os.VibrationEffect createPredefined(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    @android.annotation.FlaggedApi("android.os.vibrator.vendor_vibration_effects")
    @android.annotation.RequiresPermission("android.permission.VIBRATE_VENDOR_EFFECTS")
    public static android.os.VibrationEffect createVendorEffect(android.os.PersistableBundle p0) { return null; }
    public static android.os.VibrationEffect get(int p0) { return null; }
    public static android.os.VibrationEffect get(int p0, boolean p1) { return null; }
    @android.annotation.Nullable
    public static android.os.VibrationEffect get(android.net.Uri p0, android.content.Context p1) { return null; }
    @android.annotation.NonNull
    public static android.os.VibrationEffect.Composition startComposition() { return null; }
    @android.annotation.NonNull
    public static android.os.VibrationEffect.WaveformBuilder startWaveform() { return null; }
    @android.annotation.NonNull
    public static android.os.VibrationEffect.WaveformBuilder startWaveform(android.os.VibrationEffect.VibrationParameter p0) { return null; }
    @android.annotation.NonNull
    public static android.os.VibrationEffect.WaveformBuilder startWaveform(android.os.VibrationEffect.VibrationParameter p0, android.os.VibrationEffect.VibrationParameter p1) { return null; }
    public int describeContents() { return 0; }
    public abstract void validate();
    @android.annotation.Nullable
    public abstract android.os.VibrationEffect cropToLengthOrNull(int p0);
    public abstract long getDuration();
    public long getDuration(android.os.VibratorInfo p0) { return 0L; }
    public abstract boolean areVibrationFeaturesSupported(android.os.VibratorInfo p0);
    public boolean isHapticFeedbackCandidate() { return false; }
    @android.annotation.NonNull
    public abstract android.os.VibrationEffect resolve(int p0);
    @android.annotation.NonNull
    public abstract android.os.VibrationEffect applyEffectStrength(int p0);
    @android.annotation.NonNull
    public abstract android.os.VibrationEffect scale(float p0);
    @android.annotation.NonNull
    public abstract android.os.VibrationEffect applyAdaptiveScale(float p0);
    @android.annotation.NonNull
    public abstract android.os.VibrationEffect applyRepeatingIndefinitely(boolean p0, int p1);
    public static float scale(float p0, float p1) { return 0.0f; }
    public static float scaleLinearly(float p0, float p1) { return 0.0f; }
    public abstract java.lang.String toDebugString();
    public static java.lang.String effectIdToString(int p0) { return null; }
    public static java.lang.String effectStrengthToString(int p0) { return null; }
    @android.annotation.FlaggedApi("android.os.vibrator.normalized_pwle_effects")
    @android.annotation.NonNull
    public static android.os.VibrationEffect createRepeatingEffect(android.os.VibrationEffect p0) { return null; }
    @android.annotation.FlaggedApi("android.os.vibrator.normalized_pwle_effects")
    @android.annotation.NonNull
    public static android.os.VibrationEffect createRepeatingEffect(android.os.VibrationEffect p0, android.os.VibrationEffect p1) { return null; }

    private static final class AmplitudeVibrationParameter extends android.os.VibrationEffect.VibrationParameter {
        public final float amplitude = 0.0f;
        AmplitudeVibrationParameter(float p0) { super(); }
    }

    @android.annotation.FlaggedApi("android.os.vibrator.normalized_pwle_effects")
    public static final class BasicEnvelopeBuilder {
        public BasicEnvelopeBuilder() {}
        @android.annotation.FlaggedApi("android.os.vibrator.normalized_pwle_effects")
        @android.annotation.NonNull
        public android.os.VibrationEffect.BasicEnvelopeBuilder setInitialSharpness(float p0) { return null; }
        @android.annotation.FlaggedApi("android.os.vibrator.normalized_pwle_effects")
        @android.annotation.NonNull
        public android.os.VibrationEffect.BasicEnvelopeBuilder addControlPoint(float p0, float p1, long p2) { return null; }
        @android.annotation.FlaggedApi("android.os.vibrator.normalized_pwle_effects")
        @android.annotation.NonNull
        public android.os.VibrationEffect build() { return null; }
    }

    public static final class Composed extends android.os.VibrationEffect {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.os.VibrationEffect.Composed> CREATOR = null;
        Composed(android.os.Parcel p0) { super(); }
        Composed(android.os.vibrator.VibrationEffectSegment p0) { super(); }
        public Composed(java.util.List<? extends android.os.vibrator.VibrationEffectSegment> p0, int p1) { super(); }
        @android.annotation.NonNull
        public java.util.List<android.os.vibrator.VibrationEffectSegment> getSegments() { return null; }
        public int getRepeatIndex() { return 0; }
        @android.annotation.Nullable
        public long[] computeCreateWaveformOffOnTimingsOrNull() { return null; }
        public void validate() {}
        @android.annotation.Nullable
        public android.os.VibrationEffect cropToLengthOrNull(int p0) { return null; }
        public long getDuration() { return 0L; }
        public long getDuration(android.os.VibratorInfo p0) { return 0L; }
        public boolean areVibrationFeaturesSupported(android.os.VibratorInfo p0) { return false; }
        public boolean isHapticFeedbackCandidate() { return false; }
        @android.annotation.NonNull
        public android.os.VibrationEffect.Composed resolve(int p0) { return null; }
        @android.annotation.NonNull
        public android.os.VibrationEffect applyEffectStrength(int p0) { return null; }
        @android.annotation.NonNull
        public android.os.VibrationEffect.Composed scale(float p0) { return null; }
        @android.annotation.NonNull
        public android.os.VibrationEffect.Composed applyAdaptiveScale(float p0) { return null; }
        @android.annotation.NonNull
        public android.os.VibrationEffect.Composed applyRepeatingIndefinitely(boolean p0, int p1) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public java.lang.String toDebugString() { return null; }
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
        @android.annotation.FlaggedApi("android.os.vibrator.primitive_composition_absolute_delay")
        public static final int DELAY_TYPE_PAUSE = 0;
        @android.annotation.FlaggedApi("android.os.vibrator.primitive_composition_absolute_delay")
        public static final int DELAY_TYPE_RELATIVE_START_OFFSET = 1;
        Composition() {}
        @android.annotation.NonNull
        public android.os.VibrationEffect.Composition addOffDuration(java.time.Duration p0) { return null; }
        @android.annotation.NonNull
        public android.os.VibrationEffect.Composition addEffect(android.os.VibrationEffect p0) { return null; }
        @android.annotation.NonNull
        public android.os.VibrationEffect.Composition repeatEffectIndefinitely(android.os.VibrationEffect p0) { return null; }
        @android.annotation.NonNull
        public android.os.VibrationEffect.Composition addPrimitive(int p0) { return null; }
        @android.annotation.NonNull
        public android.os.VibrationEffect.Composition addPrimitive(int p0, float p1) { return null; }
        @android.annotation.NonNull
        public android.os.VibrationEffect.Composition addPrimitive(int p0, float p1, int p2) { return null; }
        @android.annotation.FlaggedApi("android.os.vibrator.primitive_composition_absolute_delay")
        @android.annotation.NonNull
        public android.os.VibrationEffect.Composition addPrimitive(int p0, float p1, int p2, int p3) { return null; }
        @android.annotation.NonNull
        public android.os.VibrationEffect compose() { return null; }
        public static java.lang.String primitiveToString(int p0) { return null; }
        public static java.lang.String delayTypeToString(int p0) { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface DelayType {
        }

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

    public static interface Transformation<ParamT extends java.lang.Object> {
        @android.annotation.NonNull
        public android.os.VibrationEffect transform(android.os.VibrationEffect p0, ParamT p1);
    }

    @android.annotation.FlaggedApi("android.os.vibrator.vendor_vibration_effects")
    public static final class VendorEffect extends android.os.VibrationEffect {
        public static final int DEFAULT_STRENGTH = 1;
        public static final float DEFAULT_SCALE = 1.0f;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.os.VibrationEffect.VendorEffect> CREATOR = null;
        VendorEffect(android.os.Parcel p0) { super(); }
        public VendorEffect(android.os.PersistableBundle p0, int p1, float p2, float p3) { super(); }
        @android.annotation.NonNull
        public android.os.PersistableBundle getVendorData() { return null; }
        public int getEffectStrength() { return 0; }
        public float getScale() { return 0.0f; }
        public float getAdaptiveScale() { return 0.0f; }
        @android.annotation.Nullable
        public long[] computeCreateWaveformOffOnTimingsOrNull() { return null; }
        public void validate() {}
        @android.annotation.Nullable
        public android.os.VibrationEffect cropToLengthOrNull(int p0) { return null; }
        public long getDuration() { return 0L; }
        public boolean areVibrationFeaturesSupported(android.os.VibratorInfo p0) { return false; }
        public boolean isHapticFeedbackCandidate() { return false; }
        @android.annotation.NonNull
        public android.os.VibrationEffect.VendorEffect resolve(int p0) { return null; }
        @android.annotation.NonNull
        public android.os.VibrationEffect applyEffectStrength(int p0) { return null; }
        @android.annotation.NonNull
        public android.os.VibrationEffect.VendorEffect scale(float p0) { return null; }
        @android.annotation.NonNull
        public android.os.VibrationEffect applyAdaptiveScale(float p0) { return null; }
        @android.annotation.NonNull
        public android.os.VibrationEffect.VendorEffect applyRepeatingIndefinitely(boolean p0, int p1) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public java.lang.String toDebugString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class VibrationParameter {
        VibrationParameter() {}
        @android.annotation.NonNull
        public static android.os.VibrationEffect.VibrationParameter targetAmplitude(float p0) { return null; }
        @android.annotation.NonNull
        public static android.os.VibrationEffect.VibrationParameter targetFrequency(float p0) { return null; }
    }

    public static final class WaveformBuilder {
        WaveformBuilder() {}
        @android.annotation.NonNull
        public android.os.VibrationEffect.WaveformBuilder addTransition(java.time.Duration p0, android.os.VibrationEffect.VibrationParameter p1) { return null; }
        @android.annotation.NonNull
        public android.os.VibrationEffect.WaveformBuilder addTransition(java.time.Duration p0, android.os.VibrationEffect.VibrationParameter p1, android.os.VibrationEffect.VibrationParameter p2) { return null; }
        @android.annotation.NonNull
        public android.os.VibrationEffect.WaveformBuilder addSustain(java.time.Duration p0) { return null; }
        @android.annotation.NonNull
        public android.os.VibrationEffect build() { return null; }
    }

    @android.annotation.FlaggedApi("android.os.vibrator.normalized_pwle_effects")
    public static final class WaveformEnvelopeBuilder {
        public WaveformEnvelopeBuilder() {}
        @android.annotation.FlaggedApi("android.os.vibrator.normalized_pwle_effects")
        @android.annotation.NonNull
        public android.os.VibrationEffect.WaveformEnvelopeBuilder setInitialFrequencyHz(float p0) { return null; }
        @android.annotation.FlaggedApi("android.os.vibrator.normalized_pwle_effects")
        @android.annotation.NonNull
        public android.os.VibrationEffect.WaveformEnvelopeBuilder addControlPoint(float p0, float p1, long p2) { return null; }
        @android.annotation.FlaggedApi("android.os.vibrator.normalized_pwle_effects")
        @android.annotation.NonNull
        public android.os.VibrationEffect build() { return null; }
    }
}
