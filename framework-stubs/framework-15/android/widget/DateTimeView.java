package android.widget;

@android.widget.RemoteViews.RemoteView
public class DateTimeView extends android.widget.TextView {
    int mLastDisplay;
    java.text.DateFormat mLastFormat;
    public DateTimeView(android.content.Context p0) { super((android.content.Context)null); }
    public DateTimeView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    @android.view.RemotableViewMethod
    public void setTime(long p0) {}
    @android.view.RemotableViewMethod
    public void setShowRelativeTime(boolean p0) {}
    public boolean isShowRelativeTime() { return false; }
    @android.view.RemotableViewMethod
    public void setVisibility(int p0) {}
    void update() {}
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    void clearFormatAndUpdate() {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public static void setReceiverHandler(android.os.Handler p0) {}

    private static class ReceiverInfo {
        public void addView(android.widget.DateTimeView p0) {}
        public void removeView(android.widget.DateTimeView p0) {}
        void updateAll() {}
        long getSoonestUpdateTime() { return 0L; }
        static final android.content.Context getApplicationContextIfAvailable(android.content.Context p0) { return null; }
        void register(android.content.Context p0) {}
        void unregister(android.content.Context p0) {}
        public void setHandler(android.os.Handler p0) {}
    }
}
