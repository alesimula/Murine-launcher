package android.widget;

public class SeekBar extends android.widget.AbsSeekBar {
    public SeekBar(android.content.Context p0) { super((android.content.Context)null); }
    public SeekBar(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public SeekBar(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public SeekBar(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    void onProgressRefresh(float p0, boolean p1, int p2) {}
    public void setOnSeekBarChangeListener(android.widget.SeekBar.OnSeekBarChangeListener p0) {}
    void onStartTrackingTouch() {}
    void onStopTrackingTouch() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}

    public static interface OnSeekBarChangeListener {
        public void onProgressChanged(android.widget.SeekBar p0, int p1, boolean p2);
        public void onStartTrackingTouch(android.widget.SeekBar p0);
        public void onStopTrackingTouch(android.widget.SeekBar p0);
    }
}
