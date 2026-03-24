package android.app.jank;

@android.annotation.FlaggedApi("android.app.jank.detailed_app_jank_metrics_api")
public final class AppJankStats {
    public static final java.lang.String WIDGET_CATEGORY_UNSPECIFIED = "unspecified";
    public static final java.lang.String WIDGET_CATEGORY_SCROLL = "scroll";
    public static final java.lang.String WIDGET_CATEGORY_ANIMATION = "animation";
    public static final java.lang.String WIDGET_CATEGORY_MEDIA = "media";
    public static final java.lang.String WIDGET_CATEGORY_NAVIGATION = "navigation";
    public static final java.lang.String WIDGET_CATEGORY_KEYBOARD = "keyboard";
    public static final java.lang.String WIDGET_CATEGORY_OTHER = "other";
    public static final java.lang.String WIDGET_STATE_UNSPECIFIED = "unspecified";
    public static final java.lang.String WIDGET_STATE_NONE = "none";
    public static final java.lang.String WIDGET_STATE_SCROLLING = "scrolling";
    public static final java.lang.String WIDGET_STATE_FLINGING = "flinging";
    public static final java.lang.String WIDGET_STATE_SWIPING = "swiping";
    public static final java.lang.String WIDGET_STATE_DRAGGING = "dragging";
    public static final java.lang.String WIDGET_STATE_ZOOMING = "zooming";
    public static final java.lang.String WIDGET_STATE_ANIMATING = "animating";
    public static final java.lang.String WIDGET_STATE_PLAYBACK = "playback";
    public static final java.lang.String WIDGET_STATE_TAPPING = "tapping";
    public static final java.lang.String WIDGET_STATE_PREDICTIVE_BACK = "predictive_back";
    public AppJankStats(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, long p5, long p6, android.app.jank.RelativeFrameTimeHistogram p7) {}
    public int getUid() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getWidgetId() { return null; }
    @android.annotation.NonNull
    public java.lang.String getWidgetCategory() { return null; }
    @android.annotation.NonNull
    public java.lang.String getWidgetState() { return null; }
    public long getJankyFrameCount() { return 0L; }
    public long getTotalFrameCount() { return 0L; }
    @android.annotation.NonNull
    public android.app.jank.RelativeFrameTimeHistogram getRelativeFrameTimeHistogram() { return null; }
    @android.annotation.Nullable
    public java.lang.String getNavigationComponent() { return null; }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WidgetCategory {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WidgetState {
    }
}
