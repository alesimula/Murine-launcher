package android.appwidget;

public abstract class AppWidgetManagerInternal {
    public AppWidgetManagerInternal() {}
    @android.annotation.Nullable
    public abstract android.util.ArraySet<java.lang.String> getHostedWidgetPackages(int p0);
    public abstract void unlockUser(int p0);
    public abstract void applyResourceOverlaysToWidgets(java.util.Set<java.lang.String> p0, int p1, boolean p2);
}
