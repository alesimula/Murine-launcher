package com.android.org.conscrypt;

final class ShortBufferWithoutStackTraceException extends javax.crypto.ShortBufferException {
    public ShortBufferWithoutStackTraceException() { super(); }
    public ShortBufferWithoutStackTraceException(java.lang.String p0) { super(); }
    public synchronized java.lang.Throwable fillInStackTrace() { return null; }
}
