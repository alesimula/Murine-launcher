package android.view;

public class SurfaceControlRegistry {
    static boolean sCallStackDebuggingInitialized;
    static boolean sCallStackDebuggingEnabled;
    public void setReportingThresholds(int p0, int p1, android.view.SurfaceControlRegistry.Reporter p2) {}
    public void setCallStackDebuggingParams(java.lang.String p0, java.lang.String p1) {}
    @android.annotation.RequiresPermission("android.permission.READ_FRAME_BUFFER")
    @android.annotation.NonNull
    public static void createProcessInstance(android.content.Context p0) {}
    public static void destroyProcessInstance() {}
    public static android.view.SurfaceControlRegistry getProcessInstance() { return null; }
    void add(android.view.SurfaceControl p0) {}
    void remove(android.view.SurfaceControl p0) {}
    public int hashCode() { return 0; }
    static final void initializeCallStackDebugging() {}
    final void checkCallStackDebugging(java.lang.String p0, android.view.SurfaceControl.Transaction p1, android.view.SurfaceControl p2, java.lang.String p3) {}
    public final boolean matchesForCallStackDebugging(java.lang.String p0, java.lang.String p1) { return false; }
    static final boolean isCallStackDebuggingEnabled() { return false; }
    public static void dump(int p0, boolean p1, java.io.PrintWriter p2) {}

    private static class DefaultReporter implements android.view.SurfaceControlRegistry.Reporter {
        public void onMaxLayersExceeded(java.util.WeakHashMap<android.view.SurfaceControl, java.lang.Long> p0, int p1, java.io.PrintWriter p2) {}
    }

    private static class NoOpRegistry extends android.view.SurfaceControlRegistry {
        public void setReportingThresholds(int p0, int p1, android.view.SurfaceControlRegistry.Reporter p2) {}
        void add(android.view.SurfaceControl p0) {}
        void remove(android.view.SurfaceControl p0) {}
    }

    public static interface Reporter {
        public void onMaxLayersExceeded(java.util.WeakHashMap<android.view.SurfaceControl, java.lang.Long> p0, int p1, java.io.PrintWriter p2);
    }
}
