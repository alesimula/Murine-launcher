package android.window;

public interface SplashScreen {
    public static final int SPLASH_SCREEN_STYLE_UNDEFINED = -1;
    public static final int SPLASH_SCREEN_STYLE_SOLID_COLOR = 0;
    public static final int SPLASH_SCREEN_STYLE_ICON = 1;
    @android.annotation.SuppressLint("ExecutorRegistration")
    public void setOnExitAnimationListener(android.window.SplashScreen.OnExitAnimationListener p0);
    public void clearOnExitAnimationListener();
    public void setSplashScreenTheme(int p0);

    public static interface OnExitAnimationListener {
        public void onSplashScreenExit(android.window.SplashScreenView p0);
    }

    public static class SplashScreenImpl implements android.window.SplashScreen {
        public SplashScreenImpl(android.content.Context p0) {}
        public void setOnExitAnimationListener(android.window.SplashScreen.OnExitAnimationListener p0) {}
        public void clearOnExitAnimationListener() {}
        public void setSplashScreenTheme(int p0) {}
    }

    public static class SplashScreenManagerGlobal {
        public static android.window.SplashScreen.SplashScreenManagerGlobal getInstance() { return null; }
        public void tokenDestroyed(android.os.IBinder p0) {}
        public void handOverSplashScreenView(android.os.IBinder p0, android.window.SplashScreenView p1) {}
        public boolean containsExitListener(android.os.IBinder p0) { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SplashScreenStyle {
    }
}
