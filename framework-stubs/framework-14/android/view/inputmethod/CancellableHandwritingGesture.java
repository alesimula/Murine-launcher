package android.view.inputmethod;

public abstract class CancellableHandwritingGesture extends android.view.inputmethod.HandwritingGesture {
    android.os.CancellationSignal mCancellationSignal;
    android.os.IBinder mCancellationSignalToken;
    public CancellableHandwritingGesture() { super(); }
    public void setCancellationSignal(android.os.CancellationSignal p0) {}
    android.os.CancellationSignal getCancellationSignal() { return null; }
    public void unbeamCancellationSignal(android.os.CancellationSignalBeamer.Receiver p0) {}
}
