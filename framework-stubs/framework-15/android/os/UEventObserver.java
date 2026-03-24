package android.os;

public abstract class UEventObserver {
    public UEventObserver() {}
    protected void finalize() throws java.lang.Throwable {}
    public final void startObserving(java.lang.String p0) {}
    public final void stopObserving() {}
    public abstract void onUEvent(android.os.UEventObserver.UEvent p0);

    public static final class UEvent {
        public UEvent(java.lang.String p0) {}
        public java.lang.String get(java.lang.String p0) { return null; }
        public java.lang.String get(java.lang.String p0, java.lang.String p1) { return null; }
        public java.lang.String toString() { return null; }
    }

    private static final class UEventThread extends java.lang.Thread {
        public UEventThread() { super(); }
        public void run() {}
        public void addObserver(java.lang.String p0, android.os.UEventObserver p1) {}
        public void removeObserver(android.os.UEventObserver p0) {}
    }
}
