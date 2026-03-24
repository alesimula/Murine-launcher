package com.android.internal.vibrator.persistence;

public final class XmlValidator {
    public XmlValidator() {}
    public static void checkStartTag(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1) throws com.android.internal.vibrator.persistence.XmlParserException {}
    public static void checkStartTag(com.android.modules.utils.TypedXmlPullParser p0) throws com.android.internal.vibrator.persistence.XmlParserException {}
    public static void checkTagHasNoUnexpectedAttributes(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String... p1) throws com.android.internal.vibrator.persistence.XmlParserException {}
    public static void checkSerializedVibration(com.android.internal.vibrator.persistence.XmlSerializedVibration<? extends android.os.VibrationEffect> p0, android.os.VibrationEffect p1) throws com.android.internal.vibrator.persistence.XmlSerializerException {}
    public static void checkSerializerCondition(boolean p0, java.lang.String p1, java.lang.Object... p2) throws com.android.internal.vibrator.persistence.XmlSerializerException {}
    public static void checkParserCondition(boolean p0, java.lang.String p1, java.lang.Object... p2) throws com.android.internal.vibrator.persistence.XmlParserException {}
}
