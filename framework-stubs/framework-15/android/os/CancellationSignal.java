package android.os;

public final class CancellationSignal {
    public CancellationSignal() {}
    public boolean isCanceled() { return false; }
    public void throwIfCanceled() {}
    public void cancel() {}
    public void setOnCancelListener(android.os.CancellationSignal.OnCancelListener p0) {}
    public void setRemote(android.os.ICancellationSignal p0) {}
    public static android.os.ICancellationSignal createTransport() { return null; }
    public static android.os.CancellationSignal fromTransport(android.os.ICancellationSignal p0) { return null; }

    public static interface OnCancelListener {
        public void onCancel();
    }

    private static final class Transport extends android.os.ICancellationSignal.Stub {
        final android.os.CancellationSignal mCancellationSignal = null;
        public void cancel() throws android.os.RemoteException {}
    }
}
