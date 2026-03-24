package com.android.internal.vibrator.persistence;

final class SerializedPredefinedEffect implements com.android.internal.vibrator.persistence.SerializedComposedEffect.SerializedSegment {
    SerializedPredefinedEffect(com.android.internal.vibrator.persistence.XmlConstants.PredefinedEffectName p0, boolean p1) {}
    public void deserializeIntoComposition(android.os.VibrationEffect.Composition p0) {}
    public void write(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    public java.lang.String toString() { return null; }

    static final class Parser {
        Parser() {}
        @android.annotation.NonNull
        static com.android.internal.vibrator.persistence.SerializedPredefinedEffect parseNext(com.android.modules.utils.TypedXmlPullParser p0, int p1) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException { return null; }
    }
}
