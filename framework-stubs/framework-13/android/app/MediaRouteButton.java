package android.app;

public class MediaRouteButton extends android.view.View {
    public MediaRouteButton(android.content.Context p0) { super((android.content.Context)null); }
    public MediaRouteButton(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public MediaRouteButton(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public MediaRouteButton(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public int getRouteTypes() { return 0; }
    public void setRouteTypes(int p0) {}
    public void setExtendedSettingsClickListener(android.view.View.OnClickListener p0) {}
    public void showDialog() {}
    boolean showDialogInternal() { return false; }
    public void setContentDescription(java.lang.CharSequence p0) {}
    public boolean performClick() { return false; }
    protected int[] onCreateDrawableState(int p0) { return null; }
    protected void drawableStateChanged() {}
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
    public void jumpDrawablesToCurrentState() {}
    public void setVisibility(int p0) {}
    public void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    protected void onMeasure(int p0, int p1) {}
    protected void onDraw(android.graphics.Canvas p0) {}

    private final class MediaRouterCallback extends android.media.MediaRouter.SimpleCallback {
        public void onRouteAdded(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteRemoved(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteSelected(android.media.MediaRouter p0, int p1, android.media.MediaRouter.RouteInfo p2) {}
        public void onRouteUnselected(android.media.MediaRouter p0, int p1, android.media.MediaRouter.RouteInfo p2) {}
        public void onRouteGrouped(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1, android.media.MediaRouter.RouteGroup p2, int p3) {}
        public void onRouteUngrouped(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1, android.media.MediaRouter.RouteGroup p2) {}
    }
}
