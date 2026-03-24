package android.window;

public final class SplashScreenView extends android.widget.FrameLayout {
    private static final java.lang.String TAG = null;
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final int LIGHT_BARS_MASK = 24;
    private static final int WINDOW_FLAG_MASK = -1946157056;
    private boolean mNotCopyable;
    private boolean mIsCopied;
    private int mInitBackgroundColor;
    private android.view.View mIconView;
    private android.graphics.Bitmap mParceledIconBitmap;
    private android.view.View mBrandingImageView;
    private android.graphics.Bitmap mParceledBrandingBitmap;
    private android.graphics.Bitmap mParceledIconBackgroundBitmap;
    private java.time.Duration mIconAnimationDuration;
    private java.time.Instant mIconAnimationStart;
    private android.app.Activity mHostActivity;
    private android.view.SurfaceControlViewHost.SurfacePackage mSurfacePackageCopy;
    private android.view.SurfaceControlViewHost.SurfacePackage mSurfacePackage;
    private android.view.SurfaceView mSurfaceView;
    private android.view.SurfaceControlViewHost mSurfaceHost;
    private android.os.RemoteCallback mClientCallback;
    private android.view.Window mWindow;
    private int mAppWindowFlags;
    private int mStatusBarColor;
    private int mNavigationBarColor;
    private int mSystemBarsAppearance;
    private boolean mHasRemoved;
    private boolean mNavigationContrastEnforced;
    private boolean mStatusContrastEnforced;
    private boolean mDecorFitsSystemWindows;
    public SplashScreenView(android.content.Context p0) { super((android.content.Context)null); }
    public SplashScreenView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public void setNotCopyable() {}
    public boolean isCopyable() { return false; }
    public void onCopied() {}
    public android.view.SurfaceControlViewHost getSurfaceHost() { return null; }
    public void setAlpha(float p0) {}
    public java.time.Duration getIconAnimationDuration() { return null; }
    public java.time.Instant getIconAnimationStart() { return null; }
    void transferSurface() {}
    void initIconAnimation(android.graphics.drawable.Drawable p0, long p1) {}
    private void animationStartCallback() {}
    public void remove() {}
    protected void onDetachedFromWindow() {}
    private void releaseAnimationSurfaceHost() {}
    public void attachHostActivityAndSetSystemUIColors(android.app.Activity p0, android.view.Window p1) {}
    private void restoreSystemUIColors() {}
    public static void applySystemBarsContrastColor(android.view.WindowInsetsController p0, int p1) {}
    public android.view.View getIconView() { return null; }
    public android.view.View getBrandingView() { return null; }
    public int getInitBackgroundColor() { return 0; }

    public static class Builder {
        private final android.content.Context mContext = null;
        private int mIconSize;
        private int mBackgroundColor;
        private android.graphics.Bitmap mParceledIconBitmap;
        private android.graphics.Bitmap mParceledIconBackgroundBitmap;
        private android.graphics.drawable.Drawable mIconDrawable;
        private android.graphics.drawable.Drawable mOverlayDrawable;
        private android.graphics.drawable.Drawable mIconBackground;
        private android.view.SurfaceControlViewHost.SurfacePackage mSurfacePackage;
        private android.os.RemoteCallback mClientCallback;
        private int mBrandingImageWidth;
        private int mBrandingImageHeight;
        private android.graphics.drawable.Drawable mBrandingDrawable;
        private android.graphics.Bitmap mParceledBrandingBitmap;
        private java.time.Instant mIconAnimationStart;
        private java.time.Duration mIconAnimationDuration;
        public Builder(android.content.Context p0) {}
        public android.window.SplashScreenView.Builder createFromParcel(android.window.SplashScreenView.SplashScreenViewParcelable p0) { return null; }
        public android.window.SplashScreenView.Builder setIconSize(int p0) { return null; }
        public android.window.SplashScreenView.Builder setBackgroundColor(int p0) { return null; }
        public android.window.SplashScreenView.Builder setOverlayDrawable(android.graphics.drawable.Drawable p0) { return null; }
        public android.window.SplashScreenView.Builder setCenterViewDrawable(android.graphics.drawable.Drawable p0) { return null; }
        public android.window.SplashScreenView.Builder setIconBackground(android.graphics.drawable.Drawable p0) { return null; }
        public android.window.SplashScreenView.Builder setAnimationDurationMillis(int p0) { return null; }
        public android.window.SplashScreenView.Builder setBrandingDrawable(android.graphics.drawable.Drawable p0, int p1, int p2) { return null; }
        public android.window.SplashScreenView build() { return null; }
        private android.view.SurfaceView createSurfaceView(android.window.SplashScreenView p0) { return null; }
    }

    public static interface IconAnimateListener {
        public boolean prepareAnimate(long p0, java.lang.Runnable p1);
    }

    public static class SplashScreenViewParcelable implements android.os.Parcelable {
        private int mIconSize;
        private int mBackgroundColor;
        private android.graphics.Bitmap mIconBackground;
        private android.graphics.Bitmap mIconBitmap;
        private int mBrandingWidth;
        private int mBrandingHeight;
        private android.graphics.Bitmap mBrandingBitmap;
        private long mIconAnimationStartMillis;
        private long mIconAnimationDurationMillis;
        private android.view.SurfaceControlViewHost.SurfacePackage mSurfacePackage;
        private android.os.RemoteCallback mClientCallback;
        public static final android.os.Parcelable.Creator<android.window.SplashScreenView.SplashScreenViewParcelable> CREATOR = null;
        public SplashScreenViewParcelable(android.window.SplashScreenView p0) {}
        private android.graphics.Bitmap copyDrawable(android.graphics.drawable.Drawable p0) { return null; }
        private SplashScreenViewParcelable(android.os.Parcel p0) {}
        private void readParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void clearIfNeeded() {}
        int getIconSize() { return 0; }
        int getBackgroundColor() { return 0; }
        public void setClientCallback(android.os.RemoteCallback p0) {}
    }
}
