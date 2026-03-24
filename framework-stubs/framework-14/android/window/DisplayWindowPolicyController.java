package android.window;

public abstract class DisplayWindowPolicyController {
    public DisplayWindowPolicyController() {}
    public final boolean isInterestedWindowFlags(int p0, int p1) { return false; }
    public final void setInterestedWindowFlags(int p0, int p1) {}
    public final boolean isWindowingModeSupported(int p0) { return false; }
    public final void setSupportedWindowingModes(java.util.Set<java.lang.Integer> p0) {}
    public abstract boolean canContainActivities(java.util.List<android.content.pm.ActivityInfo> p0, int p1);
    public abstract boolean canActivityBeLaunched(android.content.pm.ActivityInfo p0, android.content.Intent p1, int p2, int p3, boolean p4);
    public abstract boolean keepActivityOnWindowFlagsChanged(android.content.pm.ActivityInfo p0, int p1, int p2);
    public abstract boolean canShowTasksInHostDeviceRecents();
    public void onTopActivityChanged(android.content.ComponentName p0, int p1, int p2) {}
    public void onRunningAppsChanged(android.util.ArraySet<java.lang.Integer> p0) {}
    public boolean isEnteringPipAllowed(int p0) { return false; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
}
