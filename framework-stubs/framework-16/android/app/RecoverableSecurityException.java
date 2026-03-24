package android.app;

public final class RecoverableSecurityException extends java.lang.SecurityException implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.RecoverableSecurityException> CREATOR = null;
    public RecoverableSecurityException(android.os.Parcel p0) { super(); }
    public RecoverableSecurityException(java.lang.Throwable p0, java.lang.CharSequence p1, android.app.RemoteAction p2) { super(); }
    @android.annotation.NonNull
    public java.lang.CharSequence getUserMessage() { return null; }
    @android.annotation.NonNull
    public android.app.RemoteAction getUserAction() { return null; }
    public void showAsNotification(android.content.Context p0, java.lang.String p1) {}
    public void showAsDialog(android.app.Activity p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class LocalDialog extends android.app.DialogFragment {
        public LocalDialog() { super(); }
        public android.app.Dialog onCreateDialog(android.os.Bundle p0) { return null; }
    }
}
