package com.android.internal.vibrator.persistence;

@java.lang.FunctionalInterface
public interface XmlParser<T extends java.lang.Object> {
    public com.android.internal.vibrator.persistence.XmlSerializedVibration<T> parseTag(com.android.modules.utils.TypedXmlPullParser p0) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException;
}
