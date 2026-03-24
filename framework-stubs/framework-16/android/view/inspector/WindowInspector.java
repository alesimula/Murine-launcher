package android.view.inspector;

public final class WindowInspector {
    @android.annotation.NonNull
    public static java.util.List<android.view.View> getGlobalWindowViews() { return null; }
    @android.annotation.FlaggedApi("android.view.flags.root_view_changed_listener")
    public static void addGlobalWindowViewsListener(java.util.concurrent.Executor p0, java.util.function.Consumer<java.util.List<android.view.View>> p1) {}
    @android.annotation.FlaggedApi("android.view.flags.root_view_changed_listener")
    public static void removeGlobalWindowViewsListener(java.util.function.Consumer<java.util.List<android.view.View>> p0) {}
}
