package com.android.internal.vibrator.persistence;

final class SerializedCompositionPrimitive implements com.android.internal.vibrator.persistence.SerializedComposedEffect.SerializedSegment {
    SerializedCompositionPrimitive(com.android.internal.vibrator.persistence.XmlConstants.PrimitiveEffectName p0, float p1, int p2, com.android.internal.vibrator.persistence.XmlConstants.PrimitiveDelayType p3) {}
    public void deserializeIntoComposition(android.os.VibrationEffect.Composition p0) {}
    public void write(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    public java.lang.String toString() { return null; }

    static final class Parser {
        Parser() {}
        @android.annotation.NonNull
        static com.android.internal.vibrator.persistence.SerializedCompositionPrimitive parseNext(com.android.modules.utils.TypedXmlPullParser p0) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException { return null; }
    }
}
