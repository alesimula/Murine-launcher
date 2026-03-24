package com.android.internal.vibrator.persistence;

public interface XmlSerializedVibration<T extends java.lang.Object> {
    @android.annotation.NonNull
    public T deserialize();
    public void write(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException;
    public void writeContent(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException;
}
