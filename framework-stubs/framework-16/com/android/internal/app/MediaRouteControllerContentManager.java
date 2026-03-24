package com.android.internal.app;

public class MediaRouteControllerContentManager {
    public MediaRouteControllerContentManager(android.content.Context p0, com.android.internal.app.MediaRouteControllerContentManager.Delegate p1) {}
    public void bindViews(android.view.View p0) {}
    public void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    public void update() {}
    public void onDisconnectButtonClick() {}
    public void requestUpdateRouteVolume(int p0) {}

    public static interface Delegate {
        public void setMediaRouteDeviceTitle(java.lang.CharSequence p0);
        public void setMediaRouteDeviceIcon(android.graphics.drawable.Drawable p0);
        public void dismissView();
    }

    private final class MediaRouterCallback extends android.media.MediaRouter.SimpleCallback {
        public void onRouteUnselected(android.media.MediaRouter p0, int p1, android.media.MediaRouter.RouteInfo p2) {}
        public void onRouteChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteVolumeChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteGrouped(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1, android.media.MediaRouter.RouteGroup p2, int p3) {}
        public void onRouteUngrouped(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1, android.media.MediaRouter.RouteGroup p2) {}
    }
}
