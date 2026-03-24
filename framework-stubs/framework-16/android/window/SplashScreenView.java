package android.window;

public final class SplashScreenView extends android.widget.FrameLayout {
    public SplashScreenView(android.content.Context p0) { super((android.content.Context)null); }
    public SplashScreenView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public void setNotCopyable() {}
    public boolean isCopyable() { return false; }
    public void onCopied() {}
    @android.annotation.Nullable
    public android.view.SurfaceControlViewHost getSurfaceHost() { return null; }
    public void setAlpha(float p0) {}
    @android.annotation.Nullable
    public java.time.Duration getIconAnimationDuration() { return null; }
    @android.annotation.Nullable
    public java.time.Instant getIconAnimationStart() { return null; }
    public void syncTransferSurfaceOnDraw() {}
    void initIconAnimation(android.graphics.drawable.Drawable p0) {}
    public void remove() {}
    protected void onDetachedFromWindow() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public static void releaseIconHost(android.view.SurfaceControlViewHost p0) {}
    public void attachHostWindow(android.view.Window p0) {}
    @android.annotation.Nullable
    public android.view.View getIconView() { return null; }
    @android.annotation.Nullable
    public android.view.View getBrandingView() { return null; }
    public int getInitBackgroundColor() { return 0; }

    public static class Builder {
        public Builder(android.content.Context p0) {}
        public android.window.SplashScreenView.Builder createFromParcel(android.window.SplashScreenView.SplashScreenViewParcelable p0) { return null; }
        public android.window.SplashScreenView.Builder setIconSize(int p0) { return null; }
        public android.window.SplashScreenView.Builder setBackgroundColor(int p0) { return null; }
        public android.window.SplashScreenView.Builder setOverlayDrawable(android.graphics.drawable.Drawable p0) { return null; }
        public android.window.SplashScreenView.Builder setCenterViewDrawable(android.graphics.drawable.Drawable p0) { return null; }
        public android.window.SplashScreenView.Builder setIconBackground(android.graphics.drawable.Drawable p0) { return null; }
        public android.window.SplashScreenView.Builder setUiThreadInitConsumer(java.util.function.Consumer<java.lang.Runnable> p0) { return null; }
        public android.window.SplashScreenView.Builder setBrandingDrawable(android.graphics.drawable.Drawable p0, int p1, int p2) { return null; }
        public android.window.SplashScreenView.Builder setAllowHandleSolidColor(boolean p0) { return null; }
        public android.window.SplashScreenView build() { return null; }
    }

    public static interface IconAnimateListener {
        public void prepareAnimate(java.util.function.LongConsumer p0);
        public void stopAnimation();
        default public void setAnimationJankMonitoring(android.animation.AnimatorListenerAdapter p0) {}
    }

    public static class SplashScreenViewParcelable implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.window.SplashScreenView.SplashScreenViewParcelable> CREATOR = null;
        public SplashScreenViewParcelable(android.window.SplashScreenView p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void clearIfNeeded() {}
        int getIconSize() { return 0; }
        int getBackgroundColor() { return 0; }
        public void setClientCallback(android.os.RemoteCallback p0) {}
    }
}
