package com.android.internal.vibrator.persistence;

final class SerializedAmplitudeStepWaveform implements com.android.internal.vibrator.persistence.SerializedComposedEffect.SerializedSegment {
    public void deserializeIntoComposition(android.os.VibrationEffect.Composition p0) {}
    public void write(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    public java.lang.String toString() { return null; }

    static final class Builder {
        Builder() {}
        void addDurationAndAmplitude(long p0, int p1) {}
        void setRepeatIndexToCurrentEntry() {}
        boolean hasNonZeroDuration() { return false; }
        com.android.internal.vibrator.persistence.SerializedAmplitudeStepWaveform build() { return null; }
    }

    static final class Parser {
        Parser() {}
        @android.annotation.NonNull
        static com.android.internal.vibrator.persistence.SerializedAmplitudeStepWaveform parseNext(com.android.modules.utils.TypedXmlPullParser p0) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException { return null; }
        static void parseWaveformEntry(com.android.modules.utils.TypedXmlPullParser p0, java.util.function.BiConsumer<java.lang.Integer, java.lang.Integer> p1) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException {}
    }
}
