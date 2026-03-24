package android.view;

public interface WindowInsetsController {
    public static final int APPEARANCE_OPAQUE_STATUS_BARS = 1;
    public static final int APPEARANCE_OPAQUE_NAVIGATION_BARS = 2;
    public static final int APPEARANCE_LOW_PROFILE_BARS = 4;
    public static final int APPEARANCE_LIGHT_STATUS_BARS = 8;
    public static final int APPEARANCE_LIGHT_NAVIGATION_BARS = 16;
    public static final int APPEARANCE_SEMI_TRANSPARENT_STATUS_BARS = 32;
    public static final int APPEARANCE_SEMI_TRANSPARENT_NAVIGATION_BARS = 64;
    @android.annotation.FlaggedApi("android.view.flags.customizable_window_headers")
    public static final int APPEARANCE_TRANSPARENT_CAPTION_BAR_BACKGROUND = 128;
    @android.annotation.FlaggedApi("android.view.flags.customizable_window_headers")
    public static final int APPEARANCE_LIGHT_CAPTION_BARS = 256;
    public static final int APPEARANCE_FORCE_LIGHT_NAVIGATION_BARS = 512;
    @java.lang.Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_TOUCH = 0;
    public static final int BEHAVIOR_DEFAULT = 1;
    @java.lang.Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_SWIPE = 1;
    public static final int BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE = 2;
    public void show(int p0);
    public void hide(int p0);
    public void controlWindowInsetsAnimation(int p0, long p1, android.view.animation.Interpolator p2, android.os.CancellationSignal p3, android.view.WindowInsetsAnimationControlListener p4);
    public void setSystemDrivenInsetsAnimationLoggingListener(android.view.WindowInsetsAnimationControlListener p0);
    public void setSystemBarsAppearance(int p0, int p1);
    public void setSystemBarsAppearanceFromResource(int p0, int p1);
    public int getSystemBarsAppearance();
    default public void setImeCaptionBarInsetsHeight(int p0) {}
    public void setSystemBarsBehavior(int p0);
    public int getSystemBarsBehavior();
    public void setAnimationsDisabled(boolean p0);
    @android.annotation.NonNull
    public android.view.InsetsState getState();
    public int getRequestedVisibleTypes();
    public void addOnControllableInsetsChangedListener(android.view.WindowInsetsController.OnControllableInsetsChangedListener p0);
    public void removeOnControllableInsetsChangedListener(android.view.WindowInsetsController.OnControllableInsetsChangedListener p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Appearance {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Behavior {
    }

    public static interface OnControllableInsetsChangedListener {
        public void onControllableInsetsChanged(android.view.WindowInsetsController p0, int p1);
    }
}
