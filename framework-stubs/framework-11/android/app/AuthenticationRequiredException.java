package android.app;

public final class AuthenticationRequiredException extends java.lang.SecurityException implements android.os.Parcelable {
    private static final java.lang.String TAG = "AuthenticationRequiredException";
    private final android.app.PendingIntent mUserAction = null;
    public static final android.os.Parcelable.Creator<android.app.AuthenticationRequiredException> CREATOR = null;
    public AuthenticationRequiredException(android.os.Parcel p0) { super((java.lang.String)null); }
    public AuthenticationRequiredException(java.lang.Throwable p0, android.app.PendingIntent p1) { super((java.lang.String)null); }
    public android.app.PendingIntent getUserAction() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
