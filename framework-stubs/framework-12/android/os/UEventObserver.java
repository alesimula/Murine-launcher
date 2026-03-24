package android.os;

public abstract class UEventObserver {
    private static final java.lang.String TAG = "UEventObserver";
    private static final boolean DEBUG = false;
    private static android.os.UEventObserver.UEventThread sThread;
    private static native void nativeSetup();
    private static native java.lang.String nativeWaitForNextEvent();
    private static native void nativeAddMatch(java.lang.String p0);
    private static native void nativeRemoveMatch(java.lang.String p0);
    public UEventObserver() {}
    protected void finalize() throws java.lang.Throwable {}
    private static android.os.UEventObserver.UEventThread getThread() { return null; }
    private static android.os.UEventObserver.UEventThread peekThread() { return null; }
    public final void startObserving(java.lang.String p0) {}
    public final void stopObserving() {}
    public abstract void onUEvent(android.os.UEventObserver.UEvent p0);

    public static final class UEvent {
        private final java.util.HashMap<java.lang.String, java.lang.String> mMap = null;
        public UEvent(java.lang.String p0) {}
        public java.lang.String get(java.lang.String p0) { return null; }
        public java.lang.String get(java.lang.String p0, java.lang.String p1) { return null; }
        public java.lang.String toString() { return null; }
    }

    private static final class UEventThread extends java.lang.Thread {
        private final java.util.ArrayList<java.lang.Object> mKeysAndObservers = null;
        private final java.util.ArrayList<android.os.UEventObserver> mTempObserversToSignal = null;
        public UEventThread() { super(); }
        public void run() {}
        private void sendEvent(java.lang.String p0) {}
        public void addObserver(java.lang.String p0, android.os.UEventObserver p1) {}
        public void removeObserver(android.os.UEventObserver p0) {}
    }
}
