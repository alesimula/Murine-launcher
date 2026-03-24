package com.android.framework.protobuf;

public enum JavaType {
    VOID,
    INT,
    LONG,
    FLOAT,
    DOUBLE,
    BOOLEAN,
    STRING,
    BYTE_STRING,
    ENUM,
    MESSAGE;
    public java.lang.Object getDefaultDefault() { return null; }
    public java.lang.Class<?> getType() { return null; }
    public java.lang.Class<?> getBoxedType() { return null; }
    public boolean isValidType(java.lang.Class<?> p0) { return false; }
}
