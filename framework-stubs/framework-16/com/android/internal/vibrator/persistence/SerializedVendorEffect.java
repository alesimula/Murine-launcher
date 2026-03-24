package com.android.internal.vibrator.persistence;

final class SerializedVendorEffect implements com.android.internal.vibrator.persistence.XmlSerializedVibration<android.os.VibrationEffect.VendorEffect> {
    SerializedVendorEffect(android.os.PersistableBundle p0) {}
    @android.annotation.SuppressLint("MissingPermission")
    @android.annotation.NonNull
    public android.os.VibrationEffect.VendorEffect deserialize() { return null; }
    public void write(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    public void writeContent(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    public java.lang.String toString() { return null; }

    static final class Parser {
        Parser() {}
        @android.annotation.NonNull
        static com.android.internal.vibrator.persistence.SerializedVendorEffect parseNext(com.android.modules.utils.TypedXmlPullParser p0, int p1) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException { return null; }
    }
}
