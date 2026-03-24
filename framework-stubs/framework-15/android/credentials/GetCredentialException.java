package android.credentials;

public class GetCredentialException extends java.lang.Exception {
    @android.annotation.NonNull
    public static final java.lang.String TYPE_UNKNOWN = "android.credentials.GetCredentialException.TYPE_UNKNOWN";
    @android.annotation.NonNull
    public static final java.lang.String TYPE_NO_CREDENTIAL = "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL";
    @android.annotation.NonNull
    public static final java.lang.String TYPE_USER_CANCELED = "android.credentials.GetCredentialException.TYPE_USER_CANCELED";
    @android.annotation.NonNull
    public static final java.lang.String TYPE_INTERRUPTED = "android.credentials.GetCredentialException.TYPE_INTERRUPTED";
    @android.annotation.NonNull
    public java.lang.String getType() { return null; }
    public GetCredentialException(java.lang.String p0, java.lang.String p1) { super(); }
    public GetCredentialException(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2) { super(); }
    public GetCredentialException(java.lang.String p0, java.lang.Throwable p1) { super(); }
    public GetCredentialException(java.lang.String p0) { super(); }
}
