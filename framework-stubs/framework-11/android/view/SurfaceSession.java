package android.view;

public final class SurfaceSession {
    private long mNativeClient;
    private static native long nativeCreate();
    private static native void nativeDestroy(long p0);
    private static native void nativeKill(long p0);
    public SurfaceSession() {}
    protected void finalize() throws java.lang.Throwable {}
    public void kill() {}
}
