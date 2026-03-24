package com.android.internal.vibrator.persistence;

@java.lang.FunctionalInterface
public interface XmlSerializer<T extends java.lang.Object> {
    @android.annotation.NonNull
    public com.android.internal.vibrator.persistence.XmlSerializedVibration<T> serialize(T p0) throws com.android.internal.vibrator.persistence.XmlSerializerException;
}
