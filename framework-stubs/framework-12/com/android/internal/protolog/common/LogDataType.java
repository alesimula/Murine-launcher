package com.android.internal.protolog.common;

public class LogDataType {
    public static final int STRING = 0;
    public static final int LONG = 1;
    public static final int DOUBLE = 2;
    public static final int BOOLEAN = 3;
    private static final int TYPE_WIDTH = 2;
    private static final int TYPE_MASK = 3;
    public LogDataType() {}
    public static int logDataTypesToBitMask(java.util.List<java.lang.Integer> p0) { return 0; }
    public static int bitmaskToLogDataType(int p0, int p1) { return 0; }
    public static java.util.List<java.lang.Integer> parseFormatString(java.lang.String p0) { return null; }
}
