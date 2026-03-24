package android.window;

public interface SplashScreen {
    public static final int SPLASH_SCREEN_STYLE_EMPTY = 0;
    public static final int SPLASH_SCREEN_STYLE_ICON = 1;
    @android.annotation.SuppressLint("ExecutorRegistration")
    public void setOnExitAnimationListener(android.window.SplashScreen.OnExitAnimationListener p0);
    public void clearOnExitAnimationListener();
    public void setSplashScreenTheme(int p0);

    public static interface OnExitAnimationListener {
        public void onSplashScreenExit(android.window.SplashScreenView p0);
    }

    public static class SplashScreenImpl implements android.window.SplashScreen {
        private static final java.lang.String TAG = "SplashScreenImpl";
        private android.window.SplashScreen.OnExitAnimationListener mExitAnimationListener;
        private final android.os.IBinder mActivityToken = null;
        private final android.window.SplashScreen.SplashScreenManagerGlobal mGlobal = null;
        public SplashScreenImpl(android.content.Context p0) {}
        public void setOnExitAnimationListener(android.window.SplashScreen.OnExitAnimationListener p0) {}
        public void clearOnExitAnimationListener() {}
        public void setSplashScreenTheme(int p0) {}
    }

    public static class SplashScreenManagerGlobal {
        private static final java.lang.String TAG = null;
        private final java.lang.Object mGlobalLock = null;
        private final java.util.ArrayList<android.window.SplashScreen.SplashScreenImpl> mImpls = null;
        private static final android.util.Singleton<android.window.SplashScreen.SplashScreenManagerGlobal> sInstance = null;
        private SplashScreenManagerGlobal() {}
        public static android.window.SplashScreen.SplashScreenManagerGlobal getInstance() { return null; }
        private void addImpl(android.window.SplashScreen.SplashScreenImpl p0) {}
        private void removeImpl(android.window.SplashScreen.SplashScreenImpl p0) {}
        private android.window.SplashScreen.SplashScreenImpl findImpl(android.os.IBinder p0) { return null; }
        public void tokenDestroyed(android.os.IBinder p0) {}
        public void handOverSplashScreenView(android.os.IBinder p0, android.window.SplashScreenView p1) {}
        private void dispatchOnExitAnimation(android.os.IBinder p0, android.window.SplashScreenView p1) {}
        public boolean containsExitListener(android.os.IBinder p0) { return false; }
        private void transferSurface(android.window.SplashScreenView p0) {}
    }

    public static @interface SplashScreenStyle {
    }
}
