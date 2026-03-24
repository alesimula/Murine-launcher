package android.view;

public class SurfaceControlRegistry {
    public void setReportingThresholds(int p0, int p1, android.view.SurfaceControlRegistry.Reporter p2) {}
    @android.annotation.RequiresPermission("android.permission.READ_FRAME_BUFFER")
    public static void createProcessInstance(android.content.Context p0) {}
    public static void destroyProcessInstance() {}
    public static android.view.SurfaceControlRegistry getProcessInstance() { return null; }
    void add(android.view.SurfaceControl p0) {}
    void remove(android.view.SurfaceControl p0) {}
    public int hashCode() { return 0; }
    public static void dump(int p0, boolean p1, java.io.PrintWriter p2) {}

    private static class DefaultReporter implements android.view.SurfaceControlRegistry.Reporter {
        public void onMaxLayersExceeded(java.util.WeakHashMap<android.view.SurfaceControl, java.lang.Long> p0, int p1, java.io.PrintWriter p2) {}
    }

    public static interface Reporter {
        public void onMaxLayersExceeded(java.util.WeakHashMap<android.view.SurfaceControl, java.lang.Long> p0, int p1, java.io.PrintWriter p2);
    }
}
