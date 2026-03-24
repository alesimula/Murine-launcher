package com.android.internal.util;

public class TypedProperties extends java.util.HashMap<java.lang.String, java.lang.Object> {
    static final java.lang.String NULL_STRING = null;
    static final int TYPE_UNSET = 120;
    static final int TYPE_BOOLEAN = 90;
    static final int TYPE_BYTE = 329;
    static final int TYPE_SHORT = 585;
    static final int TYPE_INT = 1097;
    static final int TYPE_LONG = 2121;
    static final int TYPE_FLOAT = 1094;
    static final int TYPE_DOUBLE = 2118;
    static final int TYPE_STRING = 29516;
    static final int TYPE_ERROR = -1;
    public static final int STRING_TYPE_MISMATCH = -2;
    public static final int STRING_NOT_SET = -1;
    public static final int STRING_NULL = 0;
    public static final int STRING_SET = 1;
    static java.io.StreamTokenizer initTokenizer(java.io.Reader p0) { return null; }
    static int interpretType(java.lang.String p0) { return 0; }
    static void parse(java.io.Reader p0, java.util.Map<java.lang.String, java.lang.Object> p1) throws com.android.internal.util.TypedProperties.ParseException, java.io.IOException {}
    static java.lang.Object parseValue(java.io.StreamTokenizer p0, int p1) throws java.io.IOException { return null; }
    public TypedProperties() { super(); }
    public void load(java.io.Reader p0) throws java.io.IOException {}
    public java.lang.Object get(java.lang.Object p0) { return null; }
    public boolean getBoolean(java.lang.String p0, boolean p1) { return false; }
    public byte getByte(java.lang.String p0, byte p1) { return 0; }
    public short getShort(java.lang.String p0, short p1) { return 0; }
    public int getInt(java.lang.String p0, int p1) { return 0; }
    public long getLong(java.lang.String p0, long p1) { return 0L; }
    public float getFloat(java.lang.String p0, float p1) { return 0.0f; }
    public double getDouble(java.lang.String p0, double p1) { return 0.0; }
    public java.lang.String getString(java.lang.String p0, java.lang.String p1) { return null; }
    public boolean getBoolean(java.lang.String p0) { return false; }
    public byte getByte(java.lang.String p0) { return 0; }
    public short getShort(java.lang.String p0) { return 0; }
    public int getInt(java.lang.String p0) { return 0; }
    public long getLong(java.lang.String p0) { return 0L; }
    public float getFloat(java.lang.String p0) { return 0.0f; }
    public double getDouble(java.lang.String p0) { return 0.0; }
    public java.lang.String getString(java.lang.String p0) { return null; }
    public int getStringInfo(java.lang.String p0) { return 0; }

    public static class TypeException extends java.lang.IllegalArgumentException {
        TypeException(java.lang.String p0, java.lang.Object p1, java.lang.String p2) { super(); }
    }

    public static class ParseException extends java.lang.IllegalArgumentException {
        ParseException(java.io.StreamTokenizer p0, java.lang.String p1) { super(); }
    }
}
