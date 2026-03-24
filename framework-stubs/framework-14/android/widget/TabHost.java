package android.widget;

@java.lang.Deprecated
public class TabHost extends android.widget.FrameLayout implements android.view.ViewTreeObserver.OnTouchModeChangeListener {
    protected int mCurrentTab;
    protected android.app.LocalActivityManager mLocalActivityManager;
    public TabHost(android.content.Context p0) { super((android.content.Context)null); }
    public TabHost(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TabHost(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public TabHost(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public android.widget.TabHost.TabSpec newTabSpec(java.lang.String p0) { return null; }
    public void setup() {}
    public void sendAccessibilityEventInternal(int p0) {}
    public void setup(android.app.LocalActivityManager p0) {}
    public void onTouchModeChanged(boolean p0) {}
    public void addTab(android.widget.TabHost.TabSpec p0) {}
    public void clearAllTabs() {}
    public android.widget.TabWidget getTabWidget() { return null; }
    public int getCurrentTab() { return 0; }
    public java.lang.String getCurrentTabTag() { return null; }
    public android.view.View getCurrentTabView() { return null; }
    public android.view.View getCurrentView() { return null; }
    public void setCurrentTabByTag(java.lang.String p0) {}
    public android.widget.FrameLayout getTabContentView() { return null; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public void dispatchWindowFocusChanged(boolean p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void setCurrentTab(int p0) {}
    public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener p0) {}

    public static interface TabContentFactory {
        public android.view.View createTabContent(java.lang.String p0);
    }

    public class TabSpec {
        public android.widget.TabHost.TabSpec setIndicator(java.lang.CharSequence p0) { return null; }
        public android.widget.TabHost.TabSpec setIndicator(java.lang.CharSequence p0, android.graphics.drawable.Drawable p1) { return null; }
        public android.widget.TabHost.TabSpec setIndicator(android.view.View p0) { return null; }
        public android.widget.TabHost.TabSpec setContent(int p0) { return null; }
        public android.widget.TabHost.TabSpec setContent(android.widget.TabHost.TabContentFactory p0) { return null; }
        public android.widget.TabHost.TabSpec setContent(android.content.Intent p0) { return null; }
        public java.lang.String getTag() { return null; }
    }

    public static interface OnTabChangeListener {
        public void onTabChanged(java.lang.String p0);
    }

    private static interface ContentStrategy {
        public android.view.View getContentView();
        public void tabClosed();
    }

    private class FactoryContentStrategy implements android.widget.TabHost.ContentStrategy {
        public FactoryContentStrategy(android.widget.TabHost p0, java.lang.CharSequence p1, android.widget.TabHost.TabContentFactory p2) {}
        public android.view.View getContentView() { return null; }
        public void tabClosed() {}
    }

    private static interface IndicatorStrategy {
        public android.view.View createIndicatorView();
    }

    private class IntentContentStrategy implements android.widget.TabHost.ContentStrategy {
        public android.view.View getContentView() { return null; }
        public void tabClosed() {}
    }

    private class LabelAndIconIndicatorStrategy implements android.widget.TabHost.IndicatorStrategy {
        public android.view.View createIndicatorView() { return null; }
    }

    private class LabelIndicatorStrategy implements android.widget.TabHost.IndicatorStrategy {
        public android.view.View createIndicatorView() { return null; }
    }

    private class ViewIdContentStrategy implements android.widget.TabHost.ContentStrategy {
        public android.view.View getContentView() { return null; }
        public void tabClosed() {}
    }

    private class ViewIndicatorStrategy implements android.widget.TabHost.IndicatorStrategy {
        public android.view.View createIndicatorView() { return null; }
    }
}
