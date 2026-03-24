package android.media;

public class MediaCasStateException extends java.lang.IllegalStateException {
    private final int mErrorCode = 0;
    private final java.lang.String mDiagnosticInfo = null;
    private MediaCasStateException(int p0, java.lang.String p1, java.lang.String p2) { super(); }
    static void throwExceptionIfNeeded(int p0) {}
    static void throwExceptionIfNeeded(int p0, java.lang.String p1) {}
    public int getErrorCode() { return 0; }
    public java.lang.String getDiagnosticInfo() { return null; }
}
