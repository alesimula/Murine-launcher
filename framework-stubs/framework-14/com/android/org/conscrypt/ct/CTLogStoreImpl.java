package com.android.org.conscrypt.ct;

public class CTLogStoreImpl implements com.android.org.conscrypt.ct.CTLogStore {
    public CTLogStoreImpl() {}
    public CTLogStoreImpl(java.io.File p0, java.io.File p1, com.android.org.conscrypt.ct.CTLogInfo[] p2) {}
    public com.android.org.conscrypt.ct.CTLogInfo getKnownLog(byte[] p0) { return null; }
    public static com.android.org.conscrypt.ct.CTLogInfo[] getDefaultFallbackLogs() { return null; }
    public static com.android.org.conscrypt.ct.CTLogInfo loadLog(java.io.File p0) throws java.io.FileNotFoundException, com.android.org.conscrypt.ct.CTLogStoreImpl.InvalidLogFileException { return null; }
    public static com.android.org.conscrypt.ct.CTLogInfo loadLog(java.io.InputStream p0) throws com.android.org.conscrypt.ct.CTLogStoreImpl.InvalidLogFileException { return null; }

    public static class InvalidLogFileException extends java.lang.Exception {
        public InvalidLogFileException() { super(); }
        public InvalidLogFileException(java.lang.String p0) { super(); }
        public InvalidLogFileException(java.lang.String p0, java.lang.Throwable p1) { super(); }
        public InvalidLogFileException(java.lang.Throwable p0) { super(); }
    }
}
