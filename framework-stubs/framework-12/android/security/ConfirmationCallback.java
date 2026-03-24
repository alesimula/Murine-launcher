package android.security;

public abstract class ConfirmationCallback {
    public ConfirmationCallback() {}
    public void onConfirmed(byte[] p0) {}
    public void onDismissed() {}
    public void onCanceled() {}
    public void onError(java.lang.Throwable p0) {}
}
