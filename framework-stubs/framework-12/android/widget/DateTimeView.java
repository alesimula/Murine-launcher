package android.widget;

@android.widget.RemoteViews.RemoteView
public class DateTimeView extends android.widget.TextView {
    private static final int SHOW_TIME = 0;
    private static final int SHOW_MONTH_DAY_YEAR = 1;
    private long mTimeMillis;
    private java.time.LocalDateTime mLocalTime;
    int mLastDisplay;
    java.text.DateFormat mLastFormat;
    private long mUpdateTimeMillis;
    private static final java.lang.ThreadLocal<android.widget.DateTimeView.ReceiverInfo> sReceiverInfo = null;
    private java.lang.String mNowText;
    private boolean mShowRelativeTime;
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
    private void updateRelativeTime() {}
    private static long computeNextMidnight(java.time.LocalDateTime p0, java.time.ZoneId p1) { return 0L; }
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    private void updateNowText() {}
    private static int dayDistance(java.time.LocalDateTime p0, java.time.LocalDateTime p1) { return 0; }
    private java.text.DateFormat getTimeFormat() { return null; }
    void clearFormatAndUpdate() {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public static void setReceiverHandler(android.os.Handler p0) {}
    private static java.time.LocalDateTime toLocalDateTime(long p0, java.time.ZoneId p1) { return null; }
    private static long toEpochMillis(java.time.LocalDateTime p0, java.time.ZoneId p1) { return 0L; }

    private static class ReceiverInfo {
        private final java.util.ArrayList<android.widget.DateTimeView> mAttachedViews = null;
        private final android.content.BroadcastReceiver mReceiver = null;
        private final android.database.ContentObserver mObserver = null;
        private android.os.Handler mHandler;
        private ReceiverInfo() {}
        public void addView(android.widget.DateTimeView p0) {}
        public void removeView(android.widget.DateTimeView p0) {}
        void updateAll() {}
        long getSoonestUpdateTime() { return 0L; }
        static final android.content.Context getApplicationContextIfAvailable(android.content.Context p0) { return null; }
        void register(android.content.Context p0) {}
        void unregister(android.content.Context p0) {}
        public void setHandler(android.os.Handler p0) {}
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.DateTimeView> {
        private boolean mPropertiesMapped;
        private int mShowReleativeId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.DateTimeView p0, android.view.inspector.PropertyReader p1) {}
    }
}
