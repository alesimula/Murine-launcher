package android.view;

public final class SurfaceSession {
    @android.annotation.UnsupportedAppUsage
    private long mNativeClient;
    private static native long nativeCreate();
    private static native void nativeDestroy(long p0);
    private static native void nativeKill(long p0);
    @android.annotation.UnsupportedAppUsage
    public SurfaceSession() {}
    protected void finalize() throws java.lang.Throwable {}
    @android.annotation.UnsupportedAppUsage
    public void kill() {}
}
