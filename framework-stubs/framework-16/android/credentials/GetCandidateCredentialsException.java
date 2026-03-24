package android.credentials;

@android.annotation.Hide
public class GetCandidateCredentialsException extends java.lang.Exception {
    @android.annotation.NonNull
    public static final java.lang.String TYPE_UNKNOWN = "android.credentials.GetCandidateCredentialsException.TYPE_UNKNOWN";
    @android.annotation.NonNull
    public static final java.lang.String TYPE_NO_CREDENTIAL = "android.credentials.GetCandidateCredentialsException.TYPE_NO_CREDENTIAL";
    @android.annotation.NonNull
    public static final java.lang.String TYPE_USER_CANCELED = "android.credentials.GetCredentialException.TYPE_USER_CANCELED";
    @android.annotation.NonNull
    public static final java.lang.String TYPE_INTERRUPTED = "android.credentials.GetCredentialException.TYPE_INTERRUPTED";
    @android.annotation.NonNull
    public java.lang.String getType() { return null; }
    public GetCandidateCredentialsException(java.lang.String p0, java.lang.String p1) { super(); }
    public GetCandidateCredentialsException(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2) { super(); }
    public GetCandidateCredentialsException(java.lang.String p0, java.lang.Throwable p1) { super(); }
    public GetCandidateCredentialsException(java.lang.String p0) { super(); }
}
