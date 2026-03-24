package com.android.internal.telephony;

public class EncodeException extends java.lang.Exception {
    private int mError;
    public static final int ERROR_UNENCODABLE = 0;
    public static final int ERROR_EXCEED_SIZE = 1;
    public EncodeException() { super(); }
    @android.annotation.UnsupportedAppUsage
    public EncodeException(java.lang.String p0) { super(); }
    public EncodeException(java.lang.String p0, int p1) { super(); }
    @android.annotation.UnsupportedAppUsage
    public EncodeException(char p0) { super(); }
    public int getError() { return 0; }
}
