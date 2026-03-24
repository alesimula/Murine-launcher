package android.widget;

class SimpleMonthView extends android.view.View {
    public SimpleMonthView(android.content.Context p0) { super((android.content.Context)null); }
    public SimpleMonthView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public SimpleMonthView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public SimpleMonthView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public int getMonthHeight() { return 0; }
    public int getCellWidth() { return 0; }
    public void setMonthTextAppearance(int p0) {}
    public void setDayOfWeekTextAppearance(int p0) {}
    public void setDayTextAppearance(int p0) {}
    void setMonthTextColor(android.content.res.ColorStateList p0) {}
    void setDayOfWeekTextColor(android.content.res.ColorStateList p0) {}
    void setDayTextColor(android.content.res.ColorStateList p0) {}
    void setDaySelectorColor(android.content.res.ColorStateList p0) {}
    void setDayHighlightColor(android.content.res.ColorStateList p0) {}
    public void setOnDayClickListener(android.widget.SimpleMonthView.OnDayClickListener p0) {}
    public boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    public void getFocusedRect(android.graphics.Rect p0) {}
    protected void onFocusLost() {}
    protected void onDraw(android.graphics.Canvas p0) {}
    public java.lang.String getMonthYearLabel() { return null; }
    public void setSelectedDay(int p0) {}
    public void setFirstDayOfWeek(int p0) {}
    void setMonthParams(int p0, int p1, int p2, int p3, int p4, int p5) {}
    protected void onMeasure(int p0, int p1) {}
    public void onRtlPropertiesChanged(int p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public boolean getBoundsForDay(int p0, android.graphics.Rect p1) { return false; }
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent p0, int p1) { return null; }

    private class MonthViewTouchHelper extends com.android.internal.widget.ExploreByTouchHelper {
        public MonthViewTouchHelper(android.widget.SimpleMonthView p0, android.view.View p1) { super(null); }
        protected int getVirtualViewAt(float p0, float p1) { return 0; }
        protected void getVisibleVirtualViews(android.util.IntArray p0) {}
        protected void onPopulateEventForVirtualView(int p0, android.view.accessibility.AccessibilityEvent p1) {}
        protected void onPopulateNodeForVirtualView(int p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
        protected boolean onPerformActionForVirtualView(int p0, int p1, android.os.Bundle p2) { return false; }
    }

    public static interface OnDayClickListener {
        public void onDayClick(android.widget.SimpleMonthView p0, android.icu.util.Calendar p1);
    }
}
