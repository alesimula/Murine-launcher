package com.android.internal.vibrator.persistence;

public final class XmlConstants {
    public static final java.lang.String NAMESPACE = null;
    public static final java.lang.String TAG_VIBRATION_EFFECT = "vibration-effect";
    public static final java.lang.String TAG_VIBRATION_SELECT = "vibration-select";
    public static final java.lang.String TAG_PREDEFINED_EFFECT = "predefined-effect";
    public static final java.lang.String TAG_PRIMITIVE_EFFECT = "primitive-effect";
    public static final java.lang.String TAG_WAVEFORM_EFFECT = "waveform-effect";
    public static final java.lang.String TAG_WAVEFORM_ENTRY = "waveform-entry";
    public static final java.lang.String TAG_REPEATING = "repeating";
    public static final java.lang.String ATTRIBUTE_NAME = "name";
    public static final java.lang.String ATTRIBUTE_FALLBACK = "fallback";
    public static final java.lang.String ATTRIBUTE_DURATION_MS = "durationMs";
    public static final java.lang.String ATTRIBUTE_AMPLITUDE = "amplitude";
    public static final java.lang.String ATTRIBUTE_SCALE = "scale";
    public static final java.lang.String ATTRIBUTE_DELAY_MS = "delayMs";
    public static final java.lang.String VALUE_AMPLITUDE_DEFAULT = "default";
    public static final int FLAG_ALLOW_HIDDEN_APIS = 1;
    public XmlConstants() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }

    public static enum PredefinedEffectName {
        TICK,
        CLICK,
        HEAVY_CLICK,
        DOUBLE_CLICK,
        TEXTURE_TICK,
        THUD,
        POP,
        RINGTONE_1,
        RINGTONE_2,
        RINGTONE_3,
        RINGTONE_4,
        RINGTONE_5,
        RINGTONE_6,
        RINGTONE_7,
        RINGTONE_8,
        RINGTONE_9,
        RINGTONE_10,
        RINGTONE_11,
        RINGTONE_12,
        RINGTONE_13,
        RINGTONE_14,
        RINGTONE_15;
        @android.annotation.Nullable
        public static com.android.internal.vibrator.persistence.XmlConstants.PredefinedEffectName findById(int p0, int p1) { return null; }
        @android.annotation.Nullable
        public static com.android.internal.vibrator.persistence.XmlConstants.PredefinedEffectName findByName(java.lang.String p0, int p1) { return null; }
        public int getEffectId() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static enum PrimitiveEffectName {
        LOW_TICK,
        TICK,
        CLICK,
        SLOW_RISE,
        QUICK_RISE,
        QUICK_FALL,
        SPIN,
        THUD;
        @android.annotation.Nullable
        public static com.android.internal.vibrator.persistence.XmlConstants.PrimitiveEffectName findById(int p0) { return null; }
        @android.annotation.Nullable
        public static com.android.internal.vibrator.persistence.XmlConstants.PrimitiveEffectName findByName(java.lang.String p0) { return null; }
        public int getPrimitiveId() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
