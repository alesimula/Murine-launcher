package android.view;

public abstract class TunnelModeEnabledListener {
    private long mNativeListener;
    private final java.util.concurrent.Executor mExecutor = null;
    public TunnelModeEnabledListener(java.util.concurrent.Executor p0) {}
    public void destroy() {}
    protected void finalize() throws java.lang.Throwable {}
    public abstract void onTunnelModeEnabledChanged(boolean p0);
    public static void register(android.view.TunnelModeEnabledListener p0) {}
    public static void unregister(android.view.TunnelModeEnabledListener p0) {}
    public static void dispatchOnTunnelModeEnabledChanged(android.view.TunnelModeEnabledListener p0, boolean p1) {}
    private static native long nativeCreate(android.view.TunnelModeEnabledListener p0);
    private static native void nativeDestroy(long p0);
    private static native void nativeRegister(long p0);
    private static native void nativeUnregister(long p0);
}
