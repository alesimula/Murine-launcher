package com.android.internal.app;

public class MediaRouteChooserDialog extends android.app.Dialog {
    private final android.media.MediaRouter mRouter = null;
    private final com.android.internal.app.MediaRouteChooserDialog.MediaRouterCallback mCallback = null;
    private int mRouteTypes;
    private android.view.View.OnClickListener mExtendedSettingsClickListener;
    private com.android.internal.app.MediaRouteChooserDialog.RouteAdapter mAdapter;
    private android.widget.ListView mListView;
    private android.widget.Button mExtendedSettingsButton;
    private boolean mAttachedToWindow;
    public MediaRouteChooserDialog(android.content.Context p0, int p1) { super((android.content.Context)null); }
    public int getRouteTypes() { return 0; }
    public void setRouteTypes(int p0) {}
    public void setExtendedSettingsClickListener(android.view.View.OnClickListener p0) {}
    public boolean onFilterRoute(android.media.MediaRouter.RouteInfo p0) { return false; }
    protected void onCreate(android.os.Bundle p0) {}
    private void updateExtendedSettingsButton() {}
    public void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    public void refreshRoutes() {}
    static boolean isLightTheme(android.content.Context p0) { return false; }

    private static final class RouteComparator implements java.util.Comparator<android.media.MediaRouter.RouteInfo> {
        public static final com.android.internal.app.MediaRouteChooserDialog.RouteComparator sInstance = null;
        private RouteComparator() {}
        public int compare(android.media.MediaRouter.RouteInfo p0, android.media.MediaRouter.RouteInfo p1) { return 0; }
    }

    private final class RouteAdapter extends android.widget.ArrayAdapter<android.media.MediaRouter.RouteInfo> implements android.widget.AdapterView.OnItemClickListener {
        private final android.view.LayoutInflater mInflater = null;
        public RouteAdapter(com.android.internal.app.MediaRouteChooserDialog p0, android.content.Context p1) { super((android.content.Context)null, 0); }
        public void update() {}
        public boolean areAllItemsEnabled() { return false; }
        public boolean isEnabled(int p0) { return false; }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        public void onItemClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) {}
    }

    private final class MediaRouterCallback extends android.media.MediaRouter.SimpleCallback {
        private MediaRouterCallback(com.android.internal.app.MediaRouteChooserDialog p0) { super(); }
        public void onRouteAdded(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteRemoved(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteSelected(android.media.MediaRouter p0, int p1, android.media.MediaRouter.RouteInfo p2) {}
    }
}
