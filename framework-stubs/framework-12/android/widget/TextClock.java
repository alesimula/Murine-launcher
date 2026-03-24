package android.widget;

@android.widget.RemoteViews.RemoteView
public class TextClock extends android.widget.TextView {
    @java.lang.Deprecated
    public static final java.lang.CharSequence DEFAULT_FORMAT_12_HOUR = null;
    @java.lang.Deprecated
    public static final java.lang.CharSequence DEFAULT_FORMAT_24_HOUR = null;
    private java.lang.CharSequence mFormat12;
    private java.lang.CharSequence mFormat24;
    private java.lang.CharSequence mDescFormat12;
    private java.lang.CharSequence mDescFormat24;
    @android.view.ViewDebug.ExportedProperty
    private java.lang.CharSequence mFormat;
    @android.view.ViewDebug.ExportedProperty
    private boolean mHasSeconds;
    private java.lang.CharSequence mDescFormat;
    private boolean mRegistered;
    private boolean mShouldRunTicker;
    private java.util.Calendar mTime;
    private java.lang.String mTimeZone;
    private boolean mShowCurrentUserTime;
    private android.database.ContentObserver mFormatChangeObserver;
    private boolean mStopTicking;
    private final android.content.BroadcastReceiver mIntentReceiver = null;
    private final java.lang.Runnable mTicker = null;
    public TextClock(android.content.Context p0) { super((android.content.Context)null); }
    public TextClock(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TextClock(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public TextClock(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void init() {}
    private void createTime(java.lang.String p0) {}
    @android.view.ViewDebug.ExportedProperty
    public java.lang.CharSequence getFormat12Hour() { return null; }
    @android.view.RemotableViewMethod
    public void setFormat12Hour(java.lang.CharSequence p0) {}
    public void setContentDescriptionFormat12Hour(java.lang.CharSequence p0) {}
    @android.view.ViewDebug.ExportedProperty
    public java.lang.CharSequence getFormat24Hour() { return null; }
    @android.view.RemotableViewMethod
    public void setFormat24Hour(java.lang.CharSequence p0) {}
    public void setContentDescriptionFormat24Hour(java.lang.CharSequence p0) {}
    public void setShowCurrentUserTime(boolean p0) {}
    public void refreshTime() {}
    public boolean is24HourModeEnabled() { return false; }
    public java.lang.String getTimeZone() { return null; }
    @android.view.RemotableViewMethod
    public void setTimeZone(java.lang.String p0) {}
    public java.lang.CharSequence getFormat() { return null; }
    private void chooseFormat() {}
    private java.lang.String getBestDateTimePattern(java.lang.String p0) { return null; }
    private static java.lang.CharSequence abc(java.lang.CharSequence p0, java.lang.CharSequence p1, java.lang.CharSequence p2) { return null; }
    protected void onAttachedToWindow() {}
    public void onVisibilityAggregated(boolean p0) {}
    protected void onDetachedFromWindow() {}
    public void disableClockTick() {}
    private void registerReceiver() {}
    private void registerObserver() {}
    private void unregisterReceiver() {}
    private void unregisterObserver() {}
    private void onTimeChanged() {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}

    private class FormatChangeObserver extends android.database.ContentObserver {
        public FormatChangeObserver(android.widget.TextClock p0, android.os.Handler p1) { super(null); }
        public void onChange(boolean p0) {}
        public void onChange(boolean p0, android.net.Uri p1) {}
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.TextClock> {
        private boolean mPropertiesMapped;
        private int mFormat12HourId;
        private int mFormat24HourId;
        private int mIs24HourModeEnabledId;
        private int mTimeZoneId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.TextClock p0, android.view.inspector.PropertyReader p1) {}
    }
}
