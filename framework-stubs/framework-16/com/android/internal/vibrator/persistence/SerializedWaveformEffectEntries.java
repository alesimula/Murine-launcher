package com.android.internal.vibrator.persistence;

final class SerializedWaveformEffectEntries implements com.android.internal.vibrator.persistence.SerializedComposedEffect.SerializedSegment {
    public void deserializeIntoComposition(android.os.VibrationEffect.Composition p0) {}
    public void write(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    public java.lang.String toString() { return null; }

    static final class Builder {
        Builder() {}
        void addDurationAndAmplitude(long p0, int p1) {}
        boolean hasNonZeroDuration() { return false; }
        com.android.internal.vibrator.persistence.SerializedWaveformEffectEntries build() { return null; }
    }

    static final class Parser {
        Parser() {}
        public static void parseWaveformEntry(com.android.modules.utils.TypedXmlPullParser p0, com.android.internal.vibrator.persistence.SerializedWaveformEffectEntries.Builder p1) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException {}
    }
}
