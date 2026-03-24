package android.view;

public abstract class TunnelModeEnabledListener {
    public TunnelModeEnabledListener(java.util.concurrent.Executor p0) {}
    public void destroy() {}
    protected void finalize() throws java.lang.Throwable {}
    public abstract void onTunnelModeEnabledChanged(boolean p0);
    public static void register(android.view.TunnelModeEnabledListener p0) {}
    public static void unregister(android.view.TunnelModeEnabledListener p0) {}
    public static void dispatchOnTunnelModeEnabledChanged(android.view.TunnelModeEnabledListener p0, boolean p1) {}
}
