package android.app;

public class MediaRouteActionProvider extends android.view.ActionProvider {
    public MediaRouteActionProvider(android.content.Context p0) { super(null); }
    public void setRouteTypes(int p0) {}
    public void setExtendedSettingsClickListener(android.view.View.OnClickListener p0) {}
    public android.view.View onCreateActionView() { return null; }
    public android.view.View onCreateActionView(android.view.MenuItem p0) { return null; }
    public boolean onPerformDefaultAction() { return false; }
    public boolean overridesItemVisibility() { return false; }
    public boolean isVisible() { return false; }

    private static class MediaRouterCallback extends android.media.MediaRouter.SimpleCallback {
        public MediaRouterCallback(android.app.MediaRouteActionProvider p0) { super(); }
        public void onRouteAdded(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteRemoved(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
    }
}
