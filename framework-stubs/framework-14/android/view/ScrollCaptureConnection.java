package android.view;

public class ScrollCaptureConnection extends android.view.IScrollCaptureConnection.Stub implements android.os.IBinder.DeathRecipient {
    public ScrollCaptureConnection(java.util.concurrent.Executor p0, android.view.ScrollCaptureTarget p1) { super(); }
    public android.os.ICancellationSignal startCapture(android.view.Surface p0, android.view.IScrollCaptureCallbacks p1) throws android.os.RemoteException { return null; }
    public android.os.ICancellationSignal requestImage(android.graphics.Rect p0) throws android.os.RemoteException { return null; }
    void onImageRequestCompleted(android.graphics.Rect p0) {}
    public android.os.ICancellationSignal endCapture() throws android.os.RemoteException { return null; }
    public void binderDied() {}
    public synchronized void close() {}
    public boolean isConnected() { return false; }
    public boolean isActive() { return false; }
    public java.lang.String toString() { return null; }
    protected void finalize() throws java.lang.Throwable {}

    private static final class ConsumerCallback<T extends java.lang.Object> extends android.view.ScrollCaptureConnection.SafeCallback<java.util.function.Consumer<T>> implements java.util.function.Consumer<T> {
        ConsumerCallback(android.os.CancellationSignal p0, java.util.concurrent.Executor p1, java.util.function.Consumer<T> p2) { super(null, null, null); }
        public void accept(T p0) {}
    }

    private static final class RunnableCallback extends android.view.ScrollCaptureConnection.SafeCallback<java.lang.Runnable> implements java.lang.Runnable {
        RunnableCallback(android.os.CancellationSignal p0, java.util.concurrent.Executor p1, java.lang.Runnable p2) { super(null, null, null); }
        public void run() {}
    }

    private static class SafeCallback<T extends java.lang.Object> {
        protected SafeCallback(android.os.CancellationSignal p0, java.util.concurrent.Executor p1, T p2) {}
        protected final void maybeAccept(java.util.function.Consumer<T> p0) {}
        static java.lang.Runnable create(android.os.CancellationSignal p0, java.util.concurrent.Executor p1, java.lang.Runnable p2) { return null; }
        static <T extends java.lang.Object> java.util.function.Consumer<T> create(android.os.CancellationSignal p0, java.util.concurrent.Executor p1, java.util.function.Consumer<T> p2) { return null; }
    }
}
