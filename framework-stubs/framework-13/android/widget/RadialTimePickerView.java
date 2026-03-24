package android.widget;

public class RadialTimePickerView extends android.view.View {
    public static final int HOURS = 0;
    public static final int MINUTES = 1;
    boolean mChangedDuringTouch;
    public RadialTimePickerView(android.content.Context p0) { super((android.content.Context)null); }
    public RadialTimePickerView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public RadialTimePickerView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public RadialTimePickerView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    void applyAttributes(android.util.AttributeSet p0, int p1, int p2) {}
    public void initialize(int p0, int p1, boolean p2) {}
    public void setCurrentItemShowing(int p0, boolean p1) {}
    public int getCurrentItemShowing() { return 0; }
    public void setOnValueSelectedListener(android.widget.RadialTimePickerView.OnValueSelectedListener p0) {}
    public void setCurrentHour(int p0) {}
    public int getCurrentHour() { return 0; }
    public void setCurrentMinute(int p0) {}
    public int getCurrentMinute() { return 0; }
    public boolean setAmOrPm(int p0) { return false; }
    public int getAmOrPm() { return 0; }
    public void showHours(boolean p0) {}
    public void showMinutes(boolean p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void onDraw(android.graphics.Canvas p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    public void setInputEnabled(boolean p0) {}
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent p0, int p1) { return null; }

    static interface OnValueSelectedListener {
        public void onValueSelected(int p0, int p1, boolean p2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface PickerType {
    }

    private class RadialPickerTouchHelper extends com.android.internal.widget.ExploreByTouchHelper {
        public RadialPickerTouchHelper(android.widget.RadialTimePickerView p0) { super(null); }
        public void onInitializeAccessibilityNodeInfo(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
        public boolean performAccessibilityAction(android.view.View p0, int p1, android.os.Bundle p2) { return false; }
        protected int getVirtualViewAt(float p0, float p1) { return 0; }
        protected void getVisibleVirtualViews(android.util.IntArray p0) {}
        protected void onPopulateEventForVirtualView(int p0, android.view.accessibility.AccessibilityEvent p1) {}
        protected void onPopulateNodeForVirtualView(int p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
        protected boolean onPerformActionForVirtualView(int p0, int p1, android.os.Bundle p2) { return false; }
    }
}
