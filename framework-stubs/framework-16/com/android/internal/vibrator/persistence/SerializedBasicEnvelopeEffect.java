package com.android.internal.vibrator.persistence;

final class SerializedBasicEnvelopeEffect implements com.android.internal.vibrator.persistence.SerializedComposedEffect.SerializedSegment {
    SerializedBasicEnvelopeEffect(com.android.internal.vibrator.persistence.SerializedBasicEnvelopeEffect.BasicControlPoint[] p0, float p1) {}
    public void write(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    public void deserializeIntoComposition(android.os.VibrationEffect.Composition p0) {}
    public java.lang.String toString() { return null; }

    private static final class BasicControlPoint {
        BasicControlPoint(float p0, float p1, long p2) {}
        public java.lang.String toString() { return null; }
    }

    static final class Builder {
        Builder() {}
        void setInitialSharpness(float p0) {}
        void addControlPoint(float p0, float p1, long p2) {}
        com.android.internal.vibrator.persistence.SerializedBasicEnvelopeEffect build() { return null; }
    }

    static final class Parser {
        Parser() {}
        @android.annotation.NonNull
        static com.android.internal.vibrator.persistence.SerializedBasicEnvelopeEffect parseNext(com.android.modules.utils.TypedXmlPullParser p0, int p1) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException { return null; }
    }
}
