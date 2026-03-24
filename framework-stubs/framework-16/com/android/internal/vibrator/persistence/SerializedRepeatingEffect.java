package com.android.internal.vibrator.persistence;

public class SerializedRepeatingEffect implements com.android.internal.vibrator.persistence.SerializedComposedEffect.SerializedSegment {
    SerializedRepeatingEffect(com.android.internal.vibrator.persistence.SerializedComposedEffect p0, com.android.internal.vibrator.persistence.SerializedComposedEffect p1) {}
    public void write(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    public void deserializeIntoComposition(android.os.VibrationEffect.Composition p0) {}
    public java.lang.String toString() { return null; }

    static final class Builder {
        Builder() {}
        void setPreamble(com.android.internal.vibrator.persistence.SerializedComposedEffect p0) {}
        void setRepeating(com.android.internal.vibrator.persistence.SerializedComposedEffect p0) {}
        boolean hasRepeatingSegment() { return false; }
        com.android.internal.vibrator.persistence.SerializedRepeatingEffect build() { return null; }
    }

    static final class Parser {
        Parser() {}
        @android.annotation.NonNull
        static com.android.internal.vibrator.persistence.SerializedRepeatingEffect parseNext(com.android.modules.utils.TypedXmlPullParser p0, int p1) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException { return null; }
    }
}
