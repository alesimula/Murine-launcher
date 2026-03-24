package com.android.internal.app;

public class MediaRouteControllerDialog extends android.app.AlertDialog {
    private static final int VOLUME_UPDATE_DELAY_MILLIS = 250;
    private final android.media.MediaRouter mRouter = null;
    private final com.android.internal.app.MediaRouteControllerDialog.MediaRouterCallback mCallback = null;
    private final android.media.MediaRouter.RouteInfo mRoute = null;
    private boolean mCreated;
    private android.graphics.drawable.Drawable mMediaRouteButtonDrawable;
    private int[] mMediaRouteConnectingState;
    private int[] mMediaRouteOnState;
    private android.graphics.drawable.Drawable mCurrentIconDrawable;
    private boolean mVolumeControlEnabled;
    private android.widget.LinearLayout mVolumeLayout;
    private android.widget.SeekBar mVolumeSlider;
    private boolean mVolumeSliderTouched;
    private android.view.View mControlView;
    private boolean mAttachedToWindow;
    public MediaRouteControllerDialog(android.content.Context p0, int p1) { super((android.content.Context)null); }
    public android.media.MediaRouter.RouteInfo getRoute() { return null; }
    public android.view.View onCreateMediaControlView(android.os.Bundle p0) { return null; }
    public android.view.View getMediaControlView() { return null; }
    public void setVolumeControlEnabled(boolean p0) {}
    public boolean isVolumeControlEnabled() { return false; }
    protected void onCreate(android.os.Bundle p0) {}
    public void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    private boolean update() { return false; }
    private android.graphics.drawable.Drawable obtainMediaRouteButtonDrawable() { return null; }
    private android.graphics.drawable.Drawable getIconDrawable() { return null; }
    private void updateVolume() {}
    private boolean isVolumeControlAvailable() { return false; }

    private final class MediaRouterCallback extends android.media.MediaRouter.SimpleCallback {
        private MediaRouterCallback(com.android.internal.app.MediaRouteControllerDialog p0) { super(); }
        public void onRouteUnselected(android.media.MediaRouter p0, int p1, android.media.MediaRouter.RouteInfo p2) {}
        public void onRouteChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteVolumeChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteGrouped(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1, android.media.MediaRouter.RouteGroup p2, int p3) {}
        public void onRouteUngrouped(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1, android.media.MediaRouter.RouteGroup p2) {}
    }
}
