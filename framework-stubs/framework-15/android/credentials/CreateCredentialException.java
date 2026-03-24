package android.credentials;

public class CreateCredentialException extends java.lang.Exception {
    @android.annotation.NonNull
    public static final java.lang.String TYPE_UNKNOWN = "android.credentials.CreateCredentialException.TYPE_UNKNOWN";
    @android.annotation.NonNull
    public static final java.lang.String TYPE_NO_CREATE_OPTIONS = "android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS";
    @android.annotation.NonNull
    public static final java.lang.String TYPE_USER_CANCELED = "android.credentials.CreateCredentialException.TYPE_USER_CANCELED";
    @android.annotation.NonNull
    public static final java.lang.String TYPE_INTERRUPTED = "android.credentials.CreateCredentialException.TYPE_INTERRUPTED";
    @android.annotation.NonNull
    public java.lang.String getType() { return null; }
    public CreateCredentialException(java.lang.String p0, java.lang.String p1) { super(); }
    public CreateCredentialException(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2) { super(); }
    public CreateCredentialException(java.lang.String p0, java.lang.Throwable p1) { super(); }
    public CreateCredentialException(java.lang.String p0) { super(); }
}
