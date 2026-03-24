package android.media;

public class MediaCasException extends java.lang.Exception {
    private MediaCasException(java.lang.String p0) { super(); }
    static void throwExceptionIfNeeded(int p0) throws android.media.MediaCasException {}

    public static final class UnsupportedCasException extends android.media.MediaCasException {
        public UnsupportedCasException(java.lang.String p0) { super(null); }
    }

    public static final class ResourceBusyException extends android.media.MediaCasException {
        public ResourceBusyException(java.lang.String p0) { super(null); }
    }

    public static final class NotProvisionedException extends android.media.MediaCasException {
        public NotProvisionedException(java.lang.String p0) { super(null); }
    }

    public static final class DeniedByServerException extends android.media.MediaCasException {
        public DeniedByServerException(java.lang.String p0) { super(null); }
    }
}
