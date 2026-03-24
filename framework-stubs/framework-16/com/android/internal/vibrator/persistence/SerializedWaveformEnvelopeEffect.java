package com.android.internal.vibrator.persistence;

final class SerializedWaveformEnvelopeEffect implements com.android.internal.vibrator.persistence.SerializedComposedEffect.SerializedSegment {
    SerializedWaveformEnvelopeEffect(com.android.internal.vibrator.persistence.SerializedWaveformEnvelopeEffect.WaveformControlPoint[] p0, float p1) {}
    public void write(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    public void deserializeIntoComposition(android.os.VibrationEffect.Composition p0) {}
    public java.lang.String toString() { return null; }

    static final class Builder {
        Builder() {}
        void setInitialFrequencyHz(float p0) {}
        void addControlPoint(float p0, float p1, long p2) {}
        com.android.internal.vibrator.persistence.SerializedWaveformEnvelopeEffect build() { return null; }
    }

    static final class Parser {
        Parser() {}
        @android.annotation.NonNull
        static com.android.internal.vibrator.persistence.SerializedWaveformEnvelopeEffect parseNext(com.android.modules.utils.TypedXmlPullParser p0, int p1) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException { return null; }
    }

    private static final class WaveformControlPoint {
        WaveformControlPoint(float p0, float p1, long p2) {}
        public java.lang.String toString() { return null; }
    }
}
