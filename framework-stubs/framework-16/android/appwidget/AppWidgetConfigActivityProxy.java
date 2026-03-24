package android.appwidget;

public class AppWidgetConfigActivityProxy extends android.app.Activity {
    public AppWidgetConfigActivityProxy() { super(); }
    protected void onCreate(android.os.Bundle p0) {}
    protected void onActivityResult(int p0, int p1, android.content.Intent p2) {}
    public android.view.WindowManager getWindowManager() { return null; }

    private static class MyWM extends android.view.WindowManagerWrapper {
        MyWM(android.view.WindowManager p0) { super(null); }
        public void addView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
        public void updateViewLayout(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
        public void removeView(android.view.View p0) {}
        public void removeViewImmediate(android.view.View p0) {}
    }
}
