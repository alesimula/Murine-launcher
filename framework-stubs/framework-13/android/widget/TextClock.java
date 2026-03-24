package android.widget;

@android.widget.RemoteViews.RemoteView
public class TextClock extends android.widget.TextView {
    @java.lang.Deprecated
    public static final java.lang.CharSequence DEFAULT_FORMAT_12_HOUR = null;
    @java.lang.Deprecated
    public static final java.lang.CharSequence DEFAULT_FORMAT_24_HOUR = null;
    public TextClock(android.content.Context p0) { super((android.content.Context)null); }
    public TextClock(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TextClock(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public TextClock(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
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
    protected void onAttachedToWindow() {}
    public void onVisibilityAggregated(boolean p0) {}
    protected void onDetachedFromWindow() {}
    public void disableClockTick() {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}

    private class FormatChangeObserver extends android.database.ContentObserver {
        public FormatChangeObserver(android.widget.TextClock p0, android.os.Handler p1) { super(null); }
        public void onChange(boolean p0) {}
        public void onChange(boolean p0, android.net.Uri p1) {}
    }
}
