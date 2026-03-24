package android.widget;

public class NumberPicker extends android.widget.LinearLayout {
    public static final android.widget.NumberPicker.Formatter getTwoDigitFormatter() { return null; }
    public NumberPicker(android.content.Context p0) { super((android.content.Context)null); }
    public NumberPicker(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public NumberPicker(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public NumberPicker(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    protected boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    public void computeScroll() {}
    public void setEnabled(boolean p0) {}
    public void scrollBy(int p0, int p1) {}
    protected int computeVerticalScrollOffset() { return 0; }
    protected int computeVerticalScrollRange() { return 0; }
    protected int computeVerticalScrollExtent() { return 0; }
    public int getSolidColor() { return 0; }
    public void setOnValueChangedListener(android.widget.NumberPicker.OnValueChangeListener p0) {}
    public void setOnScrollListener(android.widget.NumberPicker.OnScrollListener p0) {}
    public void setFormatter(android.widget.NumberPicker.Formatter p0) {}
    public void setValue(int p0) {}
    public boolean performClick() { return false; }
    public boolean performLongClick() { return false; }
    public boolean getWrapSelectorWheel() { return false; }
    public void setWrapSelectorWheel(boolean p0) {}
    public void setOnLongPressUpdateInterval(long p0) {}
    public int getValue() { return 0; }
    public int getMinValue() { return 0; }
    public void setMinValue(int p0) {}
    public int getMaxValue() { return 0; }
    public void setMaxValue(int p0) {}
    public java.lang.String[] getDisplayedValues() { return null; }
    public void setDisplayedValues(java.lang.String[] p0) {}
    public java.lang.CharSequence getDisplayedValueForCurrentSelection() { return null; }
    public void setSelectionDividerHeight(int p0) {}
    public int getSelectionDividerHeight() { return 0; }
    protected float getTopFadingEdgeStrength() { return 0.0f; }
    protected float getBottomFadingEdgeStrength() { return 0.0f; }
    protected void onDetachedFromWindow() {}
    protected void drawableStateChanged() {}
    public void jumpDrawablesToCurrentState() {}
    public void onResolveDrawables(int p0) {}
    protected void onDraw(android.graphics.Canvas p0) {}
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() { return null; }
    public void setTextColor(int p0) {}
    public int getTextColor() { return 0; }
    public void setTextSize(float p0) {}
    public float getTextSize() { return 0.0f; }

    class AccessibilityNodeProviderImpl extends android.view.accessibility.AccessibilityNodeProvider {
        AccessibilityNodeProviderImpl(android.widget.NumberPicker p0) { super(); }
        public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int p0) { return null; }
        public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(java.lang.String p0, int p1) { return null; }
        public boolean performAction(int p0, int p1, android.os.Bundle p2) { return false; }
        public void sendAccessibilityEventForVirtualView(int p0, int p1) {}
    }

    class BeginSoftInputOnLongPressCommand implements java.lang.Runnable {
        BeginSoftInputOnLongPressCommand(android.widget.NumberPicker p0) {}
        public void run() {}
    }

    class ChangeCurrentByOneFromLongPressCommand implements java.lang.Runnable {
        ChangeCurrentByOneFromLongPressCommand(android.widget.NumberPicker p0) {}
        public void run() {}
    }

    public static class CustomEditText extends android.widget.EditText {
        public CustomEditText(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
        public void onEditorAction(int p0) {}
    }

    public static interface Formatter {
        public java.lang.String format(int p0);
    }

    class InputTextFilter extends android.text.method.NumberKeyListener {
        InputTextFilter(android.widget.NumberPicker p0) { super(); }
        public int getInputType() { return 0; }
        protected char[] getAcceptedChars() { return null; }
        public java.lang.CharSequence filter(java.lang.CharSequence p0, int p1, int p2, android.text.Spanned p3, int p4, int p5) { return null; }
    }

    public static interface OnScrollListener {
        public static final int SCROLL_STATE_IDLE = 0;
        public static final int SCROLL_STATE_TOUCH_SCROLL = 1;
        public static final int SCROLL_STATE_FLING = 2;
        public void onScrollStateChange(android.widget.NumberPicker p0, int p1);

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ScrollState {
        }
    }

    public static interface OnValueChangeListener {
        public void onValueChange(android.widget.NumberPicker p0, int p1, int p2);
    }

    class PressedStateHelper implements java.lang.Runnable {
        public static final int BUTTON_INCREMENT = 1;
        public static final int BUTTON_DECREMENT = 2;
        PressedStateHelper(android.widget.NumberPicker p0) {}
        public void cancel() {}
        public void buttonPressDelayed(int p0) {}
        public void buttonTapped(int p0) {}
        public void run() {}
    }

    private static class SetSelectionCommand implements java.lang.Runnable {
        public SetSelectionCommand(android.widget.EditText p0) {}
        public void post(int p0, int p1) {}
        public void cancel() {}
        public void run() {}
    }

    private static class TwoDigitFormatter implements android.widget.NumberPicker.Formatter {
        final java.lang.StringBuilder mBuilder = null;
        char mZeroDigit;
        java.util.Formatter mFmt;
        final java.lang.Object[] mArgs = null;
        TwoDigitFormatter() {}
        public java.lang.String format(int p0) { return null; }
    }
}
